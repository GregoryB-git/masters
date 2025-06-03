package gb;

import d2.q;
import eb.c;
import eb.e1;
import eb.h;
import eb.h1;
import eb.k0.f;
import eb.k0.g;
import eb.k0.j;
import eb.p;
import eb.s0;
import eb.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m.e;

public final class f0
  implements h2
{
  public final eb.f0 a = eb.f0.a(f0.class, null);
  public final Object b = new Object();
  public final Executor c;
  public final h1 d;
  public a e;
  public b f;
  public Runnable g;
  public h2.a h;
  public Collection<e> i = new LinkedHashSet();
  public e1 j;
  public k0.j k;
  public long l;
  
  public f0(Executor paramExecutor, h1 paramh1)
  {
    c = paramExecutor;
    d = paramh1;
  }
  
  public final e a(s2 arg1, h[] paramArrayOfh)
  {
    e locale = new e(???, paramArrayOfh);
    i.add(locale);
    synchronized (b)
    {
      int m = i.size();
      if (m == 1) {
        d.b(e);
      }
      int n = paramArrayOfh.length;
      for (m = 0; m < n; m++) {
        paramArrayOfh[m].v();
      }
      return locale;
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      boolean bool;
      if (!i.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public final void c(e1 parame1)
  {
    synchronized (b)
    {
      if (j != null) {
        return;
      }
      j = parame1;
      h1 localh1 = d;
      d locald = new gb/f0$d;
      locald.<init>(this, parame1);
      localh1.b(locald);
      if (!b())
      {
        parame1 = g;
        if (parame1 != null)
        {
          d.b(parame1);
          g = null;
        }
      }
      d.a();
      return;
    }
  }
  
  public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
  {
    try
    {
      s2 locals2 = new gb/s2;
      locals2.<init>(paramt0, params0, paramc);
      paramt0 = null;
      long l1 = -1L;
      for (;;)
      {
        synchronized (b)
        {
          params0 = j;
          if (params0 != null)
          {
            paramt0 = new gb/l0;
            paramt0.<init>(params0, t.a.a, paramArrayOfh);
          }
        }
        params0 = k;
        if (params0 == null) {}
        for (;;)
        {
          paramt0 = a(locals2, paramArrayOfh);
          break;
          if ((paramt0 == null) || (l1 != l)) {
            break label103;
          }
        }
        break label160;
        label103:
        l1 = l;
        paramt0 = v0.e(params0.a(locals2), Boolean.TRUE.equals(h));
        if (paramt0 != null)
        {
          paramt0 = paramt0.d(c, b, a, paramArrayOfh);
          label160:
          return paramt0;
        }
        paramt0 = params0;
      }
      throw paramt0;
    }
    finally
    {
      d.a();
    }
  }
  
  public final eb.f0 f()
  {
    return a;
  }
  
  public final Runnable g(h2.a parama)
  {
    h = parama;
    parama = (r1.g)parama;
    e = new a(parama);
    f = new b(parama);
    g = new c(parama);
    return null;
  }
  
  public final void h(e1 parame1)
  {
    c(parame1);
    synchronized (b)
    {
      Object localObject2 = i;
      Runnable localRunnable = g;
      g = null;
      if (!((Collection)localObject2).isEmpty()) {
        i = Collections.emptyList();
      }
      if (localRunnable != null)
      {
        ??? = ((Collection)localObject2).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (e)((Iterator)???).next();
          localObject2 = ((g0)localObject2).t(new l0(parame1, t.a.b, l));
          if (localObject2 != null) {
            ((h0)localObject2).run();
          }
        }
        d.execute(localRunnable);
      }
      return;
    }
  }
  
  public final void i(k0.j arg1)
  {
    synchronized (b)
    {
      k = ???;
      l += 1L;
      if ((??? != null) && (b()))
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(i);
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        while (localIterator.hasNext())
        {
          e locale = (e)localIterator.next();
          localObject2 = ???.a(j);
          ??? = j).a;
          Object localObject4 = v0.e((k0.f)localObject2, Boolean.TRUE.equals(h));
          if (localObject4 != null)
          {
            localObject2 = c;
            ??? = b;
            if (??? != null) {
              localObject2 = ???;
            }
            ??? = k.a();
            try
            {
              k0.g localg = j;
              localObject4 = ((u)localObject4).d(c, b, a, l);
              k.c((p)???);
              ??? = locale.t((s)localObject4);
              if (??? != null) {
                ((Executor)localObject2).execute((Runnable)???);
              }
              localArrayList.add(locale);
            }
            finally
            {
              k.c((p)???);
            }
          }
        }
        synchronized (b)
        {
          if (!b()) {
            return;
          }
          i.removeAll(localArrayList);
          if (i.isEmpty())
          {
            localObject2 = new java/util/LinkedHashSet;
            ((LinkedHashSet)localObject2).<init>();
            i = ((Collection)localObject2);
          }
          if (!b())
          {
            d.b(f);
            if (j != null)
            {
              localObject2 = g;
              if (localObject2 != null)
              {
                d.b((Runnable)localObject2);
                g = null;
              }
            }
          }
          d.a();
          return;
        }
      }
      return;
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      e(true);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      e(false);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      d();
    }
  }
  
  public final class d
    implements Runnable
  {
    public d(e1 parame1) {}
    
    public final void run()
    {
      h.a(a);
    }
  }
  
  public final class e
    extends g0
  {
    public final k0.g j;
    public final p k = p.b();
    public final h[] l;
    
    public e(s2 params2, h[] paramArrayOfh)
    {
      j = params2;
      l = paramArrayOfh;
    }
    
    public final void i(q paramq)
    {
      c localc = j).a;
      if (Boolean.TRUE.equals(h)) {
        paramq.e("wait_for_ready");
      }
      super.i(paramq);
    }
    
    public final void n(e1 arg1)
    {
      super.n(???);
      synchronized (b)
      {
        f0 localf0 = f0.this;
        if (g != null)
        {
          boolean bool = i.remove(this);
          if ((!b()) && (bool))
          {
            localf0 = f0.this;
            d.b(f);
            localf0 = f0.this;
            if (j != null)
            {
              d.b(g);
              g = null;
            }
          }
        }
        d.a();
        return;
      }
    }
    
    public final void s(e1 parame1)
    {
      h[] arrayOfh = l;
      int i = arrayOfh.length;
      for (int n = 0; n < i; n++) {
        arrayOfh[n].o(parame1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */