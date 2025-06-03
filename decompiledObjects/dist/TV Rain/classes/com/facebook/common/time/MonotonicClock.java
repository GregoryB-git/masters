package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface MonotonicClock
{
  @DoNotStrip
  public abstract long now();
}

/* Location:
 * Qualified Name:     com.facebook.common.time.MonotonicClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */