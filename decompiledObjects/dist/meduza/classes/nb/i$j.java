package nb;

import eb.d;
import eb.d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import x6.b;

public final class i$j
  implements i.i
{
  public final i.f a;
  public final d b;
  
  public i$j(i.f paramf, d paramd)
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.s("success rate ejection config is null", bool);
    a = paramf;
    b = paramd;
  }
  
  public final void a(i.b paramb, long paramLong)
  {
    Object localObject1 = i.h(paramb, a.e.d.intValue());
    if ((((ArrayList)localObject1).size() >= a.e.c.intValue()) && (((ArrayList)localObject1).size() != 0))
    {
      Object localObject2 = new ArrayList();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (i.a)localIterator.next();
        ((ArrayList)localObject2).add(Double.valueOf(c.a.get() / ((i.a)localObject3).c()));
      }
      Object localObject3 = ((ArrayList)localObject2).iterator();
      double d1 = 0.0D;
      for (double d2 = 0.0D; ((Iterator)localObject3).hasNext(); d2 += ((Double)((Iterator)localObject3).next()).doubleValue()) {}
      double d3 = d2 / ((ArrayList)localObject2).size();
      localObject3 = ((ArrayList)localObject2).iterator();
      for (d2 = d1; ((Iterator)localObject3).hasNext(); d2 += d1 * d1) {
        d1 = ((Double)((Iterator)localObject3).next()).doubleValue() - d3;
      }
      d1 = Math.sqrt(d2 / ((ArrayList)localObject2).size());
      d2 = d3 - a.e.a.intValue() / 1000.0F * d1;
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (i.a)((Iterator)localObject1).next();
        if (paramb.d() >= a.d.intValue()) {
          return;
        }
        if (c.a.get() / ((i.a)localObject2).c() < d2)
        {
          b.b(d.a.a, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", new Object[] { localObject2, Double.valueOf(c.a.get() / ((i.a)localObject2).c()), Double.valueOf(d3), Double.valueOf(d1), Double.valueOf(d2) });
          if (new Random().nextInt(100) < a.e.b.intValue()) {
            ((i.a)localObject2).b(paramLong);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */