package V2;

import A2.n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class K
  extends j
{
  public final Object a = new Object();
  public final H b = new H();
  public boolean c;
  public volatile boolean d;
  public Object e;
  public Exception f;
  
  public final j a(Executor paramExecutor, d paramd)
  {
    b.a(new x(paramExecutor, paramd));
    y();
    return this;
  }
  
  public final j b(e parame)
  {
    Executor localExecutor = l.a;
    b.a(new z(localExecutor, parame));
    y();
    return this;
  }
  
  public final j c(Executor paramExecutor, e parame)
  {
    b.a(new z(paramExecutor, parame));
    y();
    return this;
  }
  
  public final j d(Executor paramExecutor, f paramf)
  {
    b.a(new B(paramExecutor, paramf));
    y();
    return this;
  }
  
  public final j e(Executor paramExecutor, g paramg)
  {
    b.a(new D(paramExecutor, paramg));
    y();
    return this;
  }
  
  public final j f(b paramb)
  {
    return g(l.a, paramb);
  }
  
  public final j g(Executor paramExecutor, b paramb)
  {
    K localK = new K();
    b.a(new t(paramExecutor, paramb, localK));
    y();
    return localK;
  }
  
  public final j h(Executor paramExecutor, b paramb)
  {
    K localK = new K();
    b.a(new v(paramExecutor, paramb, localK));
    y();
    return localK;
  }
  
  public final Exception i()
  {
    synchronized (a)
    {
      Exception localException = f;
      return localException;
    }
  }
  
  public final Object j()
  {
    Object localObject1 = a;
    label48:
    try
    {
      v();
      w();
      Object localObject2 = f;
      if (localObject2 == null)
      {
        localObject2 = e;
        return localObject2;
      }
    }
    finally
    {
      break label48;
      h localh = new V2/h;
      localh.<init>(localThrowable);
      throw localh;
    }
  }
  
  public final Object k(Class paramClass)
  {
    Object localObject = a;
    label71:
    try
    {
      v();
      w();
      if (!paramClass.isInstance(f))
      {
        paramClass = f;
        if (paramClass == null)
        {
          paramClass = e;
          return paramClass;
        }
      }
    }
    finally
    {
      break label71;
      h localh = new V2/h;
      localh.<init>(paramClass);
      throw localh;
      throw ((Throwable)paramClass.cast(f));
    }
  }
  
  public final boolean l()
  {
    return d;
  }
  
  public final boolean m()
  {
    synchronized (a)
    {
      boolean bool = c;
      return bool;
    }
  }
  
  public final boolean n()
  {
    boolean bool3;
    synchronized (a)
    {
      boolean bool1 = c;
      boolean bool2 = false;
      bool3 = bool2;
      if (bool1)
      {
        bool3 = bool2;
        if (!d)
        {
          bool3 = bool2;
          if (f == null) {
            bool3 = true;
          }
        }
      }
    }
    return bool3;
    throw ((Throwable)localObject2);
  }
  
  public final j o(i parami)
  {
    Executor localExecutor = l.a;
    K localK = new K();
    b.a(new F(localExecutor, parami, localK));
    y();
    return localK;
  }
  
  public final j p(Executor paramExecutor, i parami)
  {
    K localK = new K();
    b.a(new F(paramExecutor, parami, localK));
    y();
    return localK;
  }
  
  public final void q(Exception paramException)
  {
    n.j(paramException, "Exception must not be null");
    synchronized (a)
    {
      x();
      c = true;
      f = paramException;
      b.b(this);
      return;
    }
  }
  
  public final void r(Object paramObject)
  {
    synchronized (a)
    {
      x();
      c = true;
      e = paramObject;
      b.b(this);
      return;
    }
  }
  
  public final boolean s()
  {
    synchronized (a)
    {
      if (c) {
        return false;
      }
    }
  }
  
  public final boolean t(Exception paramException)
  {
    n.j(paramException, "Exception must not be null");
    synchronized (a)
    {
      if (c) {
        return false;
      }
    }
  }
  
  public final boolean u(Object paramObject)
  {
    synchronized (a)
    {
      if (c) {
        return false;
      }
    }
  }
  
  public final void v()
  {
    n.m(c, "Task is not yet complete");
  }
  
  public final void w()
  {
    if (!d) {
      return;
    }
    throw new CancellationException("Task is already canceled.");
  }
  
  public final void x()
  {
    if (!c) {
      return;
    }
    throw c.a(this);
  }
  
  public final void y()
  {
    synchronized (a)
    {
      if (!c) {
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     V2.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */