package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;

public final class StandaloneMediaClock
  implements MediaClock
{
  private long baseElapsedMs;
  private long baseUs;
  private final Clock clock;
  private PlaybackParameters playbackParameters;
  private boolean started;
  
  public StandaloneMediaClock(Clock paramClock)
  {
    clock = paramClock;
    playbackParameters = PlaybackParameters.DEFAULT;
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    return playbackParameters;
  }
  
  public long getPositionUs()
  {
    long l1 = baseUs;
    long l2 = l1;
    if (started)
    {
      l2 = clock.elapsedRealtime() - baseElapsedMs;
      PlaybackParameters localPlaybackParameters = playbackParameters;
      if (speed == 1.0F) {
        l2 = C.msToUs(l2);
      } else {
        l2 = localPlaybackParameters.getMediaTimeUsForPlayoutTimeMs(l2);
      }
      l2 = l1 + l2;
    }
    return l2;
  }
  
  public void resetPosition(long paramLong)
  {
    baseUs = paramLong;
    if (started) {
      baseElapsedMs = clock.elapsedRealtime();
    }
  }
  
  public PlaybackParameters setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    if (started) {
      resetPosition(getPositionUs());
    }
    playbackParameters = paramPlaybackParameters;
    return paramPlaybackParameters;
  }
  
  public void start()
  {
    if (!started)
    {
      baseElapsedMs = clock.elapsedRealtime();
      started = true;
    }
  }
  
  public void stop()
  {
    if (started)
    {
      resetPosition(getPositionUs());
      started = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.StandaloneMediaClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */