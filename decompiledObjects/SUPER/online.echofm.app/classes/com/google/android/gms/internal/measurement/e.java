package com.google.android.gms.internal.measurement;

import X2.t;
import X2.y;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  public static final y d = y.a0("_syn", "_err", "_el");
  public String a;
  public long b;
  public Map c;
  
  public e(String paramString, long paramLong, Map paramMap)
  {
    a = paramString;
    b = paramLong;
    paramString = new HashMap();
    c = paramString;
    if (paramMap != null) {
      paramString.putAll(paramMap);
    }
  }
  
  public static Object c(String paramString, Object paramObject1, Object paramObject2)
  {
    if ((d.contains(paramString)) && ((paramObject2 instanceof Double))) {}
    do
    {
      return Long.valueOf(Math.round(((Double)paramObject2).doubleValue()));
      if (paramString.startsWith("_"))
      {
        if ((paramObject1 instanceof String)) {
          return paramObject2;
        }
        if (paramObject1 != null) {
          return paramObject1;
        }
        return paramObject2;
      }
      if ((paramObject1 instanceof Double)) {
        return paramObject2;
      }
    } while ((paramObject1 instanceof Long));
    if ((paramObject1 instanceof String)) {
      return paramObject2.toString();
    }
    return paramObject2;
  }
  
  public final long a()
  {
    return b;
  }
  
  public final Object b(String paramString)
  {
    if (c.containsKey(paramString)) {
      return c.get(paramString);
    }
    return null;
  }
  
  public final void d(String paramString, Object paramObject)
  {
    if (paramObject == null)
    {
      c.remove(paramString);
      return;
    }
    paramObject = c(paramString, c.get(paramString), paramObject);
    c.put(paramString, paramObject);
  }
  
  public final String e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if (b != b) {
      return false;
    }
    if (!a.equals(a)) {
      return false;
    }
    return c.equals(c);
  }
  
  public final void f(String paramString)
  {
    a = paramString;
  }
  
  public final Map g()
  {
    return c;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    long l = b;
    return (i * 31 + (int)(l ^ l >>> 32)) * 31 + c.hashCode();
  }
  
  public final String toString()
  {
    String str1 = a;
    long l = b;
    String str2 = String.valueOf(c);
    StringBuilder localStringBuilder = new StringBuilder("Event{name='");
    localStringBuilder.append(str1);
    localStringBuilder.append("', timestamp=");
    localStringBuilder.append(l);
    localStringBuilder.append(", params=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */