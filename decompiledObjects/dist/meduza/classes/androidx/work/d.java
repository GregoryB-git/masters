package androidx.work;

import android.content.Context;
import f;
import java.util.UUID;
import s7.e;

public abstract class d
{
  public Context a;
  public WorkerParameters b;
  public volatile int c = 65280;
  public boolean d;
  
  public d(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    if (paramContext != null)
    {
      if (paramWorkerParameters != null)
      {
        a = paramContext;
        b = paramWorkerParameters;
        return;
      }
      throw new IllegalArgumentException("WorkerParameters is null");
    }
    throw new IllegalArgumentException("Application Context is null");
  }
  
  public final Context a()
  {
    return a;
  }
  
  public e<o2.d> b()
  {
    z2.c localc = new z2.c();
    localc.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
    return localc;
  }
  
  public final UUID c()
  {
    return b.a;
  }
  
  public final c e()
  {
    return b.b;
  }
  
  public final boolean f()
  {
    boolean bool;
    if (c != 65280) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void g() {}
  
  public abstract z2.c h();
  
  public final void i(int paramInt)
  {
    c = paramInt;
    g();
  }
  
  public static abstract class a
  {
    public static final class a
      extends d.a
    {
      public final c a;
      
      public a()
      {
        a = localc;
      }
      
      public final boolean equals(Object paramObject)
      {
        if (this == paramObject) {
          return true;
        }
        if ((paramObject != null) && (a.class == paramObject.getClass()))
        {
          paramObject = (a)paramObject;
          return a.equals(a);
        }
        return false;
      }
      
      public final int hashCode()
      {
        int i = a.class.getName().hashCode();
        return a.hashCode() + i * 31;
      }
      
      public final String toString()
      {
        StringBuilder localStringBuilder = f.l("Failure {mOutputData=");
        localStringBuilder.append(a);
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends d.a
    {
      public final boolean equals(Object paramObject)
      {
        boolean bool = true;
        if (this == paramObject) {
          return true;
        }
        if ((paramObject == null) || (b.class != paramObject.getClass())) {
          bool = false;
        }
        return bool;
      }
      
      public final int hashCode()
      {
        return b.class.getName().hashCode();
      }
      
      public final String toString()
      {
        return "Retry";
      }
    }
    
    public static final class c
      extends d.a
    {
      public final c a;
      
      public c()
      {
        this(c.c);
      }
      
      public c(c paramc)
      {
        a = paramc;
      }
      
      public final boolean equals(Object paramObject)
      {
        if (this == paramObject) {
          return true;
        }
        if ((paramObject != null) && (c.class == paramObject.getClass()))
        {
          paramObject = (c)paramObject;
          return a.equals(a);
        }
        return false;
      }
      
      public final int hashCode()
      {
        int i = c.class.getName().hashCode();
        return a.hashCode() + i * 31;
      }
      
      public final String toString()
      {
        StringBuilder localStringBuilder = f.l("Success {mOutputData=");
        localStringBuilder.append(a);
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */