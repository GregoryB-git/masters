package z4;

import l3.l;
import r5.h;
import v3.i0;
import v3.i0.a;
import v3.n1;
import v5.e0;
import v5.p;
import x6.b;
import z3.g;

public final class c
  implements r, r.a
{
  public final r a;
  public r.a b;
  public a[] c;
  public long d;
  public long e;
  public long f;
  public d.b o;
  
  public c(r paramr, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    a = paramr;
    c = new a[0];
    long l;
    if (paramBoolean) {
      l = paramLong1;
    } else {
      l = -9223372036854775807L;
    }
    d = l;
    e = paramLong1;
    f = paramLong2;
  }
  
  public final void a(d0 paramd0)
  {
    paramd0 = (r)paramd0;
    paramd0 = b;
    paramd0.getClass();
    paramd0.a(this);
  }
  
  public final void b(r paramr)
  {
    if (o != null) {
      return;
    }
    paramr = b;
    paramr.getClass();
    paramr.b(this);
  }
  
  public final long c()
  {
    long l1 = a.c();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = f;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final boolean d(long paramLong)
  {
    return a.d(paramLong);
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    long l1 = e;
    if (paramLong == l1) {
      return l1;
    }
    long l2 = e0.j(a, 0L, paramLong - l1);
    long l3 = b;
    l1 = f;
    if (l1 == Long.MIN_VALUE) {
      l1 = Long.MAX_VALUE;
    } else {
      l1 -= paramLong;
    }
    l1 = e0.j(l3, 0L, l1);
    if ((l2 != a) || (l1 != b)) {
      paramn1 = new n1(l2, l1);
    }
    return a.e(paramLong, paramn1);
  }
  
  public final boolean f()
  {
    boolean bool;
    if (d != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long g()
  {
    long l1 = a.g();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = f;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final void h(long paramLong)
  {
    a.h(paramLong);
  }
  
  public final long i(h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    c = new a[paramArrayOfc0.length];
    c0[] arrayOfc0 = new c0[paramArrayOfc0.length];
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = paramArrayOfc0.length;
      c0 localc0 = null;
      if (j >= k) {
        break;
      }
      a[] arrayOfa = c;
      a locala = (a)paramArrayOfc0[j];
      arrayOfa[j] = locala;
      if (locala != null) {
        localc0 = a;
      }
      arrayOfc0[j] = localc0;
    }
    long l1 = a.i(paramArrayOfh, paramArrayOfBoolean1, arrayOfc0, paramArrayOfBoolean2, paramLong);
    boolean bool1 = f();
    boolean bool2 = true;
    if (bool1)
    {
      l2 = e;
      if (paramLong == l2)
      {
        if (l2 != 0L)
        {
          k = paramArrayOfh.length;
          for (j = 0; j < k; j++)
          {
            paramArrayOfBoolean1 = paramArrayOfh[j];
            if (paramArrayOfBoolean1 != null)
            {
              paramArrayOfBoolean1 = paramArrayOfBoolean1.p();
              if (!p.a(t, q))
              {
                j = 1;
                break label196;
              }
            }
          }
        }
        j = 0;
        label196:
        if (j != 0)
        {
          l2 = l1;
          break label213;
        }
      }
    }
    long l2 = -9223372036854775807L;
    label213:
    d = l2;
    bool1 = bool2;
    if (l1 != paramLong)
    {
      if (l1 >= e)
      {
        paramLong = f;
        bool1 = bool2;
        if (paramLong == Long.MIN_VALUE) {
          break label278;
        }
        if (l1 <= paramLong)
        {
          bool1 = bool2;
          break label278;
        }
      }
      bool1 = false;
    }
    label278:
    b.H(bool1);
    for (j = i; j < paramArrayOfc0.length; j++)
    {
      paramArrayOfBoolean1 = arrayOfc0[j];
      if (paramArrayOfBoolean1 == null)
      {
        c[j] = null;
      }
      else
      {
        paramArrayOfh = c;
        paramArrayOfBoolean2 = paramArrayOfh[j];
        if ((paramArrayOfBoolean2 == null) || (a != paramArrayOfBoolean1)) {
          paramArrayOfh[j] = new a(paramArrayOfBoolean1);
        }
      }
      paramArrayOfc0[j] = c[j];
    }
    return l1;
  }
  
  public final boolean isLoading()
  {
    return a.isLoading();
  }
  
  public final void j()
  {
    d.b localb = o;
    if (localb == null)
    {
      a.j();
      return;
    }
    throw localb;
  }
  
  public final long l(long paramLong)
  {
    d = -9223372036854775807L;
    a[] arrayOfa = c;
    int i = arrayOfa.length;
    boolean bool1 = false;
    for (int j = 0; j < i; j++)
    {
      a locala = arrayOfa[j];
      if (locala != null) {
        b = false;
      }
    }
    long l = a.l(paramLong);
    if (l != paramLong)
    {
      bool2 = bool1;
      if (l < e) {
        break label112;
      }
      paramLong = f;
      if (paramLong != Long.MIN_VALUE)
      {
        bool2 = bool1;
        if (l > paramLong) {
          break label112;
        }
      }
    }
    boolean bool2 = true;
    label112:
    b.H(bool2);
    return l;
  }
  
  public final void n(r.a parama, long paramLong)
  {
    b = parama;
    a.n(this, paramLong);
  }
  
  public final long o()
  {
    if (f())
    {
      l1 = d;
      d = -9223372036854775807L;
      l2 = o();
      if (l2 != -9223372036854775807L) {
        l1 = l2;
      }
      return l1;
    }
    long l1 = a.o();
    if (l1 == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l2 = e;
    boolean bool1 = true;
    if (l1 >= l2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.H(bool2);
    l2 = f;
    boolean bool2 = bool1;
    if (l2 != Long.MIN_VALUE) {
      if (l1 <= l2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    b.H(bool2);
    return l1;
  }
  
  public final j0 q()
  {
    return a.q();
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    a.s(paramLong, paramBoolean);
  }
  
  public final class a
    implements c0
  {
    public final c0 a;
    public boolean b;
    
    public a(c0 paramc0)
    {
      a = paramc0;
    }
    
    public final void a()
    {
      a.a();
    }
    
    public final boolean b()
    {
      boolean bool;
      if ((!f()) && (a.b())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int m(long paramLong)
    {
      if (f()) {
        return -3;
      }
      return a.m(paramLong);
    }
    
    public final int r(l paraml, g paramg, int paramInt)
    {
      if (f()) {
        return -3;
      }
      if (b)
      {
        a = 4;
        return -4;
      }
      paramInt = a.r(paraml, paramg, paramInt);
      if (paramInt == -5)
      {
        paramg = (i0)b;
        paramg.getClass();
        paramInt = J;
        if ((paramInt != 0) || (K != 0))
        {
          c localc = c.this;
          l = e;
          int i = 0;
          if (l != 0L) {
            paramInt = 0;
          }
          if (f == Long.MIN_VALUE) {
            i = K;
          }
          paramg = paramg.a();
          A = paramInt;
          B = i;
          b = paramg.a();
        }
        return -5;
      }
      paraml = c.this;
      long l = f;
      if ((l != Long.MIN_VALUE) && (((paramInt == -4) && (e >= l)) || ((paramInt == -3) && (paraml.g() == Long.MIN_VALUE) && (!d))))
      {
        paramg.o();
        a = 4;
        b = true;
        return -4;
      }
      return paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     z4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */