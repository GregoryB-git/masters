package gb;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n7.p;

public final class x2$a
  implements Runnable
{
  public x2$a(x2 paramx2) {}
  
  public final void run()
  {
    Object localObject1 = a;
    if (!f)
    {
      g = null;
      return;
    }
    Object localObject2 = d;
    localObject1 = TimeUnit.NANOSECONDS;
    long l = ((p)localObject2).a((TimeUnit)localObject1);
    localObject2 = a;
    l = e - l;
    if (l > 0L)
    {
      g = a.schedule(new x2.b((x2)localObject2), l, (TimeUnit)localObject1);
    }
    else
    {
      f = false;
      g = null;
      c.run();
    }
  }
}

/* Location:
 * Qualified Name:     gb.x2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */