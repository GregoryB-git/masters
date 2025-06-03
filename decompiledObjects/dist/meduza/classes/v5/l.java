package v5;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n1.a;

public final class l<T>
{
  public final c a;
  public final k b;
  public final b<T> c;
  public final CopyOnWriteArraySet<c<T>> d;
  public final ArrayDeque<Runnable> e;
  public final ArrayDeque<Runnable> f;
  public final Object g;
  public boolean h;
  public boolean i;
  
  public l(Looper paramLooper, c paramc, b<T> paramb)
  {
    this(new CopyOnWriteArraySet(), paramLooper, paramc, paramb);
  }
  
  public l(CopyOnWriteArraySet<c<T>> paramCopyOnWriteArraySet, Looper paramLooper, c paramc, b<T> paramb)
  {
    a = paramc;
    d = paramCopyOnWriteArraySet;
    c = paramb;
    g = new Object();
    e = new ArrayDeque();
    f = new ArrayDeque();
    b = paramc.b(paramLooper, new s5.b(this, 1));
    i = true;
  }
  
  public final void a(T paramT)
  {
    paramT.getClass();
    synchronized (g)
    {
      if (h) {
        return;
      }
      CopyOnWriteArraySet localCopyOnWriteArraySet = d;
      c localc = new v5/l$c;
      localc.<init>(paramT);
      localCopyOnWriteArraySet.add(localc);
      return;
    }
  }
  
  public final void b()
  {
    f();
    if (f.isEmpty()) {
      return;
    }
    if (!b.a())
    {
      k localk = b;
      localk.c(localk.f(0));
    }
    boolean bool = e.isEmpty();
    e.addAll(f);
    f.clear();
    if ((bool ^ true)) {
      return;
    }
    while (!e.isEmpty())
    {
      ((Runnable)e.peekFirst()).run();
      e.removeFirst();
    }
  }
  
  public final void c(int paramInt, a<T> parama)
  {
    f();
    CopyOnWriteArraySet localCopyOnWriteArraySet = new CopyOnWriteArraySet(d);
    f.add(new a(localCopyOnWriteArraySet, paramInt, parama, 1));
  }
  
  public final void d()
  {
    f();
    synchronized (g)
    {
      h = true;
      ??? = d.iterator();
      while (((Iterator)???).hasNext())
      {
        c localc = (c)((Iterator)???).next();
        b localb = c;
        d = true;
        if (c)
        {
          c = false;
          localb.d(a, b.b());
        }
      }
      d.clear();
      return;
    }
  }
  
  public final void e(int paramInt, a<T> parama)
  {
    c(paramInt, parama);
    b();
  }
  
  public final void f()
  {
    if (!i) {
      return;
    }
    boolean bool;
    if (Thread.currentThread() == b.l().getThread()) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
  }
  
  public static abstract interface a<T>
  {
    public abstract void invoke(T paramT);
  }
  
  public static abstract interface b<T>
  {
    public abstract void d(T paramT, h paramh);
  }
  
  public static final class c<T>
  {
    public final T a;
    public h.a b;
    public boolean c;
    public boolean d;
    
    public c(T paramT)
    {
      a = paramT;
      b = new h.a();
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (c.class == paramObject.getClass())) {
        return a.equals(a);
      }
      return false;
    }
    
    public final int hashCode()
    {
      return a.hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     v5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */