package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Objects;

public final class x
{
  public static final x f = new x(null, 100, null, null);
  public final int a;
  public final String b;
  public final Boolean c;
  public final String d;
  public final EnumMap<e3.a, g3> e;
  
  public x() {}
  
  public x(Boolean paramBoolean1, int paramInt, Boolean paramBoolean2, String paramString)
  {
    EnumMap localEnumMap = new EnumMap(e3.a.class);
    e = localEnumMap;
    localEnumMap.put(e3.a.d, e3.f(paramBoolean1));
    a = paramInt;
    b = f();
    c = paramBoolean2;
    d = paramString;
  }
  
  public x(EnumMap<e3.a, g3> paramEnumMap, int paramInt, Boolean paramBoolean, String paramString)
  {
    EnumMap localEnumMap = new EnumMap(e3.a.class);
    e = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
    a = paramInt;
    b = f();
    c = paramBoolean;
    d = paramString;
  }
  
  public static x a(int paramInt, Bundle paramBundle)
  {
    Boolean localBoolean = null;
    if (paramBundle == null) {
      return new x(null, paramInt, null, null);
    }
    EnumMap localEnumMap = new EnumMap(e3.a.class);
    for (e3.a locala : ca) {
      localEnumMap.put(locala, e3.g(paramBundle.getString(a)));
    }
    if (paramBundle.containsKey("is_dma_region")) {
      localBoolean = Boolean.valueOf(paramBundle.getString("is_dma_region"));
    }
    return new x(localEnumMap, paramInt, localBoolean, paramBundle.getString("cps_display_str"));
  }
  
  public static x b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      String[] arrayOfString = paramString.split(":");
      int i = Integer.parseInt(arrayOfString[0]);
      paramString = new EnumMap(e3.a.class);
      e3.a[] arrayOfa = ca;
      int j = arrayOfa.length;
      int k = 1;
      int m = 0;
      while (m < j)
      {
        paramString.put(arrayOfa[m], e3.e(arrayOfString[k].charAt(0)));
        m++;
        k++;
      }
      return new x(paramString, i, null, null);
    }
    return f;
  }
  
  public static Boolean c(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle = e3.g(paramBundle.getString("ad_personalization"));
    int i = w.a[paramBundle.ordinal()];
    if (i != 3)
    {
      if (i != 4) {
        return null;
      }
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
  
  public final g3 d()
  {
    g3 localg31 = (g3)e.get(e3.a.d);
    g3 localg32 = localg31;
    if (localg31 == null) {
      localg32 = g3.b;
    }
    return localg32;
  }
  
  public final boolean e()
  {
    Iterator localIterator = e.values().iterator();
    while (localIterator.hasNext()) {
      if ((g3)localIterator.next() != g3.b) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof x)) {
      return false;
    }
    paramObject = (x)paramObject;
    if (!b.equalsIgnoreCase(b)) {
      return false;
    }
    if (!Objects.equals(c, c)) {
      return false;
    }
    return Objects.equals(d, d);
  }
  
  public final String f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    for (e3.a locala : ca)
    {
      localStringBuilder.append(":");
      localStringBuilder.append(e3.a((g3)e.get(locala)));
    }
    return localStringBuilder.toString();
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
    return j * 137 + (i * 29 + b.hashCode());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("source=");
    localStringBuilder.append(e3.h(a));
    e3.a[] arrayOfa = ca;
    int i = 0;
    int j = arrayOfa.length;
    while (i < j)
    {
      Object localObject = arrayOfa[i];
      localStringBuilder.append(",");
      localStringBuilder.append(a);
      localStringBuilder.append("=");
      localObject = (g3)e.get(localObject);
      if (localObject == null) {}
      int k;
      do
      {
        localStringBuilder.append("uninitialized");
        break;
        k = w.a[localObject.ordinal()];
      } while (k == 1);
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4) {
            break label162;
          }
          localObject = "granted";
        }
        else
        {
          localObject = "denied";
        }
      }
      else {
        localObject = "eu_consent_policy";
      }
      localStringBuilder.append((String)localObject);
      label162:
      i++;
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
 * Qualified Name:     e7.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */