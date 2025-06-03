package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

public class DaemonRequest
{
  private Callback mCallback;
  private Context mContext;
  private SDKLogger mLogger;
  private JSONObject mParameters;
  private ConcurrentHashMap<String, CompletableFuture<GraphResponse>> mRequestStore;
  
  public DaemonRequest(Context paramContext, JSONObject paramJSONObject, Callback paramCallback)
  {
    mContext = paramContext;
    mParameters = paramJSONObject;
    mCallback = paramCallback;
    mRequestStore = DaemonReceiver.getInstance(paramContext).getRequestStore();
    mLogger = SDKLogger.getInstance(paramContext);
  }
  
  private CompletableFuture<GraphResponse> createRequest()
  {
    CompletableFuture.supplyAsync(new Supplier()
    {
      public GraphResponse get()
      {
        String str1 = UUID.randomUUID().toString();
        try
        {
          DaemonRequest.access$100(DaemonRequest.this).put("requestID", str1);
          Object localObject1 = new android/content/Intent;
          ((Intent)localObject1).<init>();
          String str2 = DaemonRequest.access$100(DaemonRequest.this).getString("type");
          DaemonRequest.access$200(DaemonRequest.this).logPreparingRequest(str2, str1, DaemonRequest.access$100(DaemonRequest.this));
          if ((!str2.equals(SDKMessageEnum.GET_ACCESS_TOKEN.toString())) && (!str2.equals(SDKMessageEnum.IS_ENV_READY.toString())))
          {
            localObject2 = DaemonRequest.access$300(DaemonRequest.this).getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).getString("daemonPackageName", null);
            if (localObject2 == null)
            {
              localObject1 = new com/facebook/FacebookRequestError;
              ((FacebookRequestError)localObject1).<init>(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection");
              return DaemonReceiver.createErrorResponse((FacebookRequestError)localObject1, str1);
            }
            ((Intent)localObject1).setPackage((String)localObject2);
          }
          ((Intent)localObject1).setAction("com.facebook.gamingservices.DAEMON_REQUEST");
          Object localObject2 = DaemonRequest.access$100(DaemonRequest.this).keys();
          while (((Iterator)localObject2).hasNext())
          {
            String str3 = (String)((Iterator)localObject2).next();
            ((Intent)localObject1).putExtra(str3, DaemonRequest.access$100(DaemonRequest.this).getString(str3));
          }
          DaemonRequest.access$300(DaemonRequest.this).sendBroadcast((Intent)localObject1);
          DaemonRequest.access$200(DaemonRequest.this).logSentRequest(str2, str1, DaemonRequest.access$100(DaemonRequest.this));
          localObject1 = new java/util/concurrent/CompletableFuture;
          ((CompletableFuture)localObject1).<init>();
          DaemonRequest.access$400(DaemonRequest.this).put(str1, localObject1);
          localObject1 = (GraphResponse)((CompletableFuture)localObject1).get();
          return (GraphResponse)localObject1;
        }
        catch (JSONException|InterruptedException|ExecutionException localJSONException) {}
        return DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), str1);
      }
    });
  }
  
  private GraphResponse executeAndWait()
    throws ExecutionException, InterruptedException
  {
    return (GraphResponse)createRequest().get();
  }
  
  private GraphResponse executeAndWait(int paramInt)
    throws ExecutionException, InterruptedException, TimeoutException
  {
    return (GraphResponse)createRequest().get(paramInt, TimeUnit.SECONDS);
  }
  
  public static GraphResponse executeAndWait(Context paramContext, @Nullable JSONObject paramJSONObject, SDKMessageEnum paramSDKMessageEnum)
  {
    if (paramJSONObject == null) {}
    try
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      break label37;
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      label37:
      paramSDKMessageEnum = new com/facebook/gamingservices/cloudgaming/DaemonRequest;
      paramSDKMessageEnum.<init>(paramContext, paramJSONObject, null);
      paramContext = paramSDKMessageEnum.executeAndWait();
      return paramContext;
    }
    catch (JSONException|ExecutionException|InterruptedException paramContext) {}
    return DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
  }
  
  public static GraphResponse executeAndWait(Context paramContext, @Nullable JSONObject paramJSONObject, SDKMessageEnum paramSDKMessageEnum, int paramInt)
  {
    if (paramJSONObject == null) {}
    try
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      break label37;
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      label37:
      paramSDKMessageEnum = new com/facebook/gamingservices/cloudgaming/DaemonRequest;
      paramSDKMessageEnum.<init>(paramContext, paramJSONObject, null);
      paramContext = paramSDKMessageEnum.executeAndWait(paramInt);
      return paramContext;
    }
    catch (JSONException|ExecutionException|InterruptedException|TimeoutException paramContext) {}
    return DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
  }
  
  private void executeAsync()
    throws ExecutionException, InterruptedException
  {
    createRequest().thenAccept(new Consumer()
    {
      public void accept(GraphResponse paramAnonymousGraphResponse)
      {
        if (DaemonRequest.access$000(DaemonRequest.this) != null) {
          DaemonRequest.access$000(DaemonRequest.this).onCompleted(paramAnonymousGraphResponse);
        }
      }
    });
  }
  
  public static void executeAsync(Context paramContext, @Nullable JSONObject paramJSONObject, Callback paramCallback, SDKMessageEnum paramSDKMessageEnum)
  {
    if (paramJSONObject == null) {}
    try
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      break label37;
      paramJSONObject = paramJSONObject.put("type", paramSDKMessageEnum.toString());
      label37:
      paramSDKMessageEnum = new com/facebook/gamingservices/cloudgaming/DaemonRequest;
      paramSDKMessageEnum.<init>(paramContext, paramJSONObject, paramCallback);
      paramSDKMessageEnum.executeAsync();
    }
    catch (JSONException|ExecutionException|InterruptedException paramContext)
    {
      if (paramCallback != null) {
        paramCallback.onCompleted(DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
      }
    }
  }
  
  public static void executeAsync(Context paramContext, @Nullable JSONObject paramJSONObject, Callback paramCallback, String paramString)
  {
    if (paramJSONObject == null) {}
    try
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
      paramJSONObject = paramJSONObject.put("type", paramString);
      break label31;
      paramJSONObject = paramJSONObject.put("type", paramString);
      label31:
      paramString = new com/facebook/gamingservices/cloudgaming/DaemonRequest;
      paramString.<init>(paramContext, paramJSONObject, paramCallback);
      paramString.executeAsync();
    }
    catch (JSONException|ExecutionException|InterruptedException paramContext)
    {
      if (paramCallback != null) {
        paramCallback.onCompleted(DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
      }
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void onCompleted(GraphResponse paramGraphResponse);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.DaemonRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */