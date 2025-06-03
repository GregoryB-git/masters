package B3;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n4.a;
import n4.b;
import n4.c;
import n4.d;

public class v
  implements d, c
{
  public final Map a = new HashMap();
  public Queue b = new ArrayDeque();
  public final Executor c;
  
  public v(Executor paramExecutor)
  {
    c = paramExecutor;
  }
  
  public void a(a parama)
  {
    E.b(parama);
    label90:
    try
    {
      localObject = b;
      if (localObject != null)
      {
        ((Queue)localObject).add(parama);
        return;
      }
    }
    finally
    {
      Object localObject;
      break label90;
      Iterator localIterator = g(parama).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        ((Executor)((Map.Entry)localObject).getValue()).execute(new u((Map.Entry)localObject, parama));
      }
      return;
    }
  }
  
  public void b(Class paramClass, Executor paramExecutor, b paramb)
  {
    try
    {
      E.b(paramClass);
      E.b(paramb);
      E.b(paramExecutor);
      if (!a.containsKey(paramClass))
      {
        Map localMap = a;
        ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
        localConcurrentHashMap.<init>();
        localMap.put(paramClass, localConcurrentHashMap);
      }
    }
    finally
    {
      break label86;
    }
    ((ConcurrentHashMap)a.get(paramClass)).put(paramb, paramExecutor);
    return;
    label86:
    throw paramClass;
  }
  
  public void c(Class paramClass, b paramb)
  {
    b(paramClass, c, paramb);
  }
  
  public void d(Class paramClass, b paramb)
  {
    try
    {
      E.b(paramClass);
      E.b(paramb);
      boolean bool = a.containsKey(paramClass);
      if (!bool) {
        return;
      }
      ConcurrentHashMap localConcurrentHashMap = (ConcurrentHashMap)a.get(paramClass);
      localConcurrentHashMap.remove(paramb);
      if (localConcurrentHashMap.isEmpty()) {
        a.remove(paramClass);
      }
    }
    finally
    {
      break label81;
    }
    return;
    label81:
    throw paramClass;
  }
  
  public void f()
  {
    try
    {
      Queue localQueue = b;
      if (localQueue != null) {
        b = null;
      }
    }
    finally
    {
      break label64;
    }
    Iterator localIterator = null;
    if (localIterator != null)
    {
      localIterator = localIterator.iterator();
      while (localIterator.hasNext()) {
        a((a)localIterator.next());
      }
    }
    return;
    label64:
    throw localIterator;
  }
  
  public final Set g(a parama)
  {
    try
    {
      parama = (Map)a.get(parama.b());
      if (parama == null) {
        parama = Collections.emptySet();
      }
    }
    finally
    {
      break label45;
    }
    parama = parama.entrySet();
    return parama;
    label45:
    throw parama;
  }
}

/* Location:
 * Qualified Name:     B3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */