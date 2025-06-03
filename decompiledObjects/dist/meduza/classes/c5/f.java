package c5;

import java.nio.ByteBuffer;
import l3.l;
import r4.c;
import v3.i0;
import v5.e0;
import z3.g;
import z4.c0;

public final class f
  implements c0
{
  public final i0 a;
  public final c b;
  public long[] c;
  public boolean d;
  public d5.f e;
  public boolean f;
  public int o;
  public long p;
  
  public f(d5.f paramf, i0 parami0, boolean paramBoolean)
  {
    a = parami0;
    e = paramf;
    b = new c();
    p = -9223372036854775807L;
    c = b;
    d(paramf, paramBoolean);
  }
  
  public final void a() {}
  
  public final boolean b()
  {
    return true;
  }
  
  public final void c(long paramLong)
  {
    long[] arrayOfLong = c;
    int i = 1;
    int j = e0.b(arrayOfLong, paramLong, true);
    o = j;
    if ((!d) || (j != c.length)) {
      i = 0;
    }
    if (i == 0) {
      paramLong = -9223372036854775807L;
    }
    p = paramLong;
  }
  
  public final void d(d5.f paramf, boolean paramBoolean)
  {
    int i = o;
    long l1;
    if (i == 0) {
      l1 = -9223372036854775807L;
    } else {
      l1 = c[(i - 1)];
    }
    d = paramBoolean;
    e = paramf;
    paramf = b;
    c = paramf;
    long l2 = p;
    if (l2 != -9223372036854775807L) {
      c(l2);
    } else if (l1 != -9223372036854775807L) {
      o = e0.b(paramf, l1, false);
    }
  }
  
  public final int m(long paramLong)
  {
    int i = Math.max(o, e0.b(c, paramLong, true));
    int j = o;
    o = i;
    return i - j;
  }
  
  public final int r(l paraml, g paramg, int paramInt)
  {
    int i = o;
    int j;
    if (i == c.length) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) && (!d))
    {
      a = 4;
      return -4;
    }
    if (((paramInt & 0x2) == 0) && (f))
    {
      if (j != 0) {
        return -3;
      }
      if ((paramInt & 0x1) == 0) {
        o = (i + 1);
      }
      if ((paramInt & 0x4) == 0)
      {
        paraml = b.e(e.a[i]);
        paramg.q(paraml.length);
        c.put(paraml);
      }
      e = c[i];
      a = 1;
      return -4;
    }
    b = a;
    f = true;
    return -5;
  }
}

/* Location:
 * Qualified Name:     c5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */