package com.google.ads.interactivemedia.v3.api;

public abstract interface AdsManagerLoadedEvent
{
  public abstract AdsManager getAdsManager();
  
  public abstract StreamManager getStreamManager();
  
  public abstract Object getUserRequestContext();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */