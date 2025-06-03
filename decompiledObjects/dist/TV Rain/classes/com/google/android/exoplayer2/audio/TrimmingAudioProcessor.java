package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class TrimmingAudioProcessor
  implements AudioProcessor
{
  private static final int OUTPUT_ENCODING = 2;
  private ByteBuffer buffer;
  private int bytesPerFrame;
  private int channelCount;
  private byte[] endBuffer;
  private int endBufferSize;
  private boolean inputEnded;
  private boolean isActive;
  private ByteBuffer outputBuffer;
  private int pendingTrimStartBytes;
  private boolean receivedInputSinceConfigure;
  private int sampleRateHz;
  private int trimEndFrames;
  private int trimStartFrames;
  private long trimmedFrameCount;
  
  public TrimmingAudioProcessor()
  {
    ByteBuffer localByteBuffer = AudioProcessor.EMPTY_BUFFER;
    buffer = localByteBuffer;
    outputBuffer = localByteBuffer;
    channelCount = -1;
    sampleRateHz = -1;
    endBuffer = Util.EMPTY_BYTE_ARRAY;
  }
  
  public boolean configure(int paramInt1, int paramInt2, int paramInt3)
    throws AudioProcessor.UnhandledFormatException
  {
    if (paramInt3 == 2)
    {
      paramInt3 = endBufferSize;
      if (paramInt3 > 0) {
        trimmedFrameCount += paramInt3 / bytesPerFrame;
      }
      channelCount = paramInt2;
      sampleRateHz = paramInt1;
      paramInt2 = Util.getPcmFrameSize(2, paramInt2);
      bytesPerFrame = paramInt2;
      paramInt1 = trimEndFrames;
      endBuffer = new byte[paramInt1 * paramInt2];
      boolean bool1 = false;
      endBufferSize = 0;
      paramInt3 = trimStartFrames;
      pendingTrimStartBytes = (paramInt2 * paramInt3);
      boolean bool2 = isActive;
      boolean bool3;
      if ((paramInt3 == 0) && (paramInt1 == 0)) {
        bool3 = false;
      } else {
        bool3 = true;
      }
      isActive = bool3;
      receivedInputSinceConfigure = false;
      if (bool2 != bool3) {
        bool1 = true;
      }
      return bool1;
    }
    throw new AudioProcessor.UnhandledFormatException(paramInt1, paramInt2, paramInt3);
  }
  
  public void flush()
  {
    outputBuffer = AudioProcessor.EMPTY_BUFFER;
    inputEnded = false;
    if (receivedInputSinceConfigure) {
      pendingTrimStartBytes = 0;
    }
    endBufferSize = 0;
  }
  
  public ByteBuffer getOutput()
  {
    ByteBuffer localByteBuffer1 = outputBuffer;
    ByteBuffer localByteBuffer2 = localByteBuffer1;
    if (inputEnded)
    {
      localByteBuffer2 = localByteBuffer1;
      if (endBufferSize > 0)
      {
        localByteBuffer2 = localByteBuffer1;
        if (localByteBuffer1 == AudioProcessor.EMPTY_BUFFER)
        {
          int i = buffer.capacity();
          int j = endBufferSize;
          if (i < j) {
            buffer = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
          } else {
            buffer.clear();
          }
          buffer.put(endBuffer, 0, endBufferSize);
          endBufferSize = 0;
          buffer.flip();
          localByteBuffer2 = buffer;
        }
      }
    }
    outputBuffer = AudioProcessor.EMPTY_BUFFER;
    return localByteBuffer2;
  }
  
  public int getOutputChannelCount()
  {
    return channelCount;
  }
  
  public int getOutputEncoding()
  {
    return 2;
  }
  
  public int getOutputSampleRateHz()
  {
    return sampleRateHz;
  }
  
  public long getTrimmedFrameCount()
  {
    return trimmedFrameCount;
  }
  
  public boolean isActive()
  {
    return isActive;
  }
  
  public boolean isEnded()
  {
    boolean bool;
    if ((inputEnded) && (endBufferSize == 0) && (outputBuffer == AudioProcessor.EMPTY_BUFFER)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void queueEndOfStream()
  {
    inputEnded = true;
  }
  
  public void queueInput(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    if (k == 0) {
      return;
    }
    receivedInputSinceConfigure = true;
    int m = Math.min(k, pendingTrimStartBytes);
    trimmedFrameCount += m / bytesPerFrame;
    pendingTrimStartBytes -= m;
    paramByteBuffer.position(i + m);
    if (pendingTrimStartBytes > 0) {
      return;
    }
    i = k - m;
    k = endBufferSize + i - endBuffer.length;
    if (buffer.capacity() < k) {
      buffer = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
    } else {
      buffer.clear();
    }
    m = Util.constrainValue(k, 0, endBufferSize);
    buffer.put(endBuffer, 0, m);
    k = Util.constrainValue(k - m, 0, i);
    paramByteBuffer.limit(paramByteBuffer.position() + k);
    buffer.put(paramByteBuffer);
    paramByteBuffer.limit(j);
    i -= k;
    j = endBufferSize - m;
    endBufferSize = j;
    byte[] arrayOfByte = endBuffer;
    System.arraycopy(arrayOfByte, m, arrayOfByte, 0, j);
    paramByteBuffer.get(endBuffer, endBufferSize, i);
    endBufferSize += i;
    buffer.flip();
    outputBuffer = buffer;
  }
  
  public void reset()
  {
    flush();
    buffer = AudioProcessor.EMPTY_BUFFER;
    channelCount = -1;
    sampleRateHz = -1;
    endBuffer = Util.EMPTY_BYTE_ARRAY;
  }
  
  public void resetTrimmedFrameCount()
  {
    trimmedFrameCount = 0L;
  }
  
  public void setTrimFrameCount(int paramInt1, int paramInt2)
  {
    trimStartFrames = paramInt1;
    trimEndFrames = paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.TrimmingAudioProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */