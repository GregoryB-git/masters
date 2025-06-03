package com.google.ads.interactivemedia.v3.internal;

public final class cn
{
  public static final cn a;
  public static final cn b;
  public final long c;
  public final long d;
  
  static
  {
    cn localcn = new cn(0L, 0L);
    a = localcn;
    new cn(Long.MAX_VALUE, Long.MAX_VALUE);
    new cn(Long.MAX_VALUE, 0L);
    new cn(0L, Long.MAX_VALUE);
    b = localcn;
  }
  
  public cn(long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    if (paramLong2 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    c = paramLong1;
    d = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (cn.class == paramObject.getClass()))
    {
      paramObject = (cn)paramObject;
      if ((c == c) && (d == d)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)c * 31 + (int)d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */