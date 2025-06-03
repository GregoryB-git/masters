package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.upstream.DataSpec;

public abstract interface AdsLoader$EventListener
{
  public abstract void onAdClicked();
  
  public abstract void onAdLoadError(AdsMediaSource.AdLoadException paramAdLoadException, DataSpec paramDataSpec);
  
  public abstract void onAdPlaybackState(AdPlaybackState paramAdPlaybackState);
  
  public abstract void onAdTapped();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */