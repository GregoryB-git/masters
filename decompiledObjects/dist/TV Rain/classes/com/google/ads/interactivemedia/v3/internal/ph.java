package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

final class ph
  extends cr
{
  private final long b;
  private final long c;
  private final int d;
  private final long e;
  private final long f;
  private final long g;
  private final aaa h;
  private final Object i;
  
  public ph(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, long paramLong5, aaa paramaaa, Object paramObject)
  {
    b = paramLong1;
    c = paramLong2;
    d = paramInt;
    e = paramLong3;
    f = paramLong4;
    g = paramLong5;
    h = paramaaa;
    i = paramObject;
  }
  
  public final int a(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    int j = ((Integer)paramObject).intValue() - d;
    if ((j >= 0) && (j < h.a())) {
      return j;
    }
    return -1;
  }
  
  public final ct a(int paramInt, ct paramct, boolean paramBoolean)
  {
    rp.a(paramInt, 0, h.a());
    Integer localInteger = null;
    String str;
    if (paramBoolean) {
      str = h.a(paramInt).a;
    } else {
      str = null;
    }
    if (paramBoolean) {
      localInteger = Integer.valueOf(d + paramInt);
    }
    return paramct.a(str, localInteger, 0, h.c(paramInt), av.b(h.a(paramInt).b - h.a(0).b) - e);
  }
  
  public final cw a(int paramInt, cw paramcw, long paramLong)
  {
    rp.a(paramInt, 0, 1);
    long l1 = g;
    Object localObject = h;
    if (!d) {
      paramLong = l1;
    }
    for (;;)
    {
      break;
      long l2 = l1;
      if (paramLong > 0L)
      {
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > f)
        {
          paramLong = -9223372036854775807L;
          break;
        }
      }
      long l3 = e + l2;
      l1 = ((aaa)localObject).c(0);
      paramInt = 0;
      while ((paramInt < h.a() - 1) && (l3 >= l1))
      {
        l3 -= l1;
        paramInt++;
        l1 = h.c(paramInt);
      }
      localObject = h.a(paramInt);
      int j = c.size();
      for (paramInt = 0; paramInt < j; paramInt++) {
        if (c.get(paramInt)).b == 2) {
          break label192;
        }
      }
      paramInt = -1;
      label192:
      if (paramInt == -1)
      {
        paramLong = l2;
      }
      else
      {
        localObject = ((qc)c.get(paramInt)).c.get(0)).e();
        paramLong = l2;
        if (localObject != null) {
          if (((pp)localObject).c(l1) == 0) {
            paramLong = l2;
          } else {
            paramLong = ((pp)localObject).a(((pp)localObject).a(l3, l1)) + l2 - l3;
          }
        }
      }
    }
    localObject = h;
    boolean bool;
    if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
      bool = true;
    } else {
      bool = false;
    }
    return paramcw.a(cw.a, i, localObject, b, c, true, bool, paramLong, f, 0, ((aaa)localObject).a() - 1, e);
  }
  
  public final Object a(int paramInt)
  {
    rp.a(paramInt, 0, h.a());
    return Integer.valueOf(d + paramInt);
  }
  
  public final int b()
  {
    return 1;
  }
  
  public final int c()
  {
    return h.a();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ph
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */