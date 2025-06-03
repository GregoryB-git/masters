package u;

import b3.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class c$d
  implements e
{
  public final WeakReference o;
  public final a p = new a();
  
  public c$d(c.a parama)
  {
    o = new WeakReference(parama);
  }
  
  public boolean a(boolean paramBoolean)
  {
    return p.cancel(paramBoolean);
  }
  
  public boolean b(Object paramObject)
  {
    return p.z(paramObject);
  }
  
  public void c(Runnable paramRunnable, Executor paramExecutor)
  {
    p.c(paramRunnable, paramExecutor);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    c.a locala = (c.a)o.get();
    paramBoolean = p.cancel(paramBoolean);
    if ((paramBoolean) && (locala != null)) {
      locala.a();
    }
    return paramBoolean;
  }
  
  public boolean d(Throwable paramThrowable)
  {
    return p.C(paramThrowable);
  }
  
  public Object get()
  {
    return p.get();
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    return p.get(paramLong, paramTimeUnit);
  }
  
  public boolean isCancelled()
  {
    return p.isCancelled();
  }
  
  public boolean isDone()
  {
    return p.isDone();
  }
  
  public String toString()
  {
    return p.toString();
  }
  
  public class a
    extends a
  {
    public a() {}
    
    public String u()
    {
      c.a locala = (c.a)o.get();
      if (locala == null) {
        return "Completer object has been garbage collected, future will fail soon";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("tag=[");
      localStringBuilder.append(a);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     u.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */