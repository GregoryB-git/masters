package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public abstract class qg
  extends qh
{
  public final long a;
  public final long b;
  public final List<ql> c;
  
  public qg(qd paramqd, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<ql> paramList)
  {
    super(paramqd, paramLong1, paramLong2);
    a = paramLong3;
    b = paramLong4;
    c = paramList;
  }
  
  public final long a(long paramLong)
  {
    List localList = c;
    if (localList != null) {
      paramLong = geta))).a - f;
    } else {
      paramLong = (paramLong - a) * b;
    }
    return wl.c(paramLong, 1000000L, e);
  }
  
  public abstract qd a(qc paramqc, long paramLong);
  
  public boolean a()
  {
    return c != null;
  }
  
  public abstract int b(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */