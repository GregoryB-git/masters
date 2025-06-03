package u;

import b3.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class c
{
  public static e a(c paramc)
  {
    a locala = new a();
    d locald = new d(locala);
    b = locald;
    a = paramc.getClass();
    try
    {
      paramc = paramc.a(locala);
      if (paramc != null) {
        a = paramc;
      }
    }
    catch (Exception paramc)
    {
      locald.d(paramc);
    }
    return locald;
  }
  
  public static final class a
  {
    public Object a;
    public c.d b;
    public d c = d.G();
    public boolean d;
    
    public void a()
    {
      a = null;
      b = null;
      c.z(null);
    }
    
    public boolean b(Object paramObject)
    {
      boolean bool = true;
      d = true;
      c.d locald = b;
      if ((locald == null) || (!locald.b(paramObject))) {
        bool = false;
      }
      if (bool) {
        d();
      }
      return bool;
    }
    
    public boolean c()
    {
      boolean bool = true;
      d = true;
      c.d locald = b;
      if ((locald == null) || (!locald.a(true))) {
        bool = false;
      }
      if (bool) {
        d();
      }
      return bool;
    }
    
    public final void d()
    {
      a = null;
      b = null;
      c = null;
    }
    
    public boolean e(Throwable paramThrowable)
    {
      boolean bool = true;
      d = true;
      c.d locald = b;
      if ((locald == null) || (!locald.d(paramThrowable))) {
        bool = false;
      }
      if (bool) {
        d();
      }
      return bool;
    }
    
    public void finalize()
    {
      Object localObject = b;
      if ((localObject != null) && (!((c.d)localObject).isDone()))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
        localStringBuilder.append(a);
        ((c.d)localObject).d(new c.b(localStringBuilder.toString()));
      }
      if (!d)
      {
        localObject = c;
        if (localObject != null) {
          ((d)localObject).z(null);
        }
      }
    }
  }
  
  public static final class b
    extends Throwable
  {
    public b(String paramString)
    {
      super();
    }
    
    public Throwable fillInStackTrace()
    {
      return this;
    }
  }
  
  public static abstract interface c
  {
    public abstract Object a(c.a parama);
  }
  
  public static final class d
    implements e
  {
    public final WeakReference o;
    public final a p = new a();
    
    public d(c.a parama)
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
}

/* Location:
 * Qualified Name:     u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */