package gb;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n7.p;

public final class o1$b
  implements Runnable
{
  public o1$b(o1 paramo1) {}
  
  public final void run()
  {
    synchronized (a)
    {
      o1 localo12 = a;
      g = null;
      int i = e;
      if (i == 2)
      {
        i = 1;
        e = 4;
        f = a.schedule(h, k, TimeUnit.NANOSECONDS);
      }
      else
      {
        if (i == 3)
        {
          ScheduledExecutorService localScheduledExecutorService = a;
          p1 localp1 = i;
          long l = j;
          p localp = b;
          TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
          g = localScheduledExecutorService.schedule(localp1, l - localp.a(localTimeUnit), localTimeUnit);
          a.e = 2;
        }
        i = 0;
      }
      if (i != 0) {
        a.c.b();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     gb.o1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */