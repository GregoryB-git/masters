package s7;

import f;
import g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.i;
import sun.misc.Unsafe;

public abstract class a<V>
  extends t7.a
  implements e<V>
{
  public static final boolean d;
  public static final Logger e;
  public static final a f;
  public static final Object o = new Object();
  public volatile Object a;
  public volatile d b;
  public volatile k c;
  
  static
  {
    boolean bool;
    try
    {
      bool = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    }
    catch (SecurityException localSecurityException)
    {
      bool = false;
    }
    d = bool;
    e = Logger.getLogger(a.class.getName());
    Object localObject2 = null;
    Object localObject3;
    try
    {
      localObject3 = new s7/a$j;
      ((j)localObject3).<init>();
      Object localObject1 = null;
    }
    catch (Error localError1) {}catch (RuntimeException localRuntimeException1) {}
    try
    {
      localObject3 = new s7/a$e;
      ((e)localObject3).<init>(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
    }
    catch (Error localError2) {}catch (RuntimeException localRuntimeException2) {}
    Object localObject5 = new g();
    localObject2 = localRuntimeException2;
    Object localObject4 = localObject5;
    f = (a)localObject4;
    if (localObject2 != null)
    {
      localObject5 = e;
      localObject4 = Level.SEVERE;
      ((Logger)localObject5).log((Level)localObject4, "UnsafeAtomicHelper is broken!", localRuntimeException1);
      ((Logger)localObject5).log((Level)localObject4, "SafeAtomicHelper is broken!", (Throwable)localObject2);
    }
  }
  
  private void b(StringBuilder paramStringBuilder)
  {
    String str1 = "]";
    int i = 0;
    for (;;)
    {
      try
      {
        try
        {
          Object localObject1 = get();
          if (i != 0) {}
          String str2;
          paramStringBuilder.append("FAILURE, cause=[");
        }
        finally
        {
          try
          {
            try
            {
              Thread.currentThread().interrupt();
              paramStringBuilder.append("SUCCESS, result=[");
              c(paramStringBuilder, localObject1);
              paramStringBuilder.append("]");
            }
            catch (RuntimeException localRuntimeException)
            {
              continue;
            }
            catch (ExecutionException localExecutionException)
            {
              continue;
            }
            localObject2 = finally;
            if (i != 0) {
              Thread.currentThread().interrupt();
            }
            throw ((Throwable)localObject2);
          }
          catch (CancellationException localCancellationException)
          {
            str3 = "CANCELLED";
          }
          paramStringBuilder.append("UNKNOWN, cause=[");
          paramStringBuilder.append(localRuntimeException.getClass());
          str2 = " thrown from get()]";
          continue;
        }
        String str3;
        paramStringBuilder.append(((Throwable)localObject2).getCause());
        paramStringBuilder.append(str3);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        i = 1;
      }
    }
  }
  
  public static void d(a parama)
  {
    parama.getClass();
    Object localObject2;
    for (Object localObject1 = f.e(parama); localObject1 != null; localObject1 = b)
    {
      localObject2 = a;
      if (localObject2 != null)
      {
        a = null;
        LockSupport.unpark((Thread)localObject2);
      }
    }
    localObject1 = f.d(parama, d.d);
    parama = null;
    for (;;)
    {
      localObject2 = parama;
      if (localObject1 == null) {
        break;
      }
      localObject2 = c;
      c = parama;
      parama = (a)localObject1;
      localObject1 = localObject2;
    }
    while (localObject2 != null)
    {
      parama = c;
      localObject1 = a;
      Objects.requireNonNull(localObject1);
      if (!(localObject1 instanceof f))
      {
        localObject2 = b;
        Objects.requireNonNull(localObject2);
        e((Runnable)localObject1, (Executor)localObject2);
        localObject2 = parama;
      }
      else
      {
        parama = (f)localObject1;
        throw null;
      }
    }
  }
  
  public static void e(Runnable paramRunnable, Executor paramExecutor)
  {
    try
    {
      paramExecutor.execute(paramRunnable);
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = e;
      Level localLevel = Level.SEVERE;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RuntimeException while executing runnable ");
      localStringBuilder.append(paramRunnable);
      localStringBuilder.append(" with executor ");
      localStringBuilder.append(paramExecutor);
      localLogger.log(localLevel, localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  private static Object g(Object paramObject)
  {
    if (!(paramObject instanceof b))
    {
      if (!(paramObject instanceof c))
      {
        localObject = paramObject;
        if (paramObject == o) {
          localObject = null;
        }
        return localObject;
      }
      throw new ExecutionException(a);
    }
    paramObject = a;
    Object localObject = new CancellationException("Task was cancelled.");
    ((Throwable)localObject).initCause((Throwable)paramObject);
    throw ((Throwable)localObject);
  }
  
  public final Throwable a()
  {
    if ((this instanceof h))
    {
      Object localObject = a;
      if ((localObject instanceof c)) {
        return a;
      }
    }
    return null;
  }
  
  public final void c(StringBuilder paramStringBuilder, Object paramObject)
  {
    if (paramObject == null)
    {
      paramObject = "null";
    }
    else if (paramObject == this)
    {
      paramObject = "this future";
    }
    else
    {
      paramStringBuilder.append(paramObject.getClass().getName());
      paramStringBuilder.append("@");
      paramObject = Integer.toHexString(System.identityHashCode(paramObject));
    }
    paramStringBuilder.append((String)paramObject);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    Object localObject1 = a;
    boolean bool = true;
    int i;
    if (localObject1 == null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i | localObject1 instanceof f) != 0)
    {
      Object localObject2;
      Object localObject3;
      if (d)
      {
        localObject2 = new b(new CancellationException("Future.cancel() was called."), paramBoolean);
        localObject3 = localObject1;
      }
      else
      {
        if (paramBoolean) {
          localObject3 = b.b;
        } else {
          localObject3 = b.c;
        }
        Objects.requireNonNull(localObject3);
        localObject2 = localObject3;
        localObject3 = localObject1;
      }
      do
      {
        if (f.b(this, localObject3, localObject2))
        {
          d(this);
          if (!(localObject3 instanceof f))
          {
            paramBoolean = bool;
            break;
          }
          ((f)localObject3).getClass();
          throw null;
        }
        localObject1 = a;
        localObject3 = localObject1;
      } while ((localObject1 instanceof f));
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  public void f(Runnable paramRunnable, Executor paramExecutor)
  {
    x6.b.y(paramExecutor, "Executor was null.");
    if (!isDone())
    {
      Object localObject = b;
      if (localObject != d.d)
      {
        d locald1 = new d(paramRunnable, paramExecutor);
        d locald2;
        do
        {
          c = ((d)localObject);
          if (f.a(this, (d)localObject, locald1)) {
            return;
          }
          locald2 = b;
          localObject = locald2;
        } while (locald2 != d.d);
      }
    }
    e(paramRunnable, paramExecutor);
  }
  
  public V get()
  {
    if (!Thread.interrupted())
    {
      Object localObject1 = a;
      int i;
      if (localObject1 != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i & (localObject1 instanceof f ^ true)) != 0) {
        return (V)g(localObject1);
      }
      localObject1 = c;
      if (localObject1 != k.c)
      {
        k localk = new k();
        Object localObject2;
        do
        {
          localObject2 = f;
          ((a)localObject2).f(localk, (k)localObject1);
          if (((a)localObject2).c(this, (k)localObject1, localk))
          {
            do
            {
              LockSupport.park(this);
              if (Thread.interrupted()) {
                break;
              }
              localObject1 = a;
              if (localObject1 != null) {
                i = 1;
              } else {
                i = 0;
              }
            } while ((i & (localObject1 instanceof f ^ true)) == 0);
            return (V)g(localObject1);
            i(localk);
            throw new InterruptedException();
          }
          localObject2 = c;
          localObject1 = localObject2;
        } while (localObject2 != k.c);
      }
      localObject1 = a;
      Objects.requireNonNull(localObject1);
      return (V)g(localObject1);
    }
    throw new InterruptedException();
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted())
    {
      Object localObject1 = a;
      int i = 1;
      int j;
      if (localObject1 != null) {
        j = 1;
      } else {
        j = 0;
      }
      if ((j & (localObject1 instanceof f ^ true)) != 0) {
        return (V)g(localObject1);
      }
      long l2;
      if (l1 > 0L) {
        l2 = System.nanoTime() + l1;
      } else {
        l2 = 0L;
      }
      if (l1 >= 1000L)
      {
        localObject1 = c;
        if (localObject1 != k.c)
        {
          localObject2 = new k();
          do
          {
            localObject3 = f;
            ((a)localObject3).f((k)localObject2, (k)localObject1);
            if (((a)localObject3).c(this, (k)localObject1, (k)localObject2))
            {
              long l3 = l1;
              do
              {
                LockSupport.parkNanos(this, Math.min(l3, 2147483647999999999L));
                if (Thread.interrupted()) {
                  break;
                }
                localObject1 = a;
                if (localObject1 != null) {
                  j = 1;
                } else {
                  j = 0;
                }
                if ((j & (localObject1 instanceof f ^ true)) != 0) {
                  return (V)g(localObject1);
                }
                l1 = l2 - System.nanoTime();
                l3 = l1;
              } while (l1 >= 1000L);
              i((k)localObject2);
              localObject1 = this;
              localObject2 = localObject1;
              localObject3 = paramTimeUnit;
              break;
              i((k)localObject2);
              throw new InterruptedException();
            }
            localObject3 = c;
            localObject1 = localObject3;
          } while (localObject3 != k.c);
        }
        paramTimeUnit = a;
        Objects.requireNonNull(paramTimeUnit);
        return (V)g(paramTimeUnit);
      }
      localObject1 = this;
      Object localObject2 = localObject1;
      Object localObject3 = paramTimeUnit;
      while (l1 > 0L)
      {
        localObject4 = a;
        if (localObject4 != null) {
          j = 1;
        } else {
          j = 0;
        }
        if ((j & (localObject4 instanceof f ^ true)) != 0) {
          return (V)g(localObject4);
        }
        if (!Thread.interrupted()) {
          l1 = l2 - System.nanoTime();
        } else {
          throw new InterruptedException();
        }
      }
      Object localObject4 = ((a)localObject1).toString();
      String str = paramTimeUnit.toString();
      localObject2 = Locale.ROOT;
      str = str.toLowerCase((Locale)localObject2);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Waited ");
      localStringBuilder.append(paramLong);
      localStringBuilder.append(" ");
      localStringBuilder.append(paramTimeUnit.toString().toLowerCase((Locale)localObject2));
      localObject2 = localStringBuilder.toString();
      paramTimeUnit = (TimeUnit)localObject2;
      if (l1 + 1000L < 0L)
      {
        localObject2 = g.d((String)localObject2, " (plus ");
        l2 = -l1;
        paramLong = ((TimeUnit)localObject3).convert(l2, TimeUnit.NANOSECONDS);
        l2 -= ((TimeUnit)localObject3).toNanos(paramLong);
        boolean bool = paramLong < 0L;
        j = i;
        if (bool) {
          if (l2 > 1000L) {
            j = i;
          } else {
            j = 0;
          }
        }
        paramTimeUnit = (TimeUnit)localObject2;
        if (bool)
        {
          paramTimeUnit = new StringBuilder();
          paramTimeUnit.append((String)localObject2);
          paramTimeUnit.append(paramLong);
          paramTimeUnit.append(" ");
          paramTimeUnit.append(str);
          localObject3 = paramTimeUnit.toString();
          paramTimeUnit = (TimeUnit)localObject3;
          if (j != 0) {
            paramTimeUnit = g.d((String)localObject3, ",");
          }
          paramTimeUnit = g.d(paramTimeUnit, " ");
        }
        localObject3 = paramTimeUnit;
        if (j != 0)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(paramTimeUnit);
          ((StringBuilder)localObject3).append(l2);
          ((StringBuilder)localObject3).append(" nanoseconds ");
          localObject3 = ((StringBuilder)localObject3).toString();
        }
        paramTimeUnit = g.d((String)localObject3, "delay)");
      }
      if (((a)localObject1).isDone()) {
        throw new TimeoutException(g.d(paramTimeUnit, " but future completed as timeout expired"));
      }
      throw new TimeoutException(g.e(paramTimeUnit, " for ", (String)localObject4));
    }
    throw new InterruptedException();
  }
  
  public final String h()
  {
    if ((this instanceof ScheduledFuture))
    {
      StringBuilder localStringBuilder = f.l("remaining delay=[");
      localStringBuilder.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
      localStringBuilder.append(" ms]");
      return localStringBuilder.toString();
    }
    return null;
  }
  
  public final void i(k paramk)
  {
    a = null;
    paramk = c;
    if (paramk == k.c) {
      return;
    }
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = localObject2)
    {
      if (paramk == null) {
        return;
      }
      k localk = b;
      if (a != null)
      {
        localObject2 = paramk;
      }
      else
      {
        if (localObject1 != null)
        {
          b = localk;
          localObject2 = localObject1;
          if (a != null) {
            break label82;
          }
          break;
        }
        localObject2 = localObject1;
        if (!f.c(this, paramk, localk)) {
          break;
        }
      }
      label82:
      paramk = localk;
    }
  }
  
  public boolean isCancelled()
  {
    return a instanceof b;
  }
  
  public boolean isDone()
  {
    Object localObject = a;
    int i;
    if (localObject != null) {
      i = 1;
    } else {
      i = 0;
    }
    return (localObject instanceof f ^ true) & i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1;
    if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
      str1 = getClass().getSimpleName();
    } else {
      str1 = getClass().getName();
    }
    localStringBuilder.append(str1);
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("[status=");
    if (isCancelled())
    {
      localStringBuilder.append("CANCELLED");
    }
    else if (isDone())
    {
      b(localStringBuilder);
    }
    else
    {
      int i = localStringBuilder.length();
      localStringBuilder.append("PENDING");
      Object localObject2 = a;
      boolean bool = localObject2 instanceof f;
      str1 = null;
      if (bool)
      {
        localStringBuilder.append(", setFuture=[");
        ((f)localObject2).getClass();
        try
        {
          localStringBuilder.append(null);
        }
        catch (StackOverflowError localStackOverflowError1) {}catch (RuntimeException localRuntimeException1) {}
        localStringBuilder.append("Exception thrown from implementation: ");
        localStringBuilder.append(localRuntimeException1.getClass());
      }
      else
      {
        try
        {
          localObject2 = h();
          bool = i.a((String)localObject2);
          if (bool) {
            break label248;
          }
          Object localObject1 = localObject2;
        }
        catch (StackOverflowError localStackOverflowError2) {}catch (RuntimeException localRuntimeException2) {}
        localObject2 = f.l("Exception thrown from implementation: ");
        ((StringBuilder)localObject2).append(localRuntimeException2.getClass());
        String str2 = ((StringBuilder)localObject2).toString();
        label248:
        if (str2 == null) {
          break label273;
        }
        localStringBuilder.append(", info=[");
        localStringBuilder.append(str2);
      }
      localStringBuilder.append("]");
      label273:
      if (isDone())
      {
        localStringBuilder.delete(i, localStringBuilder.length());
        b(localStringBuilder);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static abstract class a
  {
    public abstract boolean a(a<?> parama, a.d paramd1, a.d paramd2);
    
    public abstract boolean b(a<?> parama, Object paramObject1, Object paramObject2);
    
    public abstract boolean c(a<?> parama, a.k paramk1, a.k paramk2);
    
    public abstract a.d d(a<?> parama, a.d paramd);
    
    public abstract a.k e(a parama);
    
    public abstract void f(a.k paramk1, a.k paramk2);
    
    public abstract void g(a.k paramk, Thread paramThread);
  }
  
  public static final class b
  {
    public static final b b;
    public static final b c;
    public final Throwable a;
    
    static
    {
      if (a.d)
      {
        c = null;
        b = null;
      }
      else
      {
        c = new b(null, false);
        b = new b(null, true);
      }
    }
    
    public b(Throwable paramThrowable, boolean paramBoolean)
    {
      a = paramThrowable;
    }
  }
  
  public static final class c
  {
    public final Throwable a;
    
    static
    {
      new c(new a());
    }
    
    public c(Throwable paramThrowable)
    {
      paramThrowable.getClass();
      a = paramThrowable;
    }
    
    public final class a
      extends Throwable
    {
      public a()
      {
        super();
      }
      
      public final Throwable fillInStackTrace()
      {
        return this;
      }
    }
  }
  
  public static final class d
  {
    public static final d d = new d();
    public final Runnable a;
    public final Executor b;
    public d c;
    
    public d()
    {
      a = null;
      b = null;
    }
    
    public d(Runnable paramRunnable, Executor paramExecutor)
    {
      a = paramRunnable;
      b = paramExecutor;
    }
  }
  
  public static final class e
    extends a.a
  {
    public final AtomicReferenceFieldUpdater<a.k, Thread> a;
    public final AtomicReferenceFieldUpdater<a.k, a.k> b;
    public final AtomicReferenceFieldUpdater<a, a.k> c;
    public final AtomicReferenceFieldUpdater<a, a.d> d;
    public final AtomicReferenceFieldUpdater<a, Object> e;
    
    public e(AtomicReferenceFieldUpdater<a.k, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<a.k, a.k> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<a, a.k> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, a.d> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, Object> paramAtomicReferenceFieldUpdater4)
    {
      a = paramAtomicReferenceFieldUpdater;
      b = paramAtomicReferenceFieldUpdater1;
      c = paramAtomicReferenceFieldUpdater2;
      d = paramAtomicReferenceFieldUpdater3;
      e = paramAtomicReferenceFieldUpdater4;
    }
    
    public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramd1, paramd2))
        {
          bool = true;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(parama) == paramd1);
      boolean bool = false;
      return bool;
    }
    
    public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = e;
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramObject1, paramObject2))
        {
          bool = true;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(parama) == paramObject1);
      boolean bool = false;
      return bool;
    }
    
    public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = c;
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramk1, paramk2))
        {
          bool = true;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(parama) == paramk1);
      boolean bool = false;
      return bool;
    }
    
    public final a.d d(a<?> parama, a.d paramd)
    {
      return (a.d)d.getAndSet(parama, paramd);
    }
    
    public final a.k e(a parama)
    {
      a.k localk = a.k.c;
      return (a.k)c.getAndSet(parama, localk);
    }
    
    public final void f(a.k paramk1, a.k paramk2)
    {
      b.lazySet(paramk1, paramk2);
    }
    
    public final void g(a.k paramk, Thread paramThread)
    {
      a.lazySet(paramk, paramThread);
    }
  }
  
  public static final class f<V>
    implements Runnable
  {
    public final void run()
    {
      throw null;
    }
  }
  
  public static final class g
    extends a.a
  {
    public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      try
      {
        if (b == paramd1)
        {
          b = paramd2;
          return true;
        }
        return false;
      }
      finally {}
    }
    
    public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
    {
      try
      {
        if (a == paramObject1)
        {
          a = paramObject2;
          return true;
        }
        return false;
      }
      finally {}
    }
    
    public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
    {
      try
      {
        if (c == paramk1)
        {
          c = paramk2;
          return true;
        }
        return false;
      }
      finally {}
    }
    
    public final a.d d(a<?> parama, a.d paramd)
    {
      try
      {
        a.d locald = b;
        if (locald != paramd) {
          b = paramd;
        }
        return locald;
      }
      finally {}
    }
    
    public final a.k e(a parama)
    {
      a.k localk1 = a.k.c;
      try
      {
        a.k localk2 = c;
        if (localk2 != localk1) {
          c = localk1;
        }
        return localk2;
      }
      finally {}
    }
    
    public final void f(a.k paramk1, a.k paramk2)
    {
      b = paramk2;
    }
    
    public final void g(a.k paramk, Thread paramThread)
    {
      a = paramThread;
    }
  }
  
  public static abstract interface h<V>
    extends e<V>
  {}
  
  public static abstract class i<V>
    extends a<V>
    implements a.h<V>
  {
    public final boolean cancel(boolean paramBoolean)
    {
      return super.cancel(paramBoolean);
    }
    
    public final void f(Runnable paramRunnable, Executor paramExecutor)
    {
      super.f(paramRunnable, paramExecutor);
    }
    
    public final V get()
    {
      return (V)super.get();
    }
    
    public final V get(long paramLong, TimeUnit paramTimeUnit)
    {
      return (V)super.get(paramLong, paramTimeUnit);
    }
    
    public final boolean isCancelled()
    {
      return a instanceof a.b;
    }
    
    public final boolean isDone()
    {
      return super.isDone();
    }
  }
  
  public static final class j
    extends a.a
  {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    
    /* Error */
    static
    {
      // Byte code:
      //   0: invokestatic 33	sun/misc/Unsafe:getUnsafe	()Lsun/misc/Unsafe;
      //   3: astore_0
      //   4: goto +20 -> 24
      //   7: astore_0
      //   8: new 9	s7/a$j$a
      //   11: astore_0
      //   12: aload_0
      //   13: invokespecial 36	s7/a$j$a:<init>	()V
      //   16: aload_0
      //   17: invokestatic 42	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
      //   20: checkcast 29	sun/misc/Unsafe
      //   23: astore_0
      //   24: aload_0
      //   25: ldc 6
      //   27: ldc 43
      //   29: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   32: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   35: putstatic 55	s7/a$j:c	J
      //   38: aload_0
      //   39: ldc 6
      //   41: ldc 56
      //   43: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   46: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   49: putstatic 58	s7/a$j:b	J
      //   52: aload_0
      //   53: ldc 6
      //   55: ldc 59
      //   57: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   60: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   63: putstatic 61	s7/a$j:d	J
      //   66: aload_0
      //   67: ldc 63
      //   69: ldc 59
      //   71: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   74: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   77: putstatic 65	s7/a$j:e	J
      //   80: aload_0
      //   81: ldc 63
      //   83: ldc 56
      //   85: invokevirtual 49	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   88: invokevirtual 53	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
      //   91: putstatic 67	s7/a$j:f	J
      //   94: aload_0
      //   95: putstatic 69	s7/a$j:a	Lsun/misc/Unsafe;
      //   98: return
      //   99: astore_0
      //   100: aload_0
      //   101: athrow
      //   102: astore_0
      //   103: new 27	java/lang/RuntimeException
      //   106: dup
      //   107: aload_0
      //   108: invokespecial 72	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
      //   111: athrow
      //   112: astore_0
      //   113: new 27	java/lang/RuntimeException
      //   116: dup
      //   117: ldc 74
      //   119: aload_0
      //   120: invokevirtual 78	java/security/PrivilegedActionException:getCause	()Ljava/lang/Throwable;
      //   123: invokespecial 81	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   126: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   3	1	0	localUnsafe	Unsafe
      //   7	1	0	localSecurityException	SecurityException
      //   11	84	0	localObject	Object
      //   99	2	0	localRuntimeException	RuntimeException
      //   102	6	0	localNoSuchFieldException	NoSuchFieldException
      //   112	8	0	localPrivilegedActionException	java.security.PrivilegedActionException
      // Exception table:
      //   from	to	target	type
      //   0	4	7	java/lang/SecurityException
      //   24	98	99	java/lang/RuntimeException
      //   24	98	102	java/lang/NoSuchFieldException
      //   8	24	112	java/security/PrivilegedActionException
    }
    
    public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
    {
      return b.a(a, parama, b, paramd1, paramd2);
    }
    
    public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
    {
      return b.a(a, parama, d, paramObject1, paramObject2);
    }
    
    public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
    {
      return b.a(a, parama, c, paramk1, paramk2);
    }
    
    public final a.d d(a<?> parama, a.d paramd)
    {
      a.d locald;
      do
      {
        locald = b;
        if (paramd == locald) {
          return locald;
        }
      } while (!a(parama, locald, paramd));
      return locald;
    }
    
    public final a.k e(a parama)
    {
      a.k localk1 = a.k.c;
      a.k localk2;
      do
      {
        localk2 = c;
        if (localk1 == localk2) {
          return localk2;
        }
      } while (!c(parama, localk2, localk1));
      return localk2;
    }
    
    public final void f(a.k paramk1, a.k paramk2)
    {
      a.putObject(paramk1, f, paramk2);
    }
    
    public final void g(a.k paramk, Thread paramThread)
    {
      a.putObject(paramk, e, paramThread);
    }
    
    public final class a
      implements PrivilegedExceptionAction<Unsafe>
    {
      public static Unsafe a()
      {
        for (Object localObject : Unsafe.class.getDeclaredFields())
        {
          ((AccessibleObject)localObject).setAccessible(true);
          localObject = ((Field)localObject).get(null);
          if (Unsafe.class.isInstance(localObject)) {
            return (Unsafe)Unsafe.class.cast(localObject);
          }
        }
        throw new NoSuchFieldError("the Unsafe");
      }
    }
  }
  
  public static final class k
  {
    public static final k c = new k(0);
    public volatile Thread a;
    public volatile k b;
    
    public k()
    {
      a.f.g(this, Thread.currentThread());
    }
    
    public k(int paramInt) {}
  }
}

/* Location:
 * Qualified Name:     s7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */