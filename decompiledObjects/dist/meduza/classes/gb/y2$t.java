package gb;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public final class y2$t
{
  public final Object a;
  public Future<?> b;
  public boolean c;
  
  public y2$t(Object paramObject)
  {
    a = paramObject;
  }
  
  public final void a(ScheduledFuture paramScheduledFuture)
  {
    synchronized (a)
    {
      if (!c) {
        b = paramScheduledFuture;
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     gb.y2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */