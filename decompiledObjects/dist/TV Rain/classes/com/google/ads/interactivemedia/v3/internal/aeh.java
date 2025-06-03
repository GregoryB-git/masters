package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.CuePoint;

public final class aeh
  implements CuePoint
{
  private final double a;
  private final double b;
  private final boolean c;
  
  public aeh(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    a = paramDouble1;
    b = paramDouble2;
    c = paramBoolean;
  }
  
  public final double getEndTime()
  {
    return b;
  }
  
  public final double getStartTime()
  {
    return a;
  }
  
  public final boolean isPlayed()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aeh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */