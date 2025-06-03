package gb;

import eb.e1;
import eb.l;
import eb.s0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x6.b;

public class g0
  implements s
{
  public volatile boolean a;
  public t b;
  public s c;
  public e1 d;
  public List<Runnable> e = new ArrayList();
  public n f;
  public long g;
  public long h;
  public ArrayList i = new ArrayList();
  
  public final void a(final l paraml)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    b.y(paraml, "compressor");
    i.add(new c(paraml));
  }
  
  public final boolean b()
  {
    if (a) {
      return c.b();
    }
    return false;
  }
  
  public final void c(Runnable paramRunnable)
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called after start");
    try
    {
      if (!a)
      {
        e.add(paramRunnable);
        return;
      }
      paramRunnable.run();
      return;
    }
    finally {}
  }
  
  public final void d(final InputStream paramInputStream)
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called after start");
    b.y(paramInputStream, "message");
    if (a) {
      c.d(paramInputStream);
    } else {
      c(new j(paramInputStream));
    }
  }
  
  public final void e()
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    i.add(new b());
  }
  
  public final void f(final int paramInt)
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called after start");
    if (a) {
      c.f(paramInt);
    } else {
      c(new a(paramInt));
    }
  }
  
  public final void flush()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called after start");
    if (a) {
      c.flush();
    } else {
      c(new k());
    }
  }
  
  public final void g(final int paramInt)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    i.add(new f(paramInt));
  }
  
  public final void h(final int paramInt)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    i.add(new g(paramInt));
  }
  
  public void i(d2.q paramq)
  {
    try
    {
      if (b == null) {
        return;
      }
      if (c != null)
      {
        paramq.f(Long.valueOf(h - g), "buffered_nanos");
        c.i(paramq);
      }
      else
      {
        paramq.f(Long.valueOf(System.nanoTime() - g), "buffered_nanos");
        paramq.e("waiting_for_connection");
      }
      return;
    }
    finally {}
  }
  
  public final void j(final eb.q paramq)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    i.add(new h(paramq));
  }
  
  public final void k(final String paramString)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    b.y(paramString, "authority");
    i.add(new i(paramString));
  }
  
  public final void l(t paramt)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "already started");
    try
    {
      e1 locale1 = d;
      bool = a;
      Object localObject = paramt;
      if (!bool)
      {
        localObject = new gb/g0$n;
        ((n)localObject).<init>(paramt);
        f = ((n)localObject);
      }
      b = ((t)localObject);
      g = System.nanoTime();
      if (locale1 != null)
      {
        ((t)localObject).d(locale1, t.a.a, new s0());
        return;
      }
      if (bool) {
        r((t)localObject);
      }
      return;
    }
    finally {}
  }
  
  public final void m()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called after start");
    c(new m());
  }
  
  public void n(final e1 parame1)
  {
    Object localObject = b;
    int j = 0;
    boolean bool1 = true;
    boolean bool2;
    if (localObject != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.I(bool2, "May only be called after start");
    b.y(parame1, "reason");
    try
    {
      localObject = c;
      if (localObject == null)
      {
        l2 locall2 = l2.a;
        if (localObject == null) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        b.G(localObject, "realStream already set to %s", bool2);
        c = locall2;
        h = System.nanoTime();
        d = parame1;
      }
    }
    finally
    {
      break label153;
    }
    j = 1;
    if (j != 0)
    {
      c(new l(parame1));
    }
    else
    {
      q();
      s(parame1);
      b.d(parame1, t.a.a, new s0());
    }
    return;
    label153:
    throw parame1;
  }
  
  public final void o(final eb.s params)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    b.y(params, "decompressorRegistry");
    i.add(new e(params));
  }
  
  public final void p(final boolean paramBoolean)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "May only be called before start");
    i.add(new d(paramBoolean));
  }
  
  public final void q()
  {
    Object localObject1 = new ArrayList();
    for (;;)
    {
      try
      {
        if (e.isEmpty())
        {
          e = null;
          a = true;
          n localn = f;
          if (localn != null)
          {
            localObject1 = new ArrayList();
            for (;;)
            {
              try
              {
                if (c.isEmpty())
                {
                  c = null;
                  b = true;
                }
                else
                {
                  localList2 = c;
                  c = ((List)localObject1);
                  localObject1 = localList2.iterator();
                  while (((Iterator)localObject1).hasNext()) {
                    ((Runnable)((Iterator)localObject1).next()).run();
                  }
                  localList2.clear();
                  localObject1 = localList2;
                }
              }
              finally {}
            }
          }
          return;
        }
        List localList2 = e;
        e = localList1;
        Object localObject2 = localList2.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Runnable)((Iterator)localObject2).next()).run();
        }
        localList2.clear();
        localObject2 = localList2;
      }
      finally {}
    }
  }
  
  public final void r(t paramt)
  {
    Iterator localIterator = i.iterator();
    while (localIterator.hasNext()) {
      ((Runnable)localIterator.next()).run();
    }
    i = null;
    c.l(paramt);
  }
  
  public void s(e1 parame1) {}
  
  public final h0 t(s params)
  {
    try
    {
      if (c != null) {
        return null;
      }
      b.y(params, "stream");
      s locals = c;
      boolean bool;
      if (locals == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.G(locals, "realStream already set to %s", bool);
      c = params;
      h = System.nanoTime();
      params = b;
      if (params == null)
      {
        e = null;
        a = true;
      }
      if (params == null) {
        return null;
      }
      r(params);
      return new h0(this);
    }
    finally {}
  }
  
  public final class a
    implements Runnable
  {
    public a(int paramInt) {}
    
    public final void run()
    {
      c.f(paramInt);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      c.e();
    }
  }
  
  public final class c
    implements Runnable
  {
    public c(l paraml) {}
    
    public final void run()
    {
      c.a(paraml);
    }
  }
  
  public final class d
    implements Runnable
  {
    public d(boolean paramBoolean) {}
    
    public final void run()
    {
      c.p(paramBoolean);
    }
  }
  
  public final class e
    implements Runnable
  {
    public e(eb.s params) {}
    
    public final void run()
    {
      c.o(params);
    }
  }
  
  public final class f
    implements Runnable
  {
    public f(int paramInt) {}
    
    public final void run()
    {
      c.g(paramInt);
    }
  }
  
  public final class g
    implements Runnable
  {
    public g(int paramInt) {}
    
    public final void run()
    {
      c.h(paramInt);
    }
  }
  
  public final class h
    implements Runnable
  {
    public h(eb.q paramq) {}
    
    public final void run()
    {
      c.j(paramq);
    }
  }
  
  public final class i
    implements Runnable
  {
    public i(String paramString) {}
    
    public final void run()
    {
      c.k(paramString);
    }
  }
  
  public final class j
    implements Runnable
  {
    public j(InputStream paramInputStream) {}
    
    public final void run()
    {
      c.d(paramInputStream);
    }
  }
  
  public final class k
    implements Runnable
  {
    public k() {}
    
    public final void run()
    {
      c.flush();
    }
  }
  
  public final class l
    implements Runnable
  {
    public l(e1 parame1) {}
    
    public final void run()
    {
      c.n(parame1);
    }
  }
  
  public final class m
    implements Runnable
  {
    public m() {}
    
    public final void run()
    {
      c.m();
    }
  }
  
  public static final class n
    implements t
  {
    public final t a;
    public volatile boolean b;
    public List<Runnable> c = new ArrayList();
    
    public n(t paramt)
    {
      a = paramt;
    }
    
    public final void a(final n3.a parama)
    {
      if (b) {
        a.a(parama);
      } else {
        e(new a(parama));
      }
    }
    
    public final void b(final s0 params0)
    {
      e(new c(params0));
    }
    
    public final void c()
    {
      if (b) {
        a.c();
      } else {
        e(new b());
      }
    }
    
    public final void d(final e1 parame1, final t.a parama, final s0 params0)
    {
      e(new d(parame1, parama, params0));
    }
    
    public final void e(Runnable paramRunnable)
    {
      try
      {
        if (!b)
        {
          c.add(paramRunnable);
          return;
        }
        paramRunnable.run();
        return;
      }
      finally {}
    }
    
    public final class a
      implements Runnable
    {
      public a(n3.a parama) {}
      
      public final void run()
      {
        a.a(parama);
      }
    }
    
    public final class b
      implements Runnable
    {
      public b() {}
      
      public final void run()
      {
        a.c();
      }
    }
    
    public final class c
      implements Runnable
    {
      public c(s0 params0) {}
      
      public final void run()
      {
        a.b(params0);
      }
    }
    
    public final class d
      implements Runnable
    {
      public d(e1 parame1, t.a parama, s0 params0) {}
      
      public final void run()
      {
        a.d(parame1, parama, params0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */