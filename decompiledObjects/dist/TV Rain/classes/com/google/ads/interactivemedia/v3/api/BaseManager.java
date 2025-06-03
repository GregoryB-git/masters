package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;

public abstract interface BaseManager
  extends AdProgressProvider
{
  public abstract void addAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener);
  
  public abstract void addAdEventListener(AdEvent.AdEventListener paramAdEventListener);
  
  public abstract void destroy();
  
  public abstract AdProgressInfo getAdProgressInfo();
  
  public abstract Ad getCurrentAd();
  
  public abstract void init();
  
  public abstract void init(AdsRenderingSettings paramAdsRenderingSettings);
  
  public abstract boolean isCustomPlaybackUsed();
  
  public abstract void removeAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener);
  
  public abstract void removeAdEventListener(AdEvent.AdEventListener paramAdEventListener);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.BaseManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */