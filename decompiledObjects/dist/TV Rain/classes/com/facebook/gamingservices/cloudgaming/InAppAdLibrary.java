package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONObject;

public class InAppAdLibrary
{
  public static final String PLACEMENT_ID = "placementID";
  
  public static void loadInterstitialAd(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.LOAD_INTERSTITIAL_AD);
  }
  
  public static void loadRewardedVideo(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.LOAD_REWARDED_VIDEO);
  }
  
  public static void showInterstitialAd(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.SHOW_INTERSTITIAL_AD);
  }
  
  public static void showRewardedVideo(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.SHOW_REWARDED_VIDEO);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.InAppAdLibrary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */