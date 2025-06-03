package com.facebook.gamingservices.cloudgaming;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class DaemonReceiver
{
  private static SDKLogger mLogger;
  private static ConcurrentHashMap<String, CompletableFuture<GraphResponse>> requestStore;
  @Nullable
  private static DaemonReceiver single_instance;
  
  @SuppressLint({"BadDependencyInjection"})
  private DaemonReceiver(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter("com.facebook.gamingservices.DAEMON_RESPONSE");
    HandlerThread localHandlerThread = new HandlerThread("com.facebook.gamingservices.DAEMON_RESPONSE_HANDLER");
    localHandlerThread.start();
    paramContext.registerReceiver(new DaemonBroadcastReceiver(null), localIntentFilter, null, new Handler(localHandlerThread.getLooper()));
    requestStore = new ConcurrentHashMap();
    mLogger = SDKLogger.getInstance(paramContext);
  }
  
  private static GraphResponse createDefaultErrorResponse(String paramString)
  {
    return createErrorResponse(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), paramString);
  }
  
  public static GraphResponse createErrorResponse(FacebookRequestError paramFacebookRequestError, @Nullable String paramString)
  {
    mLogger.logSendingErrorResponse(paramFacebookRequestError, paramString);
    return new GraphResponse(null, null, paramFacebookRequestError);
  }
  
  private static GraphResponse createErrorResponse(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONObject("error");
    if (paramJSONObject != null) {
      return createErrorResponse(new FacebookRequestError(paramJSONObject.optInt("code"), paramJSONObject.optString("type"), paramJSONObject.optString("message")), paramString);
    }
    return createDefaultErrorResponse(paramString);
  }
  
  private static GraphResponse createSuccessResponse(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject.optJSONObject("success") != null)
    {
      mLogger.logSendingSuccessResponse(paramString);
      return new GraphResponse(null, null, null, paramJSONObject.optJSONObject("success"));
    }
    if (paramJSONObject.optJSONArray("success") != null)
    {
      mLogger.logSendingSuccessResponse(paramString);
      return new GraphResponse(null, null, null, paramJSONObject.optJSONArray("success"));
    }
    return createDefaultErrorResponse(paramString);
  }
  
  public static DaemonReceiver getInstance(Context paramContext)
  {
    try
    {
      if (single_instance == null)
      {
        DaemonReceiver localDaemonReceiver = new com/facebook/gamingservices/cloudgaming/DaemonReceiver;
        localDaemonReceiver.<init>(paramContext);
        single_instance = localDaemonReceiver;
      }
      paramContext = single_instance;
      return paramContext;
    }
    finally {}
  }
  
  private static GraphResponse processResponse(JSONObject paramJSONObject, String paramString)
  {
    if (!paramJSONObject.isNull("success")) {
      return createSuccessResponse(paramJSONObject, paramString);
    }
    if (!paramJSONObject.isNull("error")) {
      return createErrorResponse(paramJSONObject, paramString);
    }
    return createDefaultErrorResponse(paramString);
  }
  
  public ConcurrentHashMap<String, CompletableFuture<GraphResponse>> getRequestStore()
  {
    try
    {
      ConcurrentHashMap localConcurrentHashMap = requestStore;
      return localConcurrentHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static class DaemonBroadcastReceiver
    extends BroadcastReceiver
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      try
      {
        paramContext = new org/json/JSONObject;
        paramContext.<init>(paramIntent.getStringExtra("returnPayload"));
        paramIntent = paramContext.getString("requestID");
        if (DaemonReceiver.access$100().containsKey(paramIntent))
        {
          CompletableFuture localCompletableFuture = (CompletableFuture)DaemonReceiver.access$100().remove(paramIntent);
          if (localCompletableFuture != null) {
            localCompletableFuture.complete(DaemonReceiver.access$200(paramContext, paramIntent));
          }
        }
        return;
      }
      catch (JSONException paramContext)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.DaemonReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */