package i9;

import a.a;
import g9.f0;
import j9.e;
import j9.g;
import j9.h;
import j9.i;
import j9.k.a;
import j9.m;
import j9.o;
import j9.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import t8.c;
import x6.b;

public final class y
  implements g0
{
  public c<i, g> a = h.a;
  public f b;
  
  public final HashMap a(Iterable paramIterable)
  {
    HashMap localHashMap = new HashMap();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      i locali = (i)paramIterable.next();
      localHashMap.put(locali, g(locali));
    }
    return localHashMap;
  }
  
  public final void b(ArrayList paramArrayList)
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("setIndexManager() not called", bool, new Object[0]);
    Object localObject = h.a;
    Iterator localIterator = paramArrayList.iterator();
    for (paramArrayList = (ArrayList)localObject; localIterator.hasNext(); paramArrayList = paramArrayList.n(localObject, m.n((i)localObject, q.b)))
    {
      localObject = (i)localIterator.next();
      a = a.p(localObject);
    }
    b.h(paramArrayList);
  }
  
  public final Map<i, m> c(String paramString, k.a parama, int paramInt)
  {
    throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
  }
  
  public final void d(m paramm, q paramq)
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("setIndexManager() not called", bool, new Object[0]);
    b.Z("Cannot add document to the RemoteDocumentCache with a read time of zero", paramq.equals(q.b) ^ true, new Object[0]);
    c localc = a;
    i locali = b;
    m localm = paramm.a();
    e = paramq;
    a = localc.n(locali, localm);
    b.j(b.i());
  }
  
  public final void e(f paramf)
  {
    b = paramf;
  }
  
  public final HashMap f(f0 paramf0, k.a parama, Set paramSet, a parama1)
  {
    parama1 = new HashMap();
    Object localObject1 = new i((o)f.g(""));
    Iterator localIterator = a.o(localObject1);
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      localObject1 = (g)((Map.Entry)localObject2).getValue();
      localObject2 = (i)((Map.Entry)localObject2).getKey();
      if (!f.p(a)) {
        break;
      }
      if ((a.q() <= f.q() + 1) && (k.a.g((g)localObject1).f(parama) > 0) && ((paramSet.contains(((g)localObject1).getKey())) || (paramf0.g((g)localObject1)))) {
        parama1.put(((g)localObject1).getKey(), ((g)localObject1).a());
      }
    }
    return parama1;
  }
  
  public final m g(i parami)
  {
    g localg = (g)a.h(parami);
    if (localg != null) {
      parami = localg.a();
    } else {
      parami = m.m(parami);
    }
    return parami;
  }
}

/* Location:
 * Qualified Name:     i9.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */