package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class qf
  extends qc
  implements pp
{
  private final qg e;
  
  public qf(long paramLong, bw parambw, String paramString, qg paramqg, List<pz> paramList)
  {
    super(paramLong, parambw, paramString, paramqg, paramList, (byte)0);
    e = paramqg;
  }
  
  public final long a()
  {
    return e.a;
  }
  
  public final long a(long paramLong)
  {
    return e.a(paramLong);
  }
  
  public final long a(long paramLong1, long paramLong2)
  {
    qg localqg = e;
    long l1 = a;
    paramLong2 = localqg.b(paramLong2);
    if (paramLong2 == 0L) {
      return l1;
    }
    long l2;
    long l3;
    if (c == null)
    {
      l2 = b * 1000000L / e;
      l3 = a;
      paramLong1 = paramLong1 / l2 + l3;
      if (paramLong1 < l1) {
        paramLong1 = l1;
      } else if (paramLong2 != -1L) {
        return Math.min(paramLong1, l1 + paramLong2 - 1L);
      }
    }
    else
    {
      paramLong2 = paramLong2 + l1 - 1L;
      l3 = l1;
      while (l3 <= paramLong2)
      {
        l2 = (paramLong2 - l3) / 2L + l3;
        boolean bool = localqg.a(l2) < paramLong1;
        if (bool) {
          l3 = l2 + 1L;
        } else if (bool) {
          paramLong2 = l2 - 1L;
        } else {
          return l2;
        }
      }
      if (l3 == l1) {
        return l3;
      }
      paramLong1 = paramLong2;
    }
    return paramLong1;
  }
  
  public final long b(long paramLong1, long paramLong2)
  {
    qg localqg = e;
    List localList = c;
    if (localList != null) {
      return geta))).b * 1000000L / e;
    }
    int i = localqg.b(paramLong2);
    if ((i != -1) && (paramLong1 == a + i - 1L)) {
      return paramLong2 - localqg.a(paramLong1);
    }
    return b * 1000000L / e;
  }
  
  public final qd b(long paramLong)
  {
    return e.a(this, paramLong);
  }
  
  public final boolean b()
  {
    return e.a();
  }
  
  public final int c(long paramLong)
  {
    return e.b(paramLong);
  }
  
  public final qd d()
  {
    return null;
  }
  
  public final pp e()
  {
    return this;
  }
  
  public final String f()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */