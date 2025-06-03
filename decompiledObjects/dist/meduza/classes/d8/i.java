package d8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class i
  implements c, x8.a
{
  public static final g h = new g(0);
  public final HashMap a = new HashMap();
  public final HashMap b = new HashMap();
  public final HashMap c = new HashMap();
  public HashSet d = new HashSet();
  public final m e;
  public final AtomicReference<Boolean> f = new AtomicReference();
  public final f g;
  
  public i(Executor paramExecutor, ArrayList paramArrayList1, ArrayList paramArrayList2, f paramf)
  {
    Object localObject = new m(paramExecutor);
    e = ((m)localObject);
    g = paramf;
    paramExecutor = new ArrayList();
    paramExecutor.add(b.c(localObject, m.class, new Class[] { c9.d.class, c9.c.class }));
    paramExecutor.add(b.c(this, x8.a.class, new Class[0]));
    paramArrayList2 = paramArrayList2.iterator();
    while (paramArrayList2.hasNext())
    {
      paramf = (b)paramArrayList2.next();
      if (paramf != null) {
        paramExecutor.add(paramf);
      }
    }
    paramArrayList2 = new ArrayList();
    paramArrayList1 = paramArrayList1.iterator();
    while (paramArrayList1.hasNext()) {
      paramArrayList2.add(paramArrayList1.next());
    }
    paramArrayList1 = new ArrayList();
    try
    {
      paramArrayList2 = paramArrayList2.iterator();
      while (paramArrayList2.hasNext())
      {
        paramf = (t9.b)paramArrayList2.next();
        try
        {
          paramf = (ComponentRegistrar)paramf.get();
          if (paramf != null)
          {
            paramExecutor.addAll(g.a(paramf));
            paramArrayList2.remove();
          }
        }
        catch (n paramf)
        {
          paramArrayList2.remove();
          Log.w("ComponentDiscovery", "Invalid component registrar.", paramf);
        }
      }
      paramArrayList2 = paramExecutor.iterator();
      label413:
      while (paramArrayList2.hasNext())
      {
        localObject = nextb.toArray();
        int i = localObject.length;
        for (int j = 0;; j++)
        {
          if (j >= i) {
            break label413;
          }
          paramf = localObject[j];
          if (paramf.toString().contains("kotlinx.coroutines.CoroutineDispatcher"))
          {
            if (d.contains(paramf.toString()))
            {
              paramArrayList2.remove();
              break;
            }
            d.add(paramf.toString());
          }
        }
      }
      if (a.isEmpty())
      {
        j.a(paramExecutor);
      }
      else
      {
        paramArrayList2 = new java/util/ArrayList;
        paramArrayList2.<init>(a.keySet());
        paramArrayList2.addAll(paramExecutor);
        j.a(paramArrayList2);
      }
      paramArrayList2 = paramExecutor.iterator();
      while (paramArrayList2.hasNext())
      {
        localObject = (b)paramArrayList2.next();
        paramf = new d8/o;
        u7.d locald = new u7/d;
        locald.<init>(1, this, localObject);
        paramf.<init>(locald);
        a.put(localObject, paramf);
      }
      paramArrayList1.addAll(i(paramExecutor));
      paramArrayList1.addAll(j());
      h();
      paramExecutor = paramArrayList1.iterator();
      while (paramExecutor.hasNext()) {
        ((Runnable)paramExecutor.next()).run();
      }
      paramExecutor = (Boolean)f.get();
      if (paramExecutor != null) {
        g(a, paramExecutor.booleanValue());
      }
      return;
    }
    finally {}
  }
  
  public final <T> t9.a<T> a(t<T> paramt)
  {
    paramt = c(paramt);
    if (paramt == null) {
      return new s(s.c, s.d);
    }
    if ((paramt instanceof s)) {
      return (s)paramt;
    }
    return new s(null, paramt);
  }
  
  public final t9.b b(Class paramClass)
  {
    return c(t.a(paramClass));
  }
  
  public final <T> t9.b<T> c(t<T> paramt)
  {
    if (paramt != null) {}
    try
    {
      paramt = (t9.b)b.get(paramt);
      return paramt;
    }
    finally {}
    paramt = new java/lang/NullPointerException;
    paramt.<init>("Null interface requested.");
    throw paramt;
  }
  
  public final Set d(t paramt)
  {
    return (Set)k(paramt).get();
  }
  
  public final Object e(t paramt)
  {
    paramt = c(paramt);
    if (paramt == null) {
      paramt = null;
    } else {
      paramt = paramt.get();
    }
    return paramt;
  }
  
  public final t9.a f(Class paramClass)
  {
    return a(t.a(paramClass));
  }
  
  public final void g(Map<b<?>, t9.b<?>> paramMap, boolean paramBoolean)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      ??? = (b)((Map.Entry)localObject1).getKey();
      localObject1 = (t9.b)((Map.Entry)localObject1).getValue();
      int i = d;
      int j = 0;
      int k;
      if (i == 1) {
        k = 1;
      } else {
        k = 0;
      }
      if (k == 0)
      {
        k = j;
        if (i == 2) {
          k = 1;
        }
        if ((k == 0) || (!paramBoolean)) {}
      }
      else
      {
        ((t9.b)localObject1).get();
      }
    }
    synchronized (e)
    {
      paramMap = b;
      if (paramMap != null) {
        b = null;
      }
    }
    paramMap = null;
    if (paramMap != null)
    {
      paramMap = paramMap.iterator();
      while (paramMap.hasNext()) {
        ((m)???).b((c9.a)paramMap.next());
      }
    }
  }
  
  public final Object get(Class paramClass)
  {
    return e(t.a(paramClass));
  }
  
  public final void h()
  {
    Iterator localIterator1 = a.keySet().iterator();
    while (localIterator1.hasNext())
    {
      b localb = (b)localIterator1.next();
      Iterator localIterator2 = c.iterator();
      Object localObject;
      while (localIterator2.hasNext())
      {
        localObject = (k)localIterator2.next();
        int i = b;
        int j = 1;
        if (i == 2) {
          i = 1;
        } else {
          i = 0;
        }
        HashMap localHashMap;
        t localt;
        if ((i != 0) && (!c.containsKey(a)))
        {
          localHashMap = c;
          localt = a;
          localObject = new p(Collections.emptySet());
        }
        else
        {
          if (b.containsKey(a)) {
            continue;
          }
          int k = b;
          if (k == 1) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label241;
          }
          if (k == 2) {
            i = j;
          } else {
            i = 0;
          }
          if (i != 0) {
            continue;
          }
          localHashMap = b;
          localt = a;
          localObject = new s(s.c, s.d);
        }
        localHashMap.put(localt, localObject);
      }
      continue;
      label241:
      throw new q(String.format("Unsatisfied dependency for component %s: %s", new Object[] { localb, a }));
    }
  }
  
  public final ArrayList i(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject = (b)paramArrayList.next();
      int i;
      if (e == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        t9.b localb = (t9.b)a.get(localObject);
        localObject = b.iterator();
        while (((Iterator)localObject).hasNext())
        {
          t localt = (t)((Iterator)localObject).next();
          if (!b.containsKey(localt)) {
            b.put(localt, localb);
          } else {
            localArrayList.add(new w.g(14, (s)b.get(localt), localb));
          }
        }
      }
    }
    return localArrayList;
  }
  
  public final ArrayList j()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new HashMap();
    Object localObject2 = a.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      Object localObject4 = (b)((Map.Entry)localObject3).getKey();
      int i;
      if (e == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        localObject3 = (t9.b)((Map.Entry)localObject3).getValue();
        localObject4 = b.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          t localt = (t)((Iterator)localObject4).next();
          if (!((HashMap)localObject1).containsKey(localt)) {
            ((HashMap)localObject1).put(localt, new HashSet());
          }
          ((Set)((HashMap)localObject1).get(localt)).add(localObject3);
        }
      }
    }
    localObject1 = ((HashMap)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      if (!c.containsKey(((Map.Entry)localObject3).getKey()))
      {
        c.put((t)((Map.Entry)localObject3).getKey(), new p((Set)((Map.Entry)localObject3).getValue()));
      }
      else
      {
        localObject2 = (p)c.get(((Map.Entry)localObject3).getKey());
        localObject3 = ((Set)((Map.Entry)localObject3).getValue()).iterator();
        while (((Iterator)localObject3).hasNext()) {
          localArrayList.add(new g.q(10, localObject2, (t9.b)((Iterator)localObject3).next()));
        }
      }
    }
    return localArrayList;
  }
  
  public final <T> t9.b<Set<T>> k(t<T> paramt)
  {
    try
    {
      paramt = (p)c.get(paramt);
      if (paramt != null) {
        return paramt;
      }
      paramt = h;
      return paramt;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     d8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */