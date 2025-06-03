package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONObject;

public class GameFeaturesLibrary
{
  public static void canCreateShortcut(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.CAN_CREATE_SHORTCUT);
  }
  
  public static void createShortcut(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.CREATE_SHORTCUT);
  }
  
  public static void getPayload(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.GET_PAYLOAD);
  }
  
  public static void postSessionScore(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.POST_SESSION_SCORE);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.GameFeaturesLibrary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */