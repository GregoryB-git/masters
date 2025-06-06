package com.facebook.common.executors;

import java.util.concurrent.ScheduledExecutorService;

public abstract interface HandlerExecutorService
  extends ScheduledExecutorService
{
  public abstract boolean isHandlerThread();
  
  public abstract void quit();
}

/* Location:
 * Qualified Name:     com.facebook.common.executors.HandlerExecutorService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */