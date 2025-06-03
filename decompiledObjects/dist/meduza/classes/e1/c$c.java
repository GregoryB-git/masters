package e1;

import java.util.concurrent.atomic.AtomicBoolean;

public final class c$c
  implements Runnable
{
  public c$c(c paramc, Object paramObject) {}
  
  public final void run()
  {
    c localc = b;
    Object localObject = a;
    if (c.get()) {
      localc.b(localObject);
    } else {
      localc.c(localObject);
    }
    b = 3;
  }
}

/* Location:
 * Qualified Name:     e1.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */