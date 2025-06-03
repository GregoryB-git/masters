package com.facebook.common.time;

public class SystemClock
  implements Clock
{
  private static final SystemClock INSTANCE = new SystemClock();
  
  public static SystemClock get()
  {
    return INSTANCE;
  }
  
  public long now()
  {
    return System.currentTimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.time.SystemClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */