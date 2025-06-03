package com.facebook.gamingservices;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequest.OnProgressCallback;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class OpenGamingMediaDialog
  implements GraphRequest.OnProgressCallback
{
  private Context context;
  private GraphRequest.Callback nestedCallback;
  
  public OpenGamingMediaDialog(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public OpenGamingMediaDialog(Context paramContext, GraphRequest.Callback paramCallback)
  {
    context = paramContext;
    nestedCallback = paramCallback;
  }
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    Object localObject = nestedCallback;
    if (localObject != null) {
      ((GraphRequest.Callback)localObject).onCompleted(paramGraphResponse);
    }
    if ((paramGraphResponse != null) && (paramGraphResponse.getError() == null))
    {
      localObject = paramGraphResponse.getJSONObject().optString("id", null);
      paramGraphResponse = paramGraphResponse.getJSONObject().optString("video_id", null);
      if ((localObject == null) && (paramGraphResponse == null)) {
        return;
      }
      if (localObject != null) {
        paramGraphResponse = (GraphResponse)localObject;
      }
      if (CloudGameLoginHandler.isRunningInCloud()) {
        localObject = new JSONObject();
      }
    }
    try
    {
      ((JSONObject)localObject).put("id", paramGraphResponse);
      ((JSONObject)localObject).put("deepLink", "MEDIA_ASSET");
      DaemonRequest.executeAsync(context, (JSONObject)localObject, null, SDKMessageEnum.OPEN_GAMING_SERVICES_DEEP_LINK);
    }
    catch (JSONException paramGraphResponse)
    {
      for (;;) {}
    }
    paramGraphResponse = new Intent("android.intent.action.VIEW", Uri.parse(z2.o("https://fb.gg/me/media_asset/", paramGraphResponse)));
    context.startActivity(paramGraphResponse);
  }
  
  public void onProgress(long paramLong1, long paramLong2)
  {
    GraphRequest.Callback localCallback = nestedCallback;
    if ((localCallback != null) && ((localCallback instanceof GraphRequest.OnProgressCallback))) {
      ((GraphRequest.OnProgressCallback)localCallback).onProgress(paramLong1, paramLong2);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.OpenGamingMediaDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */