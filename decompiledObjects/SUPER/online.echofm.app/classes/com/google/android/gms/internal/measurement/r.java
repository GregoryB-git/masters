package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class r
  implements m, s
{
  public final Map o = new HashMap();
  
  public final void a(String paramString, s params)
  {
    if (params == null)
    {
      o.remove(paramString);
      return;
    }
    o.put(paramString, params);
  }
  
  public final List b()
  {
    return new ArrayList(o.keySet());
  }
  
  public final s c()
  {
    r localr = new r();
    Iterator localIterator = o.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      Map localMap;
      String str;
      if ((((Map.Entry)localObject).getValue() instanceof m))
      {
        localMap = o;
        str = (String)((Map.Entry)localObject).getKey();
      }
      for (localObject = (s)((Map.Entry)localObject).getValue();; localObject = ((s)((Map.Entry)localObject).getValue()).c())
      {
        localMap.put(str, localObject);
        break;
        localMap = o;
        str = (String)((Map.Entry)localObject).getKey();
      }
    }
    return localr;
  }
  
  public final Boolean d()
  {
    return Boolean.TRUE;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof r)) {
      return false;
    }
    paramObject = (r)paramObject;
    return o.equals(o);
  }
  
  public final Double f()
  {
    return Double.valueOf(NaN.0D);
  }
  
  public final String g()
  {
    return "[object Object]";
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public final s i(String paramString)
  {
    if (o.containsKey(paramString)) {
      return (s)o.get(paramString);
    }
    return s.d;
  }
  
  public final Iterator k()
  {
    return p.b(o);
  }
  
  public final boolean q(String paramString)
  {
    return o.containsKey(paramString);
  }
  
  public s s(String paramString, f3 paramf3, List paramList)
  {
    if ("toString".equals(paramString)) {
      return new u(toString());
    }
    return p.a(this, new u(paramString), paramf3, paramList);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    if (!o.isEmpty())
    {
      Iterator localIterator = o.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append(String.format("%s: %s,", new Object[] { str, o.get(str) }));
      }
      localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(","));
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */