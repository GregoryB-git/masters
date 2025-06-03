package com.google.android.exoplayer2.source.dash;

import d5.g;
import d5.j;
import java.util.List;
import v3.o0;
import v3.o0.e;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;
import x6.b;

public final class DashMediaSource$b
  extends r1
{
  public final long b;
  public final long c;
  public final long d;
  public final int e;
  public final long f;
  public final long o;
  public final long p;
  public final d5.c q;
  public final o0 r;
  public final o0.e s;
  
  public DashMediaSource$b(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4, long paramLong5, long paramLong6, d5.c paramc, o0 paramo0, o0.e parame)
  {
    boolean bool1 = d;
    boolean bool2 = true;
    boolean bool3;
    if (parame != null) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool1 == bool3) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    b.H(bool3);
    b = paramLong1;
    c = paramLong2;
    d = paramLong3;
    e = paramInt;
    f = paramLong4;
    o = paramLong5;
    p = paramLong6;
    q = paramc;
    r = paramo0;
    s = parame;
  }
  
  public final int b(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    int i = -1;
    if (!bool) {
      return -1;
    }
    int j = ((Integer)paramObject).intValue() - e;
    int k = i;
    if (j >= 0) {
      if (j >= h()) {
        k = i;
      } else {
        k = j;
      }
    }
    return k;
  }
  
  public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
  {
    b.x(paramInt, h());
    Integer localInteger = null;
    String str;
    if (paramBoolean) {
      str = q.b(paramInt).a;
    } else {
      str = null;
    }
    if (paramBoolean) {
      localInteger = Integer.valueOf(e + paramInt);
    }
    long l1 = q.e(paramInt);
    long l2 = e0.I(q.b(paramInt).b - q.b(0).b);
    long l3 = f;
    paramb.getClass();
    paramb.h(str, localInteger, 0, l1, l2 - l3, a5.a.o, false);
    return paramb;
  }
  
  public final int h()
  {
    return q.c();
  }
  
  public final Object l(int paramInt)
  {
    b.x(paramInt, h());
    return Integer.valueOf(e + paramInt);
  }
  
  public final r1.c n(int paramInt, r1.c paramc, long paramLong)
  {
    b.x(paramInt, 1);
    long l1 = p;
    Object localObject1 = q;
    if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt == 0) {
      paramLong = l1;
    }
    for (;;)
    {
      break;
      l2 = l1;
      if (paramLong > 0L)
      {
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > o)
        {
          paramLong = -9223372036854775807L;
          break;
        }
      }
      l1 = f + l2;
      l3 = ((d5.c)localObject1).e(0);
      paramInt = 0;
      while ((paramInt < q.c() - 1) && (l1 >= l3))
      {
        l1 -= l3;
        paramInt++;
        l3 = q.e(paramInt);
      }
      localObject1 = q.b(paramInt);
      int i = c.size();
      for (paramInt = 0; paramInt < i; paramInt++) {
        if (c.get(paramInt)).b == 2) {
          break label225;
        }
      }
      paramInt = -1;
      label225:
      if (paramInt == -1)
      {
        paramLong = l2;
      }
      else
      {
        localObject1 = ((j)c.get(paramInt)).c.get(0)).l();
        paramLong = l2;
        if (localObject1 != null) {
          if (((c5.c)localObject1).j(l3) == 0L) {
            paramLong = l2;
          } else {
            paramLong = ((c5.c)localObject1).a(((c5.c)localObject1).g(l1, l3)) + l2 - l1;
          }
        }
      }
    }
    Object localObject2 = r1.c.z;
    localObject1 = r;
    d5.c localc = q;
    long l2 = b;
    long l3 = c;
    l1 = d;
    boolean bool;
    if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
      bool = true;
    } else {
      bool = false;
    }
    paramc.b(localObject2, (o0)localObject1, localc, l2, l3, l1, true, bool, s, paramLong, o, 0, h() - 1, f);
    return paramc;
  }
  
  public final int o()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */