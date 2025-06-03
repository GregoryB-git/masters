package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Set;

public final class AFc1bSDK$4
  implements Runnable
{
  public AFc1bSDK$4(AFc1bSDK paramAFc1bSDK, AFd1zSDK paramAFd1zSDK) {}
  
  public final void run()
  {
    AFc1bSDK localAFc1bSDK;
    AFd1zSDK localAFd1zSDK;
    Object localObject6;
    boolean bool1;
    boolean bool2;
    int i;
    boolean bool3;
    boolean bool4;
    Object localObject3;
    synchronized (AFKeystoreWrapper.AFLogger)
    {
      if (AFKeystoreWrapper.afErrorLog.contains(AFInAppEventType))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("QUEUE: tried to add already running task: ");
        localStringBuilder.append(AFInAppEventType);
        AFLogger.afDebugLog(localStringBuilder.toString());
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1bSDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */