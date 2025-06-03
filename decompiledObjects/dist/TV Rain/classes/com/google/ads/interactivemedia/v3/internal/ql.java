package com.google.ads.interactivemedia.v3.internal;

public final class ql
{
  public final long a;
  public final long b;
  
  public ql(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ql.class == paramObject.getClass()))
    {
      paramObject = (ql)paramObject;
      if ((a == a) && (b == b)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)a * 31 + (int)b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ql
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */