package com.google.ads.interactivemedia.v3.api.player;

import com.google.ads.interactivemedia.v3.api.AdPodInfo;

public abstract interface VideoAdPlayer
  extends AdProgressProvider, VolumeProvider
{
  public abstract void addCallback(VideoAdPlayerCallback paramVideoAdPlayerCallback);
  
  public abstract void loadAd(AdMediaInfo paramAdMediaInfo, AdPodInfo paramAdPodInfo);
  
  public abstract void pauseAd(AdMediaInfo paramAdMediaInfo);
  
  public abstract void playAd(AdMediaInfo paramAdMediaInfo);
  
  public abstract void release();
  
  public abstract void removeCallback(VideoAdPlayerCallback paramVideoAdPlayerCallback);
  
  public abstract void stopAd(AdMediaInfo paramAdMediaInfo);
  
  public static abstract interface VideoAdPlayerCallback
  {
    public abstract void onAdProgress(AdMediaInfo paramAdMediaInfo, VideoProgressUpdate paramVideoProgressUpdate);
    
    public abstract void onBuffering(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onEnded(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onError(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onLoaded(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onPause(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onPlay(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onResume(AdMediaInfo paramAdMediaInfo);
    
    public abstract void onVolumeChanged(AdMediaInfo paramAdMediaInfo, int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */