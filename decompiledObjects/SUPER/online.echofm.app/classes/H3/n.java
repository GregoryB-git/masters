package H3;

import V2.b;
import V2.j;
import V2.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n
{
  public final Executor a;
  public j b = m.e(null);
  public final Object c = new Object();
  public final ThreadLocal d = new ThreadLocal();
  
  public n(Executor paramExecutor)
  {
    a = paramExecutor;
    paramExecutor.execute(new a());
  }
  
  public void b()
  {
    if (e()) {
      return;
    }
    throw new IllegalStateException("Not running on background worker thread as intended.");
  }
  
  public Executor c()
  {
    return a;
  }
  
  public final j d(j paramj)
  {
    return paramj.g(a, new d());
  }
  
  public final boolean e()
  {
    return Boolean.TRUE.equals(d.get());
  }
  
  public final b f(final Callable paramCallable)
  {
    return new c(paramCallable);
  }
  
  public j g(final Runnable paramRunnable)
  {
    return h(new b(paramRunnable));
  }
  
  public j h(Callable paramCallable)
  {
    synchronized (c)
    {
      paramCallable = b.g(a, f(paramCallable));
      b = d(paramCallable);
      return paramCallable;
    }
  }
  
  public j i(Callable paramCallable)
  {
    synchronized (c)
    {
      paramCallable = b.h(a, f(paramCallable));
      b = d(paramCallable);
      return paramCallable;
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      n.a(n.this).set(Boolean.TRUE);
    }
  }
  
  public class b
    implements Callable
  {
    public b(Runnable paramRunnable) {}
    
    public Void a()
    {
      paramRunnable.run();
      return null;
    }
  }
  
  public class c
    implements b
  {
    public c(Callable paramCallable) {}
    
    public Object a(j paramj)
    {
      return paramCallable.call();
    }
  }
  
  public class d
    implements b
  {
    public d() {}
    
    public Void b(j paramj)
    {
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     H3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */