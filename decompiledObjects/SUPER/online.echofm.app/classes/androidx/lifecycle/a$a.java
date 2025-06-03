package androidx.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a$a
{
  public final Map a;
  public final Map b;
  
  public a$a(Map paramMap)
  {
    b = paramMap;
    a = new HashMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      d.b localb = (d.b)localEntry.getValue();
      List localList = (List)a.get(localb);
      paramMap = localList;
      if (localList == null)
      {
        paramMap = new ArrayList();
        a.put(localb, paramMap);
      }
      paramMap.add(localEntry.getKey());
    }
  }
  
  public static void b(List paramList, h paramh, d.b paramb, Object paramObject)
  {
    if (paramList != null) {
      for (int i = paramList.size() - 1; i >= 0; i--) {
        ((a.b)paramList.get(i)).a(paramh, paramb, paramObject);
      }
    }
  }
  
  public void a(h paramh, d.b paramb, Object paramObject)
  {
    b((List)a.get(paramb), paramh, paramb, paramObject);
    b((List)a.get(d.b.ON_ANY), paramh, paramb, paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */