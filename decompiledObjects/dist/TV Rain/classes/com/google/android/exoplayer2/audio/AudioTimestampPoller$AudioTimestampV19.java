package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class AudioTimestampPoller$AudioTimestampV19
{
  private final AudioTimestamp audioTimestamp;
  private final AudioTrack audioTrack;
  private long lastTimestampPositionFrames;
  private long lastTimestampRawPositionFrames;
  private long rawTimestampFramePositionWrapCount;
  
  public AudioTimestampPoller$AudioTimestampV19(AudioTrack paramAudioTrack)
  {
    audioTrack = paramAudioTrack;
    audioTimestamp = new AudioTimestamp();
  }
  
  public long getTimestampPositionFrames()
  {
    return lastTimestampPositionFrames;
  }
  
  public long getTimestampSystemTimeUs()
  {
    return audioTimestamp.nanoTime / 1000L;
  }
  
  public boolean maybeUpdateTimestamp()
  {
    boolean bool = audioTrack.getTimestamp(audioTimestamp);
    if (bool)
    {
      long l = audioTimestamp.framePosition;
      if (lastTimestampRawPositionFrames > l) {
        rawTimestampFramePositionWrapCount += 1L;
      }
      lastTimestampRawPositionFrames = l;
      lastTimestampPositionFrames = (l + (rawTimestampFramePositionWrapCount << 32));
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioTimestampPoller.AudioTimestampV19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */