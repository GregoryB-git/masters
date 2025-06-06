package com.google.android.exoplayer2.text.cea;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class CeaDecoder
  implements SubtitleDecoder
{
  private static final int NUM_INPUT_BUFFERS = 10;
  private static final int NUM_OUTPUT_BUFFERS = 2;
  private final ArrayDeque<CeaInputBuffer> availableInputBuffers = new ArrayDeque();
  private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;
  private CeaInputBuffer dequeuedInputBuffer;
  private long playbackPositionUs;
  private long queuedInputBufferCount;
  private final PriorityQueue<CeaInputBuffer> queuedInputBuffers;
  
  public CeaDecoder()
  {
    int i = 0;
    for (int j = 0; j < 10; j++) {
      availableInputBuffers.add(new CeaInputBuffer(null));
    }
    availableOutputBuffers = new ArrayDeque();
    for (j = i; j < 2; j++) {
      availableOutputBuffers.add(new CeaOutputBuffer(null));
    }
    queuedInputBuffers = new PriorityQueue();
  }
  
  private void releaseInputBuffer(CeaInputBuffer paramCeaInputBuffer)
  {
    paramCeaInputBuffer.clear();
    availableInputBuffers.add(paramCeaInputBuffer);
  }
  
  public abstract Subtitle createSubtitle();
  
  public abstract void decode(SubtitleInputBuffer paramSubtitleInputBuffer);
  
  public SubtitleInputBuffer dequeueInputBuffer()
    throws SubtitleDecoderException
  {
    boolean bool;
    if (dequeuedInputBuffer == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    if (availableInputBuffers.isEmpty()) {
      return null;
    }
    CeaInputBuffer localCeaInputBuffer = (CeaInputBuffer)availableInputBuffers.pollFirst();
    dequeuedInputBuffer = localCeaInputBuffer;
    return localCeaInputBuffer;
  }
  
  public SubtitleOutputBuffer dequeueOutputBuffer()
    throws SubtitleDecoderException
  {
    if (availableOutputBuffers.isEmpty()) {
      return null;
    }
    while ((!queuedInputBuffers.isEmpty()) && (queuedInputBuffers.peek()).timeUs <= playbackPositionUs))
    {
      CeaInputBuffer localCeaInputBuffer = (CeaInputBuffer)queuedInputBuffers.poll();
      Object localObject;
      if (localCeaInputBuffer.isEndOfStream())
      {
        localObject = (SubtitleOutputBuffer)availableOutputBuffers.pollFirst();
        ((Buffer)localObject).addFlag(4);
        releaseInputBuffer(localCeaInputBuffer);
        return (SubtitleOutputBuffer)localObject;
      }
      decode(localCeaInputBuffer);
      if (isNewSubtitleDataAvailable())
      {
        localObject = createSubtitle();
        if (!localCeaInputBuffer.isDecodeOnly())
        {
          SubtitleOutputBuffer localSubtitleOutputBuffer = (SubtitleOutputBuffer)availableOutputBuffers.pollFirst();
          localSubtitleOutputBuffer.setContent(timeUs, (Subtitle)localObject, Long.MAX_VALUE);
          releaseInputBuffer(localCeaInputBuffer);
          return localSubtitleOutputBuffer;
        }
      }
      releaseInputBuffer(localCeaInputBuffer);
    }
    return null;
  }
  
  public void flush()
  {
    queuedInputBufferCount = 0L;
    playbackPositionUs = 0L;
    while (!queuedInputBuffers.isEmpty()) {
      releaseInputBuffer((CeaInputBuffer)queuedInputBuffers.poll());
    }
    CeaInputBuffer localCeaInputBuffer = dequeuedInputBuffer;
    if (localCeaInputBuffer != null)
    {
      releaseInputBuffer(localCeaInputBuffer);
      dequeuedInputBuffer = null;
    }
  }
  
  public abstract String getName();
  
  public abstract boolean isNewSubtitleDataAvailable();
  
  public void queueInputBuffer(SubtitleInputBuffer paramSubtitleInputBuffer)
    throws SubtitleDecoderException
  {
    boolean bool;
    if (paramSubtitleInputBuffer == dequeuedInputBuffer) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if (paramSubtitleInputBuffer.isDecodeOnly())
    {
      releaseInputBuffer(dequeuedInputBuffer);
    }
    else
    {
      paramSubtitleInputBuffer = dequeuedInputBuffer;
      long l = queuedInputBufferCount;
      queuedInputBufferCount = (1L + l);
      CeaInputBuffer.access$202(paramSubtitleInputBuffer, l);
      queuedInputBuffers.add(dequeuedInputBuffer);
    }
    dequeuedInputBuffer = null;
  }
  
  public void release() {}
  
  public void releaseOutputBuffer(SubtitleOutputBuffer paramSubtitleOutputBuffer)
  {
    paramSubtitleOutputBuffer.clear();
    availableOutputBuffers.add(paramSubtitleOutputBuffer);
  }
  
  public void setPositionUs(long paramLong)
  {
    playbackPositionUs = paramLong;
  }
  
  public static final class CeaInputBuffer
    extends SubtitleInputBuffer
    implements Comparable<CeaInputBuffer>
  {
    private long queuedInputBufferCount;
    
    public int compareTo(@NonNull CeaInputBuffer paramCeaInputBuffer)
    {
      boolean bool1 = isEndOfStream();
      boolean bool2 = paramCeaInputBuffer.isEndOfStream();
      int i = 1;
      int j = 1;
      if (bool1 != bool2)
      {
        if (!isEndOfStream()) {
          j = -1;
        }
        return j;
      }
      long l1 = timeUs - timeUs;
      long l2 = l1;
      if (l1 == 0L)
      {
        l1 = queuedInputBufferCount - queuedInputBufferCount;
        l2 = l1;
        if (l1 == 0L) {
          return 0;
        }
      }
      if (l2 > 0L) {
        j = i;
      } else {
        j = -1;
      }
      return j;
    }
  }
  
  public final class CeaOutputBuffer
    extends SubtitleOutputBuffer
  {
    private CeaOutputBuffer() {}
    
    public final void release()
    {
      releaseOutputBuffer(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.CeaDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */