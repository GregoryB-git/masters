package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.adq;
import com.google.ads.interactivemedia.v3.internal.adv;
import com.google.ads.interactivemedia.v3.internal.adw;
import com.google.ads.interactivemedia.v3.internal.ady;
import com.google.ads.interactivemedia.v3.internal.afy;
import com.google.ads.interactivemedia.v3.internal.ahw;
import com.google.ads.interactivemedia.v3.internal.aib;
import java.util.List;
import java.util.Map;

final class o
  implements ae
{
  private aib<String, String> adTagParameters;
  private String adTagUrl;
  private String adsResponse;
  private String apiKey;
  private String assetKey;
  private String authToken;
  private aib<String, String> companionSlots;
  private Float contentDuration;
  private ahw<String> contentKeywords;
  private String contentSourceId;
  private String contentTitle;
  private String env;
  private aib<String, ab> experimentState;
  private aib<String, String> extraParameters;
  private String format;
  private afy identifierInfo;
  private Boolean isTv;
  private Integer linearAdSlotHeight;
  private Integer linearAdSlotWidth;
  private Float liveStreamPrefetchSeconds;
  private adq marketAppInfo;
  private String msParameter;
  private String network;
  private ImaSdkSettings settings;
  private String streamActivityMonitorId;
  private Boolean useQAStreamBaseUrl;
  private Boolean usesCustomVideoPlayback;
  private Float vastLoadTimeout;
  private adv videoContinuousPlay;
  private String videoId;
  private adw videoPlayActivation;
  private ady videoPlayMuted;
  
  public final ae adTagParameters(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      paramMap = null;
    } else {
      paramMap = aib.a(paramMap);
    }
    adTagParameters = paramMap;
    return this;
  }
  
  public final ae adTagUrl(String paramString)
  {
    adTagUrl = paramString;
    return this;
  }
  
  public final ae adsResponse(String paramString)
  {
    adsResponse = paramString;
    return this;
  }
  
  public final ae apiKey(String paramString)
  {
    apiKey = paramString;
    return this;
  }
  
  public final ae assetKey(String paramString)
  {
    assetKey = paramString;
    return this;
  }
  
  public final ae authToken(String paramString)
  {
    authToken = paramString;
    return this;
  }
  
  public final ad build()
  {
    return new l(adsResponse, adTagUrl, assetKey, authToken, contentSourceId, videoId, apiKey, format, adTagParameters, env, network, contentDuration, contentKeywords, contentTitle, vastLoadTimeout, liveStreamPrefetchSeconds, companionSlots, extraParameters, isTv, msParameter, linearAdSlotWidth, linearAdSlotHeight, usesCustomVideoPlayback, streamActivityMonitorId, experimentState, identifierInfo, useQAStreamBaseUrl, videoPlayActivation, videoContinuousPlay, videoPlayMuted, settings, marketAppInfo, null);
  }
  
  public final ae companionSlots(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      paramMap = null;
    } else {
      paramMap = aib.a(paramMap);
    }
    companionSlots = paramMap;
    return this;
  }
  
  public final ae contentDuration(Float paramFloat)
  {
    contentDuration = paramFloat;
    return this;
  }
  
  public final ae contentKeywords(List<String> paramList)
  {
    if (paramList == null) {
      paramList = null;
    } else {
      paramList = ahw.a(paramList);
    }
    contentKeywords = paramList;
    return this;
  }
  
  public final ae contentSourceId(String paramString)
  {
    contentSourceId = paramString;
    return this;
  }
  
  public final ae contentTitle(String paramString)
  {
    contentTitle = paramString;
    return this;
  }
  
  public final ae env(String paramString)
  {
    env = paramString;
    return this;
  }
  
  public final ae experimentState(aib<String, ab> paramaib)
  {
    experimentState = paramaib;
    return this;
  }
  
  public final ae extraParameters(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      paramMap = null;
    } else {
      paramMap = aib.a(paramMap);
    }
    extraParameters = paramMap;
    return this;
  }
  
  public final ae format(String paramString)
  {
    format = paramString;
    return this;
  }
  
  public final ae identifierInfo(afy paramafy)
  {
    identifierInfo = paramafy;
    return this;
  }
  
  public final ae isTv(Boolean paramBoolean)
  {
    isTv = paramBoolean;
    return this;
  }
  
  public final ae linearAdSlotHeight(Integer paramInteger)
  {
    linearAdSlotHeight = paramInteger;
    return this;
  }
  
  public final ae linearAdSlotWidth(Integer paramInteger)
  {
    linearAdSlotWidth = paramInteger;
    return this;
  }
  
  public final ae liveStreamPrefetchSeconds(Float paramFloat)
  {
    liveStreamPrefetchSeconds = paramFloat;
    return this;
  }
  
  public final ae marketAppInfo(adq paramadq)
  {
    marketAppInfo = paramadq;
    return this;
  }
  
  public final ae msParameter(String paramString)
  {
    msParameter = paramString;
    return this;
  }
  
  public final ae network(String paramString)
  {
    network = paramString;
    return this;
  }
  
  public final ae settings(ImaSdkSettings paramImaSdkSettings)
  {
    settings = paramImaSdkSettings;
    return this;
  }
  
  public final ae streamActivityMonitorId(String paramString)
  {
    streamActivityMonitorId = paramString;
    return this;
  }
  
  public final ae useQAStreamBaseUrl(Boolean paramBoolean)
  {
    useQAStreamBaseUrl = paramBoolean;
    return this;
  }
  
  public final ae usesCustomVideoPlayback(Boolean paramBoolean)
  {
    usesCustomVideoPlayback = paramBoolean;
    return this;
  }
  
  public final ae vastLoadTimeout(Float paramFloat)
  {
    vastLoadTimeout = paramFloat;
    return this;
  }
  
  public final ae videoContinuousPlay(adv paramadv)
  {
    videoContinuousPlay = paramadv;
    return this;
  }
  
  public final ae videoId(String paramString)
  {
    videoId = paramString;
    return this;
  }
  
  public final ae videoPlayActivation(adw paramadw)
  {
    videoPlayActivation = paramadw;
    return this;
  }
  
  public final ae videoPlayMuted(ady paramady)
  {
    videoPlayMuted = paramady;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */