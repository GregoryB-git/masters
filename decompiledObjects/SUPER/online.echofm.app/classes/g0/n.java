package g0;

import android.os.Looper;
import android.os.Message;
import d0.p;
import d0.p.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class n
{
  public final c a;
  public final k b;
  public final b c;
  public final CopyOnWriteArraySet d;
  public final ArrayDeque e;
  public final ArrayDeque f;
  public final Object g;
  public boolean h;
  public boolean i;
  
  public n(Looper paramLooper, c paramc, b paramb)
  {
    this(new CopyOnWriteArraySet(), paramLooper, paramc, paramb, true);
  }
  
  public n(CopyOnWriteArraySet paramCopyOnWriteArraySet, Looper paramLooper, c paramc, b paramb, boolean paramBoolean)
  {
    a = paramc;
    d = paramCopyOnWriteArraySet;
    c = paramb;
    g = new Object();
    e = new ArrayDeque();
    f = new ArrayDeque();
    b = paramc.e(paramLooper, new l(this));
    i = paramBoolean;
  }
  
  public void c(Object paramObject)
  {
    a.e(paramObject);
    CopyOnWriteArraySet localCopyOnWriteArraySet;
    c localc;
    synchronized (g)
    {
      if (h) {
        return;
      }
    }
  }
  
  public n d(Looper paramLooper, c paramc, b paramb)
  {
    return new n(d, paramLooper, paramc, paramb, i);
  }
  
  public n e(Looper paramLooper, b paramb)
  {
    return d(paramLooper, a, paramb);
  }
  
  public void f()
  {
    l();
    if (f.isEmpty()) {
      return;
    }
    if (!b.a(1))
    {
      k localk = b;
      localk.d(localk.k(1));
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
  
  public final boolean g(Message paramMessage)
  {
    paramMessage = d.iterator();
    do
    {
      if (!paramMessage.hasNext()) {
        break;
      }
      ((c)paramMessage.next()).b(c);
    } while (!b.a(1));
    return true;
  }
  
  public void i(int paramInt, a parama)
  {
    l();
    CopyOnWriteArraySet localCopyOnWriteArraySet = new CopyOnWriteArraySet(d);
    f.add(new m(localCopyOnWriteArraySet, paramInt, parama));
  }
  
  public void j()
  {
    l();
    synchronized (g)
    {
      h = true;
      ??? = d.iterator();
      while (((Iterator)???).hasNext()) {
        ((c)((Iterator)???).next()).c(c);
      }
      d.clear();
      return;
    }
  }
  
  public void k(int paramInt, a parama)
  {
    i(paramInt, parama);
    f();
  }
  
  public final void l()
  {
    if (!i) {
      return;
    }
    boolean bool;
    if (Thread.currentThread() == b.i().getThread()) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
  }
  
  public static abstract interface a
  {
    public abstract void invoke(Object paramObject);
  }
  
  public static abstract interface b
  {
    public abstract void a(Object paramObject, p paramp);
  }
  
  public static final class c
  {
    public final Object a;
    public p.b b;
    public boolean c;
    public boolean d;
    
    public c(Object paramObject)
    {
      a = paramObject;
      b = new p.b();
    }
    
    public void a(int paramInt, n.a parama)
    {
      if (!d)
      {
        if (paramInt != -1) {
          b.a(paramInt);
        }
        c = true;
        parama.invoke(a);
      }
    }
    
    public void b(n.b paramb)
    {
      if ((!d) && (c))
      {
        p localp = b.e();
        b = new p.b();
        c = false;
        paramb.a(a, localp);
      }
    }
    
    public void c(n.b paramb)
    {
      d = true;
      if (c)
      {
        c = false;
        paramb.a(a, b.e());
      }
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (c.class == paramObject.getClass())) {
        return a.equals(a);
      }
      return false;
    }
    
    public int hashCode()
    {
      return a.hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     g0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */