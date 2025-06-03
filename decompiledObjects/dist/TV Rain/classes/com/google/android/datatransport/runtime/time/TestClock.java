package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class TestClock
  implements Clock
{
  private final AtomicLong timestamp;
  
  public TestClock(long paramLong)
  {
    timestamp = new AtomicLong(paramLong);
  }
  
  public void advance(long paramLong)
  {
    if (paramLong >= 0L)
    {
      timestamp.addAndGet(paramLong);
      return;
    }
    throw new IllegalArgumentException("cannot advance time backwards.");
  }
  
  public long getTime()
  {
    return timestamp.get();
  }
  
  public void tick()
  {
    advance(1L);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.TestClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */