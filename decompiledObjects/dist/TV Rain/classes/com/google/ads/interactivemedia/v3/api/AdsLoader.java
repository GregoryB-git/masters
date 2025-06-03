package com.google.ads.interactivemedia.v3.api;

public abstract interface AdsLoader
{
  public abstract void addAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener);
  
  public abstract void addAdsLoadedListener(AdsLoadedListener paramAdsLoadedListener);
  
  public abstract void contentComplete();
  
  public abstract ImaSdkSettings getSettings();
  
  public abstract void removeAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener);
  
  public abstract void removeAdsLoadedListener(AdsLoadedListener paramAdsLoadedListener);
  
  public abstract void requestAds(AdsRequest paramAdsRequest);
  
  public abstract String requestStream(StreamRequest paramStreamRequest);
  
  public static abstract interface AdsLoadedListener
  {
    public abstract void onAdsManagerLoaded(AdsManagerLoadedEvent paramAdsManagerLoadedEvent);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdsLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */