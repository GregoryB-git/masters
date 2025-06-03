package com.facebook.gamingservices.cloudgaming.internal;

import androidx.annotation.Nullable;

public enum SDKMessageEnum
{
  private final String mStringValue;
  
  static
  {
    SDKMessageEnum localSDKMessageEnum1 = new SDKMessageEnum("OPEN_PLAY_STORE", 0, "openPlayStore");
    OPEN_PLAY_STORE = localSDKMessageEnum1;
    SDKMessageEnum localSDKMessageEnum2 = new SDKMessageEnum("OPEN_APP_STORE", 1, "openAppStore");
    OPEN_APP_STORE = localSDKMessageEnum2;
    SDKMessageEnum localSDKMessageEnum3 = new SDKMessageEnum("MARK_GAME_LOADED", 2, "markGameLoaded");
    MARK_GAME_LOADED = localSDKMessageEnum3;
    SDKMessageEnum localSDKMessageEnum4 = new SDKMessageEnum("GET_PLAYER_DATA", 3, "getPlayerData");
    GET_PLAYER_DATA = localSDKMessageEnum4;
    SDKMessageEnum localSDKMessageEnum5 = new SDKMessageEnum("SET_PLAYER_DATA", 4, "setPlayerData");
    SET_PLAYER_DATA = localSDKMessageEnum5;
    SDKMessageEnum localSDKMessageEnum6 = new SDKMessageEnum("GET_CATALOG", 5, "getCatalog");
    GET_CATALOG = localSDKMessageEnum6;
    SDKMessageEnum localSDKMessageEnum7 = new SDKMessageEnum("GET_PURCHASES", 6, "getPurchases");
    GET_PURCHASES = localSDKMessageEnum7;
    SDKMessageEnum localSDKMessageEnum8 = new SDKMessageEnum("PURCHASE", 7, "purchase");
    PURCHASE = localSDKMessageEnum8;
    SDKMessageEnum localSDKMessageEnum9 = new SDKMessageEnum("CONSUME_PURCHASE", 8, "consumePurchase");
    CONSUME_PURCHASE = localSDKMessageEnum9;
    SDKMessageEnum localSDKMessageEnum10 = new SDKMessageEnum("ON_READY", 9, "onReady");
    ON_READY = localSDKMessageEnum10;
    SDKMessageEnum localSDKMessageEnum11 = new SDKMessageEnum("LOAD_INTERSTITIAL_AD", 10, "loadInterstitialAd");
    LOAD_INTERSTITIAL_AD = localSDKMessageEnum11;
    SDKMessageEnum localSDKMessageEnum12 = new SDKMessageEnum("LOAD_REWARDED_VIDEO", 11, "loadRewardedVideo");
    LOAD_REWARDED_VIDEO = localSDKMessageEnum12;
    SDKMessageEnum localSDKMessageEnum13 = new SDKMessageEnum("SHOW_INTERSTITIAL_AD", 12, "showInterstitialAd");
    SHOW_INTERSTITIAL_AD = localSDKMessageEnum13;
    SDKMessageEnum localSDKMessageEnum14 = new SDKMessageEnum("SHOW_REWARDED_VIDEO", 13, "showRewardedVideo");
    SHOW_REWARDED_VIDEO = localSDKMessageEnum14;
    SDKMessageEnum localSDKMessageEnum15 = new SDKMessageEnum("GET_ACCESS_TOKEN", 14, "getAccessToken");
    GET_ACCESS_TOKEN = localSDKMessageEnum15;
    SDKMessageEnum localSDKMessageEnum16 = new SDKMessageEnum("GET_CONTEXT_TOKEN", 15, "getContextToken");
    GET_CONTEXT_TOKEN = localSDKMessageEnum16;
    SDKMessageEnum localSDKMessageEnum17 = new SDKMessageEnum("GET_PAYLOAD", 16, "getPayload");
    GET_PAYLOAD = localSDKMessageEnum17;
    SDKMessageEnum localSDKMessageEnum18 = new SDKMessageEnum("IS_ENV_READY", 17, "isEnvReady");
    IS_ENV_READY = localSDKMessageEnum18;
    SDKMessageEnum localSDKMessageEnum19 = new SDKMessageEnum("SHARE", 18, "share");
    SHARE = localSDKMessageEnum19;
    SDKMessageEnum localSDKMessageEnum20 = new SDKMessageEnum("CAN_CREATE_SHORTCUT", 19, "canCreateShortcut");
    CAN_CREATE_SHORTCUT = localSDKMessageEnum20;
    SDKMessageEnum localSDKMessageEnum21 = new SDKMessageEnum("CREATE_SHORTCUT", 20, "createShortcut");
    CREATE_SHORTCUT = localSDKMessageEnum21;
    SDKMessageEnum localSDKMessageEnum22 = new SDKMessageEnum("OPEN_GAMING_SERVICES_DEEP_LINK", 21, "openGamingServicesDeepLink");
    OPEN_GAMING_SERVICES_DEEP_LINK = localSDKMessageEnum22;
    SDKMessageEnum localSDKMessageEnum23 = new SDKMessageEnum("OPEN_GAME_REQUESTS_DIALOG", 22, "openGameRequestsDialog");
    OPEN_GAME_REQUESTS_DIALOG = localSDKMessageEnum23;
    SDKMessageEnum localSDKMessageEnum24 = new SDKMessageEnum("POST_SESSION_SCORE", 23, "postSessionScore");
    POST_SESSION_SCORE = localSDKMessageEnum24;
    $VALUES = new SDKMessageEnum[] { localSDKMessageEnum1, localSDKMessageEnum2, localSDKMessageEnum3, localSDKMessageEnum4, localSDKMessageEnum5, localSDKMessageEnum6, localSDKMessageEnum7, localSDKMessageEnum8, localSDKMessageEnum9, localSDKMessageEnum10, localSDKMessageEnum11, localSDKMessageEnum12, localSDKMessageEnum13, localSDKMessageEnum14, localSDKMessageEnum15, localSDKMessageEnum16, localSDKMessageEnum17, localSDKMessageEnum18, localSDKMessageEnum19, localSDKMessageEnum20, localSDKMessageEnum21, localSDKMessageEnum22, localSDKMessageEnum23, localSDKMessageEnum24 };
  }
  
  private SDKMessageEnum(String paramString)
  {
    mStringValue = paramString;
  }
  
  @Nullable
  public static SDKMessageEnum fromString(String paramString)
  {
    for (SDKMessageEnum localSDKMessageEnum : ) {
      if (localSDKMessageEnum.toString().equals(paramString)) {
        return localSDKMessageEnum;
      }
    }
    return null;
  }
  
  public String toString()
  {
    return mStringValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */