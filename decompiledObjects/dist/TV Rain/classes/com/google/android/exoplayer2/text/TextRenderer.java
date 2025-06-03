package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

public final class TextRenderer
  extends BaseRenderer
  implements Handler.Callback
{
  private static final int MSG_UPDATE_OUTPUT = 0;
  private static final int REPLACEMENT_STATE_NONE = 0;
  private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
  private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
  private SubtitleDecoder decoder;
  private final SubtitleDecoderFactory decoderFactory;
  private int decoderReplacementState;
  private final FormatHolder formatHolder;
  private boolean inputStreamEnded;
  private SubtitleInputBuffer nextInputBuffer;
  private SubtitleOutputBuffer nextSubtitle;
  private int nextSubtitleEventIndex;
  private final TextOutput output;
  @Nullable
  private final Handler outputHandler;
  private boolean outputStreamEnded;
  private Format streamFormat;
  private SubtitleOutputBuffer subtitle;
  
  public TextRenderer(TextOutput paramTextOutput, @Nullable Looper paramLooper)
  {
    this(paramTextOutput, paramLooper, SubtitleDecoderFactory.DEFAULT);
  }
  
  public TextRenderer(TextOutput paramTextOutput, @Nullable Looper paramLooper, SubtitleDecoderFactory paramSubtitleDecoderFactory)
  {
    super(3);
    output = ((TextOutput)Assertions.checkNotNull(paramTextOutput));
    if (paramLooper == null) {
      paramTextOutput = null;
    } else {
      paramTextOutput = Util.createHandler(paramLooper, this);
    }
    outputHandler = paramTextOutput;
    decoderFactory = paramSubtitleDecoderFactory;
    formatHolder = new FormatHolder();
  }
  
  private void clearOutput()
  {
    updateOutput(Collections.emptyList());
  }
  
  private long getNextEventTime()
  {
    int i = nextSubtitleEventIndex;
    long l;
    if ((i != -1) && (i < subtitle.getEventTimeCount())) {
      l = subtitle.getEventTime(nextSubtitleEventIndex);
    } else {
      l = Long.MAX_VALUE;
    }
    return l;
  }
  
  private void invokeUpdateOutputInternal(List<Cue> paramList)
  {
    output.onCues(paramList);
  }
  
  private void releaseBuffers()
  {
    nextInputBuffer = null;
    nextSubtitleEventIndex = -1;
    SubtitleOutputBuffer localSubtitleOutputBuffer = subtitle;
    if (localSubtitleOutputBuffer != null)
    {
      localSubtitleOutputBuffer.release();
      subtitle = null;
    }
    localSubtitleOutputBuffer = nextSubtitle;
    if (localSubtitleOutputBuffer != null)
    {
      localSubtitleOutputBuffer.release();
      nextSubtitle = null;
    }
  }
  
  private void releaseDecoder()
  {
    releaseBuffers();
    decoder.release();
    decoder = null;
    decoderReplacementState = 0;
  }
  
  private void replaceDecoder()
  {
    releaseDecoder();
    decoder = decoderFactory.createDecoder(streamFormat);
  }
  
  private void updateOutput(List<Cue> paramList)
  {
    Handler localHandler = outputHandler;
    if (localHandler != null) {
      localHandler.obtainMessage(0, paramList).sendToTarget();
    } else {
      invokeUpdateOutputInternal(paramList);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 0)
    {
      invokeUpdateOutputInternal((List)obj);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public boolean isEnded()
  {
    return outputStreamEnded;
  }
  
  public boolean isReady()
  {
    return true;
  }
  
  public void onDisabled()
  {
    streamFormat = null;
    clearOutput();
    releaseDecoder();
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
  {
    clearOutput();
    inputStreamEnded = false;
    outputStreamEnded = false;
    if (decoderReplacementState != 0)
    {
      replaceDecoder();
    }
    else
    {
      releaseBuffers();
      decoder.flush();
    }
  }
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {
    paramArrayOfFormat = paramArrayOfFormat[0];
    streamFormat = paramArrayOfFormat;
    if (decoder != null) {
      decoderReplacementState = 1;
    } else {
      decoder = decoderFactory.createDecoder(paramArrayOfFormat);
    }
  }
  
  public void render(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    if (outputStreamEnded) {
      return;
    }
    if (nextSubtitle == null)
    {
      decoder.setPositionUs(paramLong1);
      try
      {
        nextSubtitle = ((SubtitleOutputBuffer)decoder.dequeueOutputBuffer());
      }
      catch (SubtitleDecoderException localSubtitleDecoderException1)
      {
        throw ExoPlaybackException.createForRenderer(localSubtitleDecoderException1, getIndex());
      }
    }
    if (getState() != 2) {
      return;
    }
    if (subtitle != null)
    {
      paramLong2 = getNextEventTime();
      for (i = 0; paramLong2 <= paramLong1; i = 1)
      {
        nextSubtitleEventIndex += 1;
        paramLong2 = getNextEventTime();
      }
    }
    int i = 0;
    Object localObject = nextSubtitle;
    int j = i;
    if (localObject != null) {
      if (((Buffer)localObject).isEndOfStream())
      {
        j = i;
        if (i == 0)
        {
          j = i;
          if (getNextEventTime() == Long.MAX_VALUE) {
            if (decoderReplacementState == 2)
            {
              replaceDecoder();
              j = i;
            }
            else
            {
              releaseBuffers();
              outputStreamEnded = true;
              j = i;
            }
          }
        }
      }
      else
      {
        j = i;
        if (nextSubtitle.timeUs <= paramLong1)
        {
          localObject = subtitle;
          if (localObject != null) {
            ((SubtitleOutputBuffer)localObject).release();
          }
          localObject = nextSubtitle;
          subtitle = ((SubtitleOutputBuffer)localObject);
          nextSubtitle = null;
          nextSubtitleEventIndex = ((SubtitleOutputBuffer)localObject).getNextEventTimeIndex(paramLong1);
          j = 1;
        }
      }
    }
    if (j != 0) {
      updateOutput(subtitle.getCues(paramLong1));
    }
    if (decoderReplacementState == 2) {
      return;
    }
    try
    {
      do
      {
        for (;;)
        {
          if (inputStreamEnded) {
            break label454;
          }
          if (nextInputBuffer == null)
          {
            localObject = (SubtitleInputBuffer)decoder.dequeueInputBuffer();
            nextInputBuffer = ((SubtitleInputBuffer)localObject);
            if (localObject == null) {
              return;
            }
          }
          if (decoderReplacementState == 1)
          {
            nextInputBuffer.setFlags(4);
            decoder.queueInputBuffer(nextInputBuffer);
            nextInputBuffer = null;
            decoderReplacementState = 2;
            return;
          }
          i = readSource(formatHolder, nextInputBuffer, false);
          if (i != -4) {
            break;
          }
          if (nextInputBuffer.isEndOfStream())
          {
            inputStreamEnded = true;
          }
          else
          {
            localObject = nextInputBuffer;
            subsampleOffsetUs = formatHolder.format.subsampleOffsetUs;
            ((DecoderInputBuffer)localObject).flip();
          }
          decoder.queueInputBuffer(nextInputBuffer);
          nextInputBuffer = null;
        }
      } while (i != -3);
      label454:
      return;
    }
    catch (SubtitleDecoderException localSubtitleDecoderException2)
    {
      throw ExoPlaybackException.createForRenderer(localSubtitleDecoderException2, getIndex());
    }
  }
  
  public int supportsFormat(Format paramFormat)
  {
    if (decoderFactory.supportsFormat(paramFormat))
    {
      int i;
      if (BaseRenderer.supportsFormatDrm(null, drmInitData)) {
        i = 4;
      } else {
        i = 2;
      }
      return i;
    }
    if (MimeTypes.isText(sampleMimeType)) {
      return 1;
    }
    return 0;
  }
  
  @Deprecated
  public static abstract interface Output
    extends TextOutput
  {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.TextRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */