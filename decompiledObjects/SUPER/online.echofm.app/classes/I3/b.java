package I3;

import E3.f;
import H3.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class b
{
  public final Map a = new HashMap();
  public final int b;
  public final int c;
  
  public b(int paramInt1, int paramInt2)
  {
    b = paramInt1;
    c = paramInt2;
  }
  
  public static String c(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramString != null)
    {
      paramString = paramString.trim();
      str = paramString;
      if (paramString.length() > paramInt) {
        str = paramString.substring(0, paramInt);
      }
    }
    return str;
  }
  
  public Map a()
  {
    try
    {
      Object localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>(a);
      localObject1 = Collections.unmodifiableMap((Map)localObject1);
      return (Map)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public final String b(String paramString)
  {
    if (paramString != null) {
      return c(paramString, c);
    }
    throw new IllegalArgumentException("Custom attribute key must not be null.");
  }
  
  public boolean d(String paramString1, String paramString2)
  {
    label161:
    try
    {
      localObject = b(paramString1);
      if ((a.size() >= b) && (!a.containsKey(localObject)))
      {
        localObject = f.f();
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>();
        paramString2.append("Ignored entry \"");
        paramString2.append(paramString1);
        paramString2.append("\" when adding custom keys. Maximum allowable: ");
        paramString2.append(b);
        ((f)localObject).k(paramString2.toString());
        return false;
      }
    }
    finally
    {
      Object localObject;
      break label161;
      paramString1 = c(paramString2, c);
      boolean bool = i.z((String)a.get(localObject), paramString1);
      if (bool) {
        return false;
      }
      Map localMap = a;
      if (paramString2 == null) {
        paramString1 = "";
      }
      localMap.put(localObject, paramString1);
      return true;
    }
  }
  
  public void e(Map paramMap)
  {
    for (;;)
    {
      try
      {
        localIterator = paramMap.entrySet().iterator();
        i = 0;
      }
      finally
      {
        Iterator localIterator;
        int i;
        continue;
        paramMap = (String)paramMap.getValue();
        Map localMap = a;
        if (paramMap != null) {
          continue;
        }
        paramMap = "";
        continue;
        paramMap = c(paramMap, c);
        localMap.put(localObject, paramMap);
        continue;
        if (i <= 0) {
          continue;
        }
        Object localObject = f.f();
        paramMap = new java/lang/StringBuilder;
        paramMap.<init>();
        paramMap.append("Ignored ");
        paramMap.append(i);
        paramMap.append(" entries when adding custom keys. Maximum allowable: ");
        paramMap.append(b);
        ((f)localObject).k(paramMap.toString());
        return;
      }
      if (!localIterator.hasNext()) {
        continue;
      }
      paramMap = (Map.Entry)localIterator.next();
      localObject = b((String)paramMap.getKey());
      if ((a.size() < b) || (a.containsKey(localObject))) {
        continue;
      }
      i++;
    }
  }
}

/* Location:
 * Qualified Name:     I3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */