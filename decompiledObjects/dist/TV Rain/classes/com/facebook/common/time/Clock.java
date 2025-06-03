package com.facebook.common.time;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface Clock
{
  public static final long MAX_TIME = Long.MAX_VALUE;
  
  public abstract long now();
}

/* Location:
 * Qualified Name:     com.facebook.common.time.Clock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */