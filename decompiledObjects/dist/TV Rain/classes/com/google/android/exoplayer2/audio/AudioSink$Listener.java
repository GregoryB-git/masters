package com.google.android.exoplayer2.audio;

public abstract interface AudioSink$Listener
{
  public abstract void onAudioSessionId(int paramInt);
  
  public abstract void onPositionDiscontinuity();
  
  public abstract void onUnderrun(int paramInt, long paramLong1, long paramLong2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioSink.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */