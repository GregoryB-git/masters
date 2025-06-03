package w6;

import V5.t;
import j6.c;
import j6.c.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import u6.A;
import u6.r;

public final class a$c
  extends Thread
{
  public static final AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
  private volatile int indexInArray;
  private volatile Object nextParkedWorker;
  public final n o;
  public final u p;
  public a.d q;
  public long r;
  public long s;
  public int t;
  public boolean u;
  private volatile int workerCtl;
  
  public a$c(a parama)
  {
    setDaemon(true);
    o = new n();
    p = new u();
    q = a.d.r;
    nextParkedWorker = a.z;
    t = c.o.c();
  }
  
  public a$c(a parama, int paramInt)
  {
    this(parama);
    q(paramInt);
  }
  
  public static final AtomicIntegerFieldUpdater j()
  {
    return w;
  }
  
  public final void b(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    a locala = v;
    a.a().addAndGet(locala, -2097152L);
    if (q != a.d.s) {
      q = a.d.r;
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    if (u(a.d.p)) {
      v.u();
    }
  }
  
  public final void d(h paramh)
  {
    int i = p.b();
    k(i);
    c(i);
    v.r(paramh);
    b(i);
  }
  
  public final h e(boolean paramBoolean)
  {
    h localh;
    if (paramBoolean)
    {
      int i;
      if (m(v.o * 2) == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localh = o();
        if (localh != null) {
          return localh;
        }
      }
      localh = o.g();
      if (localh != null) {
        return localh;
      }
      if (i == 0)
      {
        localh = o();
        if (localh != null) {
          return localh;
        }
      }
    }
    else
    {
      localh = o();
      if (localh != null) {
        return localh;
      }
    }
    return v(3);
  }
  
  public final h f()
  {
    h localh1 = o.h();
    h localh2 = localh1;
    if (localh1 == null)
    {
      localh1 = (h)v.t.d();
      localh2 = localh1;
      if (localh1 == null) {
        localh2 = v(1);
      }
    }
    return localh2;
  }
  
  public final h g(boolean paramBoolean)
  {
    if (s()) {
      return e(paramBoolean);
    }
    return f();
  }
  
  public final int h()
  {
    return indexInArray;
  }
  
  public final Object i()
  {
    return nextParkedWorker;
  }
  
  public final void k(int paramInt)
  {
    r = 0L;
    if (q == a.d.q) {
      q = a.d.p;
    }
  }
  
  public final boolean l()
  {
    boolean bool;
    if (nextParkedWorker != a.z) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int m(int paramInt)
  {
    int i = t;
    i ^= i << 13;
    i ^= i >> 17;
    i ^= i << 5;
    t = i;
    int j = paramInt - 1;
    if ((j & paramInt) == 0) {
      return i & j;
    }
    return (i & 0x7FFFFFFF) % paramInt;
  }
  
  public final void n()
  {
    if (r == 0L) {
      r = (System.nanoTime() + v.q);
    }
    LockSupport.parkNanos(v.q);
    if (System.nanoTime() - r >= 0L)
    {
      r = 0L;
      w();
    }
  }
  
  public final h o()
  {
    if (m(2) == 0)
    {
      localObject = (h)v.s.d();
      if (localObject != null) {
        return (h)localObject;
      }
    }
    for (Object localObject = v.t;; localObject = v.s)
    {
      return (h)((r)localObject).d();
      localObject = (h)v.t.d();
      if (localObject != null) {
        return (h)localObject;
      }
    }
  }
  
  public final void p()
  {
    int i = 0;
    for (;;)
    {
      if ((v.isTerminated()) || (q == a.d.s)) {
        break label105;
      }
      h localh = g(u);
      if (localh != null)
      {
        s = 0L;
        d(localh);
        break;
      }
      u = false;
      if (s != 0L)
      {
        if (i == 0)
        {
          i = 1;
          continue;
        }
        u(a.d.q);
        Thread.interrupted();
        LockSupport.parkNanos(s);
        s = 0L;
        break;
      }
      t();
    }
    label105:
    u(a.d.s);
  }
  
  public final void q(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(v.r);
    localStringBuilder.append("-worker-");
    String str;
    if (paramInt == 0) {
      str = "TERMINATED";
    } else {
      str = String.valueOf(paramInt);
    }
    localStringBuilder.append(str);
    setName(localStringBuilder.toString());
    indexInArray = paramInt;
  }
  
  public final void r(Object paramObject)
  {
    nextParkedWorker = paramObject;
  }
  
  public void run()
  {
    p();
  }
  
  public final boolean s()
  {
    Object localObject1 = q;
    Object localObject2 = a.d.o;
    boolean bool = true;
    if (localObject1 != localObject2)
    {
      localObject2 = v;
      localObject1 = a.a();
      long l;
      do
      {
        l = ((AtomicLongFieldUpdater)localObject1).get(localObject2);
        if ((int)((0x7FFFFC0000000000 & l) >> 42) == 0)
        {
          bool = false;
          break;
        }
      } while (!a.a().compareAndSet(localObject2, l, l - 4398046511104L));
      q = a.d.o;
    }
    return bool;
  }
  
  public final void t()
  {
    if (!l())
    {
      v.n(this);
      return;
    }
    w.set(this, -1);
    while ((l()) && (w.get(this) == -1) && (!v.isTerminated()) && (q != a.d.s))
    {
      u(a.d.q);
      Thread.interrupted();
      n();
    }
  }
  
  public final boolean u(a.d paramd)
  {
    a.d locald = q;
    boolean bool;
    if (locald == a.d.o) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      a locala = v;
      a.a().addAndGet(locala, 4398046511104L);
    }
    if (locald != paramd) {
      q = paramd;
    }
    return bool;
  }
  
  public final h v(int paramInt)
  {
    Object localObject1 = v;
    int i = (int)(a.a().get(localObject1) & 0x1FFFFF);
    if (i < 2) {
      return null;
    }
    int j = m(i);
    Object localObject2 = v;
    int k = 0;
    long l3;
    for (long l1 = Long.MAX_VALUE; k < i; l1 = l3)
    {
      int m = j + 1;
      j = m;
      if (m > i) {
        j = 1;
      }
      localObject1 = (c)u.b(j);
      if ((localObject1 != null) && (localObject1 != this))
      {
        long l2 = o.n(paramInt, p);
        if (l2 == -1L)
        {
          localObject2 = p;
          localObject1 = (h)o;
          o = null;
          return (h)localObject1;
        }
        l3 = l1;
        if (l2 > 0L) {
          l3 = Math.min(l1, l2);
        }
      }
      else
      {
        l3 = l1;
      }
      k++;
    }
    if (l1 == Long.MAX_VALUE) {
      l1 = 0L;
    }
    s = l1;
    return null;
  }
  
  public final void w()
  {
    a locala = v;
    int j;
    synchronized (u)
    {
      boolean bool = locala.isTerminated();
      if (bool) {
        return;
      }
      int i = (int)(a.a().get(locala) & 0x1FFFFF);
      j = o;
      if (i <= j) {
        return;
      }
      bool = w.compareAndSet(this, -1, 1);
      if (!bool) {
        return;
      }
      i = indexInArray;
      q(0);
      locala.q(this, i, 0);
      j = (int)(a.a().getAndDecrement(locala) & 0x1FFFFF);
      if (j != i)
      {
        Object localObject2 = u.b(j);
        Intrinsics.b(localObject2);
        localObject2 = (c)localObject2;
        u.c(i, localObject2);
        ((c)localObject2).q(i);
        locala.q((c)localObject2, j, i);
      }
    }
    u.c(j, null);
    localt = t.a;
    q = a.d.s;
  }
}

/* Location:
 * Qualified Name:     w6.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */