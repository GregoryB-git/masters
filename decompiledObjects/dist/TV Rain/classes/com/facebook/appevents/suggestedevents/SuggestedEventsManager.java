package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.ml.ModelManager.Task;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class SuggestedEventsManager
{
  private static final String ELIGIBLE_EVENTS_KEY = "eligible_for_prediction_events";
  private static final String PRODUCTION_EVENTS_KEY = "production_events";
  private static final Set<String> eligibleEvents = new HashSet();
  private static final AtomicBoolean enabled = new AtomicBoolean(false);
  private static final Set<String> productionEvents = new HashSet();
  
  /* Error */
  public static void enable()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 51	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 66	com/facebook/FacebookSdk:getExecutor	()Ljava/util/concurrent/Executor;
    //   20: astore_1
    //   21: new 6	com/facebook/appevents/suggestedevents/SuggestedEventsManager$1
    //   24: astore_2
    //   25: aload_2
    //   26: invokespecial 67	com/facebook/appevents/suggestedevents/SuggestedEventsManager$1:<init>	()V
    //   29: aload_1
    //   30: aload_2
    //   31: invokeinterface 73 2 0
    //   36: ldc 2
    //   38: monitorexit
    //   39: return
    //   40: astore_2
    //   41: aload_2
    //   42: ldc 2
    //   44: invokestatic 55	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   47: ldc 2
    //   49: monitorexit
    //   50: return
    //   51: astore_2
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   20	10	1	localExecutor	java.util.concurrent.Executor
    //   24	7	2	local1	1
    //   40	2	2	localThrowable	Throwable
    //   51	5	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	36	40	finally
    //   3	9	51	finally
    //   41	47	51	finally
  }
  
  private static void initialize()
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventsManager.class)) {
      return;
    }
    try
    {
      try
      {
        Object localObject = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        if (localObject == null) {
          return;
        }
        localObject = ((FetchedAppSettings)localObject).getSuggestedEventsSetting();
        if (localObject == null) {
          return;
        }
        populateEventsFromRawJsonString((String)localObject);
        if ((!productionEvents.isEmpty()) || (!eligibleEvents.isEmpty()))
        {
          localObject = ModelManager.getRuleFile(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
          if (localObject == null) {
            return;
          }
          FeatureExtractor.initialize((File)localObject);
          localObject = ActivityLifecycleTracker.getCurrentActivity();
          if (localObject != null) {
            trackActivity((Activity)localObject);
          }
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, SuggestedEventsManager.class);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static boolean isEligibleEvents(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventsManager.class)) {
      return false;
    }
    try
    {
      boolean bool = eligibleEvents.contains(paramString);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, SuggestedEventsManager.class);
    }
    return false;
  }
  
  public static boolean isEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventsManager.class)) {
      return false;
    }
    try
    {
      boolean bool = enabled.get();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, SuggestedEventsManager.class);
    }
    return false;
  }
  
  public static boolean isProductionEvents(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventsManager.class)) {
      return false;
    }
    try
    {
      boolean bool = productionEvents.contains(paramString);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, SuggestedEventsManager.class);
    }
    return false;
  }
  
  /* Error */
  public static void populateEventsFromRawJsonString(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 51	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: new 139	org/json/JSONObject
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokespecial 141	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ldc 17
    //   21: invokevirtual 144	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   24: istore_2
    //   25: iconst_0
    //   26: istore_3
    //   27: iload_2
    //   28: ifeq +43 -> 71
    //   31: aload_1
    //   32: ldc 17
    //   34: invokevirtual 148	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   37: astore_0
    //   38: iconst_0
    //   39: istore 4
    //   41: iload 4
    //   43: aload_0
    //   44: invokevirtual 154	org/json/JSONArray:length	()I
    //   47: if_icmpge +24 -> 71
    //   50: getstatic 39	com/facebook/appevents/suggestedevents/SuggestedEventsManager:productionEvents	Ljava/util/Set;
    //   53: aload_0
    //   54: iload 4
    //   56: invokevirtual 158	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   59: invokeinterface 161 2 0
    //   64: pop
    //   65: iinc 4 1
    //   68: goto -27 -> 41
    //   71: aload_1
    //   72: ldc 14
    //   74: invokevirtual 144	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   77: ifeq +50 -> 127
    //   80: aload_1
    //   81: ldc 14
    //   83: invokevirtual 148	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   86: astore_0
    //   87: iload_3
    //   88: istore 4
    //   90: iload 4
    //   92: aload_0
    //   93: invokevirtual 154	org/json/JSONArray:length	()I
    //   96: if_icmpge +31 -> 127
    //   99: getstatic 41	com/facebook/appevents/suggestedevents/SuggestedEventsManager:eligibleEvents	Ljava/util/Set;
    //   102: aload_0
    //   103: iload 4
    //   105: invokevirtual 158	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   108: invokeinterface 161 2 0
    //   113: pop
    //   114: iinc 4 1
    //   117: goto -27 -> 90
    //   120: astore_0
    //   121: aload_0
    //   122: ldc 2
    //   124: invokestatic 55	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   127: return
    //   128: astore_0
    //   129: goto -2 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	paramString	String
    //   12	69	1	localJSONObject	org.json.JSONObject
    //   24	4	2	bool	boolean
    //   26	62	3	i	int
    //   39	76	4	j	int
    // Exception table:
    //   from	to	target	type
    //   9	25	120	finally
    //   31	38	120	finally
    //   41	65	120	finally
    //   71	87	120	finally
    //   90	114	120	finally
    //   9	25	128	java/lang/Exception
    //   31	38	128	java/lang/Exception
    //   41	65	128	java/lang/Exception
    //   71	87	128	java/lang/Exception
    //   90	114	128	java/lang/Exception
  }
  
  public static void trackActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventsManager.class)) {
      return;
    }
    try
    {
      try
      {
        if ((enabled.get()) && (FeatureExtractor.isInitialized()) && ((!productionEvents.isEmpty()) || (!eligibleEvents.isEmpty()))) {
          ViewObserver.startTrackingActivity(paramActivity);
        } else {
          ViewObserver.stopTrackingActivity(paramActivity);
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramActivity, SuggestedEventsManager.class);
      }
      return;
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.SuggestedEventsManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */