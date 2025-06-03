package xc;

import ec.i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public final class c$a
{
  public static c a()
  {
    Object localObject = c.l;
    i.b(localObject);
    localObject = f;
    long l = System.nanoTime();
    c localc1 = null;
    if (localObject == null)
    {
      c.i.await(c.j, TimeUnit.MILLISECONDS);
      c localc2 = c.l;
      i.b(localc2);
      localObject = localc1;
      if (f == null)
      {
        localObject = localc1;
        if (System.nanoTime() - l >= c.k) {
          localObject = c.l;
        }
      }
      return (c)localObject;
    }
    l = g - l;
    if (l > 0L)
    {
      c.i.await(l, TimeUnit.NANOSECONDS);
      return null;
    }
    localc1 = c.l;
    i.b(localc1);
    f = f;
    f = null;
    return (c)localObject;
  }
}

/* Location:
 * Qualified Name:     xc.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */