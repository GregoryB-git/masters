package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class qi
  extends qg
{
  public final qm g;
  public final qm h;
  private final long i;
  
  public qi(qd paramqd, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List<ql> paramList, qm paramqm1, qm paramqm2)
  {
    super(paramqd, paramLong1, paramLong2, paramLong3, paramLong5, paramList);
    g = paramqm1;
    h = paramqm2;
    i = paramLong4;
  }
  
  public final qd a(qc paramqc)
  {
    qm localqm = g;
    if (localqm != null)
    {
      paramqc = a;
      return new qd(localqm.a(a, 0L, e, 0L), 0L, -1L);
    }
    return super.a(paramqc);
  }
  
  public final qd a(qc paramqc, long paramLong)
  {
    Object localObject = c;
    long l;
    if (localObject != null) {
      l = geta))).a;
    } else {
      l = (paramLong - a) * b;
    }
    localObject = h;
    paramqc = a;
    return new qd(((qm)localObject).a(a, paramLong, e, l), 0L, -1L);
  }
  
  public final int b(long paramLong)
  {
    List localList = c;
    if (localList != null) {
      return localList.size();
    }
    long l = i;
    if (l != -1L) {
      return (int)(l - a + 1L);
    }
    if (paramLong != -9223372036854775807L) {
      return (int)wl.a(paramLong, b * 1000000L / e);
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */