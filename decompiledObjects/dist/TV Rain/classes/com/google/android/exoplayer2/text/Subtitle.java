package com.google.android.exoplayer2.text;

import java.util.List;

public abstract interface Subtitle
{
  public abstract List<Cue> getCues(long paramLong);
  
  public abstract long getEventTime(int paramInt);
  
  public abstract int getEventTimeCount();
  
  public abstract int getNextEventTimeIndex(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.Subtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */