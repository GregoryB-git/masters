package x0;

import android.os.Handler;
import android.os.Looper;
import d0.I;
import i0.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.y1;
import p0.v;
import p0.v.a;

public abstract class a
  implements x
{
  public final ArrayList a = new ArrayList(1);
  public final HashSet b = new HashSet(1);
  public final E.a c = new E.a();
  public final v.a d = new v.a();
  public Looper e;
  public I f;
  public y1 g;
  
  public final void A(I paramI)
  {
    f = paramI;
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((x.c)localIterator.next()).a(this, paramI);
    }
  }
  
  public abstract void B();
  
  public final void c(E paramE)
  {
    c.B(paramE);
  }
  
  public final void d(x.c paramc)
  {
    boolean bool = b.isEmpty();
    b.remove(paramc);
    if (((bool ^ true)) && (b.isEmpty())) {
      v();
    }
  }
  
  public final void g(x.c paramc, y paramy, y1 paramy1)
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = e;
    boolean bool;
    if ((localLooper2 != null) && (localLooper2 != localLooper1)) {
      bool = false;
    } else {
      bool = true;
    }
    g0.a.a(bool);
    g = paramy1;
    paramy1 = f;
    a.add(paramc);
    if (e == null)
    {
      e = localLooper1;
      b.add(paramc);
      z(paramy);
    }
    else if (paramy1 != null)
    {
      n(paramc);
      paramc.a(this, paramy1);
    }
  }
  
  public final void k(Handler paramHandler, v paramv)
  {
    g0.a.e(paramHandler);
    g0.a.e(paramv);
    d.g(paramHandler, paramv);
  }
  
  public final void m(x.c paramc)
  {
    a.remove(paramc);
    if (a.isEmpty())
    {
      e = null;
      f = null;
      g = null;
      b.clear();
      B();
    }
    else
    {
      d(paramc);
    }
  }
  
  public final void n(x.c paramc)
  {
    g0.a.e(e);
    boolean bool = b.isEmpty();
    b.add(paramc);
    if (bool) {
      w();
    }
  }
  
  public final void o(v paramv)
  {
    d.t(paramv);
  }
  
  public final void p(Handler paramHandler, E paramE)
  {
    g0.a.e(paramHandler);
    g0.a.e(paramE);
    c.g(paramHandler, paramE);
  }
  
  public final v.a r(int paramInt, x.b paramb)
  {
    return d.u(paramInt, paramb);
  }
  
  public final v.a s(x.b paramb)
  {
    return d.u(0, paramb);
  }
  
  public final E.a t(int paramInt, x.b paramb)
  {
    return c.E(paramInt, paramb);
  }
  
  public final E.a u(x.b paramb)
  {
    return c.E(0, paramb);
  }
  
  public void v() {}
  
  public void w() {}
  
  public final y1 x()
  {
    return (y1)g0.a.h(g);
  }
  
  public final boolean y()
  {
    return b.isEmpty() ^ true;
  }
  
  public abstract void z(y paramy);
}

/* Location:
 * Qualified Name:     x0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */