package com.google.ads.interactivemedia.v3.internal;

import z2;

public final class gj
{
  public static final gj a = new gj(0L, 0L);
  public final long b;
  public final long c;
  
  public gj(long paramLong1, long paramLong2)
  {
    b = paramLong1;
    c = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (gj.class == paramObject.getClass()))
    {
      paramObject = (gj)paramObject;
      if ((b == b) && (c == c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)b * 31 + (int)c;
  }
  
  public final String toString()
  {
    long l1 = b;
    long l2 = c;
    StringBuilder localStringBuilder = new StringBuilder(60);
    localStringBuilder.append("[timeUs=");
    localStringBuilder.append(l1);
    localStringBuilder.append(", position=");
    return z2.r(localStringBuilder, l2, "]");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */