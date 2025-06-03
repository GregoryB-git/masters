package P1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class b
{
  public final ConcurrentHashMap a = new ConcurrentHashMap();
  
  public final List a(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "appId");
    Object localObject = (ConcurrentHashMap)a.get(paramString);
    if (localObject == null)
    {
      paramString = null;
    }
    else
    {
      paramString = new ArrayList(((Map)localObject).size());
      localObject = ((Map)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        paramString.add((a)((Map.Entry)((Iterator)localObject).next()).getValue());
      }
    }
    return paramString;
  }
  
  public final void b(String paramString, List paramList)
  {
    Intrinsics.checkNotNullParameter(paramString, "appId");
    Intrinsics.checkNotNullParameter(paramList, "gateKeeperList");
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    Iterator localIterator = ((Iterable)paramList).iterator();
    while (localIterator.hasNext())
    {
      paramList = (a)localIterator.next();
      localConcurrentHashMap.put(paramList.a(), paramList);
    }
    a.put(paramString, localConcurrentHashMap);
  }
}

/* Location:
 * Qualified Name:     P1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */