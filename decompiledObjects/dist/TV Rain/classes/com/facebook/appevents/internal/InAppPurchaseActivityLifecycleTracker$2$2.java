package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;

class InAppPurchaseActivityLifecycleTracker$2$2
  implements Runnable
{
  public InAppPurchaseActivityLifecycleTracker$2$2(InAppPurchaseActivityLifecycleTracker.2 param2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Context localContext = FacebookSdk.getApplicationContext();
      ArrayList localArrayList1 = InAppPurchaseEventManager.getPurchasesInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000());
      ArrayList localArrayList2 = localArrayList1;
      if (localArrayList1.isEmpty()) {
        localArrayList2 = InAppPurchaseEventManager.getPurchaseHistoryInapp(localContext, InAppPurchaseActivityLifecycleTracker.access$000());
      }
      InAppPurchaseActivityLifecycleTracker.access$100(localContext, localArrayList2, false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */