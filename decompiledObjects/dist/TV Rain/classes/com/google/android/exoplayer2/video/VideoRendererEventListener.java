package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import g5;
import h5;
import i5;
import q5;
import r;

public abstract interface VideoRendererEventListener
{
  public abstract void onDroppedFrames(int paramInt, long paramLong);
  
  public abstract void onRenderedFirstFrame(@Nullable Surface paramSurface);
  
  public abstract void onVideoDecoderInitialized(String paramString, long paramLong1, long paramLong2);
  
  public abstract void onVideoDisabled(DecoderCounters paramDecoderCounters);
  
  public abstract void onVideoEnabled(DecoderCounters paramDecoderCounters);
  
  public abstract void onVideoInputFormatChanged(Format paramFormat);
  
  public abstract void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat);
  
  public static final class EventDispatcher
  {
    @Nullable
    private final Handler handler;
    @Nullable
    private final VideoRendererEventListener listener;
    
    public EventDispatcher(@Nullable Handler paramHandler, @Nullable VideoRendererEventListener paramVideoRendererEventListener)
    {
      if (paramVideoRendererEventListener != null) {
        paramHandler = (Handler)Assertions.checkNotNull(paramHandler);
      } else {
        paramHandler = null;
      }
      handler = paramHandler;
      listener = paramVideoRendererEventListener;
    }
    
    public void decoderInitialized(String paramString, long paramLong1, long paramLong2)
    {
      if (listener != null) {
        handler.post(new r(this, paramString, paramLong1, paramLong2, 1));
      }
    }
    
    public void disabled(DecoderCounters paramDecoderCounters)
    {
      if (listener != null) {
        handler.post(new g5(this, paramDecoderCounters, 0));
      }
    }
    
    public void droppedFrames(int paramInt, long paramLong)
    {
      if (listener != null) {
        handler.post(new h5(this, paramInt, paramLong));
      }
    }
    
    public void enabled(DecoderCounters paramDecoderCounters)
    {
      if (listener != null) {
        handler.post(new g5(this, paramDecoderCounters, 1));
      }
    }
    
    public void inputFormatChanged(Format paramFormat)
    {
      if (listener != null) {
        handler.post(new q5(this, paramFormat, 4));
      }
    }
    
    public void renderedFirstFrame(@Nullable Surface paramSurface)
    {
      if (listener != null) {
        handler.post(new q5(this, paramSurface, 5));
      }
    }
    
    public void videoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      if (listener != null) {
        handler.post(new i5(this, paramInt1, paramInt2, paramInt3, paramFloat));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoRendererEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */