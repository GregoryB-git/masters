package x0;

import d0.I;
import d0.I.b;
import d0.I.c;
import g0.M;

public final class f$a
  extends p
{
  public final long f;
  public final long g;
  public final long h;
  public final boolean i;
  
  public f$a(I paramI, long paramLong1, long paramLong2)
  {
    super(paramI);
    int j = paramI.i();
    boolean bool2 = false;
    if (j == 1)
    {
      paramI = paramI.n(0, new I.c());
      long l1 = Math.max(0L, paramLong1);
      if ((!k) && (l1 != 0L) && (!h)) {
        throw new f.b(1);
      }
      if (paramLong2 == Long.MIN_VALUE) {
        paramLong1 = m;
      } else {
        paramLong1 = Math.max(0L, paramLong2);
      }
      long l2 = m;
      paramLong2 = paramLong1;
      if (l2 != -9223372036854775807L)
      {
        paramLong2 = paramLong1;
        if (paramLong1 > l2) {
          paramLong2 = l2;
        }
        if (l1 > paramLong2) {
          throw new f.b(2);
        }
      }
      f = l1;
      g = paramLong2;
      boolean bool1 = paramLong2 < -9223372036854775807L;
      if (!bool1) {
        paramLong1 = -9223372036854775807L;
      } else {
        paramLong1 = paramLong2 - l1;
      }
      h = paramLong1;
      boolean bool3 = bool2;
      if (i) {
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
      i = bool3;
      return;
    }
    throw new f.b(0);
  }
  
  public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
  {
    e.g(0, paramb, paramBoolean);
    long l1 = paramb.n() - f;
    long l2 = h;
    if (l2 == -9223372036854775807L) {
      l2 = -9223372036854775807L;
    } else {
      l2 -= l1;
    }
    return paramb.s(a, b, 0, l2, l1);
  }
  
  public I.c o(int paramInt, I.c paramc, long paramLong)
  {
    e.o(0, paramc, 0L);
    long l = p;
    paramLong = f;
    p = (l + paramLong);
    m = h;
    i = i;
    l = l;
    if (l != -9223372036854775807L)
    {
      paramLong = Math.max(l, paramLong);
      l = paramLong;
      l = g;
      if (l != -9223372036854775807L) {
        paramLong = Math.min(paramLong, l);
      }
      l = (paramLong - f);
    }
    paramLong = M.i1(f);
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
 * Qualified Name:     x0.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */