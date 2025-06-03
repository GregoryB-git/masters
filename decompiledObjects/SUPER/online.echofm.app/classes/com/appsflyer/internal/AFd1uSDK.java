package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFd1uSDK
  extends TimerTask
{
  private final Thread AFInAppEventType;
  
  public AFd1uSDK(Thread paramThread)
  {
    AFInAppEventType = paramThread;
  }
  
  public final void run()
  {
    AFInAppEventType.interrupt();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1uSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */