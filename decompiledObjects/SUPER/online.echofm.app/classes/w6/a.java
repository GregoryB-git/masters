package w6;

import V5.t;
import j6.c.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import p6.M;
import u6.A;
import u6.F;
import u6.r;

public final class a
  implements Executor, Closeable
{
  public static final a v = new a(null);
  public static final AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
  public static final AtomicLongFieldUpdater x = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
  public static final AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
  public static final F z = new F("NOT_IN_STACK");
  private volatile int _isTerminated;
  private volatile long controlState;
  public final int o;
  public final int p;
  private volatile long parkedWorkersStack;
  public final long q;
  public final String r;
  public final d s;
  public final d t;
  public final A u;
  
  public a(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramLong;
    r = paramString;
    if (paramInt1 >= 1)
    {
      if (paramInt2 >= paramInt1)
      {
        if (paramInt2 <= 2097150)
        {
          if (paramLong > 0L)
          {
            s = new d();
            t = new d();
            u = new A((paramInt1 + 1) * 2);
            controlState = (paramInt1 << 42);
            _isTerminated = 0;
            return;
          }
          paramString = new StringBuilder();
          paramString.append("Idle worker keep alive time ");
          paramString.append(paramLong);
          paramString.append(" must be positive");
          throw new IllegalArgumentException(paramString.toString().toString());
        }
        paramString = new StringBuilder();
        paramString.append("Max pool size ");
        paramString.append(paramInt2);
        paramString.append(" should not exceed maximal supported number of threads 2097150");
        throw new IllegalArgumentException(paramString.toString().toString());
      }
      paramString = new StringBuilder();
      paramString.append("Max pool size ");
      paramString.append(paramInt2);
      paramString.append(" should be greater than or equals to core pool size ");
      paramString.append(paramInt1);
      throw new IllegalArgumentException(paramString.toString().toString());
    }
    paramString = new StringBuilder();
    paramString.append("Core pool size ");
    paramString.append(paramInt1);
    paramString.append(" should be at least 1");
    throw new IllegalArgumentException(paramString.toString().toString());
  }
  
  public final boolean B()
  {
    c localc;
    do
    {
      localc = m();
      if (localc == null) {
        return false;
      }
    } while (!c.j().compareAndSet(localc, -1, 0));
    LockSupport.unpark(localc);
    return true;
  }
  
  public final boolean b(h paramh)
  {
    if (p.b() == 1) {}
    boolean bool;
    for (d locald = t;; locald = s)
    {
      bool = locald.a(paramh);
      break;
    }
    return bool;
  }
  
  public final int c()
  {
    A localA = u;
    IllegalArgumentException localIllegalArgumentException;
    label222:
    try
    {
      boolean bool = isTerminated();
      if (bool) {
        return -1;
      }
      AtomicLongFieldUpdater localAtomicLongFieldUpdater = x;
      long l = localAtomicLongFieldUpdater.get(this);
      int i = (int)(l & 0x1FFFFF);
      int j = l6.d.a(i - (int)((l & 0x3FFFFE00000) >> 21), 0);
      int k = o;
      if (j >= k) {
        return 0;
      }
      k = p;
      if (i >= k) {
        return 0;
      }
      i = (int)(a().get(this) & 0x1FFFFF) + 1;
      if ((i > 0) && (u.b(i) == null))
      {
        Object localObject1 = new w6/a$c;
        ((c)localObject1).<init>(this, i);
        u.c(i, localObject1);
        l = localAtomicLongFieldUpdater.incrementAndGet(this);
        if (i == (int)(0x1FFFFF & l))
        {
          ((Thread)localObject1).start();
          return j + 1;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Failed requirement.".toString());
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      break label222;
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Failed requirement.".toString());
      throw localIllegalArgumentException;
    }
  }
  
  public void close()
  {
    s(10000L);
  }
  
  public final h e(Runnable paramRunnable, i parami)
  {
    long l = l.f.a();
    if ((paramRunnable instanceof h))
    {
      paramRunnable = (h)paramRunnable;
      o = l;
      p = parami;
      return paramRunnable;
    }
    return new k(paramRunnable, l, parami);
  }
  
  public void execute(Runnable paramRunnable)
  {
    k(this, paramRunnable, null, false, 6, null);
  }
  
  public final c h()
  {
    Object localObject1 = Thread.currentThread();
    boolean bool = localObject1 instanceof c;
    Object localObject2 = null;
    if (bool) {
      localObject1 = (c)localObject1;
    } else {
      localObject1 = null;
    }
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject3 = localObject2;
      if (Intrinsics.a(c.a((c)localObject1), this)) {
        localObject3 = localObject1;
      }
    }
    return (c)localObject3;
  }
  
  public final void i(Runnable paramRunnable, i parami, boolean paramBoolean)
  {
    p6.c.a();
    parami = e(paramRunnable, parami);
    int i = p.b();
    boolean bool1 = false;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    long l;
    if (i != 0) {
      l = x.addAndGet(this, 2097152L);
    } else {
      l = 0L;
    }
    paramRunnable = h();
    parami = v(paramRunnable, parami, paramBoolean);
    if ((parami != null) && (!b(parami)))
    {
      paramRunnable = new StringBuilder();
      paramRunnable.append(r);
      paramRunnable.append(" was terminated");
      throw new RejectedExecutionException(paramRunnable.toString());
    }
    boolean bool2 = bool1;
    if (paramBoolean)
    {
      bool2 = bool1;
      if (paramRunnable != null) {
        bool2 = true;
      }
    }
    if (i != 0)
    {
      t(l, bool2);
    }
    else
    {
      if (bool2) {
        return;
      }
      u();
    }
  }
  
  public final boolean isTerminated()
  {
    boolean bool;
    if (y.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int l(c paramc)
  {
    int i;
    do
    {
      paramc = paramc.i();
      if (paramc == z) {
        return -1;
      }
      if (paramc == null) {
        return 0;
      }
      paramc = (c)paramc;
      i = paramc.h();
    } while (i == 0);
    return i;
  }
  
  public final c m()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = w;
    long l;
    int i;
    c localc;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      i = (int)(0x1FFFFF & l);
      localc = (c)u.b(i);
      if (localc == null) {
        return null;
      }
      i = l(localc);
    } while ((i < 0) || (!w.compareAndSet(this, l, i | 2097152L + l & 0xFFFFFFFFFFE00000)));
    localc.r(z);
    return localc;
  }
  
  public final boolean n(c paramc)
  {
    if (paramc.i() != z) {
      return false;
    }
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = w;
    long l;
    int j;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      int i = (int)(0x1FFFFF & l);
      j = paramc.h();
      paramc.r(u.b(i));
    } while (!w.compareAndSet(this, l, 2097152L + l & 0xFFFFFFFFFFE00000 | j));
    return true;
  }
  
  public final void q(c paramc, int paramInt1, int paramInt2)
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = w;
    long l;
    int j;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      int i = (int)(0x1FFFFF & l);
      j = i;
      if (i == paramInt1) {
        if (paramInt2 == 0) {
          j = l(paramc);
        } else {
          j = paramInt2;
        }
      }
    } while ((j < 0) || (!w.compareAndSet(this, l, 2097152L + l & 0xFFFFFFFFFFE00000 | j)));
  }
  
  /* Error */
  public final void r(h paramh)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 336 1 0
    //   6: invokestatic 282	p6/c:a	()Lp6/b;
    //   9: pop
    //   10: goto +22 -> 32
    //   13: astore_2
    //   14: invokestatic 269	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   17: astore_1
    //   18: aload_1
    //   19: invokevirtual 340	java/lang/Thread:getUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   22: aload_1
    //   23: aload_2
    //   24: invokeinterface 346 3 0
    //   29: goto -23 -> 6
    //   32: return
    //   33: astore_1
    //   34: invokestatic 282	p6/c:a	()Lp6/b;
    //   37: pop
    //   38: aload_1
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	a
    //   0	40	1	paramh	h
    //   13	11	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	6	13	finally
    //   14	29	33	finally
  }
  
  public final void s(long paramLong)
  {
    if (!y.compareAndSet(this, 0, 1)) {
      return;
    }
    c localc = h();
    synchronized (u)
    {
      long l = a().get(this);
      int i = (int)(l & 0x1FFFFF);
      if (1 <= i) {
        for (int j = 1;; j++)
        {
          ??? = u.b(j);
          Intrinsics.b(???);
          ??? = (c)???;
          if (??? != localc)
          {
            while (((Thread)???).isAlive())
            {
              LockSupport.unpark((Thread)???);
              ((Thread)???).join(paramLong);
            }
            o.f(t);
          }
          if (j == i) {
            break;
          }
        }
      }
      t.b();
      s.b();
      h localh;
      if (localc != null)
      {
        localh = localc.g(true);
        ??? = localh;
        if (localh != null) {}
      }
      else
      {
        localh = (h)s.d();
        ??? = localh;
        if (localh == null)
        {
          localh = (h)t.d();
          ??? = localh;
          if (localh == null)
          {
            if (localc != null) {
              localc.u(d.s);
            }
            w.set(this, 0L);
            x.set(this, 0L);
            return;
          }
        }
      }
      r((h)???);
    }
  }
  
  public final void t(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    if (B()) {
      return;
    }
    if (w(paramLong)) {
      return;
    }
    B();
  }
  
  public String toString()
  {
    ArrayList localArrayList = new ArrayList();
    int i = u.a();
    int j = 0;
    int k = 0;
    int m = k;
    int n = m;
    int i1 = n;
    int i2 = 1;
    int i3 = m;
    m = k;
    k = j;
    while (i2 < i)
    {
      localObject = (c)u.b(i2);
      int i4;
      int i5;
      int i6;
      if (localObject == null)
      {
        j = k;
        i4 = m;
        i5 = i3;
        i6 = i1;
      }
      else
      {
        int i7 = o.e();
        localObject = q;
        j = b.a[localObject.ordinal()];
        if (j != 1)
        {
          if (j != 2) {
            if (j != 3)
            {
              if (j != 4)
              {
                if (j != 5)
                {
                  j = k;
                  i4 = m;
                  i5 = i3;
                  i6 = i1;
                  break label350;
                }
                i6 = i1 + 1;
                j = k;
                i4 = m;
                i5 = i3;
                break label350;
              }
              int i8 = n + 1;
              j = k;
              i4 = m;
              i5 = i3;
              n = i8;
              i6 = i1;
              if (i7 <= 0) {
                break label350;
              }
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append(i7);
              j = 100;
              n = i8;
              i9 = j;
            }
            else
            {
              k++;
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append(i7);
              j = 99;
            }
          }
          for (int i9 = j;; i9 = j)
          {
            ((StringBuilder)localObject).append(i9);
            localArrayList.add(((StringBuilder)localObject).toString());
            j = k;
            i4 = m;
            i5 = i3;
            i6 = i1;
            break;
            m++;
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append(i7);
            j = 98;
          }
        }
        else
        {
          i5 = i3 + 1;
          i6 = i1;
          i4 = m;
          j = k;
        }
      }
      label350:
      i2++;
      k = j;
      m = i4;
      i3 = i5;
      i1 = i6;
    }
    long l = x.get(this);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(r);
    ((StringBuilder)localObject).append('@');
    ((StringBuilder)localObject).append(M.b(this));
    ((StringBuilder)localObject).append("[Pool Size {core = ");
    ((StringBuilder)localObject).append(o);
    ((StringBuilder)localObject).append(", max = ");
    ((StringBuilder)localObject).append(p);
    ((StringBuilder)localObject).append("}, Worker States {CPU = ");
    ((StringBuilder)localObject).append(k);
    ((StringBuilder)localObject).append(", blocking = ");
    ((StringBuilder)localObject).append(m);
    ((StringBuilder)localObject).append(", parked = ");
    ((StringBuilder)localObject).append(i3);
    ((StringBuilder)localObject).append(", dormant = ");
    ((StringBuilder)localObject).append(n);
    ((StringBuilder)localObject).append(", terminated = ");
    ((StringBuilder)localObject).append(i1);
    ((StringBuilder)localObject).append("}, running workers queues = ");
    ((StringBuilder)localObject).append(localArrayList);
    ((StringBuilder)localObject).append(", global CPU queue size = ");
    ((StringBuilder)localObject).append(s.c());
    ((StringBuilder)localObject).append(", global blocking queue size = ");
    ((StringBuilder)localObject).append(t.c());
    ((StringBuilder)localObject).append(", Control State {created workers= ");
    ((StringBuilder)localObject).append((int)(0x1FFFFF & l));
    ((StringBuilder)localObject).append(", blocking tasks = ");
    ((StringBuilder)localObject).append((int)((0x3FFFFE00000 & l) >> 21));
    ((StringBuilder)localObject).append(", CPUs acquired = ");
    ((StringBuilder)localObject).append(o - (int)((0x7FFFFC0000000000 & l) >> 42));
    ((StringBuilder)localObject).append("}]");
    return ((StringBuilder)localObject).toString();
  }
  
  public final void u()
  {
    if (B()) {
      return;
    }
    if (x(this, 0L, 1, null)) {
      return;
    }
    B();
  }
  
  public final h v(c paramc, h paramh, boolean paramBoolean)
  {
    if (paramc == null) {
      return paramh;
    }
    if (q == d.s) {
      return paramh;
    }
    if ((p.b() == 0) && (q == d.p)) {
      return paramh;
    }
    u = true;
    return o.a(paramh, paramBoolean);
  }
  
  public final boolean w(long paramLong)
  {
    if (l6.d.a((int)(0x1FFFFF & paramLong) - (int)((paramLong & 0x3FFFFE00000) >> 21), 0) < o)
    {
      int i = c();
      if ((i == 1) && (o > 1)) {
        c();
      }
      if (i > 0) {
        return true;
      }
    }
    return false;
  }
  
  public static final class a {}
  
  public final class c
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
    
    public c()
    {
      setDaemon(true);
      o = new n();
      p = new u();
      q = a.d.r;
      nextParkedWorker = a.z;
      t = j6.c.o.c();
    }
    
    public c(int paramInt)
    {
      this();
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
      a locala = a.this;
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
        u();
      }
    }
    
    public final void d(h paramh)
    {
      int i = p.b();
      k(i);
      c(i);
      r(paramh);
      b(i);
    }
    
    public final h e(boolean paramBoolean)
    {
      h localh;
      if (paramBoolean)
      {
        int i;
        if (m(o * 2) == 0) {
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
        localh1 = (h)t.d();
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
        r = (System.nanoTime() + q);
      }
      LockSupport.parkNanos(q);
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
        localObject = (h)s.d();
        if (localObject != null) {
          return (h)localObject;
        }
      }
      for (Object localObject = t;; localObject = s)
      {
        return (h)((r)localObject).d();
        localObject = (h)t.d();
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
        if ((isTerminated()) || (q == a.d.s)) {
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
      localStringBuilder.append(r);
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
        localObject2 = a.this;
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
        n(this);
        return;
      }
      w.set(this, -1);
      while ((l()) && (w.get(this) == -1) && (!isTerminated()) && (q != a.d.s))
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
        a locala = a.this;
        a.a().addAndGet(locala, 4398046511104L);
      }
      if (locald != paramd) {
        q = paramd;
      }
      return bool;
    }
    
    public final h v(int paramInt)
    {
      Object localObject1 = a.this;
      int i = (int)(a.a().get(localObject1) & 0x1FFFFF);
      if (i < 2) {
        return null;
      }
      int j = m(i);
      Object localObject2 = a.this;
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
      a locala = a.this;
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
  
  public static enum d {}
}

/* Location:
 * Qualified Name:     w6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */