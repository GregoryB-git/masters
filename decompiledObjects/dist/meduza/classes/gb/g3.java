package gb;

import b.z;
import eb.e1;
import eb.e1.a;
import eb.l0;
import eb.m0;
import eb.u0.b;
import f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g;
import n7.g.a;
import n7.w;
import x6.b;

public final class g3
{
  public static Set a(String paramString, Map paramMap)
  {
    paramString = n1.c(paramString, paramMap);
    if (paramString == null) {
      return null;
    }
    EnumSet localEnumSet = EnumSet.noneOf(e1.a.class);
    Iterator localIterator = paramString.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label258;
      }
      paramMap = localIterator.next();
      if ((paramMap instanceof Double))
      {
        Double localDouble = (Double)paramMap;
        int i = localDouble.intValue();
        double d1 = i;
        double d2 = localDouble.doubleValue();
        boolean bool1 = true;
        boolean bool2;
        if (d1 == d2) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        z.r(paramMap, "Status code %s is not integral", bool2);
        paramString = ca;
        if (a == localDouble.intValue()) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        z.r(paramMap, "Status code %s is not valid", bool2);
      }
      else
      {
        if (!(paramMap instanceof String)) {
          break;
        }
      }
      try
      {
        paramString = e1.a.valueOf((String)paramMap);
        localEnumSet.add(paramString);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        paramString = new StringBuilder();
        paramString.append("Status code ");
        paramString.append(paramMap);
        paramString.append(" is not valid");
        throw new w(paramString.toString(), localIllegalArgumentException);
      }
    }
    paramString = new StringBuilder();
    paramString.append("Can not convert status code ");
    paramString.append(paramMap);
    paramString.append(" to Status.Code, because its type is ");
    paramString.append(paramMap.getClass());
    throw new w(paramString.toString());
    label258:
    return Collections.unmodifiableSet(localIllegalArgumentException);
  }
  
  public static List<Map<String, ?>> b(Map<String, ?> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramMap.containsKey("loadBalancingConfig"))
    {
      List localList = n1.c("loadBalancingConfig", paramMap);
      if (localList == null) {
        localList = null;
      } else {
        n1.a(localList);
      }
      localArrayList.addAll(localList);
    }
    if (localArrayList.isEmpty())
    {
      paramMap = n1.h("loadBalancingPolicy", paramMap);
      if (paramMap != null) {
        localArrayList.add(Collections.singletonMap(paramMap.toLowerCase(Locale.ROOT), Collections.emptyMap()));
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static u0.b c(List<a> paramList, m0 paramm0)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      String str = a;
      paramList = paramm0.b(str);
      if (paramList == null)
      {
        localArrayList.add(str);
      }
      else
      {
        if (!localArrayList.isEmpty()) {
          Logger.getLogger(g3.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", localArrayList);
        }
        paramm0 = paramList.e(b);
        if (a != null) {
          return paramm0;
        }
        return new u0.b(new b(paramList, b));
      }
    }
    paramList = e1.g;
    paramm0 = new StringBuilder();
    paramm0.append("None of ");
    paramm0.append(localArrayList);
    paramm0.append(" specified by Service Config are available.");
    return new u0.b(paramList.g(paramm0.toString()));
  }
  
  public static List<a> d(List<Map<String, ?>> paramList)
  {
    if (paramList == null) {
      return null;
    }
    Object localObject = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Map)localIterator.next();
      if (paramList.size() == 1)
      {
        String str = (String)((Map.Entry)paramList.entrySet().iterator().next()).getKey();
        ((ArrayList)localObject).add(new a(str, n1.g(str, paramList)));
      }
      else
      {
        localObject = f.l("There are ");
        ((StringBuilder)localObject).append(paramList.size());
        ((StringBuilder)localObject).append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
        ((StringBuilder)localObject).append(paramList);
        throw new RuntimeException(((StringBuilder)localObject).toString());
      }
    }
    return Collections.unmodifiableList((List)localObject);
  }
  
  public static final class a
  {
    public final String a;
    public final Map<String, ?> b;
    
    public a(String paramString, Map<String, ?> paramMap)
    {
      b.y(paramString, "policyName");
      a = paramString;
      b.y(paramMap, "rawConfigValue");
      b = paramMap;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (a)paramObject;
        bool3 = bool2;
        if (a.equals(a))
        {
          bool3 = bool2;
          if (b.equals(b)) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b });
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "policyName");
      locala.a(b, "rawConfigValue");
      return locala.toString();
    }
  }
  
  public static final class b
  {
    public final l0 a;
    public final Object b;
    
    public b(l0 paraml0, Object paramObject)
    {
      a = paraml0;
      b = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        if ((!b.Q(a, a)) || (!b.Q(b, b))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b });
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "provider");
      locala.a(b, "config");
      return locala.toString();
    }
  }
}

/* Location:
 * Qualified Name:     gb.g3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */