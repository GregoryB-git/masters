package gb;

import d2.q;
import eb.e1;
import eb.g1;
import eb.h1;
import eb.s0;
import eb.s0.b;
import eb.s0.d;
import java.io.Closeable;
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import x6.b;

public final class y2$z
  implements t
{
  public final y2.a0 a;
  
  public y2$z(y2 paramy2, y2.a0 parama0)
  {
    a = parama0;
  }
  
  public final void a(final n3.a parama)
  {
    Object localObject = b.o;
    boolean bool;
    if (f != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "Headers should be received prior to messages.");
    if (f != a)
    {
      localObject = v0.a;
      for (;;)
      {
        localObject = parama.next();
        if (localObject == null) {
          break;
        }
        v0.b((Closeable)localObject);
      }
      return;
    }
    b.c.execute(new e(parama));
  }
  
  public final void b(final s0 params0)
  {
    if (a.d > 0)
    {
      localObject1 = y2.A;
      params0.a((s0.d)localObject1);
      params0.f((s0.d)localObject1, String.valueOf(a.d));
    }
    Object localObject1 = b;
    Object localObject2 = a;
    s0.b localb = y2.A;
    localObject2 = ((y2)localObject1).q((y2.a0)localObject2);
    if (localObject2 != null) {
      b.execute((Runnable)localObject2);
    }
    if (b.o.f == a)
    {
      localObject1 = b.m;
      if (localObject1 != null)
      {
        int i;
        int j;
        int k;
        do
        {
          i = d.get();
          j = a;
          if (i == j) {
            break;
          }
          k = c;
        } while (!d.compareAndSet(i, Math.min(k + i, j)));
      }
      b.c.execute(new a(params0));
    }
  }
  
  public final void c()
  {
    if (!b.b()) {
      return;
    }
    b.c.execute(new f());
  }
  
  public final void d(e1 arg1, t.a arg2, final s0 params0)
  {
    Object localObject3;
    synchronized (b.i)
    {
      Object localObject4 = b;
      o = o.d(a);
      b.n.e(a);
      if (b.r.decrementAndGet() == Integer.MIN_VALUE)
      {
        b.c.execute(new c());
        return;
      }
      localObject4 = a;
      if (c)
      {
        ??? = b;
        localObject4 = ((y2)???).q((y2.a0)localObject4);
        if (localObject4 != null) {
          b.execute((Runnable)localObject4);
        }
        if (b.o.f == a) {
          b.z(???, ???, params0);
        }
        return;
      }
      ??? = t.a.d;
      if ((??? == ???) && (b.q.incrementAndGet() > 1000))
      {
        localObject4 = b;
        ??? = ((y2)localObject4).q(a);
        if (??? != null) {
          b.execute((Runnable)???);
        }
        if (b.o.f == a)
        {
          ??? = e1.m.g("Too many transparent retries. Might be a bug in gRPC").f(new g1(???));
          b.z(???, ???, params0);
        }
        return;
      }
      if (b.o.f == null)
      {
        boolean bool1 = true;
        if ((??? != ???) && ((??? != t.a.b) || (!b.p.compareAndSet(false, true))))
        {
          if (??? == t.a.c)
          {
            ??? = b;
            if (h) {
              ((y2)???).u();
            }
          }
          else
          {
            b.p.set(true);
            Object localObject5 = b;
            boolean bool2 = h;
            ??? = null;
            localObject4 = null;
            boolean bool4;
            if (bool2)
            {
              localObject5 = (String)params0.c(y2.B);
              ??? = localObject4;
              if (localObject5 != null) {
                try
                {
                  ??? = Integer.valueOf((String)localObject5);
                }
                catch (NumberFormatException localNumberFormatException1)
                {
                  ??? = Integer.valueOf(-1);
                }
              }
              boolean bool3 = b.g.c.contains(a) ^ true;
              if ((b.m != null) && ((!bool3) || ((??? != null) && (((Integer)???).intValue() < 0)))) {
                bool4 = b.m.a() ^ true;
              } else {
                bool4 = false;
              }
              localObject4 = ???;
              if (!bool3)
              {
                localObject4 = ???;
                if (!bool4)
                {
                  localObject4 = ???;
                  if (!???.e())
                  {
                    localObject4 = ???;
                    if (??? != null)
                    {
                      localObject4 = ???;
                      if (((Integer)???).intValue() > 0) {
                        localObject4 = Integer.valueOf(0);
                      }
                    }
                  }
                }
              }
              if ((!bool3) && (!bool4)) {
                bool4 = bool1;
              } else {
                bool4 = false;
              }
              if (bool4) {
                y2.c(b, (Integer)localObject4);
              }
              synchronized (b.i)
              {
                localObject4 = b;
                o = o.b(a);
                if (bool4)
                {
                  localObject4 = b;
                  if ((((y2)localObject4).v(o)) || (!b.o.d.isEmpty())) {
                    return;
                  }
                }
              }
            }
            localObject4 = f;
            long l1 = 0L;
            if (localObject4 == null)
            {
              ??? = new y2.v(0L, false);
            }
            else
            {
              bool2 = f.contains(a);
              localObject4 = (String)params0.c(y2.B);
              if (localObject4 != null) {
                try
                {
                  ??? = Integer.valueOf((String)localObject4);
                }
                catch (NumberFormatException localNumberFormatException2)
                {
                  localObject3 = Integer.valueOf(-1);
                }
              }
              if ((b.m != null) && ((bool2) || ((localObject3 != null) && (((Integer)localObject3).intValue() < 0)))) {
                bool4 = b.m.a() ^ true;
              } else {
                bool4 = false;
              }
              localObject4 = b;
              if ((f.a > a.d + 1) && (!bool4))
              {
                long l2;
                if (localObject3 == null)
                {
                  if (!bool2) {
                    break label956;
                  }
                  double d = x;
                  l1 = (y2.D.nextDouble() * d);
                  localObject3 = b;
                  d = x;
                  localObject4 = f;
                  l2 = Math.min((d * d), c);
                }
                else
                {
                  if (((Integer)localObject3).intValue() < 0) {
                    break label956;
                  }
                  l1 = TimeUnit.MILLISECONDS.toNanos(((Integer)localObject3).intValue());
                  localObject3 = b;
                  l2 = f.b;
                }
                x = l2;
                bool2 = true;
                break label959;
              }
              label956:
              bool2 = false;
              label959:
              localObject3 = new y2.v(l1, bool2);
            }
            if (a)
            {
              params0 = b.r(a.d + 1, false);
              if (params0 == null) {
                return;
              }
              synchronized (b.i)
              {
                ??? = b;
                localObject4 = new gb/y2$t;
                ((y2.t)localObject4).<init>(i);
                v = ((y2.t)localObject4);
                ((y2.t)localObject4).a(d.schedule(new b(params0), b, TimeUnit.NANOSECONDS));
                return;
              }
            }
          }
        }
        else
        {
          ??? = b.r(a.d, true);
          if (??? == null) {
            return;
          }
          ??? = b;
          if (h) {
            synchronized (i)
            {
              params0 = b;
              o = o.c(a, ???);
            }
          }
          b.b.execute(new d(???));
          return;
        }
      }
      localObject4 = b;
      localObject3 = ((y2)localObject4).q(a);
      if (localObject3 != null) {
        b.execute((Runnable)localObject3);
      }
      if (b.o.f == a) {
        b.z(???, ???, params0);
      }
      return;
    }
  }
  
  public final class a
    implements Runnable
  {
    public a(s0 params0) {}
    
    public final void run()
    {
      b.u.b(params0);
    }
  }
  
  public final class b
    implements Runnable
  {
    public final void run()
    {
      b.b.b.execute(new a());
    }
    
    public final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        Object localObject = y2.z.b.this;
        y2 localy2 = b.b;
        y2.a0 locala0 = a;
        localObject = y2.A;
        localy2.t(locala0);
      }
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      Object localObject = b;
      z = true;
      t localt = u;
      localObject = s;
      localt.d(a, b, c);
    }
  }
  
  public final class d
    implements Runnable
  {
    public d(y2.a0 parama0) {}
    
    public final void run()
    {
      y2 localy2 = b;
      y2.a0 locala0 = parame1;
      s0.b localb = y2.A;
      localy2.t(locala0);
    }
  }
  
  public final class e
    implements Runnable
  {
    public e(n3.a parama) {}
    
    public final void run()
    {
      b.u.a(parama);
    }
  }
  
  public final class f
    implements Runnable
  {
    public f() {}
    
    public final void run()
    {
      y2 localy2 = b;
      if (!z) {
        u.c();
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.y2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */