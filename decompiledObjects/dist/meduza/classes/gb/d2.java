package gb;

import eb.e1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class d2
  implements Runnable
{
  public d2(r1.m paramm) {}
  
  public final void run()
  {
    if (a.b.get() == r1.k0) {
      a.b.set(null);
    }
    ??? = a.e.C;
    if (??? != null)
    {
      ??? = ((Collection)???).iterator();
      while (((Iterator)???).hasNext()) {
        ((r1.m.e)((Iterator)???).next()).a("Channel is forcefully shutdown", null);
      }
    }
    r1.p localp = a.e.G;
    e1 locale1 = r1.g0;
    localp.a(locale1);
    synchronized (a)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(b);
      ??? = localArrayList.iterator();
      while (((Iterator)???).hasNext()) {
        ((s)((Iterator)???).next()).n(locale1);
      }
      d.F.h(locale1);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     gb.d2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */