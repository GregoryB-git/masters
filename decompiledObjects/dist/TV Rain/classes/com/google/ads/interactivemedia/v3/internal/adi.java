package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

public final class adi
  implements AdErrorEvent
{
  private final AdError a;
  private final Object b;
  
  public adi(AdError paramAdError)
  {
    a = paramAdError;
    b = null;
  }
  
  public adi(AdError paramAdError, Object paramObject)
  {
    a = paramAdError;
    b = paramObject;
  }
  
  public final AdError getError()
  {
    return a;
  }
  
  public final Object getUserRequestContext()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */