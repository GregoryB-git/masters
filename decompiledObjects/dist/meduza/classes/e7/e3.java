package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;

public final class e3
{
  public static final e3 c = new e3(100);
  public final EnumMap<a, g3> a;
  public final int b;
  
  public e3(int paramInt)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    a = localEnumMap;
    localEnumMap.put(a.b, f(null));
    localEnumMap.put(a.c, f(null));
    b = paramInt;
  }
  
  public e3(EnumMap<a, g3> paramEnumMap, int paramInt)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    a = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
    b = paramInt;
  }
  
  public static char a(g3 paramg3)
  {
    if (paramg3 != null)
    {
      int i = paramg3.ordinal();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            return '1';
          }
        }
        else {
          return '0';
        }
      }
      else {
        return '+';
      }
    }
    return '-';
  }
  
  public static e3 b(int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null) {
      return new e3(paramInt);
    }
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : ba) {
      localEnumMap.put(locala, g(paramBundle.getString(a)));
    }
    return new e3(localEnumMap, paramInt);
  }
  
  public static e3 c(int paramInt, String paramString)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    a[] arrayOfa = ba;
    for (int i = 0; i < arrayOfa.length; i++)
    {
      a locala = arrayOfa[i];
      int j = i + 2;
      if (j < str.length()) {
        paramString = e(str.charAt(j));
      } else {
        paramString = g3.b;
      }
      localEnumMap.put(locala, paramString);
    }
    return new e3(localEnumMap, paramInt);
  }
  
  public static g3 e(char paramChar)
  {
    if (paramChar != '+')
    {
      if (paramChar != '0')
      {
        if (paramChar != '1') {
          return g3.b;
        }
        return g3.e;
      }
      return g3.d;
    }
    return g3.c;
  }
  
  public static g3 f(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return g3.b;
    }
    if (paramBoolean.booleanValue()) {
      return g3.e;
    }
    return g3.d;
  }
  
  public static g3 g(String paramString)
  {
    g3 localg3 = g3.b;
    if (paramString == null) {
      return localg3;
    }
    if (paramString.equals("granted")) {
      return g3.e;
    }
    if (paramString.equals("denied")) {
      return g3.d;
    }
    return localg3;
  }
  
  public static String h(int paramInt)
  {
    if (paramInt != -30)
    {
      if (paramInt != -20)
      {
        if (paramInt != -10)
        {
          if (paramInt != 0)
          {
            if (paramInt != 30)
            {
              if (paramInt != 90)
              {
                if (paramInt != 100) {
                  return "OTHER";
                }
                return "UNKNOWN";
              }
              return "REMOTE_CONFIG";
            }
            return "1P_INIT";
          }
          return "1P_API";
        }
        return "MANIFEST";
      }
      return "API";
    }
    return "TCF";
  }
  
  public static boolean i(int paramInt1, int paramInt2)
  {
    if (((paramInt1 == -20) && (paramInt2 == -30)) || ((paramInt1 == -30) && (paramInt2 == -20))) {}
    while (paramInt1 == paramInt2)
    {
      i = 1;
      break;
    }
    int i = 0;
    return (i != 0) || (paramInt1 < paramInt2);
  }
  
  public static e3 l(String paramString)
  {
    return c(100, paramString);
  }
  
  public final e3 d(e3 parame3)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : ba)
    {
      g3 localg31 = (g3)a.get(locala);
      Object localObject = (g3)a.get(locala);
      g3 localg32;
      if (localg31 != null) {
        if (localObject == null)
        {
          localObject = localg31;
        }
        else
        {
          localg32 = g3.b;
          if (localg31 != localg32) {
            if (localObject == localg32)
            {
              localObject = localg31;
            }
            else
            {
              localg32 = g3.c;
              if (localg31 == localg32) {}
            }
          }
        }
      }
      if (localObject == localg32)
      {
        localObject = localg31;
      }
      else
      {
        localg32 = g3.d;
        if ((localg31 != localg32) && (localObject != localg32)) {
          localObject = g3.e;
        } else {
          localObject = localg32;
        }
      }
      if (localObject != null) {
        localEnumMap.put(locala, localObject);
      }
    }
    return new e3(localEnumMap, 100);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e3)) {
      return false;
    }
    e3 locale3 = (e3)paramObject;
    for (Object localObject : ba) {
      if (a.get(localObject) != a.get(localObject)) {
        return false;
      }
    }
    return b == b;
  }
  
  public final int hashCode()
  {
    int i = b * 17;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      i = i * 31 + ((g3)localIterator.next()).hashCode();
    }
    return i;
  }
  
  public final boolean j(a parama)
  {
    return (g3)a.get(parama) != g3.d;
  }
  
  public final e3 k(e3 parame3)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : ba)
    {
      g3 localg31 = (g3)a.get(locala);
      g3 localg32 = localg31;
      if (localg31 == g3.b) {
        localg32 = (g3)a.get(locala);
      }
      if (localg32 != null) {
        localEnumMap.put(locala, localg32);
      }
    }
    return new e3(localEnumMap, b);
  }
  
  public final String m()
  {
    StringBuilder localStringBuilder = new StringBuilder("G1");
    label122:
    for (Object localObject : ba)
    {
      localObject = (g3)a.get(localObject);
      char c1 = '-';
      char c2 = c1;
      if (localObject != null)
      {
        int k = ((Enum)localObject).ordinal();
        c2 = c1;
        if (k != 0)
        {
          if (k != 1) {
            if (k != 2)
            {
              if (k != 3)
              {
                c2 = c1;
                break label122;
              }
            }
            else
            {
              k = 48;
              c2 = k;
              break label122;
            }
          }
          k = 49;
          c2 = k;
        }
      }
      localStringBuilder.append(c2);
    }
    return localStringBuilder.toString();
  }
  
  public final String n()
  {
    StringBuilder localStringBuilder = new StringBuilder("G1");
    for (a locala : ba) {
      localStringBuilder.append(a((g3)a.get(locala)));
    }
    return localStringBuilder.toString();
  }
  
  public final boolean o()
  {
    return j(a.b);
  }
  
  public final boolean p()
  {
    return j(a.c);
  }
  
  public final boolean q()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      if ((g3)localIterator.next() != g3.b) {
        return true;
      }
    }
    return false;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("source=");
    localStringBuilder.append(h(b));
    a[] arrayOfa = ba;
    int i = 0;
    int j = arrayOfa.length;
    while (i < j)
    {
      Object localObject = arrayOfa[i];
      localStringBuilder.append(",");
      localStringBuilder.append(a);
      localStringBuilder.append("=");
      g3 localg3 = (g3)a.get(localObject);
      localObject = localg3;
      if (localg3 == null) {
        localObject = g3.b;
      }
      localStringBuilder.append(localObject);
      i++;
    }
    return localStringBuilder.toString();
  }
  
  public static enum a
  {
    public final String a;
    
    static
    {
      a locala1 = new a("AD_STORAGE", 0, "ad_storage");
      b = locala1;
      a locala2 = new a("ANALYTICS_STORAGE", 1, "analytics_storage");
      c = locala2;
      a locala3 = new a("AD_USER_DATA", 2, "ad_user_data");
      d = locala3;
      a locala4 = new a("AD_PERSONALIZATION", 3, "ad_personalization");
      e = locala4;
      f = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a(String paramString)
    {
      a = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     e7.e3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */