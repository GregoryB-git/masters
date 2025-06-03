package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppPurchaseActivityLifecycleTracker
{
  private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
  private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
  private static final String TAG = "com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker";
  private static Application.ActivityLifecycleCallbacks callbacks;
  private static Boolean hasBiillingActivity = null;
  private static Boolean hasBillingService;
  private static Object inAppBillingObj;
  private static Intent intent;
  private static final AtomicBoolean isTracking = new AtomicBoolean(false);
  private static ServiceConnection serviceConnection;
  
  static
  {
    hasBillingService = null;
  }
  
  private static void initializeIfNotInitialized()
  {
    if (hasBillingService != null) {
      return;
    }
    try
    {
      Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
      Boolean localBoolean = Boolean.TRUE;
      hasBillingService = localBoolean;
      try
      {
        Class.forName("com.android.billingclient.api.ProxyBillingActivity");
        hasBiillingActivity = localBoolean;
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        hasBiillingActivity = Boolean.FALSE;
      }
      InAppPurchaseEventManager.clearSkuDetailsCache();
      intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
      serviceConnection = new ServiceConnection()
      {
        public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          InAppPurchaseActivityLifecycleTracker.access$002(InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), paramAnonymousIBinder));
        }
        
        public void onServiceDisconnected(ComponentName paramAnonymousComponentName) {}
      };
      callbacks = new Application.ActivityLifecycleCallbacks()
      {
        public void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
        
        public void onActivityDestroyed(Activity paramAnonymousActivity) {}
        
        public void onActivityPaused(Activity paramAnonymousActivity) {}
        
        public void onActivityResumed(Activity paramAnonymousActivity)
        {
          try
          {
            paramAnonymousActivity = FacebookSdk.getExecutor();
            Runnable local1 = new com/facebook/appevents/internal/InAppPurchaseActivityLifecycleTracker$2$1;
            local1.<init>(this);
            paramAnonymousActivity.execute(local1);
            return;
          }
          catch (Exception paramAnonymousActivity)
          {
            for (;;) {}
          }
        }
        
        public void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
        
        public void onActivityStarted(Activity paramAnonymousActivity) {}
        
        public void onActivityStopped(Activity paramAnonymousActivity)
        {
          try
          {
            if ((InAppPurchaseActivityLifecycleTracker.access$200().booleanValue()) && (paramAnonymousActivity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")))
            {
              Executor localExecutor = FacebookSdk.getExecutor();
              paramAnonymousActivity = new com/facebook/appevents/internal/InAppPurchaseActivityLifecycleTracker$2$2;
              paramAnonymousActivity.<init>(this);
              localExecutor.execute(paramAnonymousActivity);
            }
            return;
          }
          catch (Exception paramAnonymousActivity)
          {
            for (;;) {}
          }
        }
      };
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      hasBillingService = Boolean.FALSE;
    }
  }
  
  private static void logPurchase(Context paramContext, ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        localObject = ((JSONObject)localObject).getString("productId");
        localHashMap.put(localObject, str);
        localArrayList.add(localObject);
      }
      catch (JSONException localJSONException)
      {
        Log.e(TAG, "Error parsing in-app purchase data.", localJSONException);
      }
    }
    paramArrayList = InAppPurchaseEventManager.getSkuDetails(paramContext, localArrayList, inAppBillingObj, paramBoolean).entrySet().iterator();
    while (paramArrayList.hasNext())
    {
      paramContext = (Map.Entry)paramArrayList.next();
      AutomaticAnalyticsLogger.logPurchase((String)localHashMap.get(paramContext.getKey()), (String)paramContext.getValue(), paramBoolean);
    }
  }
  
  private static void startTracking()
  {
    if (!isTracking.compareAndSet(false, true)) {
      return;
    }
    Context localContext = FacebookSdk.getApplicationContext();
    if ((localContext instanceof Application))
    {
      ((Application)localContext).registerActivityLifecycleCallbacks(callbacks);
      localContext.bindService(intent, serviceConnection, 1);
    }
  }
  
  public static void update()
  {
    
    if (!hasBillingService.booleanValue()) {
      return;
    }
    if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
      startTracking();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */