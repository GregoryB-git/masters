package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import c4;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import p;
import q;
import q5;
import r;

public final class AudioRendererEventListener$EventDispatcher
{
  @Nullable
  private final Handler handler;
  @Nullable
  private final AudioRendererEventListener listener;
  
  public AudioRendererEventListener$EventDispatcher(@Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener)
  {
    if (paramAudioRendererEventListener != null) {
      paramHandler = (Handler)Assertions.checkNotNull(paramHandler);
    } else {
      paramHandler = null;
    }
    handler = paramHandler;
    listener = paramAudioRendererEventListener;
  }
  
  public void audioSessionId(int paramInt)
  {
    if (listener != null) {
      handler.post(new c4(this, paramInt, 1));
    }
  }
  
  public void audioTrackUnderrun(int paramInt, long paramLong1, long paramLong2)
  {
    if (listener != null) {
      handler.post(new q(this, paramInt, paramLong1, paramLong2));
    }
  }
  
  public void decoderInitialized(String paramString, long paramLong1, long paramLong2)
  {
    if (listener != null) {
      handler.post(new r(this, paramString, paramLong1, paramLong2, 0));
    }
  }
  
  public void disabled(DecoderCounters paramDecoderCounters)
  {
    if (listener != null) {
      handler.post(new p(this, paramDecoderCounters, 0));
    }
  }
  
  public void enabled(DecoderCounters paramDecoderCounters)
  {
    if (listener != null) {
      handler.post(new p(this, paramDecoderCounters, 1));
    }
  }
  
  public void inputFormatChanged(Format paramFormat)
  {
    if (listener != null) {
      handler.post(new q5(this, paramFormat, 3));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */