package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.adq;
import com.google.ads.interactivemedia.v3.internal.adv;
import com.google.ads.interactivemedia.v3.internal.adw;
import com.google.ads.interactivemedia.v3.internal.ady;
import com.google.ads.interactivemedia.v3.internal.afy;
import com.google.ads.interactivemedia.v3.internal.ahw;
import com.google.ads.interactivemedia.v3.internal.aib;

final class l
  extends ad
{
  private final aib<String, String> adTagParameters;
  private final String adTagUrl;
  private final String adsResponse;
  private final String apiKey;
  private final String assetKey;
  private final String authToken;
  private final aib<String, String> companionSlots;
  private final Float contentDuration;
  private final ahw<String> contentKeywords;
  private final String contentSourceId;
  private final String contentTitle;
  private final String env;
  private final aib<String, ab> experimentState;
  private final aib<String, String> extraParameters;
  private final String format;
  private final afy identifierInfo;
  private final Boolean isTv;
  private final Integer linearAdSlotHeight;
  private final Integer linearAdSlotWidth;
  private final Float liveStreamPrefetchSeconds;
  private final adq marketAppInfo;
  private final String msParameter;
  private final String network;
  private final ImaSdkSettings settings;
  private final String streamActivityMonitorId;
  private final Boolean useQAStreamBaseUrl;
  private final Boolean usesCustomVideoPlayback;
  private final Float vastLoadTimeout;
  private final adv videoContinuousPlay;
  private final String videoId;
  private final adw videoPlayActivation;
  private final ady videoPlayMuted;
  
  private l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, aib<String, String> paramaib1, String paramString9, String paramString10, Float paramFloat1, ahw<String> paramahw, String paramString11, Float paramFloat2, Float paramFloat3, aib<String, String> paramaib2, aib<String, String> paramaib3, Boolean paramBoolean1, String paramString12, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean2, String paramString13, aib<String, ab> paramaib, afy paramafy, Boolean paramBoolean3, adw paramadw, adv paramadv, ady paramady, ImaSdkSettings paramImaSdkSettings, adq paramadq)
  {
    adsResponse = paramString1;
    adTagUrl = paramString2;
    assetKey = paramString3;
    authToken = paramString4;
    contentSourceId = paramString5;
    videoId = paramString6;
    apiKey = paramString7;
    format = paramString8;
    adTagParameters = paramaib1;
    env = paramString9;
    network = paramString10;
    contentDuration = paramFloat1;
    contentKeywords = paramahw;
    contentTitle = paramString11;
    vastLoadTimeout = paramFloat2;
    liveStreamPrefetchSeconds = paramFloat3;
    companionSlots = paramaib2;
    extraParameters = paramaib3;
    isTv = paramBoolean1;
    msParameter = paramString12;
    linearAdSlotWidth = paramInteger1;
    linearAdSlotHeight = paramInteger2;
    usesCustomVideoPlayback = paramBoolean2;
    streamActivityMonitorId = paramString13;
    experimentState = paramaib;
    identifierInfo = paramafy;
    useQAStreamBaseUrl = paramBoolean3;
    videoPlayActivation = paramadw;
    videoContinuousPlay = paramadv;
    videoPlayMuted = paramady;
    settings = paramImaSdkSettings;
    marketAppInfo = paramadq;
  }
  
  public final aib<String, String> adTagParameters()
  {
    return adTagParameters;
  }
  
  public final String adTagUrl()
  {
    return adTagUrl;
  }
  
  public final String adsResponse()
  {
    return adsResponse;
  }
  
  public final String apiKey()
  {
    return apiKey;
  }
  
  public final String assetKey()
  {
    return assetKey;
  }
  
  public final String authToken()
  {
    return authToken;
  }
  
  public final aib<String, String> companionSlots()
  {
    return companionSlots;
  }
  
  public final Float contentDuration()
  {
    return contentDuration;
  }
  
  public final ahw<String> contentKeywords()
  {
    return contentKeywords;
  }
  
  public final String contentSourceId()
  {
    return contentSourceId;
  }
  
  public final String contentTitle()
  {
    return contentTitle;
  }
  
  public final String env()
  {
    return env;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ad))
    {
      paramObject = (ad)paramObject;
      Object localObject = adsResponse;
      if (localObject == null ? ((ad)paramObject).adsResponse() == null : ((String)localObject).equals(((ad)paramObject).adsResponse()))
      {
        localObject = adTagUrl;
        if (localObject == null ? ((ad)paramObject).adTagUrl() == null : ((String)localObject).equals(((ad)paramObject).adTagUrl()))
        {
          localObject = assetKey;
          if (localObject == null ? ((ad)paramObject).assetKey() == null : ((String)localObject).equals(((ad)paramObject).assetKey()))
          {
            localObject = authToken;
            if (localObject == null ? ((ad)paramObject).authToken() == null : ((String)localObject).equals(((ad)paramObject).authToken()))
            {
              localObject = contentSourceId;
              if (localObject == null ? ((ad)paramObject).contentSourceId() == null : ((String)localObject).equals(((ad)paramObject).contentSourceId()))
              {
                localObject = videoId;
                if (localObject == null ? ((ad)paramObject).videoId() == null : ((String)localObject).equals(((ad)paramObject).videoId()))
                {
                  localObject = apiKey;
                  if (localObject == null ? ((ad)paramObject).apiKey() == null : ((String)localObject).equals(((ad)paramObject).apiKey()))
                  {
                    localObject = format;
                    if (localObject == null ? ((ad)paramObject).format() == null : ((String)localObject).equals(((ad)paramObject).format()))
                    {
                      localObject = adTagParameters;
                      if (localObject == null ? ((ad)paramObject).adTagParameters() == null : ((aib)localObject).equals(((ad)paramObject).adTagParameters()))
                      {
                        localObject = env;
                        if (localObject == null ? ((ad)paramObject).env() == null : ((String)localObject).equals(((ad)paramObject).env()))
                        {
                          localObject = network;
                          if (localObject == null ? ((ad)paramObject).network() == null : ((String)localObject).equals(((ad)paramObject).network()))
                          {
                            localObject = contentDuration;
                            if (localObject == null ? ((ad)paramObject).contentDuration() == null : ((Float)localObject).equals(((ad)paramObject).contentDuration()))
                            {
                              localObject = contentKeywords;
                              if (localObject == null ? ((ad)paramObject).contentKeywords() == null : ((ahw)localObject).equals(((ad)paramObject).contentKeywords()))
                              {
                                localObject = contentTitle;
                                if (localObject == null ? ((ad)paramObject).contentTitle() == null : ((String)localObject).equals(((ad)paramObject).contentTitle()))
                                {
                                  localObject = vastLoadTimeout;
                                  if (localObject == null ? ((ad)paramObject).vastLoadTimeout() == null : ((Float)localObject).equals(((ad)paramObject).vastLoadTimeout()))
                                  {
                                    localObject = liveStreamPrefetchSeconds;
                                    if (localObject == null ? ((ad)paramObject).liveStreamPrefetchSeconds() == null : ((Float)localObject).equals(((ad)paramObject).liveStreamPrefetchSeconds()))
                                    {
                                      localObject = companionSlots;
                                      if (localObject == null ? ((ad)paramObject).companionSlots() == null : ((aib)localObject).equals(((ad)paramObject).companionSlots()))
                                      {
                                        localObject = extraParameters;
                                        if (localObject == null ? ((ad)paramObject).extraParameters() == null : ((aib)localObject).equals(((ad)paramObject).extraParameters()))
                                        {
                                          localObject = isTv;
                                          if (localObject == null ? ((ad)paramObject).isTv() == null : ((Boolean)localObject).equals(((ad)paramObject).isTv()))
                                          {
                                            localObject = msParameter;
                                            if (localObject == null ? ((ad)paramObject).msParameter() == null : ((String)localObject).equals(((ad)paramObject).msParameter()))
                                            {
                                              localObject = linearAdSlotWidth;
                                              if (localObject == null ? ((ad)paramObject).linearAdSlotWidth() == null : ((Integer)localObject).equals(((ad)paramObject).linearAdSlotWidth()))
                                              {
                                                localObject = linearAdSlotHeight;
                                                if (localObject == null ? ((ad)paramObject).linearAdSlotHeight() == null : ((Integer)localObject).equals(((ad)paramObject).linearAdSlotHeight()))
                                                {
                                                  localObject = usesCustomVideoPlayback;
                                                  if (localObject == null ? ((ad)paramObject).usesCustomVideoPlayback() == null : ((Boolean)localObject).equals(((ad)paramObject).usesCustomVideoPlayback()))
                                                  {
                                                    localObject = streamActivityMonitorId;
                                                    if (localObject == null ? ((ad)paramObject).streamActivityMonitorId() == null : ((String)localObject).equals(((ad)paramObject).streamActivityMonitorId()))
                                                    {
                                                      localObject = experimentState;
                                                      if (localObject == null ? ((ad)paramObject).experimentState() == null : ((aib)localObject).equals(((ad)paramObject).experimentState()))
                                                      {
                                                        localObject = identifierInfo;
                                                        if (localObject == null ? ((ad)paramObject).identifierInfo() == null : localObject.equals(((ad)paramObject).identifierInfo()))
                                                        {
                                                          localObject = useQAStreamBaseUrl;
                                                          if (localObject == null ? ((ad)paramObject).useQAStreamBaseUrl() == null : ((Boolean)localObject).equals(((ad)paramObject).useQAStreamBaseUrl()))
                                                          {
                                                            localObject = videoPlayActivation;
                                                            if (localObject == null ? ((ad)paramObject).videoPlayActivation() == null : localObject.equals(((ad)paramObject).videoPlayActivation()))
                                                            {
                                                              localObject = videoContinuousPlay;
                                                              if (localObject == null ? ((ad)paramObject).videoContinuousPlay() == null : localObject.equals(((ad)paramObject).videoContinuousPlay()))
                                                              {
                                                                localObject = videoPlayMuted;
                                                                if (localObject == null ? ((ad)paramObject).videoPlayMuted() == null : localObject.equals(((ad)paramObject).videoPlayMuted()))
                                                                {
                                                                  localObject = settings;
                                                                  if (localObject == null ? ((ad)paramObject).settings() == null : localObject.equals(((ad)paramObject).settings()))
                                                                  {
                                                                    localObject = marketAppInfo;
                                                                    if (localObject == null ? ((ad)paramObject).marketAppInfo() == null : localObject.equals(((ad)paramObject).marketAppInfo())) {
                                                                      return true;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public final aib<String, ab> experimentState()
  {
    return experimentState;
  }
  
  public final aib<String, String> extraParameters()
  {
    return extraParameters;
  }
  
  public final String format()
  {
    return format;
  }
  
  public final int hashCode()
  {
    Object localObject = adsResponse;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((String)localObject).hashCode();
    }
    localObject = adTagUrl;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    localObject = assetKey;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((String)localObject).hashCode();
    }
    localObject = authToken;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((String)localObject).hashCode();
    }
    localObject = contentSourceId;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = videoId;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    localObject = apiKey;
    int i3;
    if (localObject == null) {
      i3 = 0;
    } else {
      i3 = ((String)localObject).hashCode();
    }
    localObject = format;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((String)localObject).hashCode();
    }
    localObject = adTagParameters;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((aib)localObject).hashCode();
    }
    localObject = env;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    localObject = network;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = ((String)localObject).hashCode();
    }
    localObject = contentDuration;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = ((Float)localObject).hashCode();
    }
    localObject = contentKeywords;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = ((ahw)localObject).hashCode();
    }
    localObject = contentTitle;
    int i10;
    if (localObject == null) {
      i10 = 0;
    } else {
      i10 = ((String)localObject).hashCode();
    }
    localObject = vastLoadTimeout;
    int i11;
    if (localObject == null) {
      i11 = 0;
    } else {
      i11 = ((Float)localObject).hashCode();
    }
    localObject = liveStreamPrefetchSeconds;
    int i12;
    if (localObject == null) {
      i12 = 0;
    } else {
      i12 = ((Float)localObject).hashCode();
    }
    localObject = companionSlots;
    int i13;
    if (localObject == null) {
      i13 = 0;
    } else {
      i13 = ((aib)localObject).hashCode();
    }
    localObject = extraParameters;
    int i14;
    if (localObject == null) {
      i14 = 0;
    } else {
      i14 = ((aib)localObject).hashCode();
    }
    localObject = isTv;
    int i15;
    if (localObject == null) {
      i15 = 0;
    } else {
      i15 = ((Boolean)localObject).hashCode();
    }
    localObject = msParameter;
    int i16;
    if (localObject == null) {
      i16 = 0;
    } else {
      i16 = ((String)localObject).hashCode();
    }
    localObject = linearAdSlotWidth;
    int i17;
    if (localObject == null) {
      i17 = 0;
    } else {
      i17 = ((Integer)localObject).hashCode();
    }
    localObject = linearAdSlotHeight;
    int i18;
    if (localObject == null) {
      i18 = 0;
    } else {
      i18 = ((Integer)localObject).hashCode();
    }
    localObject = usesCustomVideoPlayback;
    int i19;
    if (localObject == null) {
      i19 = 0;
    } else {
      i19 = ((Boolean)localObject).hashCode();
    }
    localObject = streamActivityMonitorId;
    int i20;
    if (localObject == null) {
      i20 = 0;
    } else {
      i20 = ((String)localObject).hashCode();
    }
    localObject = experimentState;
    int i21;
    if (localObject == null) {
      i21 = 0;
    } else {
      i21 = ((aib)localObject).hashCode();
    }
    localObject = identifierInfo;
    int i22;
    if (localObject == null) {
      i22 = 0;
    } else {
      i22 = localObject.hashCode();
    }
    localObject = useQAStreamBaseUrl;
    int i23;
    if (localObject == null) {
      i23 = 0;
    } else {
      i23 = ((Boolean)localObject).hashCode();
    }
    localObject = videoPlayActivation;
    int i24;
    if (localObject == null) {
      i24 = 0;
    } else {
      i24 = localObject.hashCode();
    }
    localObject = videoContinuousPlay;
    int i25;
    if (localObject == null) {
      i25 = 0;
    } else {
      i25 = localObject.hashCode();
    }
    localObject = videoPlayMuted;
    int i26;
    if (localObject == null) {
      i26 = 0;
    } else {
      i26 = localObject.hashCode();
    }
    localObject = settings;
    int i27;
    if (localObject == null) {
      i27 = 0;
    } else {
      i27 = localObject.hashCode();
    }
    localObject = marketAppInfo;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (((((((((((((((((((((((((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i10) * 1000003 ^ i11) * 1000003 ^ i12) * 1000003 ^ i13) * 1000003 ^ i14) * 1000003 ^ i15) * 1000003 ^ i16) * 1000003 ^ i17) * 1000003 ^ i18) * 1000003 ^ i19) * 1000003 ^ i20) * 1000003 ^ i21) * 1000003 ^ i22) * 1000003 ^ i23) * 1000003 ^ i24) * 1000003 ^ i25) * 1000003 ^ i26) * 1000003 ^ i27) * 1000003 ^ i;
  }
  
  public final afy identifierInfo()
  {
    return identifierInfo;
  }
  
  public final Boolean isTv()
  {
    return isTv;
  }
  
  public final Integer linearAdSlotHeight()
  {
    return linearAdSlotHeight;
  }
  
  public final Integer linearAdSlotWidth()
  {
    return linearAdSlotWidth;
  }
  
  public final Float liveStreamPrefetchSeconds()
  {
    return liveStreamPrefetchSeconds;
  }
  
  public final adq marketAppInfo()
  {
    return marketAppInfo;
  }
  
  public final String msParameter()
  {
    return msParameter;
  }
  
  public final String network()
  {
    return network;
  }
  
  public final ImaSdkSettings settings()
  {
    return settings;
  }
  
  public final String streamActivityMonitorId()
  {
    return streamActivityMonitorId;
  }
  
  public final String toString()
  {
    Object localObject = adsResponse;
    String str1 = adTagUrl;
    String str2 = assetKey;
    String str3 = authToken;
    String str4 = contentSourceId;
    String str5 = videoId;
    String str6 = apiKey;
    String str7 = format;
    String str8 = String.valueOf(adTagParameters);
    String str9 = env;
    String str10 = network;
    String str11 = String.valueOf(contentDuration);
    String str12 = String.valueOf(contentKeywords);
    String str13 = contentTitle;
    String str14 = String.valueOf(vastLoadTimeout);
    String str15 = String.valueOf(liveStreamPrefetchSeconds);
    String str16 = String.valueOf(companionSlots);
    String str17 = String.valueOf(extraParameters);
    String str18 = String.valueOf(isTv);
    String str19 = msParameter;
    String str20 = String.valueOf(linearAdSlotWidth);
    String str21 = String.valueOf(linearAdSlotHeight);
    String str22 = String.valueOf(usesCustomVideoPlayback);
    String str23 = streamActivityMonitorId;
    String str24 = String.valueOf(experimentState);
    String str25 = String.valueOf(identifierInfo);
    String str26 = String.valueOf(useQAStreamBaseUrl);
    String str27 = String.valueOf(videoPlayActivation);
    String str28 = String.valueOf(videoContinuousPlay);
    String str29 = String.valueOf(videoPlayMuted);
    String str30 = String.valueOf(settings);
    String str31 = String.valueOf(marketAppInfo);
    int i = a.b(str7, a.b(str6, a.b(str5, a.b(str4, a.b(str3, a.b(str2, a.b(str1, a.b((String)localObject, 532))))))));
    i = a.b(str10, a.b(str9, str8.length() + i));
    int j = str11.length();
    int k = a.b(str13, str12.length() + (j + i));
    int m = str14.length();
    j = str15.length();
    i = str16.length();
    int n = str17.length();
    i = a.b(str19, str18.length() + (n + (i + (j + (m + k)))));
    m = str20.length();
    j = str21.length();
    n = a.b(str23, str22.length() + (j + (m + i)));
    k = str24.length();
    m = str25.length();
    int i1 = str26.length();
    j = str27.length();
    int i2 = str28.length();
    int i3 = str29.length();
    i = str30.length();
    localObject = a.q(str31.length() + (i + (i3 + (i2 + (j + (i1 + (m + (k + n))))))), "GsonAdsRequest{adsResponse=", (String)localObject, ", adTagUrl=", str1);
    a.C((StringBuilder)localObject, ", assetKey=", str2, ", authToken=", str3);
    a.C((StringBuilder)localObject, ", contentSourceId=", str4, ", videoId=", str5);
    a.C((StringBuilder)localObject, ", apiKey=", str6, ", format=", str7);
    a.C((StringBuilder)localObject, ", adTagParameters=", str8, ", env=", str9);
    a.C((StringBuilder)localObject, ", network=", str10, ", contentDuration=", str11);
    a.C((StringBuilder)localObject, ", contentKeywords=", str12, ", contentTitle=", str13);
    a.C((StringBuilder)localObject, ", vastLoadTimeout=", str14, ", liveStreamPrefetchSeconds=", str15);
    a.C((StringBuilder)localObject, ", companionSlots=", str16, ", extraParameters=", str17);
    a.C((StringBuilder)localObject, ", isTv=", str18, ", msParameter=", str19);
    a.C((StringBuilder)localObject, ", linearAdSlotWidth=", str20, ", linearAdSlotHeight=", str21);
    a.C((StringBuilder)localObject, ", usesCustomVideoPlayback=", str22, ", streamActivityMonitorId=", str23);
    a.C((StringBuilder)localObject, ", experimentState=", str24, ", identifierInfo=", str25);
    a.C((StringBuilder)localObject, ", useQAStreamBaseUrl=", str26, ", videoPlayActivation=", str27);
    a.C((StringBuilder)localObject, ", videoContinuousPlay=", str28, ", videoPlayMuted=", str29);
    a.C((StringBuilder)localObject, ", settings=", str30, ", marketAppInfo=", str31);
    ((StringBuilder)localObject).append("}");
    return ((StringBuilder)localObject).toString();
  }
  
  public final Boolean useQAStreamBaseUrl()
  {
    return useQAStreamBaseUrl;
  }
  
  public final Boolean usesCustomVideoPlayback()
  {
    return usesCustomVideoPlayback;
  }
  
  public final Float vastLoadTimeout()
  {
    return vastLoadTimeout;
  }
  
  public final adv videoContinuousPlay()
  {
    return videoContinuousPlay;
  }
  
  public final String videoId()
  {
    return videoId;
  }
  
  public final adw videoPlayActivation()
  {
    return videoPlayActivation;
  }
  
  public final ady videoPlayMuted()
  {
    return videoPlayMuted;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */