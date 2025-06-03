package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.UniversalAdId;
import com.google.ads.interactivemedia.v3.internal.ajd;
import com.google.ads.interactivemedia.v3.internal.aje;
import com.google.ads.interactivemedia.v3.internal.ajf;
import com.google.ads.interactivemedia.v3.internal.ajg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b
  implements Ad
{
  private String adId;
  @ajd
  @ajf
  private e adPodInfo = new e();
  private String adSystem;
  @ajd
  @ajf
  private String[] adWrapperCreativeIds;
  @ajd
  @ajf
  private String[] adWrapperIds;
  @ajd
  @ajf
  private String[] adWrapperSystems;
  private String advertiserName;
  private String clickThroughUrl;
  @ajd
  @ajf
  private List<CompanionAdImpl> companions;
  private String contentType;
  private String creativeAdId;
  private String creativeId;
  private String dealId;
  private String description;
  private boolean disableUi;
  private double duration;
  private int height;
  private boolean isUiDisabled_ = false;
  private boolean linear;
  private double skipTimeOffset = -1.0D;
  private boolean skippable;
  private String surveyUrl;
  private String title;
  private String traffickingParameters;
  @ajd
  @ajf
  private Set<UiElement> uiElements;
  private String universalAdIdRegistry;
  private String universalAdIdValue;
  @ajd
  @ajf
  private am[] universalAdIds;
  private int vastMediaBitrate;
  private int vastMediaHeight;
  private int vastMediaWidth;
  private int width;
  
  public final boolean canDisableUi()
  {
    return disableUi;
  }
  
  public final boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public final String getAdId()
  {
    return adId;
  }
  
  public final AdPodInfo getAdPodInfo()
  {
    return adPodInfo;
  }
  
  public final String getAdSystem()
  {
    return adSystem;
  }
  
  public final String[] getAdWrapperCreativeIds()
  {
    return adWrapperCreativeIds;
  }
  
  public final String[] getAdWrapperIds()
  {
    return adWrapperIds;
  }
  
  public final String[] getAdWrapperSystems()
  {
    return adWrapperSystems;
  }
  
  public final String getAdvertiserName()
  {
    return advertiserName;
  }
  
  public final String getClickThruUrl()
  {
    return clickThroughUrl;
  }
  
  public final List<CompanionAd> getCompanionAds()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = companions.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((CompanionAd)localIterator.next());
    }
    return localArrayList;
  }
  
  public final String getContentType()
  {
    return contentType;
  }
  
  public final String getCreativeAdId()
  {
    return creativeAdId;
  }
  
  public final String getCreativeId()
  {
    return creativeId;
  }
  
  public final String getDealId()
  {
    return dealId;
  }
  
  public final String getDescription()
  {
    return description;
  }
  
  public final double getDuration()
  {
    return duration;
  }
  
  public final int getHeight()
  {
    return height;
  }
  
  public final double getSkipTimeOffset()
  {
    return skipTimeOffset;
  }
  
  public final String getSurveyUrl()
  {
    return surveyUrl;
  }
  
  public final String getTitle()
  {
    return title;
  }
  
  public final String getTraffickingParameters()
  {
    return traffickingParameters;
  }
  
  public final Set<UiElement> getUiElements()
  {
    return uiElements;
  }
  
  public final String getUniversalAdIdRegistry()
  {
    return universalAdIdRegistry;
  }
  
  public final String getUniversalAdIdValue()
  {
    return universalAdIdValue;
  }
  
  public final UniversalAdId[] getUniversalAdIds()
  {
    return universalAdIds;
  }
  
  public final int getVastMediaBitrate()
  {
    return vastMediaBitrate;
  }
  
  public final int getVastMediaHeight()
  {
    return vastMediaHeight;
  }
  
  public final int getVastMediaWidth()
  {
    return vastMediaWidth;
  }
  
  public final int getWidth()
  {
    return width;
  }
  
  public final int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
  
  public final boolean isLinear()
  {
    return linear;
  }
  
  public final boolean isSkippable()
  {
    return skippable;
  }
  
  public final boolean isUiDisabled()
  {
    return isUiDisabled_;
  }
  
  public final void setAdId(String paramString)
  {
    adId = paramString;
  }
  
  public final void setAdPodInfo(e parame)
  {
    adPodInfo = parame;
  }
  
  public final void setAdSystem(String paramString)
  {
    adSystem = paramString;
  }
  
  public final void setAdWrapperCreativeIds(String[] paramArrayOfString)
  {
    adWrapperCreativeIds = paramArrayOfString;
  }
  
  public final void setAdWrapperIds(String[] paramArrayOfString)
  {
    adWrapperIds = paramArrayOfString;
  }
  
  public final void setAdWrapperSystems(String[] paramArrayOfString)
  {
    adWrapperSystems = paramArrayOfString;
  }
  
  public final void setAdvertiserName(String paramString)
  {
    advertiserName = paramString;
  }
  
  public final void setCanDisableUi(boolean paramBoolean)
  {
    disableUi = paramBoolean;
  }
  
  public final void setClickThruUrl(String paramString)
  {
    clickThroughUrl = paramString;
  }
  
  public final void setCompanionAds(List<CompanionAdImpl> paramList)
  {
    companions = paramList;
  }
  
  public final void setContentType(String paramString)
  {
    contentType = paramString;
  }
  
  public final void setCreativeAdId(String paramString)
  {
    creativeAdId = paramString;
  }
  
  public final void setCreativeId(String paramString)
  {
    creativeId = paramString;
  }
  
  public final void setDealId(String paramString)
  {
    dealId = paramString;
  }
  
  public final void setDescription(String paramString)
  {
    description = paramString;
  }
  
  public final void setDuration(double paramDouble)
  {
    duration = paramDouble;
  }
  
  public final void setHeight(int paramInt)
  {
    height = paramInt;
  }
  
  public final void setLinear(boolean paramBoolean)
  {
    linear = paramBoolean;
  }
  
  public final void setSkipTimeOffset(double paramDouble)
  {
    skipTimeOffset = paramDouble;
  }
  
  public final void setSkippable(boolean paramBoolean)
  {
    skippable = paramBoolean;
  }
  
  public final void setSurveyUrl(String paramString)
  {
    surveyUrl = paramString;
  }
  
  public final void setTitle(String paramString)
  {
    title = paramString;
  }
  
  public final void setTraffickingParameters(String paramString)
  {
    traffickingParameters = paramString;
  }
  
  public final void setUiDisabled(boolean paramBoolean)
  {
    isUiDisabled_ = paramBoolean;
  }
  
  public final void setUiElements(Set<UiElement> paramSet)
  {
    uiElements = paramSet;
  }
  
  public final void setUniversalAdIdRegistry(String paramString)
  {
    universalAdIdRegistry = paramString;
  }
  
  public final void setUniversalAdIdValue(String paramString)
  {
    universalAdIdValue = paramString;
  }
  
  public final void setUniversalAdIds(am[] paramArrayOfam)
  {
    universalAdIds = paramArrayOfam;
  }
  
  public final void setVastMediaBitrate(int paramInt)
  {
    vastMediaBitrate = paramInt;
  }
  
  public final void setVastMediaHeight(int paramInt)
  {
    vastMediaHeight = paramInt;
  }
  
  public final void setVastMediaWidth(int paramInt)
  {
    vastMediaWidth = paramInt;
  }
  
  public final void setWidth(int paramInt)
  {
    width = paramInt;
  }
  
  public final String toString()
  {
    String str1 = adId;
    Object localObject = creativeId;
    String str2 = creativeAdId;
    String str3 = universalAdIdValue;
    String str4 = universalAdIdRegistry;
    String str5 = title;
    String str6 = description;
    String str7 = contentType;
    String str8 = Arrays.toString(adWrapperIds);
    String str9 = Arrays.toString(adWrapperSystems);
    String str10 = Arrays.toString(adWrapperCreativeIds);
    String str11 = adSystem;
    String str12 = advertiserName;
    String str13 = surveyUrl;
    String str14 = dealId;
    boolean bool1 = linear;
    boolean bool2 = skippable;
    int i = width;
    int j = height;
    String str15 = traffickingParameters;
    String str16 = clickThroughUrl;
    double d1 = duration;
    String str17 = String.valueOf(adPodInfo);
    String str18 = String.valueOf(uiElements);
    boolean bool3 = disableUi;
    double d2 = skipTimeOffset;
    int k = a.b(str16, a.b(str15, a.b(str14, a.b(str13, a.b(str12, a.b(str11, a.b(str10, a.b(str9, a.b(str8, a.b(str7, a.b(str6, a.b(str5, a.b(str4, a.b(str3, a.b(str2, a.b((String)localObject, a.b(str1, 455)))))))))))))))));
    int m = str17.length();
    localObject = a.q(str18.length() + (m + k), "Ad [adId=", str1, ", creativeId=", (String)localObject);
    a.C((StringBuilder)localObject, ", creativeAdId=", str2, ", universalAdIdValue=", str3);
    a.C((StringBuilder)localObject, ", universalAdIdRegistry=", str4, ", title=", str5);
    a.C((StringBuilder)localObject, ", description=", str6, ", contentType=", str7);
    a.C((StringBuilder)localObject, ", adWrapperIds=", str8, ", adWrapperSystems=", str9);
    a.C((StringBuilder)localObject, ", adWrapperCreativeIds=", str10, ", adSystem=", str11);
    a.C((StringBuilder)localObject, ", advertiserName=", str12, ", surveyUrl=", str13);
    ((StringBuilder)localObject).append(", dealId=");
    ((StringBuilder)localObject).append(str14);
    ((StringBuilder)localObject).append(", linear=");
    ((StringBuilder)localObject).append(bool1);
    ((StringBuilder)localObject).append(", skippable=");
    ((StringBuilder)localObject).append(bool2);
    ((StringBuilder)localObject).append(", width=");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(", height=");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(", traffickingParameters=");
    ((StringBuilder)localObject).append(str15);
    ((StringBuilder)localObject).append(", clickThroughUrl=");
    ((StringBuilder)localObject).append(str16);
    ((StringBuilder)localObject).append(", duration=");
    ((StringBuilder)localObject).append(d1);
    ((StringBuilder)localObject).append(", adPodInfo=");
    ((StringBuilder)localObject).append(str17);
    ((StringBuilder)localObject).append(", uiElements=");
    ((StringBuilder)localObject).append(str18);
    ((StringBuilder)localObject).append(", disableUi=");
    ((StringBuilder)localObject).append(bool3);
    ((StringBuilder)localObject).append(", skipTimeOffset=");
    ((StringBuilder)localObject).append(d2);
    ((StringBuilder)localObject).append("]");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */