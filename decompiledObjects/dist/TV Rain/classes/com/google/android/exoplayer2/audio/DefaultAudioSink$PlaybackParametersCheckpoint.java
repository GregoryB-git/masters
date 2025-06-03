package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

final class DefaultAudioSink$PlaybackParametersCheckpoint
{
  private final long mediaTimeUs;
  private final PlaybackParameters playbackParameters;
  private final long positionUs;
  
  private DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters paramPlaybackParameters, long paramLong1, long paramLong2)
  {
    playbackParameters = paramPlaybackParameters;
    mediaTimeUs = paramLong1;
    positionUs = paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink.PlaybackParametersCheckpoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */