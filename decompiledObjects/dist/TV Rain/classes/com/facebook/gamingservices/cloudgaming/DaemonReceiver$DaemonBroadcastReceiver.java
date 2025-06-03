package com.facebook.gamingservices.cloudgaming;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

class DaemonReceiver$DaemonBroadcastReceiver
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

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.DaemonReceiver.DaemonBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */