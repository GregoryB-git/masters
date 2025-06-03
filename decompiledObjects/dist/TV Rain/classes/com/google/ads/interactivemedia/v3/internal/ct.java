package com.google.ads.interactivemedia.v3.internal;

public final class ct
{
  public Object a;
  public int b;
  public long c;
  private long d;
  private og e = og.a;
  
  public final int a(int paramInt1, int paramInt2)
  {
    return e.c[paramInt1].a(paramInt2);
  }
  
  public final int a(long paramLong)
  {
    return e.a(paramLong);
  }
  
  public final long a()
  {
    return av.a(d);
  }
  
  public final long a(int paramInt)
  {
    return e.b[paramInt];
  }
  
  public final ct a(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2)
  {
    paramObject1 = og.a;
    a = paramObject2;
    b = 0;
    c = paramLong1;
    d = paramLong2;
    e = ((og)paramObject1);
    return this;
  }
  
  public final int b(int paramInt)
  {
    return e.c[paramInt].a(-1);
  }
  
  public final int b(long paramLong)
  {
    og localog = e;
    long l = c;
    if ((paramLong != Long.MIN_VALUE) && ((l == -9223372036854775807L) || (paramLong < l)))
    {
      for (int i = 0;; i++)
      {
        long[] arrayOfLong = b;
        if (i >= arrayOfLong.length) {
          break;
        }
        l = arrayOfLong[i];
        if ((l == Long.MIN_VALUE) || ((paramLong < l) && (c[i].a()))) {
          break;
        }
      }
      if (i < b.length) {
        return i;
      }
    }
    return -1;
  }
  
  public final long b()
  {
    return d;
  }
  
  public final boolean b(int paramInt1, int paramInt2)
  {
    oj localoj = e.c[paramInt1];
    return (a != -1) && (b[paramInt2] != 0);
  }
  
  public final int c(int paramInt)
  {
    return e.c[paramInt].a;
  }
  
  public final long c()
  {
    return e.d;
  }
  
  public final long c(int paramInt1, int paramInt2)
  {
    oj localoj = e.c[paramInt1];
    if (a != -1) {
      return c[paramInt2];
    }
    return -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */