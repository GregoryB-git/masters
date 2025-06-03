package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

public abstract interface DefaultAudioSink$AudioProcessorChain
{
  public abstract PlaybackParameters applyPlaybackParameters(PlaybackParameters paramPlaybackParameters);
  
  public abstract AudioProcessor[] getAudioProcessors();
  
  public abstract long getMediaDuration(long paramLong);
  
  public abstract long getSkippedOutputFrameCount();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */