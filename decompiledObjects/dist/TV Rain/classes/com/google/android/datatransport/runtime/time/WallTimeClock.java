package com.google.android.datatransport.runtime.time;

public class WallTimeClock
  implements Clock
{
  public long getTime()
  {
    return System.currentTimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.WallTimeClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */