package com.google.ads.interactivemedia.v3.internal;

public final class mt
{
  public final Object a;
  public final int b;
  public final int c;
  public final long d;
  public final int e;
  
  public mt(Object paramObject)
  {
    this(paramObject, -1L);
  }
  
  public mt(Object paramObject, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramObject, paramInt1, paramInt2, paramLong, -1);
  }
  
  private mt(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    a = paramObject;
    b = paramInt1;
    c = paramInt2;
    d = paramLong;
    e = paramInt3;
  }
  
  public mt(Object paramObject, long paramLong)
  {
    this(paramObject, -1, -1, paramLong, -1);
  }
  
  public mt(Object paramObject, long paramLong, int paramInt)
  {
    this(paramObject, -1, -1, paramLong, paramInt);
  }
  
  public final mt a(Object paramObject)
  {
    if (a.equals(paramObject)) {
      return this;
    }
    return new mt(paramObject, b, c, d, e);
  }
  
  public final boolean a()
  {
    return b != -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (mt.class == paramObject.getClass()))
    {
      paramObject = (mt)paramObject;
      if ((a.equals(a)) && (b == b) && (c == c) && (d == d) && (e == e)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((a.hashCode() + 527) * 31 + b) * 31 + c) * 31 + (int)d) * 31 + e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */