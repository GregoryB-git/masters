package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class z
{
  public static final z f = new z(null, 100);
  public final int a;
  public final String b;
  public final Boolean c;
  public final String d;
  public final EnumMap e;
  
  public z(Boolean paramBoolean, int paramInt)
  {
    this(paramBoolean, paramInt, null, null);
  }
  
  public z(Boolean paramBoolean1, int paramInt, Boolean paramBoolean2, String paramString)
  {
    EnumMap localEnumMap = new EnumMap(q3.a.class);
    e = localEnumMap;
    localEnumMap.put(q3.a.r, paramBoolean1);
    a = paramInt;
    b = k();
    c = paramBoolean2;
    d = paramString;
  }
  
  public z(EnumMap paramEnumMap, int paramInt)
  {
    this(paramEnumMap, paramInt, null, null);
  }
  
  public z(EnumMap paramEnumMap, int paramInt, Boolean paramBoolean, String paramString)
  {
    EnumMap localEnumMap = new EnumMap(q3.a.class);
    e = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
    a = paramInt;
    b = k();
    c = paramBoolean;
    d = paramString;
  }
  
  public static z b(Bundle paramBundle, int paramInt)
  {
    Boolean localBoolean = null;
    if (paramBundle == null) {
      return new z(null, paramInt);
    }
    EnumMap localEnumMap = new EnumMap(q3.a.class);
    for (q3.a locala : p3.q.c()) {
      localEnumMap.put(locala, q3.q(paramBundle.getString(o)));
    }
    if (paramBundle.containsKey("is_dma_region")) {
      localBoolean = Boolean.valueOf(paramBundle.getString("is_dma_region"));
    }
    return new z(localEnumMap, paramInt, localBoolean, paramBundle.getString("cps_display_str"));
  }
  
  public static z c(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      String[] arrayOfString = paramString.split(":");
      int i = Integer.parseInt(arrayOfString[0]);
      paramString = new EnumMap(q3.a.class);
      q3.a[] arrayOfa = p3.q.c();
      int j = arrayOfa.length;
      int k = 1;
      int m = 0;
      while (m < j)
      {
        paramString.put(arrayOfa[m], q3.g(arrayOfString[k].charAt(0)));
        m++;
        k++;
      }
      return new z(paramString, i);
    }
    return f;
  }
  
  public static Boolean d(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    return q3.q(paramBundle.getString("ad_personalization"));
  }
  
  public final int a()
  {
    return a;
  }
  
  public final Bundle e()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = e.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      Boolean localBoolean = (Boolean)((Map.Entry)localObject).getValue();
      if (localBoolean != null) {
        localBundle.putString(getKeyo, q3.j(localBoolean.booleanValue()));
      }
    }
    Object localObject = c;
    if (localObject != null) {
      localBundle.putString("is_dma_region", ((Boolean)localObject).toString());
    }
    localObject = d;
    if (localObject != null) {
      localBundle.putString("cps_display_str", (String)localObject);
    }
    return localBundle;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof z)) {
      return false;
    }
    paramObject = (z)paramObject;
    if (!b.equalsIgnoreCase(b)) {
      return false;
    }
    if (!y.a(c, c)) {
      return false;
    }
    return y.a(d, d);
  }
  
  public final Boolean f()
  {
    return (Boolean)e.get(q3.a.r);
  }
  
  public final Boolean g()
  {
    return c;
  }
  
  public final String h()
  {
    return d;
  }
  
  public final int hashCode()
  {
    Object localObject = c;
    int i;
    if (localObject == null) {
      i = 3;
    } else if (localObject == Boolean.TRUE) {
      i = 7;
    } else {
      i = 13;
    }
    localObject = d;
    int j;
    if (localObject == null) {
      j = 17;
    } else {
      j = ((String)localObject).hashCode();
    }
    return b.hashCode() + i * 29 + j * 137;
  }
  
  public final String i()
  {
    return b;
  }
  
  public final boolean j()
  {
    Iterator localIterator = e.values().iterator();
    while (localIterator.hasNext()) {
      if ((Boolean)localIterator.next() != null) {
        return true;
      }
    }
    return false;
  }
  
  public final String k()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    for (q3.a locala : p3.q.c())
    {
      localStringBuilder.append(":");
      localStringBuilder.append(q3.a((Boolean)e.get(locala)));
    }
    return localStringBuilder.toString();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("source=");
    localStringBuilder.append(q3.h(a));
    for (Object localObject : p3.q.c())
    {
      localStringBuilder.append(",");
      localStringBuilder.append(o);
      localStringBuilder.append("=");
      localObject = (Boolean)e.get(localObject);
      if (localObject == null) {
        localObject = "uninitialized";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        break;
        if (((Boolean)localObject).booleanValue()) {
          localObject = "granted";
        } else {
          localObject = "denied";
        }
      }
    }
    if (c != null)
    {
      localStringBuilder.append(",isDmaRegion=");
      localStringBuilder.append(c);
    }
    if (d != null)
    {
      localStringBuilder.append(",cpsDisplayStr=");
      localStringBuilder.append(d);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */