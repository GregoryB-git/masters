package com.facebook.appevents.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;

final class InAppPurchaseActivityLifecycleTracker$1
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    InAppPurchaseActivityLifecycleTracker.access$002(InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), paramIBinder));
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */