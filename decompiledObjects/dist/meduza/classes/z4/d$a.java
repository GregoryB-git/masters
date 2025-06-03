package z4;

import a5.a;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;

public final class d$a
  extends l
{
  public final long c;
  public final long d;
  public final long e;
  public final boolean f;
  
  public d$a(r1 paramr1, long paramLong1, long paramLong2)
  {
    super(paramr1);
    int i = paramr1.h();
    boolean bool2 = false;
    if (i == 1)
    {
      paramr1 = paramr1.m(0, new r1.c());
      long l1 = Math.max(0L, paramLong1);
      if ((!t) && (l1 != 0L) && (!p)) {
        throw new d.b(1);
      }
      if (paramLong2 == Long.MIN_VALUE) {
        paramLong1 = v;
      } else {
        paramLong1 = Math.max(0L, paramLong2);
      }
      long l2 = v;
      paramLong2 = paramLong1;
      if (l2 != -9223372036854775807L)
      {
        paramLong2 = paramLong1;
        if (paramLong1 > l2) {
          paramLong2 = l2;
        }
        if (l1 > paramLong2) {
          throw new d.b(2);
        }
      }
      c = l1;
      d = paramLong2;
      boolean bool1 = paramLong2 < -9223372036854775807L;
      if (!bool1) {
        paramLong1 = -9223372036854775807L;
      } else {
        paramLong1 = paramLong2 - l1;
      }
      e = paramLong1;
      boolean bool3 = bool2;
      if (q) {
        if (bool1)
        {
          bool3 = bool2;
          if (l2 != -9223372036854775807L)
          {
            bool3 = bool2;
            if (paramLong2 != l2) {}
          }
        }
        else
        {
          bool3 = true;
        }
      }
      f = bool3;
      return;
    }
    throw new d.b(0);
  }
  
  public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
  {
    b.f(0, paramb, paramBoolean);
    long l1 = e - c;
    long l2 = e;
    if (l2 == -9223372036854775807L) {
      l2 = -9223372036854775807L;
    } else {
      l2 -= l1;
    }
    paramb.h(a, b, 0, l2, l1, a.o, false);
    return paramb;
  }
  
  public final r1.c n(int paramInt, r1.c paramc, long paramLong)
  {
    b.n(0, paramc, 0L);
    long l = y;
    paramLong = c;
    y = (l + paramLong);
    v = e;
    q = f;
    l = u;
    if (l != -9223372036854775807L)
    {
      paramLong = Math.max(l, paramLong);
      u = paramLong;
      l = d;
      if (l != -9223372036854775807L) {
        paramLong = Math.min(paramLong, l);
      }
      u = (paramLong - c);
    }
    paramLong = e0.R(c);
    l = e;
    if (l != -9223372036854775807L) {
      e = (l + paramLong);
    }
    l = f;
    if (l != -9223372036854775807L) {
      f = (l + paramLong);
    }
    return paramc;
  }
}

/* Location:
 * Qualified Name:     z4.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */