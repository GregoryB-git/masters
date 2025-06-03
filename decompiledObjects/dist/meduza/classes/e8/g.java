package e8;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.a;
import s.a.b;

public final class g<V>
  extends a<V>
  implements ScheduledFuture<V>
{
  public final ScheduledFuture<?> p;
  
  public g(c<V> paramc)
  {
    p = paramc.b(new a());
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (Delayed)paramObject;
    return p.compareTo(paramObject);
  }
  
  public final long getDelay(TimeUnit paramTimeUnit)
  {
    return p.getDelay(paramTimeUnit);
  }
  
  public final void h()
  {
    ScheduledFuture localScheduledFuture = p;
    Object localObject = a;
    boolean bool;
    if (((localObject instanceof a.b)) && (a)) {
      bool = true;
    } else {
      bool = false;
    }
    localScheduledFuture.cancel(bool);
  }
  
  public final class a
    implements g.b<V>
  {
    public a() {}
  }
  
  public static abstract interface b<T> {}
  
  public static abstract interface c<T>
  {
    public abstract ScheduledFuture b(g.a parama);
  }
}

/* Location:
 * Qualified Name:     e8.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */