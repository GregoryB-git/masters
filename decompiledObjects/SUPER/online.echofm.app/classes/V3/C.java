package V3;

import Q3.d;
import d4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C
{
  public final List a = new ArrayList();
  public int b;
  
  public C(k paramk)
  {
    int i = 0;
    b = 0;
    paramk = paramk.iterator();
    while (paramk.hasNext())
    {
      b localb = (b)paramk.next();
      a.add(localb.e());
    }
    b = Math.max(1, a.size());
    while (i < a.size())
    {
      b += f((CharSequence)a.get(i));
      i++;
    }
    a();
  }
  
  public static String b(String paramString, List paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramList.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append(paramString);
      }
      localStringBuilder.append((String)paramList.get(i));
    }
    return localStringBuilder.toString();
  }
  
  public static int f(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      char c = paramCharSequence.charAt(j);
      if (c <= '')
      {
        k++;
      }
      else if (c <= '߿')
      {
        k += 2;
      }
      else if (Character.isHighSurrogate(c))
      {
        k += 4;
        j++;
      }
      else
      {
        k += 3;
      }
      j++;
    }
    return k;
  }
  
  public static void g(k paramk, Object paramObject)
  {
    new C(paramk).h(paramObject);
  }
  
  public final void a()
  {
    if (b <= 768)
    {
      if (a.size() <= 32) {
        return;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
      localStringBuilder.append(e());
      throw new d(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Data has a key path longer than 768 bytes (");
    localStringBuilder.append(b);
    localStringBuilder.append(").");
    throw new d(localStringBuilder.toString());
  }
  
  public final String c()
  {
    Object localObject = a;
    localObject = (String)((List)localObject).remove(((List)localObject).size() - 1);
    b -= f((CharSequence)localObject);
    if (a.size() > 0) {
      b -= 1;
    }
    return (String)localObject;
  }
  
  public final void d(String paramString)
  {
    if (a.size() > 0) {
      b += 1;
    }
    a.add(paramString);
    b += f(paramString);
    a();
  }
  
  public final String e()
  {
    if (a.size() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("in path '");
    localStringBuilder.append(b("/", a));
    localStringBuilder.append("'");
    return localStringBuilder.toString();
  }
  
  public final void h(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      paramObject = localMap.keySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        String str = (String)((Iterator)paramObject).next();
        if (!str.startsWith("."))
        {
          d(str);
          h(localMap.get(str));
          c();
        }
      }
      return;
    }
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      for (int i = 0; i < ((List)paramObject).size(); i++)
      {
        d(Integer.toString(i));
        h(((List)paramObject).get(i));
        c();
      }
    }
  }
}

/* Location:
 * Qualified Name:     V3.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */