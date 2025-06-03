package z4;

import a4.g;
import a4.g.a;
import a4.g.a.a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t5.l0;
import v3.r1;
import w3.a0;
import x6.b;

public abstract class a
  implements t
{
  public final ArrayList<t.c> a = new ArrayList(1);
  public final HashSet<t.c> b = new HashSet(1);
  public final w.a c = new w.a();
  public final g.a d = new g.a();
  public Looper e;
  public r1 f;
  public a0 o;
  
  public final void a(t.c paramc)
  {
    a.remove(paramc);
    if (a.isEmpty())
    {
      e = null;
      f = null;
      o = null;
      b.clear();
      w();
    }
    else
    {
      l(paramc);
    }
  }
  
  public final void b(t.c paramc)
  {
    e.getClass();
    boolean bool = b.isEmpty();
    b.add(paramc);
    if (bool) {
      s();
    }
  }
  
  public final void c(g paramg)
  {
    g.a locala = d;
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      g.a.a locala1 = (g.a.a)localIterator.next();
      if (b == paramg) {
        c.remove(locala1);
      }
    }
  }
  
  public final void d(Handler paramHandler, g paramg)
  {
    g.a locala = d;
    locala.getClass();
    c.add(new g.a.a(paramHandler, paramg));
  }
  
  public final void e(t.c paramc, l0 paraml0, a0 parama0)
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = e;
    boolean bool;
    if ((localLooper2 != null) && (localLooper2 != localLooper1)) {
      bool = false;
    } else {
      bool = true;
    }
    b.q(bool);
    o = parama0;
    parama0 = f;
    a.add(paramc);
    if (e == null)
    {
      e = localLooper1;
      b.add(paramc);
      t(paraml0);
    }
    else if (parama0 != null)
    {
      b(paramc);
      paramc.a(this, parama0);
    }
  }
  
  public final void l(t.c paramc)
  {
    boolean bool = b.isEmpty();
    b.remove(paramc);
    if (((bool ^ true)) && (b.isEmpty())) {
      r();
    }
  }
  
  public final void m(w paramw)
  {
    w.a locala = c;
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      w.a.a locala1 = (w.a.a)localIterator.next();
      if (b == paramw) {
        c.remove(locala1);
      }
    }
  }
  
  public final void n(Handler paramHandler, w paramw)
  {
    w.a locala = c;
    locala.getClass();
    c.add(new w.a.a(paramHandler, paramw));
  }
  
  public final w.a q(t.b paramb)
  {
    return new w.a(c.c, 0, paramb, 0L);
  }
  
  public void r() {}
  
  public void s() {}
  
  public abstract void t(l0 paraml0);
  
  public final void v(r1 paramr1)
  {
    f = paramr1;
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((t.c)localIterator.next()).a(this, paramr1);
    }
  }
  
  public abstract void w();
}

/* Location:
 * Qualified Name:     z4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */