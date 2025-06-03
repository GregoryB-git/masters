package x0;

import A0.y;
import d0.q;
import d0.q.b;
import d0.z;
import g0.M;
import j0.i;
import k0.d1;
import k0.v0;
import k0.y0;

public final class e
  implements v, v.a
{
  public final v o;
  public v.a p;
  public a[] q;
  public long r;
  public long s;
  public long t;
  public f.b u;
  
  public e(v paramv, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    o = paramv;
    q = new a[0];
    long l;
    if (paramBoolean) {
      l = paramLong1;
    } else {
      l = -9223372036854775807L;
    }
    r = l;
    s = paramLong1;
    t = paramLong2;
  }
  
  public static boolean v(long paramLong, y[] paramArrayOfy)
  {
    if (paramLong != 0L)
    {
      int i = paramArrayOfy.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramArrayOfy[j];
        if (localObject != null)
        {
          localObject = ((y)localObject).m();
          if (!z.a(n, j)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public final d1 a(long paramLong, d1 paramd1)
  {
    long l1 = M.q(a, 0L, paramLong - s);
    long l2 = b;
    long l3 = t;
    if (l3 == Long.MIN_VALUE) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = l3 - paramLong;
    }
    paramLong = M.q(l2, 0L, paramLong);
    if ((l1 == a) && (paramLong == b)) {
      return paramd1;
    }
    return new d1(l1, paramLong);
  }
  
  public boolean b()
  {
    return o.b();
  }
  
  public long c()
  {
    long l1 = o.c();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = t;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    long l = s;
    if (paramLong == l) {
      return l;
    }
    paramd1 = a(paramLong, paramd1);
    return o.d(paramLong, paramd1);
  }
  
  public long f()
  {
    long l1 = o.f();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = t;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public boolean g(y0 paramy0)
  {
    return o.g(paramy0);
  }
  
  public void h(long paramLong)
  {
    o.h(paramLong);
  }
  
  public long i(y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    q = new a[paramArrayOfQ.length];
    Q[] arrayOfQ = new Q[paramArrayOfQ.length];
    int i = 0;
    for (int j = 0;; j++)
    {
      int k = paramArrayOfQ.length;
      Q localQ = null;
      if (j >= k) {
        break;
      }
      a[] arrayOfa = q;
      a locala = (a)paramArrayOfQ[j];
      arrayOfa[j] = locala;
      if (locala != null) {
        localQ = o;
      }
      arrayOfQ[j] = localQ;
    }
    long l1 = o.i(paramArrayOfy, paramArrayOfBoolean1, arrayOfQ, paramArrayOfBoolean2, paramLong);
    if (j())
    {
      l2 = s;
      if ((paramLong == l2) && (v(l2, paramArrayOfy)))
      {
        l2 = l1;
        break label144;
      }
    }
    long l2 = -9223372036854775807L;
    label144:
    r = l2;
    if (l1 != paramLong) {
      if (l1 >= s)
      {
        paramLong = t;
        if ((paramLong == Long.MIN_VALUE) || (l1 <= paramLong)) {}
      }
      else
      {
        bool = false;
        break label203;
      }
    }
    boolean bool = true;
    label203:
    g0.a.f(bool);
    for (j = i; j < paramArrayOfQ.length; j++)
    {
      paramArrayOfy = arrayOfQ[j];
      if (paramArrayOfy == null)
      {
        q[j] = null;
      }
      else
      {
        paramArrayOfBoolean2 = q;
        paramArrayOfBoolean1 = paramArrayOfBoolean2[j];
        if ((paramArrayOfBoolean1 == null) || (o != paramArrayOfy)) {
          paramArrayOfBoolean2[j] = new a(paramArrayOfy);
        }
      }
      paramArrayOfQ[j] = q[j];
    }
    return l1;
  }
  
  public boolean j()
  {
    boolean bool;
    if (r != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void k(v paramv)
  {
    if (u != null) {
      return;
    }
    ((v.a)g0.a.e(p)).k(this);
  }
  
  public long l()
  {
    if (j())
    {
      l1 = r;
      r = -9223372036854775807L;
      l2 = l();
      if (l2 != -9223372036854775807L) {
        l1 = l2;
      }
      return l1;
    }
    long l1 = o.l();
    if (l1 == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l2 = s;
    boolean bool1 = false;
    boolean bool2;
    if (l1 >= l2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.f(bool2);
    l2 = t;
    if (l2 != Long.MIN_VALUE)
    {
      bool2 = bool1;
      if (l1 > l2) {}
    }
    else
    {
      bool2 = true;
    }
    g0.a.f(bool2);
    return l1;
  }
  
  public Z n()
  {
    return o.n();
  }
  
  public void p()
  {
    f.b localb = u;
    if (localb == null)
    {
      o.p();
      return;
    }
    throw localb;
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    o.q(paramLong, paramBoolean);
  }
  
  public void r(v paramv)
  {
    ((v.a)g0.a.e(p)).e(this);
  }
  
  public long s(long paramLong)
  {
    r = -9223372036854775807L;
    a[] arrayOfa = q;
    int i = arrayOfa.length;
    boolean bool1 = false;
    for (int j = 0; j < i; j++)
    {
      a locala = arrayOfa[j];
      if (locala != null) {
        locala.b();
      }
    }
    long l = o.s(paramLong);
    if (l != paramLong)
    {
      bool2 = bool1;
      if (l < s) {
        break label111;
      }
      paramLong = t;
      if (paramLong != Long.MIN_VALUE)
      {
        bool2 = bool1;
        if (l > paramLong) {
          break label111;
        }
      }
    }
    boolean bool2 = true;
    label111:
    g0.a.f(bool2);
    return l;
  }
  
  public void t(f.b paramb)
  {
    u = paramb;
  }
  
  public void u(v.a parama, long paramLong)
  {
    p = parama;
    o.u(this, paramLong);
  }
  
  public void w(long paramLong1, long paramLong2)
  {
    s = paramLong1;
    t = paramLong2;
  }
  
  public final class a
    implements Q
  {
    public final Q o;
    public boolean p;
    
    public a(Q paramQ)
    {
      o = paramQ;
    }
    
    public void a()
    {
      o.a();
    }
    
    public void b()
    {
      p = false;
    }
    
    public boolean e()
    {
      boolean bool;
      if ((!j()) && (o.e())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int j(v0 paramv0, i parami, int paramInt)
    {
      if (j()) {
        return -3;
      }
      if (p)
      {
        parami.w(4);
        return -4;
      }
      long l1 = f();
      paramInt = o.j(paramv0, parami, paramInt);
      if (paramInt == -5)
      {
        parami = (q)g0.a.e(b);
        paramInt = E;
        if ((paramInt != 0) || (F != 0))
        {
          e locale = e.this;
          l1 = s;
          int i = 0;
          if (l1 != 0L) {
            paramInt = 0;
          }
          if (t == Long.MIN_VALUE) {
            i = F;
          }
          b = parami.a().V(paramInt).W(i).K();
        }
        return -5;
      }
      long l2 = t;
      if ((l2 != Long.MIN_VALUE) && (((paramInt == -4) && (t >= l2)) || ((paramInt == -3) && (l1 == Long.MIN_VALUE) && (!s))))
      {
        parami.m();
        parami.w(4);
        p = true;
        return -4;
      }
      return paramInt;
    }
    
    public int m(long paramLong)
    {
      if (j()) {
        return -3;
      }
      return o.m(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     x0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */