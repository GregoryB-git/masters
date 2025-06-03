package k0;

import A0.D;
import A0.E;
import A0.y;
import B0.b;
import d0.I;
import g0.a;
import java.io.IOException;
import x0.Q;
import x0.Z;
import x0.e;
import x0.v;
import x0.x.b;

public final class B0
{
  public final v a;
  public final Object b;
  public final Q[] c;
  public boolean d;
  public boolean e;
  public C0 f;
  public boolean g;
  public final boolean[] h;
  public final a1[] i;
  public final D j;
  public final T0 k;
  public B0 l;
  public Z m;
  public E n;
  public long o;
  
  public B0(a1[] paramArrayOfa1, long paramLong, D paramD, b paramb, T0 paramT0, C0 paramC0, E paramE)
  {
    i = paramArrayOfa1;
    o = paramLong;
    j = paramD;
    k = paramT0;
    paramD = a;
    b = a;
    f = paramC0;
    m = Z.d;
    n = paramE;
    c = new Q[paramArrayOfa1.length];
    h = new boolean[paramArrayOfa1.length];
    a = f(paramD, paramT0, paramb, b, d);
  }
  
  public static v f(x.b paramb, T0 paramT0, b paramb1, long paramLong1, long paramLong2)
  {
    paramT0 = paramT0.h(paramb, paramb1, paramLong1);
    paramb = paramT0;
    if (paramLong2 != -9223372036854775807L) {
      paramb = new e(paramT0, true, 0L, paramLong2);
    }
    return paramb;
  }
  
  public static void w(T0 paramT0, v paramv)
  {
    v localv = paramv;
    try
    {
      if ((paramv instanceof e)) {
        localv = o;
      }
      paramT0.z(localv);
    }
    catch (RuntimeException paramT0)
    {
      g0.o.d("MediaPeriodHolder", "Period release failed.", paramT0);
    }
  }
  
  public long A(long paramLong)
  {
    return paramLong - m();
  }
  
  public long B(long paramLong)
  {
    return paramLong + m();
  }
  
  public void C()
  {
    v localv = a;
    if ((localv instanceof e))
    {
      long l1 = f.d;
      long l2 = l1;
      if (l1 == -9223372036854775807L) {
        l2 = Long.MIN_VALUE;
      }
      ((e)localv).w(0L, l2);
    }
  }
  
  public long a(E paramE, long paramLong, boolean paramBoolean)
  {
    return b(paramE, paramLong, paramBoolean, new boolean[i.length]);
  }
  
  public long b(E paramE, long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    for (int i1 = 0;; i1++)
    {
      int i2 = a;
      int i3 = 1;
      if (i1 >= i2) {
        break;
      }
      boolean[] arrayOfBoolean = h;
      if ((paramBoolean) || (!paramE.b(n, i1))) {
        i3 = 0;
      }
      arrayOfBoolean[i1] = i3;
    }
    h(c);
    g();
    n = paramE;
    i();
    paramLong = a.i(c, h, c, paramArrayOfBoolean, paramLong);
    c(c);
    e = false;
    for (i1 = 0;; i1++)
    {
      paramArrayOfBoolean = c;
      if (i1 >= paramArrayOfBoolean.length) {
        break;
      }
      if (paramArrayOfBoolean[i1] != null)
      {
        a.f(paramE.c(i1));
        if (i[i1].l() != -2) {
          e = true;
        }
      }
      else
      {
        if (c[i1] == null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        a.f(paramBoolean);
      }
    }
    return paramLong;
  }
  
  public final void c(Q[] paramArrayOfQ)
  {
    for (int i1 = 0;; i1++)
    {
      a1[] arrayOfa1 = i;
      if (i1 >= arrayOfa1.length) {
        break;
      }
      if ((arrayOfa1[i1].l() == -2) && (n.c(i1))) {
        paramArrayOfQ[i1] = new x0.o();
      }
    }
  }
  
  public boolean d(C0 paramC0)
  {
    if (E0.d(f.e, e))
    {
      C0 localC0 = f;
      if ((b == b) && (a.equals(a))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void e(long paramLong1, float paramFloat, long paramLong2)
  {
    a.f(t());
    paramLong1 = A(paramLong1);
    a.g(new y0.b().f(paramLong1).g(paramFloat).e(paramLong2).d());
  }
  
  public final void g()
  {
    if (!t()) {
      return;
    }
    for (int i1 = 0;; i1++)
    {
      Object localObject = n;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((E)localObject).c(i1);
      localObject = n.c[i1];
      if ((bool) && (localObject != null)) {
        ((y)localObject).g();
      }
    }
  }
  
  public final void h(Q[] paramArrayOfQ)
  {
    for (int i1 = 0;; i1++)
    {
      a1[] arrayOfa1 = i;
      if (i1 >= arrayOfa1.length) {
        break;
      }
      if (arrayOfa1[i1].l() == -2) {
        paramArrayOfQ[i1] = null;
      }
    }
  }
  
  public final void i()
  {
    if (!t()) {
      return;
    }
    for (int i1 = 0;; i1++)
    {
      Object localObject = n;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((E)localObject).c(i1);
      localObject = n.c[i1];
      if ((bool) && (localObject != null)) {
        ((y)localObject).j();
      }
    }
  }
  
  public long j()
  {
    if (!d) {
      return f.b;
    }
    long l1;
    if (e) {
      l1 = a.f();
    } else {
      l1 = Long.MIN_VALUE;
    }
    long l2 = l1;
    if (l1 == Long.MIN_VALUE) {
      l2 = f.e;
    }
    return l2;
  }
  
  public B0 k()
  {
    return l;
  }
  
  public long l()
  {
    long l1;
    if (!d) {
      l1 = 0L;
    } else {
      l1 = a.c();
    }
    return l1;
  }
  
  public long m()
  {
    return o;
  }
  
  public long n()
  {
    return f.b + o;
  }
  
  public Z o()
  {
    return m;
  }
  
  public E p()
  {
    return n;
  }
  
  public void q(float paramFloat, I paramI)
  {
    d = true;
    m = a.n();
    paramI = x(paramFloat, paramI);
    C0 localC0 = f;
    long l1 = b;
    long l2 = e;
    long l3 = l1;
    if (l2 != -9223372036854775807L)
    {
      l3 = l1;
      if (l1 >= l2) {
        l3 = Math.max(0L, l2 - 1L);
      }
    }
    l1 = a(paramI, l3, false);
    l3 = o;
    paramI = f;
    o = (l3 + (b - l1));
    f = paramI.b(l1);
  }
  
  public boolean r()
  {
    try
    {
      if (!d) {
        a.p();
      } else {
        for (Q localQ : c) {
          if (localQ != null) {
            localQ.a();
          }
        }
      }
      return false;
    }
    catch (IOException localIOException) {}
    return true;
  }
  
  public boolean s()
  {
    boolean bool;
    if ((d) && ((!e) || (a.f() == Long.MIN_VALUE))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean t()
  {
    boolean bool;
    if (l == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void u(long paramLong)
  {
    a.f(t());
    if (d) {
      a.h(A(paramLong));
    }
  }
  
  public void v()
  {
    g();
    w(k, a);
  }
  
  public E x(float paramFloat, I paramI)
  {
    paramI = j.k(i, o(), f.a, paramI);
    int i1 = 0;
    label120:
    for (int i2 = 0; i2 < a; i2++)
    {
      boolean bool1 = paramI.c(i2);
      boolean bool2 = true;
      if (bool1)
      {
        bool1 = bool2;
        if (c[i2] == null) {
          if (i[i2].l() == -2) {
            bool1 = bool2;
          }
        }
      }
      for (bool1 = false;; bool1 = bool2)
      {
        a.f(bool1);
        break label120;
        if (c[i2] != null) {
          break;
        }
      }
    }
    y[] arrayOfy = c;
    int i3 = arrayOfy.length;
    for (i2 = i1; i2 < i3; i2++)
    {
      y localy = arrayOfy[i2];
      if (localy != null) {
        localy.r(paramFloat);
      }
    }
    return paramI;
  }
  
  public void y(B0 paramB0)
  {
    if (paramB0 == l) {
      return;
    }
    g();
    l = paramB0;
    i();
  }
  
  public void z(long paramLong)
  {
    o = paramLong;
  }
  
  public static abstract interface a
  {
    public abstract B0 a(C0 paramC0, long paramLong);
  }
}

/* Location:
 * Qualified Name:     k0.B0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */