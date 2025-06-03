package com.google.android.exoplayer2.scheduler;

public abstract interface Scheduler
{
  public static final boolean DEBUG = false;
  
  public abstract boolean cancel();
  
  public abstract boolean schedule(Requirements paramRequirements, String paramString1, String paramString2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.Scheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */