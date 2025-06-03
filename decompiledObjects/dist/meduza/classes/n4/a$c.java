package n4;

import c4.i;
import c4.v;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;

public final class a$c
  implements a.b
{
  public final c4.j a;
  public final v b;
  public final b c;
  public final i0 d;
  public final int e;
  public long f;
  public int g;
  public long h;
  
  public a$c(c4.j paramj, v paramv, b paramb, String paramString, int paramInt)
  {
    a = paramj;
    b = paramv;
    c = paramb;
    int i = a * d / 8;
    if (c == i)
    {
      int j = b * i;
      int k = j * 8;
      i = Math.max(i, j / 10);
      e = i;
      paramj = new i0.a();
      k = paramString;
      f = k;
      g = k;
      l = i;
      x = a;
      y = b;
      z = paramInt;
      d = new i0(paramj);
      return;
    }
    paramj = a0.j.n("Expected block size: ", i, "; got: ");
    paramj.append(c);
    throw a1.a(paramj.toString(), null);
  }
  
  public final void a(long paramLong)
  {
    f = paramLong;
    g = 0;
    h = 0L;
  }
  
  public final boolean b(i parami, long paramLong)
  {
    boolean bool2;
    int i;
    for (;;)
    {
      boolean bool1 = paramLong < 0L;
      bool2 = true;
      if (!bool1) {
        break;
      }
      j = g;
      k = e;
      if (j >= k) {
        break;
      }
      i = (int)Math.min(k - j, paramLong);
      i = b.e(parami, i, true);
      if (i == -1)
      {
        paramLong = 0L;
      }
      else
      {
        g += i;
        paramLong -= i;
      }
    }
    parami = c;
    int j = c;
    int k = g / j;
    if (k > 0)
    {
      paramLong = f;
      long l = e0.O(h, 1000000L, b);
      int m = k * j;
      j = g - m;
      b.c(paramLong + l, 1, m, j, null);
      h += k;
      g = j;
    }
    if (i > 0) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void c(int paramInt, long paramLong)
  {
    a.t(new d(c, 1, paramInt, paramLong));
    b.d(d);
  }
}

/* Location:
 * Qualified Name:     n4.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */