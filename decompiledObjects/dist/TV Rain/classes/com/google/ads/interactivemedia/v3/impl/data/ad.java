package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.StreamRequest.StreamFormat;
import com.google.ads.interactivemedia.v3.internal.adf;
import com.google.ads.interactivemedia.v3.internal.adq;
import com.google.ads.interactivemedia.v3.internal.adt;
import com.google.ads.interactivemedia.v3.internal.adv;
import com.google.ads.interactivemedia.v3.internal.adw;
import com.google.ads.interactivemedia.v3.internal.ady;
import com.google.ads.interactivemedia.v3.internal.adz;
import com.google.ads.interactivemedia.v3.internal.afk;
import com.google.ads.interactivemedia.v3.internal.afy;
import com.google.ads.interactivemedia.v3.internal.ahh;
import com.google.ads.interactivemedia.v3.internal.ahw;
import com.google.ads.interactivemedia.v3.internal.aib;
import com.google.ads.interactivemedia.v3.internal.aim;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ad
{
  public static ae builder()
  {
    return new o();
  }
  
  public static ad create(AdsRequest paramAdsRequest, String paramString1, String paramString2, ImaSdkSettings paramImaSdkSettings, adq paramadq, boolean paramBoolean, afy paramafy, AdDisplayContainer paramAdDisplayContainer)
  {
    String str1 = paramAdsRequest.getAdTagUrl();
    String str2 = paramAdsRequest.getAdsResponse();
    Map localMap1 = paramAdsRequest.getExtraParameters();
    Object localObject = (adt)paramAdsRequest;
    adw localadw = ((adt)localObject).a();
    ady localady = ((adt)localObject).b();
    adv localadv = ((adt)localObject).c();
    Float localFloat1 = ((adt)localObject).d();
    List localList = ((adt)localObject).e();
    String str3 = ((adt)localObject).f();
    Float localFloat2 = ((adt)localObject).g();
    Float localFloat3 = ((adt)localObject).h();
    Map localMap2 = getCompanionSlots((adf)paramAdDisplayContainer);
    localObject = paramAdDisplayContainer.getAdContainer();
    paramAdsRequest = (aib)ahh.a(paramAdsRequest.getForcedExperimentId()).a(ac.$instance).a();
    paramString1 = builder().adTagUrl(str1).adsResponse(str2).env(paramString1).network(paramString2).extraParameters(localMap1).settings(paramImaSdkSettings).videoContinuousPlay(localadv).videoPlayActivation(localadw).videoPlayMuted(localady).contentDuration(localFloat1).contentKeywords(localList).contentTitle(str3).vastLoadTimeout(localFloat2).liveStreamPrefetchSeconds(localFloat3).companionSlots(localMap2).marketAppInfo(paramadq).isTv(Boolean.valueOf(paramBoolean)).identifierInfo(paramafy).linearAdSlotWidth(Integer.valueOf(((View)localObject).getWidth())).linearAdSlotHeight(Integer.valueOf(((View)localObject).getHeight()));
    if (paramAdDisplayContainer.getPlayer() != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramString1.usesCustomVideoPlayback(Boolean.valueOf(paramBoolean)).experimentState(paramAdsRequest).build();
  }
  
  public static ad createFromStreamRequest(StreamRequest paramStreamRequest, String paramString1, String paramString2, ImaSdkSettings paramImaSdkSettings, adq paramadq, boolean paramBoolean, String paramString3, afy paramafy, StreamDisplayContainer paramStreamDisplayContainer)
  {
    Map localMap = getCompanionSlots((afk)paramStreamDisplayContainer);
    ViewGroup localViewGroup = paramStreamDisplayContainer.getAdContainer();
    aib localaib = (aib)ahh.a(paramStreamRequest.getForcedExperimentId()).a(af.$instance).a();
    if (paramStreamRequest.getFormat() == StreamRequest.StreamFormat.DASH) {
      paramStreamDisplayContainer = "dash";
    } else {
      paramStreamDisplayContainer = "hls";
    }
    return builder().assetKey(paramStreamRequest.getAssetKey()).authToken(paramStreamRequest.getAuthToken()).contentSourceId(paramStreamRequest.getContentSourceId()).videoId(paramStreamRequest.getVideoId()).apiKey(paramStreamRequest.getApiKey()).adTagParameters(paramStreamRequest.getAdTagParameters()).env(paramString1).network(paramString2).settings(paramImaSdkSettings).companionSlots(localMap).marketAppInfo(paramadq).isTv(Boolean.valueOf(paramBoolean)).msParameter(paramString3).linearAdSlotWidth(Integer.valueOf(localViewGroup.getWidth())).linearAdSlotHeight(Integer.valueOf(localViewGroup.getHeight())).streamActivityMonitorId(paramStreamRequest.getStreamActivityMonitorId()).format(paramStreamDisplayContainer).identifierInfo(paramafy).useQAStreamBaseUrl(paramStreamRequest.getUseQAStreamBaseUrl()).experimentState(localaib).build();
  }
  
  private static Map<String, String> getCompanionSlots(adz paramadz)
  {
    paramadz = paramadz.a();
    if ((paramadz != null) && (!paramadz.isEmpty()))
    {
      aim localaim = new aim();
      Iterator localIterator = paramadz.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = (CompanionAdSlot)paramadz.get(str);
        int i = ((CompanionAdSlot)localObject).getWidth();
        int j = ((CompanionAdSlot)localObject).getHeight();
        localObject = new StringBuilder(23);
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(j);
        localaim.b(str, ((StringBuilder)localObject).toString());
      }
      return localaim.a();
    }
    return null;
  }
  
  public abstract aib<String, String> adTagParameters();
  
  public abstract String adTagUrl();
  
  public abstract String adsResponse();
  
  public abstract String apiKey();
  
  public abstract String assetKey();
  
  public abstract String authToken();
  
  public abstract aib<String, String> companionSlots();
  
  public abstract Float contentDuration();
  
  public abstract ahw<String> contentKeywords();
  
  public abstract String contentSourceId();
  
  public abstract String contentTitle();
  
  public abstract String env();
  
  public abstract aib<String, ab> experimentState();
  
  public abstract aib<String, String> extraParameters();
  
  public abstract String format();
  
  public abstract afy identifierInfo();
  
  public abstract Boolean isTv();
  
  public abstract Integer linearAdSlotHeight();
  
  public abstract Integer linearAdSlotWidth();
  
  public abstract Float liveStreamPrefetchSeconds();
  
  public abstract adq marketAppInfo();
  
  public abstract String msParameter();
  
  public abstract String network();
  
  public abstract ImaSdkSettings settings();
  
  public abstract String streamActivityMonitorId();
  
  public abstract Boolean useQAStreamBaseUrl();
  
  public abstract Boolean usesCustomVideoPlayback();
  
  public abstract Float vastLoadTimeout();
  
  public abstract adv videoContinuousPlay();
  
  public abstract String videoId();
  
  public abstract adw videoPlayActivation();
  
  public abstract ady videoPlayMuted();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */