package b1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public final class b$a
{
  public final HashMap a;
  public final Map<b.b, k.a> b;
  
  public b$a(HashMap paramHashMap)
  {
    b = paramHashMap;
    a = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      k.a locala = (k.a)localEntry.getValue();
      List localList = (List)a.get(locala);
      paramHashMap = localList;
      if (localList == null)
      {
        paramHashMap = new ArrayList();
        a.put(locala, paramHashMap);
      }
      paramHashMap.add((b.b)localEntry.getKey());
    }
  }
  
  public static void a(List<b.b> paramList, o paramo, k.a parama, Object paramObject)
  {
    if (paramList != null)
    {
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        b.b localb = (b.b)paramList.get(i);
        localb.getClass();
        try
        {
          int j = a;
          if (j != 0)
          {
            if (j != 1)
            {
              if (j == 2) {
                b.invoke(paramObject, new Object[] { paramo, parama });
              }
            }
            else {
              b.invoke(paramObject, new Object[] { paramo });
            }
          }
          else {
            b.invoke(paramObject, new Object[0]);
          }
          i--;
        }
        catch (IllegalAccessException paramList)
        {
          throw new RuntimeException(paramList);
        }
        catch (InvocationTargetException paramList)
        {
          throw new RuntimeException("Failed to call observer method", paramList.getCause());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     b1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */