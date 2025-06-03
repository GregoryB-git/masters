package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class q3
{
  public static final q3 c = new q3(null, null, 100);
  public final EnumMap a;
  public final int b;
  
  public q3(Boolean paramBoolean1, Boolean paramBoolean2, int paramInt)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    a = localEnumMap;
    localEnumMap.put(a.p, paramBoolean1);
    localEnumMap.put(a.q, paramBoolean2);
    b = paramInt;
  }
  
  public q3(EnumMap paramEnumMap, int paramInt)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    a = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
    b = paramInt;
  }
  
  public static char a(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return '-';
    }
    if (paramBoolean.booleanValue()) {
      return '1';
    }
    return '0';
  }
  
  public static q3 d(Bundle paramBundle, int paramInt)
  {
    if (paramBundle == null) {
      return new q3(null, null, paramInt);
    }
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : p3.e(p3.p)) {
      localEnumMap.put(locala, q(paramBundle.getString(o)));
    }
    return new q3(localEnumMap, paramInt);
  }
  
  public static q3 e(String paramString)
  {
    return f(paramString, 100);
  }
  
  public static q3 f(String paramString, int paramInt)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    if (paramString != null)
    {
      a[] arrayOfa = p3.p.c();
      for (int i = 0; i < arrayOfa.length; i++)
      {
        a locala = arrayOfa[i];
        int j = i + 2;
        if (j < paramString.length()) {
          localEnumMap.put(locala, g(paramString.charAt(j)));
        }
      }
    }
    return new q3(localEnumMap, paramInt);
  }
  
  public static Boolean g(char paramChar)
  {
    if (paramChar != '0')
    {
      if (paramChar != '1') {
        return null;
      }
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
  
  public static String h(int paramInt)
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
  
  public static String i(Bundle paramBundle)
  {
    for (Object localObject : p3.e(p3.p)) {
      if (paramBundle.containsKey(o))
      {
        localObject = paramBundle.getString(o);
        if ((localObject != null) && (q((String)localObject) == null)) {
          return (String)localObject;
        }
      }
    }
    return null;
  }
  
  public static String j(boolean paramBoolean)
  {
    if (paramBoolean) {
      return "granted";
    }
    return "denied";
  }
  
  public static boolean k(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static int n(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return 0;
    }
    if (paramBoolean.booleanValue()) {
      return 1;
    }
    return 2;
  }
  
  public static Boolean q(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.equals("granted")) {
      return Boolean.TRUE;
    }
    if (paramString.equals("denied")) {
      return Boolean.FALSE;
    }
    return null;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final q3 c(q3 paramq3)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : p3.e(p3.p))
    {
      Boolean localBoolean1 = (Boolean)a.get(locala);
      Boolean localBoolean2 = (Boolean)a.get(locala);
      if (localBoolean1 != null) {
        if (localBoolean2 == null)
        {
          localBoolean2 = localBoolean1;
        }
        else
        {
          boolean bool;
          if ((localBoolean1.booleanValue()) && (localBoolean2.booleanValue())) {
            bool = true;
          } else {
            bool = false;
          }
          localBoolean2 = Boolean.valueOf(bool);
        }
      }
      localEnumMap.put(locala, localBoolean2);
    }
    return new q3(localEnumMap, 100);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof q3)) {
      return false;
    }
    paramObject = (q3)paramObject;
    for (a locala : p3.e(p3.p)) {
      if (n((Boolean)a.get(locala)) != n((Boolean)a.get(locala))) {
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
      i = i * 31 + n((Boolean)localIterator.next());
    }
    return i;
  }
  
  public final boolean l(a parama)
  {
    parama = (Boolean)a.get(parama);
    return (parama == null) || (parama.booleanValue());
  }
  
  public final boolean m(q3 paramq3, a... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      a locala = paramVarArgs[j];
      if ((!paramq3.l(locala)) && (l(locala))) {
        return true;
      }
    }
    return false;
  }
  
  public final q3 o(q3 paramq3)
  {
    EnumMap localEnumMap = new EnumMap(a.class);
    for (a locala : p3.e(p3.p))
    {
      Boolean localBoolean1 = (Boolean)a.get(locala);
      Boolean localBoolean2 = localBoolean1;
      if (localBoolean1 == null) {
        localBoolean2 = (Boolean)a.get(locala);
      }
      localEnumMap.put(locala, localBoolean2);
    }
    return new q3(localEnumMap, b);
  }
  
  public final Bundle p()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Boolean localBoolean = (Boolean)localEntry.getValue();
      if (localBoolean != null) {
        localBundle.putString(getKeyo, j(localBoolean.booleanValue()));
      }
    }
    return localBundle;
  }
  
  public final boolean r(q3 paramq3, a... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramVarArgs[j];
      Boolean localBoolean1 = (Boolean)a.get(localObject);
      localObject = (Boolean)a.get(localObject);
      Boolean localBoolean2 = Boolean.FALSE;
      if ((localBoolean1 == localBoolean2) && (localObject != localBoolean2)) {
        return true;
      }
    }
    return false;
  }
  
  public final Boolean s()
  {
    return (Boolean)a.get(a.p);
  }
  
  public final boolean t(q3 paramq3)
  {
    return r(paramq3, (a[])a.keySet().toArray(new a[0]));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("source=");
    localStringBuilder.append(h(b));
    for (Object localObject : p3.e(p3.p))
    {
      localStringBuilder.append(",");
      localStringBuilder.append(o);
      localStringBuilder.append("=");
      localObject = (Boolean)a.get(localObject);
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
    return localStringBuilder.toString();
  }
  
  public final Boolean u()
  {
    return (Boolean)a.get(a.q);
  }
  
  public final String v()
  {
    StringBuilder localStringBuilder = new StringBuilder("G1");
    for (a locala : p3.p.c()) {
      localStringBuilder.append(a((Boolean)a.get(locala)));
    }
    return localStringBuilder.toString();
  }
  
  public final String w()
  {
    StringBuilder localStringBuilder = new StringBuilder("G2");
    for (Object localObject : p3.p.c())
    {
      localObject = (Boolean)a.get(localObject);
      char c1;
      char c2;
      if (localObject == null)
      {
        c1 = 'g';
        c2 = c1;
      }
      else if (((Boolean)localObject).booleanValue())
      {
        c1 = 'G';
        c2 = c1;
      }
      else
      {
        c1 = 'D';
        c2 = c1;
      }
      localStringBuilder.append(c2);
    }
    return localStringBuilder.toString();
  }
  
  public final boolean x()
  {
    return l(a.p);
  }
  
  public final boolean y()
  {
    return l(a.q);
  }
  
  public final boolean z()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      if ((Boolean)localIterator.next() != null) {
        return true;
      }
    }
    return false;
  }
  
  public static enum a
  {
    public final String o;
    
    static
    {
      a locala1 = new a("AD_STORAGE", 0, "ad_storage");
      p = locala1;
      a locala2 = new a("ANALYTICS_STORAGE", 1, "analytics_storage");
      q = locala2;
      a locala3 = new a("AD_USER_DATA", 2, "ad_user_data");
      r = locala3;
      a locala4 = new a("AD_PERSONALIZATION", 3, "ad_personalization");
      s = locala4;
      t = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a(String paramString1)
    {
      o = paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     R2.q3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */