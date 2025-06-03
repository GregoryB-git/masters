package s;

import f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class d<T>
  implements s7.e<T>
{
  public final WeakReference<b<T>> a;
  public final a b = new a();
  
  public d(b<T> paramb)
  {
    a = new WeakReference(paramb);
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    b localb = (b)a.get();
    paramBoolean = b.cancel(paramBoolean);
    if ((paramBoolean) && (localb != null))
    {
      a = null;
      b = null;
      c.p(null);
    }
    return paramBoolean;
  }
  
  public final void f(Runnable paramRunnable, Executor paramExecutor)
  {
    b.f(paramRunnable, paramExecutor);
  }
  
  public final T get()
  {
    return (T)b.get();
  }
  
  public final T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (T)b.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return b.a instanceof a.b;
  }
  
  public final boolean isDone()
  {
    return b.isDone();
  }
  
  public final String toString()
  {
    return b.toString();
  }
  
  public final class a
    extends a<T>
  {
    public a() {}
    
    public final String n()
    {
      b localb = (b)a.get();
      if (localb == null) {
        return "Completer object has been garbage collected, future will fail soon";
      }
      StringBuilder localStringBuilder = f.l("tag=[");
      localStringBuilder.append(a);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     s.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */