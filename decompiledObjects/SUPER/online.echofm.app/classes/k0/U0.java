package k0;

import A0.E;
import X2.v;
import android.os.SystemClock;
import d0.C;
import d0.I;
import g0.M;
import java.util.List;
import x0.Z;
import x0.x.b;

public final class U0
{
  public static final x.b u = new x.b(new Object());
  public final I a;
  public final x.b b;
  public final long c;
  public final long d;
  public final int e;
  public final u f;
  public final boolean g;
  public final Z h;
  public final E i;
  public final List j;
  public final x.b k;
  public final boolean l;
  public final int m;
  public final int n;
  public final C o;
  public final boolean p;
  public volatile long q;
  public volatile long r;
  public volatile long s;
  public volatile long t;
  
  public U0(I paramI, x.b paramb1, long paramLong1, long paramLong2, int paramInt1, u paramu, boolean paramBoolean1, Z paramZ, E paramE, List paramList, x.b paramb2, boolean paramBoolean2, int paramInt2, int paramInt3, C paramC, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean3)
  {
    a = paramI;
    b = paramb1;
    c = paramLong1;
    d = paramLong2;
    e = paramInt1;
    f = paramu;
    g = paramBoolean1;
    h = paramZ;
    i = paramE;
    j = paramList;
    k = paramb2;
    l = paramBoolean2;
    m = paramInt2;
    n = paramInt3;
    o = paramC;
    q = paramLong3;
    r = paramLong4;
    s = paramLong5;
    t = paramLong6;
    p = paramBoolean3;
  }
  
  public static U0 k(E paramE)
  {
    I localI = I.a;
    x.b localb = u;
    return new U0(localI, localb, -9223372036854775807L, 0L, 1, null, false, Z.d, paramE, v.Y(), localb, false, 1, 0, C.d, 0L, 0L, 0L, 0L, false);
  }
  
  public static x.b l()
  {
    return u;
  }
  
  public U0 a()
  {
    return new U0(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, q, r, m(), SystemClock.elapsedRealtime(), p);
  }
  
  public U0 b(boolean paramBoolean)
  {
    return new U0(a, b, c, d, e, f, paramBoolean, h, i, j, k, l, m, n, o, q, r, s, t, p);
  }
  
  public U0 c(x.b paramb)
  {
    return new U0(a, b, c, d, e, f, g, h, i, j, paramb, l, m, n, o, q, r, s, t, p);
  }
  
  public U0 d(x.b paramb, long paramLong1, long paramLong2, long paramLong3, long paramLong4, Z paramZ, E paramE, List paramList)
  {
    return new U0(a, paramb, paramLong2, paramLong3, e, f, g, paramZ, paramE, paramList, k, l, m, n, o, q, paramLong4, paramLong1, SystemClock.elapsedRealtime(), p);
  }
  
  public U0 e(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    return new U0(a, b, c, d, e, f, g, h, i, j, k, paramBoolean, paramInt1, paramInt2, o, q, r, s, t, p);
  }
  
  public U0 f(u paramu)
  {
    return new U0(a, b, c, d, e, paramu, g, h, i, j, k, l, m, n, o, q, r, s, t, p);
  }
  
  public U0 g(C paramC)
  {
    return new U0(a, b, c, d, e, f, g, h, i, j, k, l, m, n, paramC, q, r, s, t, p);
  }
  
  public U0 h(int paramInt)
  {
    return new U0(a, b, c, d, paramInt, f, g, h, i, j, k, l, m, n, o, q, r, s, t, p);
  }
  
  public U0 i(boolean paramBoolean)
  {
    return new U0(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, q, r, s, t, paramBoolean);
  }
  
  public U0 j(I paramI)
  {
    return new U0(paramI, b, c, d, e, f, g, h, i, j, k, l, m, n, o, q, r, s, t, p);
  }
  
  public long m()
  {
    if (!n()) {
      return s;
    }
    long l1;
    long l2;
    do
    {
      l1 = t;
      l2 = s;
    } while (l1 != t);
    long l3 = SystemClock.elapsedRealtime();
    return M.J0(M.i1(l2) + ((float)(l3 - l1) * o.a));
  }
  
  public boolean n()
  {
    boolean bool;
    if ((e == 3) && (l) && (n == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void o(long paramLong)
  {
    s = paramLong;
    t = SystemClock.elapsedRealtime();
  }
}

/* Location:
 * Qualified Name:     k0.U0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */