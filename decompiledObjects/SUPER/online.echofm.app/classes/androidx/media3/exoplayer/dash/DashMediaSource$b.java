package androidx.media3.exoplayer.dash;

import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u;
import d0.u.g;
import g0.M;
import java.util.List;
import o0.c;
import o0.j;

public final class DashMediaSource$b
  extends I
{
  public final long e;
  public final long f;
  public final long g;
  public final int h;
  public final long i;
  public final long j;
  public final long k;
  public final c l;
  public final u m;
  public final u.g n;
  
  public DashMediaSource$b(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4, long paramLong5, long paramLong6, c paramc, u paramu, u.g paramg)
  {
    boolean bool1 = d;
    boolean bool2 = true;
    boolean bool3;
    if (paramg != null) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool1 == bool3) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    g0.a.f(bool3);
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramInt;
    i = paramLong4;
    j = paramLong5;
    k = paramLong6;
    l = paramc;
    m = paramu;
    n = paramg;
  }
  
  public static boolean t(c paramc)
  {
    boolean bool;
    if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int b(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    int i1 = -1;
    if (!bool) {
      return -1;
    }
    int i2 = ((Integer)paramObject).intValue() - h;
    int i3 = i1;
    if (i2 >= 0) {
      if (i2 >= i()) {
        i3 = i1;
      } else {
        i3 = i2;
      }
    }
    return i3;
  }
  
  public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
  {
    g0.a.c(paramInt, 0, i());
    Integer localInteger = null;
    String str;
    if (paramBoolean) {
      str = l.d(paramInt).a;
    } else {
      str = null;
    }
    if (paramBoolean) {
      localInteger = Integer.valueOf(h + paramInt);
    }
    return paramb.s(str, localInteger, 0, l.g(paramInt), M.J0(l.d(paramInt).b - l.d(0).b) - i);
  }
  
  public int i()
  {
    return l.e();
  }
  
  public Object m(int paramInt)
  {
    g0.a.c(paramInt, 0, i());
    return Integer.valueOf(h + paramInt);
  }
  
  public I.c o(int paramInt, I.c paramc, long paramLong)
  {
    g0.a.c(paramInt, 0, 1);
    paramLong = s(paramLong);
    Object localObject = I.c.q;
    u localu = m;
    c localc = l;
    return paramc.g(localObject, localu, localc, e, f, g, true, t(localc), n, paramLong, j, 0, i() - 1, i);
  }
  
  public int p()
  {
    return 1;
  }
  
  public final long s(long paramLong)
  {
    long l1 = k;
    if (!t(l)) {
      return l1;
    }
    long l2 = l1;
    if (paramLong > 0L)
    {
      paramLong = l1 + paramLong;
      l2 = paramLong;
      if (paramLong > j) {
        return -9223372036854775807L;
      }
    }
    l1 = i + l2;
    paramLong = l.g(0);
    int i1 = 0;
    while ((i1 < l.e() - 1) && (l1 >= paramLong))
    {
      l1 -= paramLong;
      i1++;
      paramLong = l.g(i1);
    }
    Object localObject = l.d(i1);
    i1 = ((o0.g)localObject).a(2);
    if (i1 == -1) {
      return l2;
    }
    localObject = ((j)c.get(i1)).c.get(0)).l();
    long l3 = l2;
    if (localObject != null) {
      if (((n0.g)localObject).i(paramLong) == 0L) {
        l3 = l2;
      } else {
        l3 = l2 + ((n0.g)localObject).c(((n0.g)localObject).a(l1, paramLong)) - l1;
      }
    }
    return l3;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.DashMediaSource.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */