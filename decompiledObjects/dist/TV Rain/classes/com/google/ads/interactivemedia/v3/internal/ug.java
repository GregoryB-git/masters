package com.google.ads.interactivemedia.v3.internal;

public class ug
  implements pp
{
  private final fv a;
  private final long b;
  
  public ug(fv paramfv, long paramLong)
  {
    a = paramfv;
    b = paramLong;
  }
  
  public long a()
  {
    return 0L;
  }
  
  public long a(long paramLong)
  {
    return a.e[((int)paramLong)] - b;
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    return a.b(paramLong1 + b);
  }
  
  public long b(long paramLong1, long paramLong2)
  {
    return a.d[((int)paramLong1)];
  }
  
  public qd b(long paramLong)
  {
    fv localfv = a;
    long[] arrayOfLong = c;
    int i = (int)paramLong;
    return new qd(null, arrayOfLong[i], b[i]);
  }
  
  public boolean b()
  {
    return true;
  }
  
  public int c(long paramLong)
  {
    return a.a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ug
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */