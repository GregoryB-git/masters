package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

public abstract interface AdsRequest
{
  public abstract void forceExperimentId(Integer paramInteger);
  
  @Deprecated
  public abstract AdDisplayContainer getAdDisplayContainer();
  
  public abstract String getAdTagUrl();
  
  public abstract String getAdsResponse();
  
  public abstract ContentProgressProvider getContentProgressProvider();
  
  public abstract String getExtraParameter(String paramString);
  
  public abstract Map<String, String> getExtraParameters();
  
  public abstract Integer getForcedExperimentId();
  
  public abstract Object getUserRequestContext();
  
  @Deprecated
  public abstract void setAdDisplayContainer(AdDisplayContainer paramAdDisplayContainer);
  
  public abstract void setAdTagUrl(String paramString);
  
  public abstract void setAdWillAutoPlay(boolean paramBoolean);
  
  public abstract void setAdWillPlayMuted(boolean paramBoolean);
  
  public abstract void setAdsResponse(String paramString);
  
  public abstract void setContentDuration(float paramFloat);
  
  public abstract void setContentKeywords(List<String> paramList);
  
  public abstract void setContentProgressProvider(ContentProgressProvider paramContentProgressProvider);
  
  public abstract void setContentTitle(String paramString);
  
  public abstract void setContinuousPlayback(boolean paramBoolean);
  
  public abstract void setExtraParameter(String paramString1, String paramString2);
  
  public abstract void setLiveStreamPrefetchSeconds(float paramFloat);
  
  public abstract void setUserRequestContext(Object paramObject);
  
  public abstract void setVastLoadTimeout(float paramFloat);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */