package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.internal.aje;
import com.google.ads.interactivemedia.v3.internal.ajg;

public final class e
  implements AdPodInfo
{
  public int adPosition = 1;
  public boolean isBumper = false;
  public double maxDuration = -1.0D;
  public int podIndex;
  public double timeOffset;
  public int totalAds = 1;
  
  public final boolean equals(Object paramObject)
  {
    return aje.a(this, paramObject, new String[0]);
  }
  
  public final int getAdPosition()
  {
    return adPosition;
  }
  
  public final double getMaxDuration()
  {
    return maxDuration;
  }
  
  public final int getPodIndex()
  {
    return podIndex;
  }
  
  public final double getTimeOffset()
  {
    return timeOffset;
  }
  
  public final int getTotalAds()
  {
    return totalAds;
  }
  
  public final int hashCode()
  {
    return ajg.a(this, new String[0]);
  }
  
  public final boolean isBumper()
  {
    return isBumper;
  }
  
  public final String toString()
  {
    int i = totalAds;
    int j = adPosition;
    boolean bool = isBumper;
    double d1 = maxDuration;
    int k = podIndex;
    double d2 = timeOffset;
    StringBuilder localStringBuilder = new StringBuilder(169);
    localStringBuilder.append("AdPodInfo [totalAds=");
    localStringBuilder.append(i);
    localStringBuilder.append(", adPosition=");
    localStringBuilder.append(j);
    localStringBuilder.append(", isBumper=");
    localStringBuilder.append(bool);
    localStringBuilder.append(", maxDuration=");
    localStringBuilder.append(d1);
    localStringBuilder.append(", podIndex=");
    localStringBuilder.append(k);
    localStringBuilder.append(", timeOffset=");
    localStringBuilder.append(d2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */