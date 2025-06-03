package com.facebook.appevents.aam;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class MetadataIndexer
{
  private static final String TAG = "com.facebook.appevents.aam.MetadataIndexer";
  private static Boolean enabled = Boolean.FALSE;
  
  /* Error */
  public static void enable()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 36	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: invokestatic 54	com/facebook/FacebookSdk:getExecutor	()Ljava/util/concurrent/Executor;
    //   12: astore_0
    //   13: new 6	com/facebook/appevents/aam/MetadataIndexer$1
    //   16: astore_1
    //   17: aload_1
    //   18: invokespecial 55	com/facebook/appevents/aam/MetadataIndexer$1:<init>	()V
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface 61 2 0
    //   28: goto +15 -> 43
    //   31: astore_0
    //   32: goto +12 -> 44
    //   35: astore_0
    //   36: getstatic 63	com/facebook/appevents/aam/MetadataIndexer:TAG	Ljava/lang/String;
    //   39: aload_0
    //   40: invokestatic 69	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   43: return
    //   44: aload_0
    //   45: ldc 2
    //   47: invokestatic 43	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   50: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	10	0	localExecutor	java.util.concurrent.Executor
    //   31	1	0	localObject	Object
    //   35	10	0	localException	Exception
    //   16	7	1	local1	1
    // Exception table:
    //   from	to	target	type
    //   9	28	31	finally
    //   36	43	31	finally
    //   9	28	35	java/lang/Exception
  }
  
  /* Error */
  @androidx.annotation.UiThread
  public static void onActivityResumed(android.app.Activity paramActivity)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 36	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: getstatic 25	com/facebook/appevents/aam/MetadataIndexer:enabled	Ljava/lang/Boolean;
    //   12: invokevirtual 76	java/lang/Boolean:booleanValue	()Z
    //   15: ifeq +24 -> 39
    //   18: invokestatic 82	com/facebook/appevents/aam/MetadataRule:getRules	()Ljava/util/Set;
    //   21: invokeinterface 87 1 0
    //   26: ifeq +6 -> 32
    //   29: goto +10 -> 39
    //   32: aload_0
    //   33: invokestatic 92	com/facebook/appevents/aam/MetadataViewObserver:startTrackingActivity	(Landroid/app/Activity;)V
    //   36: goto +11 -> 47
    //   39: return
    //   40: astore_0
    //   41: aload_0
    //   42: ldc 2
    //   44: invokestatic 43	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   47: return
    //   48: astore_0
    //   49: goto -2 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramActivity	android.app.Activity
    // Exception table:
    //   from	to	target	type
    //   9	29	40	finally
    //   32	36	40	finally
    //   9	29	48	java/lang/Exception
    //   32	36	48	java/lang/Exception
  }
  
  private static void updateRules()
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataIndexer.class)) {
      return;
    }
    try
    {
      Object localObject = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
      if (localObject == null) {
        return;
      }
      localObject = ((FetchedAppSettings)localObject).getRawAamRules();
      if (localObject == null) {
        return;
      }
      MetadataRule.updateRules((String)localObject);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, MetadataIndexer.class);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataIndexer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */