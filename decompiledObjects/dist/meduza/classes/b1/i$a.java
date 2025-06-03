package b1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s1.c;
import s1.c.a;
import s1.e;

public final class i$a
  implements c.a
{
  public final void a(e parame)
  {
    ec.i.e(parame, "owner");
    if ((parame instanceof t0))
    {
      s0 locals0 = ((t0)parame).getViewModelStore();
      c localc = parame.getSavedStateRegistry();
      locals0.getClass();
      Iterator localIterator = new HashSet(a.keySet()).iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        ec.i.e(localObject, "key");
        localObject = (o0)a.get(localObject);
        ec.i.b(localObject);
        i.a((o0)localObject, localc, parame.getLifecycle());
      }
      if ((new HashSet(a.keySet()).isEmpty() ^ true)) {
        localc.d();
      }
      return;
    }
    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
  }
}

/* Location:
 * Qualified Name:     b1.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */