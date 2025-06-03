package k0;

import d0.C;
import g0.a;
import g0.c;

public final class s
  implements A0
{
  public final e1 o;
  public final a p;
  public Y0 q;
  public A0 r;
  public boolean s;
  public boolean t;
  
  public s(a parama, c paramc)
  {
    p = parama;
    o = new e1(paramc);
    s = true;
  }
  
  public long H()
  {
    long l;
    if (s) {
      l = o.H();
    } else {
      l = ((A0)a.e(r)).H();
    }
    return l;
  }
  
  public void a(Y0 paramY0)
  {
    if (paramY0 == q)
    {
      r = null;
      q = null;
      s = true;
    }
  }
  
  public void b(Y0 paramY0)
  {
    A0 localA01 = paramY0.B();
    if (localA01 != null)
    {
      A0 localA02 = r;
      if (localA01 != localA02) {
        if (localA02 == null)
        {
          r = localA01;
          q = paramY0;
          localA01.k(o.h());
        }
        else
        {
          throw u.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
      }
    }
  }
  
  public void c(long paramLong)
  {
    o.a(paramLong);
  }
  
  public final boolean d(boolean paramBoolean)
  {
    Y0 localY0 = q;
    if ((localY0 != null) && (!localY0.c()) && ((!paramBoolean) || (q.getState() == 2)) && ((q.e()) || ((!paramBoolean) && (!q.p())))) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public void e()
  {
    t = true;
    o.b();
  }
  
  public void f()
  {
    t = false;
    o.c();
  }
  
  public long g(boolean paramBoolean)
  {
    i(paramBoolean);
    return H();
  }
  
  public C h()
  {
    Object localObject = r;
    if (localObject != null) {
      localObject = ((A0)localObject).h();
    } else {
      localObject = o.h();
    }
    return (C)localObject;
  }
  
  public final void i(boolean paramBoolean)
  {
    if (d(paramBoolean))
    {
      s = true;
      if (t) {
        o.b();
      }
      return;
    }
    Object localObject = (A0)a.e(r);
    long l = ((A0)localObject).H();
    if (s)
    {
      if (l < o.H())
      {
        o.c();
        return;
      }
      s = false;
      if (t) {
        o.b();
      }
    }
    o.a(l);
    localObject = ((A0)localObject).h();
    if (!((C)localObject).equals(o.h()))
    {
      o.k((C)localObject);
      p.j((C)localObject);
    }
  }
  
  public void k(C paramC)
  {
    A0 localA0 = r;
    C localC = paramC;
    if (localA0 != null)
    {
      localA0.k(paramC);
      localC = r.h();
    }
    o.k(localC);
  }
  
  public boolean r()
  {
    boolean bool;
    if (s) {
      bool = o.r();
    } else {
      bool = ((A0)a.e(r)).r();
    }
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void j(C paramC);
  }
}

/* Location:
 * Qualified Name:     k0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */