package Q3;

import V3.D;
import V3.H;
import V3.k;
import a4.i;
import d4.b;
import d4.f;
import d4.g;
import d4.q;
import d4.r;
import d4.t;
import d4.u;

public class p
{
  public final V3.m a;
  public final k b;
  public final a4.h c;
  public final boolean d;
  
  public p(V3.m paramm, k paramk)
  {
    a = paramm;
    b = paramk;
    c = a4.h.i;
    d = false;
  }
  
  public p(V3.m paramm, k paramk, a4.h paramh, boolean paramBoolean)
  {
    a = paramm;
    b = paramk;
    c = paramh;
    d = paramBoolean;
    Y3.m.g(paramh.q(), "Validation of queries failed.");
  }
  
  public p A()
  {
    U();
    a4.h localh = c.w(q.j());
    V(localh);
    return new p(a, b, localh, true);
  }
  
  public p B()
  {
    U();
    return new p(a, b, c.w(u.j()), true);
  }
  
  public void C(a parama)
  {
    if (parama != null)
    {
      E(new V3.a(a, parama, u()));
      return;
    }
    throw new NullPointerException("listener must not be null");
  }
  
  public void D(s params)
  {
    if (params != null)
    {
      E(new D(a, params, u()));
      return;
    }
    throw new NullPointerException("listener must not be null");
  }
  
  public final void E(final V3.h paramh)
  {
    H.b().e(paramh);
    a.i0(new a(paramh));
  }
  
  public p F(double paramDouble)
  {
    return N(paramDouble, b.m().e());
  }
  
  public p G(double paramDouble, String paramString)
  {
    return H(new f(Double.valueOf(paramDouble), r.a()), paramString);
  }
  
  public final p H(d4.n paramn, String paramString)
  {
    return O(paramn, Y3.j.b(paramString));
  }
  
  public p I(String paramString)
  {
    if ((paramString != null) && (c.d().equals(d4.j.j()))) {
      return P(Y3.j.b(paramString));
    }
    return Q(paramString, b.m().e());
  }
  
  public p J(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramString1 != null)
    {
      str = paramString1;
      if (c.d().equals(d4.j.j())) {
        str = Y3.j.b(paramString1);
      }
    }
    if (str != null) {
      paramString1 = new t(str, r.a());
    } else {
      paramString1 = g.W();
    }
    return H(paramString1, paramString2);
  }
  
  public p K(boolean paramBoolean)
  {
    return S(paramBoolean, b.m().e());
  }
  
  public p L(boolean paramBoolean, String paramString)
  {
    return H(new d4.a(Boolean.valueOf(paramBoolean), r.a()), paramString);
  }
  
  public p M(double paramDouble)
  {
    return N(paramDouble, null);
  }
  
  public p N(double paramDouble, String paramString)
  {
    return O(new f(Double.valueOf(paramDouble), r.a()), paramString);
  }
  
  public final p O(d4.n paramn, String paramString)
  {
    Y3.n.g(paramString);
    if ((!paramn.B()) && (!paramn.isEmpty())) {
      throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
    }
    if (!c.o())
    {
      if (paramString != null)
      {
        if (paramString.equals("[MIN_NAME]")) {
          paramString = b.n();
        } else if (paramString.equals("[MAX_KEY]")) {
          paramString = b.m();
        } else {
          paramString = b.j(paramString);
        }
      }
      else {
        paramString = null;
      }
      paramn = c.x(paramn, paramString);
      T(paramn);
      V(paramn);
      Y3.m.f(paramn.q());
      return new p(a, b, paramn, d);
    }
    throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
  }
  
  public p P(String paramString)
  {
    return Q(paramString, null);
  }
  
  public p Q(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      paramString1 = new t(paramString1, r.a());
    } else {
      paramString1 = g.W();
    }
    return O(paramString1, paramString2);
  }
  
  public p R(boolean paramBoolean)
  {
    return S(paramBoolean, null);
  }
  
  public p S(boolean paramBoolean, String paramString)
  {
    return O(new d4.a(Boolean.valueOf(paramBoolean), r.a()), paramString);
  }
  
  public final void T(a4.h paramh)
  {
    if ((paramh.o()) && (paramh.m()) && (paramh.n()) && (!paramh.l())) {
      throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
    }
  }
  
  public final void U()
  {
    if (!d) {
      return;
    }
    throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
  }
  
  public final void V(a4.h paramh)
  {
    if (paramh.d().equals(d4.j.j()))
    {
      d4.n localn;
      if (paramh.o())
      {
        localn = paramh.h();
        if ((!A2.m.a(paramh.g(), b.n())) || (!(localn instanceof t))) {
          throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
        }
      }
      if (paramh.m())
      {
        localn = paramh.f();
        if ((!paramh.e().equals(b.m())) || (!(localn instanceof t))) {
          throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
        }
      }
    }
    else if ((paramh.d().equals(q.j())) && (((paramh.o()) && (!r.b(paramh.h()))) || ((paramh.m()) && (!r.b(paramh.f())))))
    {
      throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
    }
  }
  
  public a a(a parama)
  {
    b(new V3.a(a, parama, u()));
    return parama;
  }
  
  public final void b(final V3.h paramh)
  {
    H.b().c(paramh);
    a.i0(new b(paramh));
  }
  
  public s c(s params)
  {
    b(new D(a, params, u()));
    return params;
  }
  
  public p d(double paramDouble)
  {
    return e(paramDouble, null);
  }
  
  public p e(double paramDouble, String paramString)
  {
    return f(new f(Double.valueOf(paramDouble), r.a()), paramString);
  }
  
  public final p f(d4.n paramn, String paramString)
  {
    Y3.n.g(paramString);
    if ((!paramn.B()) && (!paramn.isEmpty())) {
      throw new IllegalArgumentException("Can only use simple values for endAt()");
    }
    if (paramString != null) {
      paramString = b.j(paramString);
    } else {
      paramString = null;
    }
    if (!c.m())
    {
      paramn = c.b(paramn, paramString);
      T(paramn);
      V(paramn);
      Y3.m.f(paramn.q());
      return new p(a, b, paramn, d);
    }
    throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
  }
  
  public p g(String paramString)
  {
    return h(paramString, null);
  }
  
  public p h(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      paramString1 = new t(paramString1, r.a());
    } else {
      paramString1 = g.W();
    }
    return f(paramString1, paramString2);
  }
  
  public p i(boolean paramBoolean)
  {
    return j(paramBoolean, null);
  }
  
  public p j(boolean paramBoolean, String paramString)
  {
    return f(new d4.a(Boolean.valueOf(paramBoolean), r.a()), paramString);
  }
  
  public p k(double paramDouble)
  {
    return e(paramDouble, b.n().e());
  }
  
  public p l(double paramDouble, String paramString)
  {
    return m(new f(Double.valueOf(paramDouble), r.a()), paramString);
  }
  
  public final p m(d4.n paramn, String paramString)
  {
    return f(paramn, Y3.j.a(paramString));
  }
  
  public p n(String paramString)
  {
    if ((paramString != null) && (c.d().equals(d4.j.j()))) {
      return g(Y3.j.a(paramString));
    }
    return h(paramString, b.n().e());
  }
  
  public p o(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramString1 != null)
    {
      str = paramString1;
      if (c.d().equals(d4.j.j())) {
        str = Y3.j.a(paramString1);
      }
    }
    if (str != null) {
      paramString1 = new t(str, r.a());
    } else {
      paramString1 = g.W();
    }
    return m(paramString1, paramString2);
  }
  
  public p p(boolean paramBoolean)
  {
    return j(paramBoolean, b.n().e());
  }
  
  public p q(boolean paramBoolean, String paramString)
  {
    return m(new d4.a(Boolean.valueOf(paramBoolean), r.a()), paramString);
  }
  
  public V2.j r()
  {
    return a.O(this);
  }
  
  public k s()
  {
    return b;
  }
  
  public e t()
  {
    return new e(a, s());
  }
  
  public i u()
  {
    return new i(b, c);
  }
  
  public void v(final boolean paramBoolean)
  {
    if ((!b.isEmpty()) && (b.Z().equals(b.l()))) {
      throw new d("Can't call keepSynced() on .info paths.");
    }
    a.i0(new c(paramBoolean));
  }
  
  public p w(int paramInt)
  {
    if (paramInt > 0)
    {
      if (!c.n()) {
        return new p(a, b, c.s(paramInt), d);
      }
      throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }
    throw new IllegalArgumentException("Limit must be a positive integer!");
  }
  
  public p x(int paramInt)
  {
    if (paramInt > 0)
    {
      if (!c.n()) {
        return new p(a, b, c.t(paramInt), d);
      }
      throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }
    throw new IllegalArgumentException("Limit must be a positive integer!");
  }
  
  public p y(String paramString)
  {
    if (paramString != null)
    {
      if ((!paramString.equals("$key")) && (!paramString.equals(".key")))
      {
        if ((!paramString.equals("$priority")) && (!paramString.equals(".priority")))
        {
          if ((!paramString.equals("$value")) && (!paramString.equals(".value")))
          {
            Y3.n.h(paramString);
            U();
            paramString = new k(paramString);
            if (paramString.size() != 0)
            {
              paramString = new d4.p(paramString);
              return new p(a, b, c.w(paramString), true);
            }
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
          }
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Can't use '");
          localStringBuilder.append(paramString);
          localStringBuilder.append("' as path, please use orderByValue() instead!");
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Can't use '");
        localStringBuilder.append(paramString);
        localStringBuilder.append("' as path, please use orderByPriority() instead!");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Can't use '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("' as path, please use orderByKey() instead!");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    throw new NullPointerException("Key can't be null");
  }
  
  public p z()
  {
    U();
    a4.h localh = c.w(d4.j.j());
    V(localh);
    return new p(a, b, localh, true);
  }
  
  public class a
    implements Runnable
  {
    public a(V3.h paramh) {}
    
    public void run()
    {
      a.b0(paramh);
    }
  }
  
  public class b
    implements Runnable
  {
    public b(V3.h paramh) {}
    
    public void run()
    {
      a.D(paramh);
    }
  }
  
  public class c
    implements Runnable
  {
    public c(boolean paramBoolean) {}
    
    public void run()
    {
      p localp = p.this;
      a.Q(localp.u(), paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     Q3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */