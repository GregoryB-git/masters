package nb;

import eb.d;
import eb.d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public final class i$e
  implements i.i
{
  public final i.f a;
  public final d b;
  
  public i$e(i.f paramf, d paramd)
  {
    a = paramf;
    b = paramd;
  }
  
  public final void a(i.b paramb, long paramLong)
  {
    Object localObject = i.h(paramb, a.f.d.intValue());
    if ((((ArrayList)localObject).size() >= a.f.c.intValue()) && (((ArrayList)localObject).size() != 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        i.a locala = (i.a)((Iterator)localObject).next();
        if (paramb.d() >= a.d.intValue()) {
          return;
        }
        if (locala.c() >= a.f.d.intValue())
        {
          double d = a.f.a.intValue() / 100.0D;
          if (c.b.get() / locala.c() > d)
          {
            b.b(d.a.a, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", new Object[] { locala, Double.valueOf(c.b.get() / locala.c()) });
            if (new Random().nextInt(100) < a.f.b.intValue()) {
              locala.b(paramLong);
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */