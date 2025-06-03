package com.google.android.exoplayer2.source.ads;

import java.io.IOException;

@Deprecated
public abstract interface AdsMediaSource$EventListener
{
  public abstract void onAdClicked();
  
  public abstract void onAdLoadError(IOException paramIOException);
  
  public abstract void onAdTapped();
  
  public abstract void onInternalAdLoadError(RuntimeException paramRuntimeException);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ads.AdsMediaSource.EventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */