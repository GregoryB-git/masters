package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class InAppPurchaseActivityLifecycleTracker$2$1
  implements Runnable
{
  public InAppPurchaseActivityLifecycleTracker$2$1(InAppPurchaseActivityLifecycleTracker.2 param2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Context localContext = FacebookSdk.getApplicationContext();
      InAppPurchaseActivityLifecycleTracker.access$100(localContext, InAppPurchaseEventManager.getPurchasesInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000()), false);
      InAppPurchaseActivityLifecycleTracker.access$100(localContext, InAppPurchaseEventManager.getPurchasesSubs(localContext, InAppPurchaseActivityLifecycleTracker.access$000()), true);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */