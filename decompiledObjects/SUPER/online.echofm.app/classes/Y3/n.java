package Y3;

import Q3.d;
import V3.C;
import V3.k;
import d4.b;
import d4.o;
import d4.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class n
{
  public static final Pattern a = Pattern.compile("[\\[\\]\\.#$]");
  public static final Pattern b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");
  
  public static boolean a(String paramString)
  {
    boolean bool;
    if ((!paramString.equals(".info")) && (b.matcher(paramString).find()) && (!paramString.equals(b.m().e())) && (!paramString.equals(b.n().e()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean b(String paramString)
  {
    return a.matcher(paramString).find() ^ true;
  }
  
  public static boolean c(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() > 0) && ((paramString.equals(".value")) || (paramString.equals(".priority")) || ((!paramString.startsWith(".")) && (!b.matcher(paramString).find())))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean d(k paramk)
  {
    paramk = paramk.Z();
    boolean bool;
    if ((paramk != null) && (paramk.e().startsWith("."))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Map e(k paramk, Map paramMap)
  {
    Object localObject1 = new TreeMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localObject2 = new k((String)paramMap.getKey());
      Object localObject3 = paramMap.getValue();
      C.g(paramk.T((k)localObject2), localObject3);
      if (!((k)localObject2).isEmpty()) {
        paramMap = ((k)localObject2).X().e();
      } else {
        paramMap = "";
      }
      if ((!paramMap.equals(".sv")) && (!paramMap.equals(".value")))
      {
        if (paramMap.equals(".priority")) {
          paramMap = r.c((k)localObject2, localObject3);
        } else {
          paramMap = o.a(localObject3);
        }
        k(localObject3);
        ((Map)localObject1).put(localObject2, paramMap);
      }
      else
      {
        paramk = new StringBuilder();
        paramk.append("Path '");
        paramk.append(localObject2);
        paramk.append("' contains disallowed child name: ");
        paramk.append(paramMap);
        throw new d(paramk.toString());
      }
    }
    Object localObject2 = ((SortedMap)localObject1).keySet().iterator();
    for (paramk = null; ((Iterator)localObject2).hasNext(); paramk = paramMap)
    {
      paramMap = (k)((Iterator)localObject2).next();
      boolean bool;
      if ((paramk != null) && (paramk.V(paramMap) >= 0)) {
        bool = false;
      } else {
        bool = true;
      }
      m.f(bool);
      if ((paramk != null) && (paramk.W(paramMap)))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Path '");
        ((StringBuilder)localObject1).append(paramk);
        ((StringBuilder)localObject1).append("' is an ancestor of '");
        ((StringBuilder)localObject1).append(paramMap);
        ((StringBuilder)localObject1).append("' in an update.");
        throw new d(((StringBuilder)localObject1).toString());
      }
    }
    return (Map)localObject1;
  }
  
  public static void f(double paramDouble)
  {
    if ((!Double.isInfinite(paramDouble)) && (!Double.isNaN(paramDouble))) {
      return;
    }
    throw new d("Invalid value: Value cannot be NaN, Inf or -Inf.");
  }
  
  public static void g(String paramString)
  {
    if ((paramString != null) && (!a(paramString)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid key: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
      throw new d(localStringBuilder.toString());
    }
  }
  
  public static void h(String paramString)
  {
    if (b(paramString)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid Firebase Database path: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
    throw new d(localStringBuilder.toString());
  }
  
  public static void i(String paramString)
  {
    if (paramString.startsWith(".info")) {}
    for (int i = 5;; i = 6)
    {
      String str = paramString.substring(i);
      do
      {
        h(str);
        break;
        str = paramString;
      } while (!paramString.startsWith("/.info"));
    }
  }
  
  public static void j(String paramString)
  {
    if (c(paramString)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid key: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
    throw new d(localStringBuilder.toString());
  }
  
  public static void k(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      if (((Map)paramObject).containsKey(".sv")) {
        return;
      }
      Iterator localIterator = ((Map)paramObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramObject = (Map.Entry)localIterator.next();
        j((String)((Map.Entry)paramObject).getKey());
        k(((Map.Entry)paramObject).getValue());
      }
    }
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        k(((Iterator)paramObject).next());
      }
    }
    if (((paramObject instanceof Double)) || ((paramObject instanceof Float))) {
      f(((Double)paramObject).doubleValue());
    }
  }
  
  public static void l(k paramk)
  {
    if (d(paramk)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid write location: ");
    localStringBuilder.append(paramk.toString());
    throw new d(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     Y3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */