package B3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n4.d;
import r4.b;
import t0.f;

public class o
  implements e, h4.a
{
  public static final b i = new k();
  public final Map a = new HashMap();
  public final Map b = new HashMap();
  public final Map c = new HashMap();
  public final List d;
  public Set e = new HashSet();
  public final v f;
  public final AtomicReference g = new AtomicReference();
  public final j h;
  
  public o(Executor paramExecutor, Iterable paramIterable, Collection paramCollection, j paramj)
  {
    v localv = new v(paramExecutor);
    f = localv;
    h = paramj;
    paramExecutor = new ArrayList();
    paramExecutor.add(c.s(localv, v.class, new Class[] { d.class, n4.c.class }));
    paramExecutor.add(c.s(this, h4.a.class, new Class[0]));
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      paramj = (c)paramCollection.next();
      if (paramj != null) {
        paramExecutor.add(paramj);
      }
    }
    d = q(paramIterable);
    n(paramExecutor);
  }
  
  public static b m(Executor paramExecutor)
  {
    return new b(paramExecutor);
  }
  
  public static List q(Iterable paramIterable)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      localArrayList.add(paramIterable.next());
    }
    return localArrayList;
  }
  
  public b b(F paramF)
  {
    try
    {
      E.c(paramF, "Null interface requested.");
      paramF = (b)b.get(paramF);
      return paramF;
    }
    finally
    {
      paramF = finally;
      throw paramF;
    }
  }
  
  public r4.a d(F paramF)
  {
    paramF = b(paramF);
    if (paramF == null) {
      return D.e();
    }
    if ((paramF instanceof D)) {
      return (D)paramF;
    }
    return D.i(paramF);
  }
  
  public b f(F paramF)
  {
    try
    {
      paramF = (y)c.get(paramF);
      if (paramF != null) {
        return paramF;
      }
      paramF = i;
      return paramF;
    }
    finally {}
  }
  
  public final void n(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      localObject1 = d.iterator();
      if (((Iterator)localObject1).hasNext()) {
        localObject2 = (b)((Iterator)localObject1).next();
      }
    }
    finally
    {
      for (;;)
      {
        try
        {
          Object localObject2 = (ComponentRegistrar)((b)localObject2).get();
          if (localObject2 == null) {
            continue;
          }
          paramList.addAll(h.a((ComponentRegistrar)localObject2));
          ((Iterator)localObject1).remove();
        }
        catch (w localw)
        {
          ((Iterator)localObject1).remove();
          Log.w("ComponentDiscovery", "Invalid component registrar.", localw);
        }
        paramList = finally;
        break;
      }
      Object localObject1 = paramList.iterator();
      l locall;
      label224:
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = ((c)((Iterator)localObject1).next()).j().toArray();
        int j = localObject3.length;
        for (int k = 0;; k++)
        {
          if (k >= j) {
            break label224;
          }
          locall = localObject3[k];
          if (locall.toString().contains("kotlinx.coroutines.CoroutineDispatcher"))
          {
            if (e.contains(locall.toString()))
            {
              ((Iterator)localObject1).remove();
              break;
            }
            e.add(locall.toString());
          }
        }
      }
      if (a.isEmpty())
      {
        q.a(paramList);
      }
      else
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(a.keySet());
        ((ArrayList)localObject1).addAll(paramList);
        q.a((List)localObject1);
      }
      Object localObject3 = paramList.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        c localc = (c)((Iterator)localObject3).next();
        localObject1 = new B3/x;
        locall = new B3/l;
        locall.<init>(this, localc);
        ((x)localObject1).<init>(locall);
        a.put(localc, localObject1);
      }
      localArrayList.addAll(w(paramList));
      localArrayList.addAll(x());
      v();
      paramList = localArrayList.iterator();
      while (paramList.hasNext()) {
        ((Runnable)paramList.next()).run();
      }
      u();
      return;
    }
  }
  
  public final void o(Map paramMap, boolean paramBoolean)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      c localc = (c)((Map.Entry)localObject).getKey();
      localObject = (b)((Map.Entry)localObject).getValue();
      if ((localc.n()) || ((localc.o()) && (paramBoolean))) {
        ((b)localObject).get();
      }
    }
    f.f();
  }
  
  public void p(boolean paramBoolean)
  {
    if (!f.a(g, null, Boolean.valueOf(paramBoolean))) {
      return;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>(a);
      o(localHashMap, paramBoolean);
      return;
    }
    finally {}
  }
  
  public final void u()
  {
    Boolean localBoolean = (Boolean)g.get();
    if (localBoolean != null) {
      o(a, localBoolean.booleanValue());
    }
  }
  
  public final void v()
  {
    Iterator localIterator1 = a.keySet().iterator();
    label15:
    if (localIterator1.hasNext())
    {
      c localc = (c)localIterator1.next();
      Iterator localIterator2 = localc.g().iterator();
      label44:
      Object localObject1;
      Map localMap;
      if (localIterator2.hasNext())
      {
        localObject1 = (r)localIterator2.next();
        if ((!((r)localObject1).g()) || (c.containsKey(((r)localObject1).c()))) {
          break label125;
        }
        localMap = c;
        localObject1 = ((r)localObject1).c();
      }
      for (Object localObject2 = y.b(Collections.emptySet());; localObject2 = D.e())
      {
        localMap.put(localObject1, localObject2);
        break label44;
        break label15;
        label125:
        if (b.containsKey(((r)localObject1).c())) {
          break;
        }
        if (((r)localObject1).f()) {
          break label179;
        }
        if (((r)localObject1).g()) {
          break;
        }
        localMap = b;
        localObject1 = ((r)localObject1).c();
      }
      label179:
      throw new z(String.format("Unsatisfied dependency for component %s: %s", new Object[] { localc, ((r)localObject1).c() }));
    }
  }
  
  public final List w(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (c)localIterator1.next();
      if (((c)localObject).p())
      {
        paramList = (b)a.get(localObject);
        Iterator localIterator2 = ((c)localObject).j().iterator();
        while (localIterator2.hasNext())
        {
          localObject = (F)localIterator2.next();
          if (!b.containsKey(localObject)) {
            b.put(localObject, paramList);
          } else {
            localArrayList.add(new m((D)b.get(localObject), paramList));
          }
        }
      }
    }
    return localArrayList;
  }
  
  public final List x()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new HashMap();
    Object localObject2 = a.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      Object localObject4 = (c)((Map.Entry)localObject3).getKey();
      if (!((c)localObject4).p())
      {
        localObject3 = (b)((Map.Entry)localObject3).getValue();
        Iterator localIterator = ((c)localObject4).j().iterator();
        while (localIterator.hasNext())
        {
          localObject4 = (F)localIterator.next();
          if (!((Map)localObject1).containsKey(localObject4)) {
            ((Map)localObject1).put(localObject4, new HashSet());
          }
          ((Set)((Map)localObject1).get(localObject4)).add(localObject3);
        }
      }
    }
    localObject1 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      if (!c.containsKey(((Map.Entry)localObject3).getKey()))
      {
        c.put((F)((Map.Entry)localObject3).getKey(), y.b((Collection)((Map.Entry)localObject3).getValue()));
      }
      else
      {
        localObject2 = (y)c.get(((Map.Entry)localObject3).getKey());
        localObject3 = ((Set)((Map.Entry)localObject3).getValue()).iterator();
        while (((Iterator)localObject3).hasNext()) {
          localArrayList.add(new n((y)localObject2, (b)((Iterator)localObject3).next()));
        }
      }
    }
    return localArrayList;
  }
  
  public static final class b
  {
    public final Executor a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public j d = j.a;
    
    public b(Executor paramExecutor)
    {
      a = paramExecutor;
    }
    
    public b b(c paramc)
    {
      c.add(paramc);
      return this;
    }
    
    public b c(ComponentRegistrar paramComponentRegistrar)
    {
      b.add(new p(paramComponentRegistrar));
      return this;
    }
    
    public b d(Collection paramCollection)
    {
      b.addAll(paramCollection);
      return this;
    }
    
    public o e()
    {
      return new o(a, b, c, d, null);
    }
    
    public b g(j paramj)
    {
      d = paramj;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     B3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */