package com.google.android.exoplayer2.source.dash;

import b5.f;
import c5.c;
import d5.j;

public final class c$b
{
  public final f a;
  public final j b;
  public final d5.b c;
  public final c d;
  public final long e;
  public final long f;
  
  public c$b(long paramLong1, j paramj, d5.b paramb, f paramf, long paramLong2, c paramc)
  {
    e = paramLong1;
    b = paramj;
    c = paramb;
    f = paramLong2;
    a = paramf;
    d = paramc;
  }
  
  public final b a(long paramLong, j paramj)
  {
    c localc1 = b.l();
    c localc2 = paramj.l();
    if (localc1 == null) {
      return new b(paramLong, paramj, c, a, f, localc1);
    }
    if (!localc1.h()) {
      return new b(paramLong, paramj, c, a, f, localc2);
    }
    long l1 = localc1.j(paramLong);
    if (l1 == 0L) {
      return new b(paramLong, paramj, c, a, f, localc2);
    }
    long l2 = localc1.i();
    long l3 = localc1.a(l2);
    long l4 = l1 + l2 - 1L;
    long l5 = localc1.a(l4);
    long l6 = localc1.b(l4, paramLong);
    l1 = localc2.i();
    long l7 = localc2.a(l1);
    long l8 = f;
    boolean bool = l6 + l5 < l7;
    if (!bool) {}
    for (l2 = l4 + 1L;; l2 = localc1.g(l7, paramLong))
    {
      l2 = l2 - l1 + l8;
      break;
      if (bool) {
        break label302;
      }
      if (l7 < l3)
      {
        l2 = l8 - (localc2.g(l3, paramLong) - l2);
        break;
      }
    }
    return new b(paramLong, paramj, c, a, l2, localc2);
    label302:
    throw new z4.b();
  }
  
  public final long b(long paramLong)
  {
    long l1 = d.d(e, paramLong);
    long l2 = f;
    return d.k(e, paramLong) + (l1 + l2) - 1L;
  }
  
  public final long c(long paramLong)
  {
    long l = d(paramLong);
    return d.b(paramLong - f, e) + l;
  }
  
  public final long d(long paramLong)
  {
    return d.a(paramLong - f);
  }
  
  public final boolean e(long paramLong1, long paramLong2)
  {
    boolean bool1 = d.h();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    bool1 = bool2;
    if (paramLong2 != -9223372036854775807L) {
      if (c(paramLong1) <= paramLong2) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */