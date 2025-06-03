package com.facebook.appevents;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class AppEventQueue
{
  private static final int FLUSH_PERIOD_IN_SECONDS = 15;
  private static final Integer NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = Integer.valueOf(100);
  private static final String TAG = "com.facebook.appevents.AppEventQueue";
  private static volatile AppEventCollection appEventCollection = new AppEventCollection();
  private static final Runnable flushRunnable = new Runnable()
  {
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        AppEventQueue.access$002(null);
        if (AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
          AppEventQueue.flushAndWait(FlushReason.TIMER);
        }
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  };
  private static ScheduledFuture scheduledFuture;
  private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
  
  public static void add(AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEvent paramAppEvent)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return;
    }
    try
    {
      ScheduledExecutorService localScheduledExecutorService = singleThreadExecutor;
      Runnable local4 = new com/facebook/appevents/AppEventQueue$4;
      local4.<init>(paramAccessTokenAppIdPair, paramAppEvent);
      localScheduledExecutorService.execute(local4);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, AppEventQueue.class);
    }
  }
  
  public static GraphRequest buildRequestForSession(AccessTokenAppIdPair paramAccessTokenAppIdPair, SessionEventsState paramSessionEventsState, boolean paramBoolean, FlushStatistics paramFlushStatistics)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return null;
    }
    try
    {
      Object localObject1 = paramAccessTokenAppIdPair.getApplicationId();
      boolean bool = false;
      FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.queryAppSettings((String)localObject1, false);
      GraphRequest localGraphRequest = GraphRequest.newPostRequest(null, String.format("%s/activities", new Object[] { localObject1 }), null, null);
      Object localObject2 = localGraphRequest.getParameters();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
      }
      ((BaseBundle)localObject1).putString("access_token", paramAccessTokenAppIdPair.getAccessTokenString());
      localObject2 = InternalAppEventsLogger.getPushNotificationsRegistrationId();
      if (localObject2 != null) {
        ((BaseBundle)localObject1).putString("device_token", (String)localObject2);
      }
      localObject2 = AppEventsLoggerImpl.getInstallReferrer();
      if (localObject2 != null) {
        ((BaseBundle)localObject1).putString("install_referrer", (String)localObject2);
      }
      localGraphRequest.setParameters((Bundle)localObject1);
      if (localFetchedAppSettings != null) {
        bool = localFetchedAppSettings.supportsImplicitLogging();
      }
      int i = paramSessionEventsState.populateRequest(localGraphRequest, FacebookSdk.getApplicationContext(), bool, paramBoolean);
      if (i == 0) {
        return null;
      }
      numEvents += i;
      localObject1 = new com/facebook/appevents/AppEventQueue$5;
      ((5)localObject1).<init>(paramAccessTokenAppIdPair, localGraphRequest, paramSessionEventsState, paramFlushStatistics);
      localGraphRequest.setCallback((GraphRequest.Callback)localObject1);
      return localGraphRequest;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, AppEventQueue.class);
    }
    return null;
  }
  
  public static List<GraphRequest> buildRequests(AppEventCollection paramAppEventCollection, FlushStatistics paramFlushStatistics)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return null;
    }
    try
    {
      boolean bool = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = paramAppEventCollection.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (AccessTokenAppIdPair)localIterator.next();
        localObject = buildRequestForSession((AccessTokenAppIdPair)localObject, paramAppEventCollection.get((AccessTokenAppIdPair)localObject), bool, paramFlushStatistics);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAppEventCollection, AppEventQueue.class);
    }
    return null;
  }
  
  public static void flush(FlushReason paramFlushReason)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return;
    }
    try
    {
      ScheduledExecutorService localScheduledExecutorService = singleThreadExecutor;
      Runnable local3 = new com/facebook/appevents/AppEventQueue$3;
      local3.<init>(paramFlushReason);
      localScheduledExecutorService.execute(local3);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFlushReason, AppEventQueue.class);
    }
  }
  
  public static void flushAndWait(FlushReason paramFlushReason)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return;
    }
    try
    {
      Object localObject = AppEventStore.readAndClearStore();
      appEventCollection.addPersistedEvents((PersistedEvents)localObject);
      try
      {
        localObject = sendEventsToServer(paramFlushReason, appEventCollection);
        if (localObject != null)
        {
          paramFlushReason = new android/content/Intent;
          paramFlushReason.<init>("com.facebook.sdk.APP_EVENTS_FLUSHED");
          paramFlushReason.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", numEvents);
          paramFlushReason.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", result);
          LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(paramFlushReason);
        }
        return;
      }
      catch (Exception paramFlushReason)
      {
        Log.w(TAG, "Caught unexpected exception while flushing app events: ", paramFlushReason);
        return;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFlushReason, AppEventQueue.class);
    }
  }
  
  public static Set<AccessTokenAppIdPair> getKeySet()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return null;
    }
    try
    {
      Set localSet = appEventCollection.keySet();
      return localSet;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventQueue.class);
    }
    return null;
  }
  
  public static void handleResponse(AccessTokenAppIdPair paramAccessTokenAppIdPair, GraphRequest paramGraphRequest, GraphResponse paramGraphResponse, SessionEventsState paramSessionEventsState, FlushStatistics paramFlushStatistics)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return;
    }
    try
    {
      FacebookRequestError localFacebookRequestError = paramGraphResponse.getError();
      Object localObject = "Success";
      FlushResult localFlushResult = FlushResult.SUCCESS;
      boolean bool = true;
      if (localFacebookRequestError != null) {
        if (localFacebookRequestError.getErrorCode() == -1)
        {
          localObject = "Failed: No Connectivity";
          localFlushResult = FlushResult.NO_CONNECTIVITY;
        }
        else
        {
          localObject = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] { paramGraphResponse.toString(), localFacebookRequestError.toString() });
          localFlushResult = FlushResult.SERVER_ERROR;
        }
      }
      if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS))
      {
        String str = (String)paramGraphRequest.getTag();
        try
        {
          paramGraphResponse = new org/json/JSONArray;
          paramGraphResponse.<init>(str);
          paramGraphResponse = paramGraphResponse.toString(2);
        }
        catch (JSONException paramGraphResponse)
        {
          paramGraphResponse = "<Can't encode events for debug logging>";
        }
        Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] { paramGraphRequest.getGraphObject().toString(), localObject, paramGraphResponse });
      }
      if (localFacebookRequestError == null) {
        bool = false;
      }
      paramSessionEventsState.clearInFlightAndStats(bool);
      paramGraphResponse = FlushResult.NO_CONNECTIVITY;
      if (localFlushResult == paramGraphResponse)
      {
        localObject = FacebookSdk.getExecutor();
        paramGraphRequest = new com/facebook/appevents/AppEventQueue$6;
        paramGraphRequest.<init>(paramAccessTokenAppIdPair, paramSessionEventsState);
        ((Executor)localObject).execute(paramGraphRequest);
      }
      if ((localFlushResult != FlushResult.SUCCESS) && (result != paramGraphResponse)) {
        result = localFlushResult;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessTokenAppIdPair, AppEventQueue.class);
    }
  }
  
  public static void persistToDisk()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return;
    }
    try
    {
      ScheduledExecutorService localScheduledExecutorService = singleThreadExecutor;
      Runnable local2 = new com/facebook/appevents/AppEventQueue$2;
      local2.<init>();
      localScheduledExecutorService.execute(local2);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventQueue.class);
    }
  }
  
  private static FlushStatistics sendEventsToServer(FlushReason paramFlushReason, AppEventCollection paramAppEventCollection)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
      return null;
    }
    try
    {
      FlushStatistics localFlushStatistics = new com/facebook/appevents/FlushStatistics;
      localFlushStatistics.<init>();
      paramAppEventCollection = buildRequests(paramAppEventCollection, localFlushStatistics);
      if (paramAppEventCollection.size() > 0)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(numEvents), paramFlushReason.toString() });
        paramFlushReason = paramAppEventCollection.iterator();
        while (paramFlushReason.hasNext()) {
          ((GraphRequest)paramFlushReason.next()).executeAndWait();
        }
        return localFlushStatistics;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFlushReason, AppEventQueue.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */