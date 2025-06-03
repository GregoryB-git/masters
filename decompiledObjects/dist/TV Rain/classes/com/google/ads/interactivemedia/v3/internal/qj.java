package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class qj
  extends qg
{
  public final List<qd> g;
  
  public qj(qd paramqd, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<ql> paramList, List<qd> paramList1)
  {
    super(paramqd, paramLong1, paramLong2, paramLong3, paramLong4, paramList);
    g = paramList1;
  }
  
  public final qd a(qc paramqc, long paramLong)
  {
    return (qd)g.get((int)(paramLong - a));
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final int b(long paramLong)
  {
    return g.size();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */