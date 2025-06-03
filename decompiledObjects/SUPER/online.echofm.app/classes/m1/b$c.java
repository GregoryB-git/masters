package m1;

import F0.T;
import F0.s;
import F0.t;
import d0.A;
import d0.q;
import d0.q.b;
import g0.M;

public final class b$c
  implements b.b
{
  public final t a;
  public final T b;
  public final c c;
  public final q d;
  public final int e;
  public long f;
  public int g;
  public long h;
  
  public b$c(t paramt, T paramT, c paramc, String paramString, int paramInt)
  {
    a = paramt;
    b = paramT;
    c = paramc;
    int i = b * f / 8;
    if (e == i)
    {
      int j = c;
      int k = j * i * 8;
      j = Math.max(i, j * i / 10);
      e = j;
      d = new q.b().o0(paramString).M(k).j0(k).f0(j).N(b).p0(c).i0(paramInt).K();
      return;
    }
    paramt = new StringBuilder();
    paramt.append("Expected block size: ");
    paramt.append(i);
    paramt.append("; got: ");
    paramt.append(e);
    throw A.a(paramt.toString(), null);
  }
  
  public boolean a(s params, long paramLong)
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
      i = b.f(params, i, true);
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
    params = c;
    int j = e;
    int k = g / j;
    if (k > 0)
    {
      long l = f;
      paramLong = M.W0(h, 1000000L, c);
      j = k * j;
      int m = g - j;
      b.b(l + paramLong, 1, j, m, null);
      h += k;
      g = m;
    }
    if (i > 0) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void b(int paramInt, long paramLong)
  {
    a.e(new e(c, 1, paramInt, paramLong));
    b.d(d);
  }
  
  public void c(long paramLong)
  {
    f = paramLong;
    g = 0;
    h = 0L;
  }
}

/* Location:
 * Qualified Name:     m1.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */