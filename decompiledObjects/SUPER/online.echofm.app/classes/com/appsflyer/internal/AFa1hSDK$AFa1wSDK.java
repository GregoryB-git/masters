package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.appsflyer.AFLogger;
import java.util.concurrent.LinkedBlockingQueue;

final class AFa1hSDK$AFa1wSDK
  implements ServiceConnection
{
  final LinkedBlockingQueue<IBinder> AFInAppEventType = new LinkedBlockingQueue(1);
  boolean AFKeystoreWrapper = false;
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      AFInAppEventType.put(paramIBinder);
      return;
    }
    catch (InterruptedException paramComponentName)
    {
      AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", paramComponentName);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1hSDK.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */