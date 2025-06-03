package com.facebook.common.time;

import android.os.SystemClock;

public class CurrentThreadTimeClock
  implements Clock
{
  public long now()
  {
    return SystemClock.currentThreadTimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.time.CurrentThreadTimeClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */