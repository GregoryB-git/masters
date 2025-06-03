package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

public class UptimeClock
  implements Clock
{
  public long getTime()
  {
    return SystemClock.elapsedRealtime();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.time.UptimeClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */