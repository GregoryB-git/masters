package C3;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.a;

public class p
  extends a
  implements ScheduledFuture
{
  public final ScheduledFuture v;
  
  public p(c paramc)
  {
    v = paramc.a(new a());
  }
  
  public int K(Delayed paramDelayed)
  {
    return v.compareTo(paramDelayed);
  }
  
  public long getDelay(TimeUnit paramTimeUnit)
  {
    return v.getDelay(paramTimeUnit);
  }
  
  public void h()
  {
    v.cancel(F());
  }
  
  public class a
    implements p.b
  {
    public a() {}
    
    public void a(Throwable paramThrowable)
    {
      p.H(p.this, paramThrowable);
    }
    
    public void set(Object paramObject)
    {
      p.G(p.this, paramObject);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Throwable paramThrowable);
    
    public abstract void set(Object paramObject);
  }
  
  public static abstract interface c
  {
    public abstract ScheduledFuture a(p.b paramb);
  }
}

/* Location:
 * Qualified Name:     C3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */