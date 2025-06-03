package z3;

import h5.e;
import h5.i;
import h5.k;
import java.util.ArrayDeque;
import x6.b;

public abstract class j<I extends g, O extends h, E extends f>
  implements d<I, O, E>
{
  public final a a;
  public final Object b = new Object();
  public final ArrayDeque<I> c = new ArrayDeque();
  public final ArrayDeque<O> d = new ArrayDeque();
  public final I[] e;
  public final O[] f;
  public int g;
  public int h;
  public I i;
  public i j;
  public boolean k;
  public boolean l;
  
  public j(I[] paramArrayOfI, O[] paramArrayOfO)
  {
    e = paramArrayOfI;
    g = paramArrayOfI.length;
    int m = 0;
    for (int n = 0; n < g; n++) {
      e[n] = new k();
    }
    f = paramArrayOfO;
    h = paramArrayOfO.length;
    for (n = m; n < h; n++) {
      f[n] = new e((h5.f)this);
    }
    paramArrayOfI = new a((h5.f)this);
    a = paramArrayOfI;
    paramArrayOfI.start();
  }
  
  public final Object b()
  {
    Object localObject1 = b;
    label54:
    try
    {
      Object localObject2 = j;
      if (localObject2 == null)
      {
        if (d.isEmpty()) {
          localObject2 = null;
        } else {
          localObject2 = (h)d.removeFirst();
        }
        return localObject2;
      }
    }
    finally
    {
      break label54;
      throw ((Throwable)localObject3);
    }
  }
  
  public final Object c()
  {
    Object localObject1 = b;
    label84:
    try
    {
      Object localObject2 = j;
      if (localObject2 == null)
      {
        boolean bool;
        if (i == null) {
          bool = true;
        } else {
          bool = false;
        }
        b.H(bool);
        int m = g;
        if (m == 0)
        {
          localObject2 = null;
        }
        else
        {
          localObject2 = e;
          m--;
          g = m;
          localObject2 = localObject2[m];
        }
        i = ((g)localObject2);
        return localObject2;
      }
    }
    finally
    {
      break label84;
      throw ((Throwable)localObject3);
    }
  }
  
  public final void d(k paramk)
  {
    Object localObject1 = b;
    label100:
    try
    {
      localObject2 = j;
      if (localObject2 == null)
      {
        localObject2 = i;
        int m = 1;
        boolean bool;
        if (paramk == localObject2) {
          bool = true;
        } else {
          bool = false;
        }
        b.q(bool);
        c.addLast(paramk);
        if ((c.isEmpty()) || (h <= 0)) {
          m = 0;
        }
        if (m != 0) {
          b.notify();
        }
        i = null;
        return;
      }
    }
    finally
    {
      Object localObject2;
      break label100;
      throw ((Throwable)localObject2);
    }
  }
  
  public abstract i e(Throwable paramThrowable);
  
  public abstract i f(g paramg, h paramh, boolean paramBoolean);
  
  public final void flush()
  {
    synchronized (b)
    {
      k = true;
      g localg = i;
      g[] arrayOfg;
      int m;
      if (localg != null)
      {
        localg.o();
        arrayOfg = e;
        m = g;
        g = (m + 1);
        arrayOfg[m] = localg;
        i = null;
      }
      while (!c.isEmpty())
      {
        localg = (g)c.removeFirst();
        localg.o();
        arrayOfg = e;
        m = g;
        g = (m + 1);
        arrayOfg[m] = localg;
      }
      while (!d.isEmpty()) {
        ((h)d.removeFirst()).o();
      }
      return;
    }
  }
  
  public final boolean g()
  {
    for (;;)
    {
      synchronized (b)
      {
        if (l) {
          break;
        }
        if ((!c.isEmpty()) && (h > 0)) {
          m = 1;
        }
      }
      m = 0;
      if (m != 0) {
        break;
      }
      b.wait();
    }
    if (l) {
      return false;
    }
    ??? = (g)c.removeFirst();
    Object localObject7 = f;
    int m = h - 1;
    h = m;
    localObject7 = localObject7[m];
    boolean bool = k;
    k = false;
    if (((a)???).m(4))
    {
      ((a)localObject7).l(4);
    }
    else
    {
      if (((a)???).n()) {
        ((a)localObject7).l(Integer.MIN_VALUE);
      }
      if (((a)???).m(134217728)) {
        ((a)localObject7).l(134217728);
      }
      try
      {
        ??? = f((g)???, (h)localObject7, bool);
      }
      catch (OutOfMemoryError localOutOfMemoryError) {}catch (RuntimeException localRuntimeException) {}
      i locali = e(localRuntimeException);
      if (locali != null) {
        synchronized (b)
        {
          j = locali;
          return false;
        }
      }
    }
    synchronized (b)
    {
      if ((k) || (((a)localObject7).n())) {
        ((h)localObject7).o();
      } else {
        d.addLast(localObject7);
      }
      ((g)???).o();
      localObject7 = e;
      m = g;
      g = (m + 1);
      localObject7[m] = ???;
      return true;
    }
    throw ((Throwable)localObject6);
  }
  
  public final void release()
  {
    synchronized (b)
    {
      l = true;
      b.notify();
      try
      {
        a.join();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
      return;
    }
  }
  
  public final class a
    extends Thread
  {
    public a()
    {
      super();
    }
    
    public final void run()
    {
      j localj = j.this;
      localj.getClass();
      try
      {
        boolean bool;
        do
        {
          bool = localj.g();
        } while (bool);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        throw new IllegalStateException(localInterruptedException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     z3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */