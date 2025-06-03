package gb;

import eb.e;
import eb.e.a;
import eb.e1;
import eb.p;
import eb.q;
import eb.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n7.g;
import n7.g.a;
import x6.b;

public class d0<ReqT, RespT>
  extends e<ReqT, RespT>
{
  public static final g j = new g();
  public final ScheduledFuture<?> a;
  public final Executor b;
  public final p c;
  public volatile boolean d;
  public e.a<RespT> e;
  public e<ReqT, RespT> f;
  public e1 g;
  public List<Runnable> h = new ArrayList();
  public i<RespT> i;
  
  static
  {
    Logger.getLogger(d0.class.getName());
  }
  
  public d0(Executor paramExecutor, r1.n paramn, q paramq)
  {
    b.y(paramExecutor, "callExecutor");
    b = paramExecutor;
    b.y(paramn, "scheduler");
    paramExecutor = p.b();
    c = paramExecutor;
    paramExecutor.getClass();
    if (paramq == null)
    {
      paramExecutor = null;
    }
    else
    {
      TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
      long l1 = paramq.h(localTimeUnit);
      long l2 = Math.abs(l1);
      paramExecutor = TimeUnit.SECONDS;
      long l3 = l2 / paramExecutor.toNanos(1L);
      l2 = Math.abs(l1);
      long l4 = paramExecutor.toNanos(1L);
      paramq = new StringBuilder();
      if (l1 < 0L)
      {
        paramq.append("ClientCall started after ");
        paramq.append("CallOptions");
        paramExecutor = " deadline was exceeded. Deadline has been exceeded for ";
      }
      else
      {
        paramq.append("Deadline ");
        paramq.append("CallOptions");
        paramExecutor = " will be exceeded in ";
      }
      paramq.append(paramExecutor);
      paramq.append(l3);
      paramq.append(String.format(Locale.US, ".%09d", new Object[] { Long.valueOf(l2 % l4) }));
      paramq.append("s. ");
      paramExecutor = paramn.schedule(new c0(this, paramq), l1, localTimeUnit);
    }
    a = paramExecutor;
  }
  
  public final void a(String paramString, Throwable paramThrowable)
  {
    e1 locale1 = e1.f;
    if (paramString == null) {
      paramString = "Call cancelled without message";
    }
    locale1 = locale1.g(paramString);
    paramString = locale1;
    if (paramThrowable != null) {
      paramString = locale1.f(paramThrowable);
    }
    g(paramString, false);
  }
  
  public final void b()
  {
    h(new f());
  }
  
  public final void c(final int paramInt)
  {
    if (d) {
      f.c(paramInt);
    } else {
      h(new e(paramInt));
    }
  }
  
  public final void d(final ReqT paramReqT)
  {
    if (d) {
      f.d(paramReqT);
    } else {
      h(new d(paramReqT));
    }
  }
  
  public final void e(e.a<RespT> parama, final s0 params0)
  {
    boolean bool;
    if (e == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "already started");
    try
    {
      b.y(parama, "listener");
      e = parama;
      e1 locale1 = g;
      bool = d;
      final Object localObject = parama;
      if (!bool)
      {
        localObject = new gb/d0$i;
        ((i)localObject).<init>(parama);
        i = ((i)localObject);
      }
      if (locale1 != null)
      {
        b.execute(new h((e.a)localObject, locale1));
        return;
      }
      if (bool) {
        f.e((e.a)localObject, params0);
      } else {
        h(new b((e.a)localObject, params0));
      }
      return;
    }
    finally {}
  }
  
  public void f() {}
  
  public final void g(final e1 parame1, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = f;
      k = 0;
      boolean bool = true;
      if (localObject1 != null) {
        break label86;
      }
      localObject2 = j;
      if (localObject1 == null) {
        paramBoolean = bool;
      } else {
        paramBoolean = false;
      }
      b.G(localObject1, "realCall already set to %s", paramBoolean);
      localObject1 = a;
      if (localObject1 != null) {
        ((Future)localObject1).cancel(false);
      }
    }
    finally
    {
      break label156;
    }
    f = ((e)localObject2);
    Object localObject2 = e;
    g = parame1;
    break label99;
    label86:
    if (paramBoolean) {
      return;
    }
    localObject2 = null;
    int k = 1;
    label99:
    if (k != 0)
    {
      h(new c(parame1));
    }
    else
    {
      if (localObject2 != null) {
        b.execute(new h((e.a)localObject2, parame1));
      }
      i();
    }
    f();
    return;
    label156:
    throw parame1;
  }
  
  public final void h(Runnable paramRunnable)
  {
    try
    {
      if (!d)
      {
        h.add(paramRunnable);
        return;
      }
      paramRunnable.run();
      return;
    }
    finally {}
  }
  
  public final void i()
  {
    final Object localObject1 = new ArrayList();
    for (;;)
    {
      try
      {
        if (h.isEmpty())
        {
          h = null;
          d = true;
          localObject1 = i;
          if (localObject1 != null) {
            b.execute(new a((i)localObject1));
          }
          return;
        }
        List localList = h;
        h = ((List)localObject1);
        localObject1 = localList.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((Runnable)((Iterator)localObject1).next()).run();
        }
        localList.clear();
        localObject1 = localList;
      }
      finally {}
    }
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(f, "realCall");
    return locala.toString();
  }
  
  public final class a
    extends z
  {
    public a()
    {
      super();
    }
    
    public final void a()
    {
      d0.i locali = localObject1;
      locali.getClass();
      Object localObject1 = new ArrayList();
      for (;;)
      {
        try
        {
          if (c.isEmpty())
          {
            c = null;
            b = true;
            return;
          }
          List localList = c;
          c = ((List)localObject1);
          localObject1 = localList.iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((Runnable)((Iterator)localObject1).next()).run();
          }
          localList.clear();
          localObject1 = localList;
        }
        finally {}
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(e.a parama, s0 params0) {}
    
    public final void run()
    {
      f.e(localObject, params0);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c(e1 parame1) {}
    
    public final void run()
    {
      e locale = f;
      e1 locale1 = parame1;
      locale.a(b, c);
    }
  }
  
  public final class d
    implements Runnable
  {
    public d(Object paramObject) {}
    
    public final void run()
    {
      f.d(paramReqT);
    }
  }
  
  public final class e
    implements Runnable
  {
    public e(int paramInt) {}
    
    public final void run()
    {
      f.c(paramInt);
    }
  }
  
  public final class f
    implements Runnable
  {
    public f() {}
    
    public final void run()
    {
      f.b();
    }
  }
  
  public final class g
    extends e<Object, Object>
  {
    public final void a(String paramString, Throwable paramThrowable) {}
    
    public final void b() {}
    
    public final void c(int paramInt) {}
    
    public final void d(Object paramObject) {}
    
    public final void e(e.a<Object> parama, s0 params0) {}
  }
  
  public final class h
    extends z
  {
    public final e.a<RespT> b;
    public final e1 c;
    
    public h(e1 parame1)
    {
      super();
      b = parame1;
      e1 locale1;
      c = locale1;
    }
    
    public final void a()
    {
      e.a locala = b;
      e1 locale1 = c;
      locala.a(new s0(), locale1);
    }
  }
  
  public static final class i<RespT>
    extends e.a<RespT>
  {
    public final e.a<RespT> a;
    public volatile boolean b;
    public List<Runnable> c = new ArrayList();
    
    public i(e.a<RespT> parama)
    {
      a = parama;
    }
    
    public final void a(s0 params0, e1 parame1)
    {
      e(new e0(this, parame1, params0));
    }
    
    public final void b(final s0 params0)
    {
      if (b) {
        a.b(params0);
      } else {
        e(new a(params0));
      }
    }
    
    public final void c(final RespT paramRespT)
    {
      if (b) {
        a.c(paramRespT);
      } else {
        e(new b(paramRespT));
      }
    }
    
    public final void d()
    {
      if (b) {
        a.d();
      } else {
        e(new c());
      }
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
      public a(s0 params0) {}
      
      public final void run()
      {
        a.b(params0);
      }
    }
    
    public final class b
      implements Runnable
    {
      public b(Object paramObject) {}
      
      public final void run()
      {
        a.c(paramRespT);
      }
    }
    
    public final class c
      implements Runnable
    {
      public c() {}
      
      public final void run()
      {
        a.d();
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */