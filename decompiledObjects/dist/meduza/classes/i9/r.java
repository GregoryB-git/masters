package i9;

import j9.e;
import j9.i;
import j9.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import k9.f;
import k9.k;

public final class r
  implements b
{
  public final TreeMap<i, k> a = new TreeMap();
  public final HashMap b = new HashMap();
  
  public final void a(int paramInt, HashMap paramHashMap)
  {
    paramHashMap = paramHashMap.entrySet().iterator();
    while (paramHashMap.hasNext())
    {
      Object localObject = (Map.Entry)paramHashMap.next();
      f localf = (f)((Map.Entry)localObject).getValue();
      localObject = ((Map.Entry)localObject).getKey();
      if (localf != null)
      {
        localObject = (k)a.get(a);
        if (localObject != null) {
          ((Set)b.get(Integer.valueOf(((k)localObject).b()))).remove(a);
        }
        a.put(a, new k9.b(paramInt, localf));
        if (b.get(Integer.valueOf(paramInt)) == null) {
          b.put(Integer.valueOf(paramInt), new HashSet());
        }
        ((Set)b.get(Integer.valueOf(paramInt))).add(a);
      }
      else
      {
        throw new NullPointerException(String.format(Locale.US, "null value for key: %s", new Object[] { localObject }));
      }
    }
  }
  
  public final HashMap b(int paramInt1, int paramInt2, String paramString)
  {
    TreeMap localTreeMap = new TreeMap();
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      localObject = aa;
      if ((((e)localObject).n(((e)localObject).q() - 2).equals(paramString)) && (localk.b() > paramInt1))
      {
        Map localMap = (Map)localTreeMap.get(Integer.valueOf(localk.b()));
        localObject = localMap;
        if (localMap == null)
        {
          localObject = new HashMap();
          localTreeMap.put(Integer.valueOf(localk.b()), localObject);
        }
        ((Map)localObject).put(localk.a(), localk);
      }
    }
    paramString = new HashMap();
    Object localObject = localTreeMap.values().iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      paramString.putAll((Map)((Iterator)localObject).next());
    } while (paramString.size() < paramInt2);
    return paramString;
  }
  
  public final k c(i parami)
  {
    return (k)a.get(parami);
  }
  
  public final HashMap d(TreeSet paramTreeSet)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramTreeSet.iterator();
    while (localIterator.hasNext())
    {
      paramTreeSet = (i)localIterator.next();
      k localk = (k)a.get(paramTreeSet);
      if (localk != null) {
        localHashMap.put(paramTreeSet, localk);
      }
    }
    return localHashMap;
  }
  
  public final HashMap e(o paramo, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    int i = paramo.q();
    i locali = new i((o)paramo.g(""));
    Iterator localIterator = a.tailMap(locali).values().iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      locali = localk.a();
      if (!paramo.p(a)) {
        break;
      }
      if ((a.q() == i + 1) && (localk.b() > paramInt)) {
        localHashMap.put(localk.a(), localk);
      }
    }
    return localHashMap;
  }
  
  public final void f(int paramInt)
  {
    if (b.containsKey(Integer.valueOf(paramInt)))
    {
      Object localObject = (Set)b.get(Integer.valueOf(paramInt));
      b.remove(Integer.valueOf(paramInt));
      Iterator localIterator = ((Set)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (i)localIterator.next();
        a.remove(localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     i9.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */