package com.google.ads.interactivemedia.v3.api.player;

public abstract interface VideoAdPlayer$VideoAdPlayerCallback
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

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */