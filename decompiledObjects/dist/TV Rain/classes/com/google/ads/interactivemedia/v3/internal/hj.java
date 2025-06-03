package com.google.ads.interactivemedia.v3.internal;

final class hj
  implements he
{
  private final vy a;
  private final int b;
  private final int c;
  private int d;
  private int e;
  
  public hj(hc paramhc)
  {
    paramhc = b;
    a = paramhc;
    paramhc.c(12);
    c = (paramhc.p() & 0xFF);
    b = paramhc.p();
  }
  
  public final int a()
  {
    return b;
  }
  
  public final int b()
  {
    int i = c;
    if (i == 8) {
      return a.e();
    }
    if (i == 16) {
      return a.f();
    }
    i = d;
    d = (i + 1);
    if (i % 2 == 0)
    {
      i = a.e();
      e = i;
      return (i & 0xF0) >> 4;
    }
    return e & 0xF;
  }
  
  public final boolean c()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */