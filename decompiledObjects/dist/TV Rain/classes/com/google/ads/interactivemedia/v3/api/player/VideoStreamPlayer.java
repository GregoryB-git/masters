package com.google.ads.interactivemedia.v3.api.player;

import java.util.HashMap;
import java.util.List;

public abstract interface VideoStreamPlayer
  extends ContentProgressProvider, VolumeProvider
{
  public abstract void addCallback(VideoStreamPlayerCallback paramVideoStreamPlayerCallback);
  
  public abstract int getVolume();
  
  public abstract void loadUrl(String paramString, List<HashMap<String, String>> paramList);
  
  public abstract void onAdBreakEnded();
  
  public abstract void onAdBreakStarted();
  
  public abstract void onAdPeriodEnded();
  
  public abstract void onAdPeriodStarted();
  
  public abstract void removeCallback(VideoStreamPlayerCallback paramVideoStreamPlayerCallback);
  
  public abstract void seek(long paramLong);
  
  public static abstract interface VideoStreamPlayerCallback
  {
    public abstract void onUserTextReceived(String paramString);
    
    public abstract void onVolumeChanged(int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */