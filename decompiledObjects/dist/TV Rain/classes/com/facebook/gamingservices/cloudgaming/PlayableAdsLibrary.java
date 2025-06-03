package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONObject;

public class PlayableAdsLibrary
{
  public static void markGameLoaded(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.MARK_GAME_LOADED);
  }
  
  public static void openAppStore(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.OPEN_APP_STORE);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.PlayableAdsLibrary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */