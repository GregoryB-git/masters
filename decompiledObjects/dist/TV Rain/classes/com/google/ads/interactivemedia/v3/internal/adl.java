package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;

public final class adl
  implements AdProgressInfo
{
  private final double a;
  private final double b;
  private final int c;
  private final int d;
  private final double e;
  
  public adl(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3)
  {
    a = paramDouble1;
    b = paramDouble2;
    c = paramInt1;
    d = paramInt2;
    e = paramDouble3;
  }
  
  public final double getAdBreakDuration()
  {
    return e;
  }
  
  public final int getAdPosition()
  {
    return c;
  }
  
  public final double getCurrentTime()
  {
    return a;
  }
  
  public final double getDuration()
  {
    return b;
  }
  
  public final int getTotalAds()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */