package b1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s1.c;
import s1.c.a;
import s1.e;

public final class i
{
  public static final void a(o0 paramo0, c paramc, k paramk)
  {
    ec.i.e(paramc, "registry");
    ec.i.e(paramk, "lifecycle");
    HashMap localHashMap = a;
    if (localHashMap == null) {
      paramo0 = null;
    }
    try
    {
      paramo0 = a.get("androidx.lifecycle.savedstate.vm.tag");
      paramo0 = (g0)paramo0;
      if ((paramo0 != null) && (!c))
      {
        paramo0.b(paramk, paramc);
        paramo0 = paramk.b();
        if (paramo0 != k.b.b)
        {
          int i;
          if (paramo0.compareTo(k.b.d) >= 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            paramk.a(new j(paramk, paramc));
            break label121;
          }
        }
        paramc.d();
      }
      label121:
      return;
    }
    finally {}
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     b1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */