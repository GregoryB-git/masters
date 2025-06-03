package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

class DaemonRequest$2
  implements Supplier<GraphResponse>
{
  public DaemonRequest$2(DaemonRequest paramDaemonRequest) {}
  
  public GraphResponse get()
  {
    String str1 = UUID.randomUUID().toString();
    try
    {
      DaemonRequest.access$100(this$0).put("requestID", str1);
      Object localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      String str2 = DaemonRequest.access$100(this$0).getString("type");
      DaemonRequest.access$200(this$0).logPreparingRequest(str2, str1, DaemonRequest.access$100(this$0));
      if ((!str2.equals(SDKMessageEnum.GET_ACCESS_TOKEN.toString())) && (!str2.equals(SDKMessageEnum.IS_ENV_READY.toString())))
      {
        localObject2 = DaemonRequest.access$300(this$0).getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).getString("daemonPackageName", null);
        if (localObject2 == null)
        {
          localObject1 = new com/facebook/FacebookRequestError;
          ((FacebookRequestError)localObject1).<init>(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection");
          return DaemonReceiver.createErrorResponse((FacebookRequestError)localObject1, str1);
        }
        ((Intent)localObject1).setPackage((String)localObject2);
      }
      ((Intent)localObject1).setAction("com.facebook.gamingservices.DAEMON_REQUEST");
      Object localObject2 = DaemonRequest.access$100(this$0).keys();
      while (((Iterator)localObject2).hasNext())
      {
        String str3 = (String)((Iterator)localObject2).next();
        ((Intent)localObject1).putExtra(str3, DaemonRequest.access$100(this$0).getString(str3));
      }
      DaemonRequest.access$300(this$0).sendBroadcast((Intent)localObject1);
      DaemonRequest.access$200(this$0).logSentRequest(str2, str1, DaemonRequest.access$100(this$0));
      localObject1 = new java/util/concurrent/CompletableFuture;
      ((CompletableFuture)localObject1).<init>();
      DaemonRequest.access$400(this$0).put(str1, localObject1);
      localObject1 = (GraphResponse)((CompletableFuture)localObject1).get();
      return (GraphResponse)localObject1;
    }
    catch (JSONException|InterruptedException|ExecutionException localJSONException) {}
    return DaemonReceiver.createErrorResponse(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), str1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.DaemonRequest.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */