package com.google.android.exoplayer2.audio;

public abstract interface AudioTrackPositionTracker$Listener
{
  public abstract void onInvalidLatency(long paramLong);
  
  public abstract void onPositionFramesMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public abstract void onSystemTimeUsMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  
  public abstract void onUnderrun(int paramInt, long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */