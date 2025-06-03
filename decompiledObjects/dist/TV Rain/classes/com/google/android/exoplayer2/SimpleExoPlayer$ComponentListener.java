package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.audio.AudioFocusManager.PlayerControl;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class SimpleExoPlayer$ComponentListener
  implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AudioFocusManager.PlayerControl
{
  private SimpleExoPlayer$ComponentListener(SimpleExoPlayer paramSimpleExoPlayer) {}
  
  public void executePlayerCommand(int paramInt)
  {
    SimpleExoPlayer localSimpleExoPlayer = this$0;
    SimpleExoPlayer.access$1700(localSimpleExoPlayer, localSimpleExoPlayer.getPlayWhenReady(), paramInt);
  }
  
  public void onAudioDecoderInitialized(String paramString, long paramLong1, long paramLong2)
  {
    Iterator localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioDecoderInitialized(paramString, paramLong1, paramLong2);
    }
  }
  
  public void onAudioDisabled(DecoderCounters paramDecoderCounters)
  {
    Iterator localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioDisabled(paramDecoderCounters);
    }
    SimpleExoPlayer.access$1002(this$0, null);
    SimpleExoPlayer.access$602(this$0, null);
    SimpleExoPlayer.access$802(this$0, 0);
  }
  
  public void onAudioEnabled(DecoderCounters paramDecoderCounters)
  {
    SimpleExoPlayer.access$602(this$0, paramDecoderCounters);
    Iterator localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioEnabled(paramDecoderCounters);
    }
  }
  
  public void onAudioInputFormatChanged(Format paramFormat)
  {
    SimpleExoPlayer.access$1002(this$0, paramFormat);
    Iterator localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioInputFormatChanged(paramFormat);
    }
  }
  
  public void onAudioSessionId(int paramInt)
  {
    if (SimpleExoPlayer.access$800(this$0) == paramInt) {
      return;
    }
    SimpleExoPlayer.access$802(this$0, paramInt);
    Iterator localIterator = SimpleExoPlayer.access$900(this$0).iterator();
    while (localIterator.hasNext())
    {
      AudioListener localAudioListener = (AudioListener)localIterator.next();
      if (!SimpleExoPlayer.access$700(this$0).contains(localAudioListener)) {
        localAudioListener.onAudioSessionId(paramInt);
      }
    }
    localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioSessionId(paramInt);
    }
  }
  
  public void onAudioSinkUnderrun(int paramInt, long paramLong1, long paramLong2)
  {
    Iterator localIterator = SimpleExoPlayer.access$700(this$0).iterator();
    while (localIterator.hasNext()) {
      ((AudioRendererEventListener)localIterator.next()).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
    }
  }
  
  public void onCues(List<Cue> paramList)
  {
    SimpleExoPlayer.access$1102(this$0, paramList);
    Iterator localIterator = SimpleExoPlayer.access$1200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((TextOutput)localIterator.next()).onCues(paramList);
    }
  }
  
  public void onDroppedFrames(int paramInt, long paramLong)
  {
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onDroppedFrames(paramInt, paramLong);
    }
  }
  
  public void onMetadata(Metadata paramMetadata)
  {
    Iterator localIterator = SimpleExoPlayer.access$1300(this$0).iterator();
    while (localIterator.hasNext()) {
      ((MetadataOutput)localIterator.next()).onMetadata(paramMetadata);
    }
  }
  
  public void onRenderedFirstFrame(Surface paramSurface)
  {
    if (SimpleExoPlayer.access$500(this$0) == paramSurface)
    {
      localIterator = SimpleExoPlayer.access$400(this$0).iterator();
      while (localIterator.hasNext()) {
        ((VideoListener)localIterator.next()).onRenderedFirstFrame();
      }
    }
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onRenderedFirstFrame(paramSurface);
    }
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    SimpleExoPlayer.access$1400(this$0, new Surface(paramSurfaceTexture), true);
    SimpleExoPlayer.access$1500(this$0, paramInt1, paramInt2);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    SimpleExoPlayer.access$1400(this$0, null, true);
    SimpleExoPlayer.access$1500(this$0, 0, 0);
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    SimpleExoPlayer.access$1500(this$0, paramInt1, paramInt2);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public void onVideoDecoderInitialized(String paramString, long paramLong1, long paramLong2)
  {
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onVideoDecoderInitialized(paramString, paramLong1, paramLong2);
    }
  }
  
  public void onVideoDisabled(DecoderCounters paramDecoderCounters)
  {
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onVideoDisabled(paramDecoderCounters);
    }
    SimpleExoPlayer.access$302(this$0, null);
    SimpleExoPlayer.access$102(this$0, null);
  }
  
  public void onVideoEnabled(DecoderCounters paramDecoderCounters)
  {
    SimpleExoPlayer.access$102(this$0, paramDecoderCounters);
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onVideoEnabled(paramDecoderCounters);
    }
  }
  
  public void onVideoInputFormatChanged(Format paramFormat)
  {
    SimpleExoPlayer.access$302(this$0, paramFormat);
    Iterator localIterator = SimpleExoPlayer.access$200(this$0).iterator();
    while (localIterator.hasNext()) {
      ((VideoRendererEventListener)localIterator.next()).onVideoInputFormatChanged(paramFormat);
    }
  }
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Iterator localIterator = SimpleExoPlayer.access$400(this$0).iterator();
    while (localIterator.hasNext())
    {
      localObject = (VideoListener)localIterator.next();
      if (!SimpleExoPlayer.access$200(this$0).contains(localObject)) {
        ((VideoListener)localObject).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
      }
    }
    Object localObject = SimpleExoPlayer.access$200(this$0).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((VideoRendererEventListener)((Iterator)localObject).next()).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
    }
  }
  
  public void setVolumeMultiplier(float paramFloat)
  {
    SimpleExoPlayer.access$1600(this$0);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    SimpleExoPlayer.access$1500(this$0, paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    SimpleExoPlayer.access$1400(this$0, paramSurfaceHolder.getSurface(), false);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    SimpleExoPlayer.access$1400(this$0, null, false);
    SimpleExoPlayer.access$1500(this$0, 0, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.SimpleExoPlayer.ComponentListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */