package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.adq;
import com.google.ads.interactivemedia.v3.internal.adv;
import com.google.ads.interactivemedia.v3.internal.adw;
import com.google.ads.interactivemedia.v3.internal.ady;
import com.google.ads.interactivemedia.v3.internal.afy;
import com.google.ads.interactivemedia.v3.internal.aib;
import java.util.List;
import java.util.Map;

public abstract interface ae
{
  public abstract ae adTagParameters(Map<String, String> paramMap);
  
  public abstract ae adTagUrl(String paramString);
  
  public abstract ae adsResponse(String paramString);
  
  public abstract ae apiKey(String paramString);
  
  public abstract ae assetKey(String paramString);
  
  public abstract ae authToken(String paramString);
  
  public abstract ad build();
  
  public abstract ae companionSlots(Map<String, String> paramMap);
  
  public abstract ae contentDuration(Float paramFloat);
  
  public abstract ae contentKeywords(List<String> paramList);
  
  public abstract ae contentSourceId(String paramString);
  
  public abstract ae contentTitle(String paramString);
  
  public abstract ae env(String paramString);
  
  public abstract ae experimentState(aib<String, ab> paramaib);
  
  public abstract ae extraParameters(Map<String, String> paramMap);
  
  public abstract ae format(String paramString);
  
  public abstract ae identifierInfo(afy paramafy);
  
  public abstract ae isTv(Boolean paramBoolean);
  
  public abstract ae linearAdSlotHeight(Integer paramInteger);
  
  public abstract ae linearAdSlotWidth(Integer paramInteger);
  
  public abstract ae liveStreamPrefetchSeconds(Float paramFloat);
  
  public abstract ae marketAppInfo(adq paramadq);
  
  public abstract ae msParameter(String paramString);
  
  public abstract ae network(String paramString);
  
  public abstract ae settings(ImaSdkSettings paramImaSdkSettings);
  
  public abstract ae streamActivityMonitorId(String paramString);
  
  public abstract ae useQAStreamBaseUrl(Boolean paramBoolean);
  
  public abstract ae usesCustomVideoPlayback(Boolean paramBoolean);
  
  public abstract ae vastLoadTimeout(Float paramFloat);
  
  public abstract ae videoContinuousPlay(adv paramadv);
  
  public abstract ae videoId(String paramString);
  
  public abstract ae videoPlayActivation(adw paramadw);
  
  public abstract ae videoPlayMuted(ady paramady);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */