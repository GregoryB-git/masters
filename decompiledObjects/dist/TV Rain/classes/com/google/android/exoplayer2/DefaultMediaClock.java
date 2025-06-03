package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

final class DefaultMediaClock
  implements MediaClock
{
  private final PlaybackParameterListener listener;
  @Nullable
  private MediaClock rendererClock;
  @Nullable
  private Renderer rendererClockSource;
  private final StandaloneMediaClock standaloneMediaClock;
  
  public DefaultMediaClock(PlaybackParameterListener paramPlaybackParameterListener, Clock paramClock)
  {
    listener = paramPlaybackParameterListener;
    standaloneMediaClock = new StandaloneMediaClock(paramClock);
  }
  
  private void ensureSynced()
  {
    long l = rendererClock.getPositionUs();
    standaloneMediaClock.resetPosition(l);
    PlaybackParameters localPlaybackParameters = rendererClock.getPlaybackParameters();
    if (!localPlaybackParameters.equals(standaloneMediaClock.getPlaybackParameters()))
    {
      standaloneMediaClock.setPlaybackParameters(localPlaybackParameters);
      listener.onPlaybackParametersChanged(localPlaybackParameters);
    }
  }
  
  private boolean isUsingRendererClock()
  {
    Renderer localRenderer = rendererClockSource;
    boolean bool;
    if ((localRenderer != null) && (!localRenderer.isEnded()) && ((rendererClockSource.isReady()) || (!rendererClockSource.hasReadStreamToEnd()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    Object localObject = rendererClock;
    if (localObject != null) {
      localObject = ((MediaClock)localObject).getPlaybackParameters();
    } else {
      localObject = standaloneMediaClock.getPlaybackParameters();
    }
    return (PlaybackParameters)localObject;
  }
  
  public long getPositionUs()
  {
    if (isUsingRendererClock()) {
      return rendererClock.getPositionUs();
    }
    return standaloneMediaClock.getPositionUs();
  }
  
  public void onRendererDisabled(Renderer paramRenderer)
  {
    if (paramRenderer == rendererClockSource)
    {
      rendererClock = null;
      rendererClockSource = null;
    }
  }
  
  public void onRendererEnabled(Renderer paramRenderer)
    throws ExoPlaybackException
  {
    MediaClock localMediaClock1 = paramRenderer.getMediaClock();
    if (localMediaClock1 != null)
    {
      MediaClock localMediaClock2 = rendererClock;
      if (localMediaClock1 != localMediaClock2) {
        if (localMediaClock2 == null)
        {
          rendererClock = localMediaClock1;
          rendererClockSource = paramRenderer;
          localMediaClock1.setPlaybackParameters(standaloneMediaClock.getPlaybackParameters());
          ensureSynced();
        }
        else
        {
          throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
      }
    }
  }
  
  public void resetPosition(long paramLong)
  {
    standaloneMediaClock.resetPosition(paramLong);
  }
  
  public PlaybackParameters setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    MediaClock localMediaClock = rendererClock;
    PlaybackParameters localPlaybackParameters = paramPlaybackParameters;
    if (localMediaClock != null) {
      localPlaybackParameters = localMediaClock.setPlaybackParameters(paramPlaybackParameters);
    }
    standaloneMediaClock.setPlaybackParameters(localPlaybackParameters);
    listener.onPlaybackParametersChanged(localPlaybackParameters);
    return localPlaybackParameters;
  }
  
  public void start()
  {
    standaloneMediaClock.start();
  }
  
  public void stop()
  {
    standaloneMediaClock.stop();
  }
  
  public long syncAndGetPositionUs()
  {
    if (isUsingRendererClock())
    {
      ensureSynced();
      return rendererClock.getPositionUs();
    }
    return standaloneMediaClock.getPositionUs();
  }
  
  public static abstract interface PlaybackParameterListener
  {
    public abstract void onPlaybackParametersChanged(PlaybackParameters paramPlaybackParameters);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.DefaultMediaClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */