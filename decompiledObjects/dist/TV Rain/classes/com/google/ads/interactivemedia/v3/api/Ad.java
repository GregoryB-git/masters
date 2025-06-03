package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

public abstract interface Ad
{
  public abstract String getAdId();
  
  public abstract AdPodInfo getAdPodInfo();
  
  public abstract String getAdSystem();
  
  public abstract String[] getAdWrapperCreativeIds();
  
  public abstract String[] getAdWrapperIds();
  
  public abstract String[] getAdWrapperSystems();
  
  public abstract String getAdvertiserName();
  
  public abstract List<CompanionAd> getCompanionAds();
  
  public abstract String getContentType();
  
  public abstract String getCreativeAdId();
  
  public abstract String getCreativeId();
  
  public abstract String getDealId();
  
  public abstract String getDescription();
  
  public abstract double getDuration();
  
  public abstract int getHeight();
  
  public abstract double getSkipTimeOffset();
  
  public abstract String getSurveyUrl();
  
  public abstract String getTitle();
  
  public abstract String getTraffickingParameters();
  
  public abstract Set<UiElement> getUiElements();
  
  @Deprecated
  public abstract String getUniversalAdIdRegistry();
  
  @Deprecated
  public abstract String getUniversalAdIdValue();
  
  public abstract UniversalAdId[] getUniversalAdIds();
  
  public abstract int getVastMediaBitrate();
  
  public abstract int getVastMediaHeight();
  
  public abstract int getVastMediaWidth();
  
  public abstract int getWidth();
  
  public abstract boolean isLinear();
  
  public abstract boolean isSkippable();
  
  public abstract boolean isUiDisabled();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.Ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */