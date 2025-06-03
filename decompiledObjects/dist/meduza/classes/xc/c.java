package xc;

import ec.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;

public class c
  extends z
{
  public static final ReentrantLock h;
  public static final Condition i;
  public static final long j;
  public static final long k;
  public static c l;
  public boolean e;
  public c f;
  public long g;
  
  static
  {
    Object localObject = new ReentrantLock();
    h = (ReentrantLock)localObject;
    localObject = ((ReentrantLock)localObject).newCondition();
    i.d(localObject, "lock.newCondition()");
    i = (Condition)localObject;
    long l1 = TimeUnit.SECONDS.toMillis(60L);
    j = l1;
    k = TimeUnit.MILLISECONDS.toNanos(l1);
  }
  
  public final void h()
  {
    long l1 = c;
    boolean bool1 = a;
    boolean bool2 = l1 < 0L;
    if ((!bool2) && (!bool1)) {
      return;
    }
    ReentrantLock localReentrantLock = h;
    localReentrantLock.lock();
    try
    {
      if ((e ^ true))
      {
        e = true;
        if (l == null)
        {
          localObject1 = new xc/c;
          ((c)localObject1).<init>();
          l = (c)localObject1;
          localObject1 = new xc/c$b;
          ((b)localObject1).<init>();
          ((Thread)localObject1).start();
        }
        long l2 = System.nanoTime();
        if ((bool2) && (bool1)) {
          l1 = Math.min(l1, c() - l2);
        } else {
          if (!bool2) {
            break label127;
          }
        }
        l1 += l2;
        label127:
        if (bool1)
        {
          l1 = c();
          g = l1;
          c localc;
          for (localObject1 = l;; localObject1 = localc)
          {
            i.b(localObject1);
            localc = f;
            if ((localc == null) || (l1 - l2 < g - l2)) {
              break;
            }
          }
          f = localc;
          f = this;
          if (localObject1 == l) {
            i.signal();
          }
          localObject1 = h.a;
          return;
        }
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      Object localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Unbalanced enter/exit".toString());
      throw ((Throwable)localObject1);
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final boolean i()
  {
    ReentrantLock localReentrantLock = h;
    localReentrantLock.lock();
    try
    {
      boolean bool1 = e;
      boolean bool2 = false;
      if (bool1)
      {
        e = false;
        c localc;
        for (Object localObject1 = l; localObject1 != null; localObject1 = localc)
        {
          localc = f;
          if (localc == this)
          {
            f = f;
            f = null;
            break label76;
          }
        }
        bool2 = true;
      }
      label76:
      return bool2;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public IOException j(IOException paramIOException)
  {
    InterruptedIOException localInterruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null) {
      localInterruptedIOException.initCause(paramIOException);
    }
    return localInterruptedIOException;
  }
  
  public void k() {}
  
  public static final class a
  {
    public static c a()
    {
      Object localObject = c.l;
      i.b(localObject);
      localObject = f;
      long l = System.nanoTime();
      c localc1 = null;
      if (localObject == null)
      {
        c.i.await(c.j, TimeUnit.MILLISECONDS);
        c localc2 = c.l;
        i.b(localc2);
        localObject = localc1;
        if (f == null)
        {
          localObject = localc1;
          if (System.nanoTime() - l >= c.k) {
            localObject = c.l;
          }
        }
        return (c)localObject;
      }
      l = g - l;
      if (l > 0L)
      {
        c.i.await(l, TimeUnit.NANOSECONDS);
        return null;
      }
      localc1 = c.l;
      i.b(localc1);
      f = f;
      f = null;
      return (c)localObject;
    }
  }
  
  public static final class b
    extends Thread
  {
    public b()
    {
      super();
      setDaemon(true);
    }
    
    public final void run()
    {
      try
      {
        for (;;)
        {
          ReentrantLock localReentrantLock = c.h;
          localReentrantLock.lock();
          try
          {
            c localc = c.a.a();
            if (localc == c.l)
            {
              c.l = null;
              return;
            }
            h localh = h.a;
            localReentrantLock.unlock();
            if (localc != null) {
              localc.k();
            }
          }
          finally
          {
            localReentrantLock.unlock();
          }
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}

/* Location:
 * Qualified Name:     xc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */