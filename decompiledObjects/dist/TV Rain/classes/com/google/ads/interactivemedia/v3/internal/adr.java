package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.StreamManager;

public final class adr
  implements AdsManagerLoadedEvent
{
  private final AdsManager a;
  private final StreamManager b;
  private final Object c;
  
  public adr(AdsManager paramAdsManager, Object paramObject)
  {
    a = paramAdsManager;
    b = null;
    c = paramObject;
  }
  
  public adr(StreamManager paramStreamManager, Object paramObject)
  {
    a = null;
    b = paramStreamManager;
    c = paramObject;
  }
  
  public final AdsManager getAdsManager()
  {
    return a;
  }
  
  public final StreamManager getStreamManager()
  {
    return b;
  }
  
  public final Object getUserRequestContext()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */