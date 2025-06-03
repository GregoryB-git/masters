package com.google.ads.interactivemedia.v3.internal;

final class cc
{
  public final mt a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  public final boolean f;
  public final boolean g;
  
  public cc(mt parammt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = parammt;
    b = paramLong1;
    c = paramLong2;
    d = paramLong3;
    e = paramLong4;
    f = paramBoolean1;
    g = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (cc.class == paramObject.getClass()))
    {
      paramObject = (cc)paramObject;
      if ((b == b) && (c == c) && (d == d) && (e == e) && (f == f) && (g == g) && (wl.a(a, a))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((((a.hashCode() + 527) * 31 + (int)b) * 31 + (int)c) * 31 + (int)d) * 31 + (int)e) * 31 + f) * 31 + g;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */