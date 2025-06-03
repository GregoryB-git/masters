package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.DoNotStrip;

@DoNotStrip
public class AwakeTimeSinceBootClock
  implements MonotonicClock
{
  @DoNotStrip
  private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();
  
  @DoNotStrip
  public static AwakeTimeSinceBootClock get()
  {
    return INSTANCE;
  }
  
  @DoNotStrip
  public long now()
  {
    return SystemClock.uptimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.time.AwakeTimeSinceBootClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */