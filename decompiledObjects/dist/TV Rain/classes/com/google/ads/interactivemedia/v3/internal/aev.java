package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.List;
import java.util.Map;

public final class aev
{
  public final AdEvent.AdEventType a;
  public final b b;
  public Map<String, String> c;
  public List<CuePoint> d;
  public AdProgressInfo e;
  public String f;
  public double g;
  
  public aev(AdEvent.AdEventType paramAdEventType, b paramb)
  {
    a = paramAdEventType;
    b = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public final int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aev
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */