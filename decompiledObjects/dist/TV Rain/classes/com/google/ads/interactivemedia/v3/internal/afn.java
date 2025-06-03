package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener;
import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;
import com.google.ads.interactivemedia.v3.impl.data.ag;

public abstract interface afn
  extends AdErrorEvent.AdErrorListener, AdProgressProvider
{
  public abstract void a(aes paramaes, aer paramaer, ag paramag);
  
  public abstract void e();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */