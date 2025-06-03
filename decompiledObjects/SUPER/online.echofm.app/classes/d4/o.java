package d4;

import Q3.d;
import S3.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class o
{
  public static n a(Object paramObject)
  {
    return b(paramObject, r.a());
  }
  
  public static n b(Object paramObject, n paramn)
  {
    Object localObject1 = paramObject;
    n localn1 = paramn;
    Object localObject2;
    try
    {
      if (!(paramObject instanceof Map)) {
        break label77;
      }
      localObject2 = (Map)paramObject;
      if (((Map)localObject2).containsKey(".priority")) {
        paramn = r.d(((Map)localObject2).get(".priority"));
      }
    }
    catch (ClassCastException paramObject)
    {
      break label517;
    }
    localObject1 = paramObject;
    localn1 = paramn;
    if (((Map)localObject2).containsKey(".value"))
    {
      localObject1 = ((Map)localObject2).get(".value");
      localn1 = paramn;
    }
    label77:
    if (localObject1 == null) {
      return g.W();
    }
    if ((localObject1 instanceof String)) {
      return new t((String)localObject1, localn1);
    }
    if ((localObject1 instanceof Long)) {
      return new l((Long)localObject1, localn1);
    }
    if ((localObject1 instanceof Integer)) {
      return new l(Long.valueOf(((Integer)localObject1).intValue()), localn1);
    }
    if ((localObject1 instanceof Double)) {
      return new f((Double)localObject1, localn1);
    }
    if ((localObject1 instanceof Boolean)) {
      return new a((Boolean)localObject1, localn1);
    }
    if ((!(localObject1 instanceof Map)) && (!(localObject1 instanceof List)))
    {
      paramn = new Q3/d;
      paramObject = new java/lang/StringBuilder;
      ((StringBuilder)paramObject).<init>();
      ((StringBuilder)paramObject).append("Failed to parse node with class ");
      ((StringBuilder)paramObject).append(localObject1.getClass().toString());
      paramn.<init>(((StringBuilder)paramObject).toString());
      throw paramn;
    }
    if ((localObject1 instanceof Map))
    {
      localObject2 = (Map)localObject1;
      if (((Map)localObject2).containsKey(".sv")) {
        return new e((Map)localObject2, localn1);
      }
      paramn = new java/util/HashMap;
      paramn.<init>(((Map)localObject2).size());
      localObject1 = ((Map)localObject2).keySet().iterator();
      for (;;)
      {
        paramObject = paramn;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        paramObject = (String)((Iterator)localObject1).next();
        if (!((String)paramObject).startsWith("."))
        {
          n localn2 = a(((Map)localObject2).get(paramObject));
          if (!localn2.isEmpty()) {
            paramn.put(b.j((String)paramObject), localn2);
          }
        }
      }
    }
    localObject1 = (List)localObject1;
    paramn = new java/util/HashMap;
    paramn.<init>(((List)localObject1).size());
    for (int i = 0;; i++)
    {
      paramObject = paramn;
      if (i >= ((List)localObject1).size()) {
        break;
      }
      paramObject = new java/lang/StringBuilder;
      ((StringBuilder)paramObject).<init>();
      ((StringBuilder)paramObject).append("");
      ((StringBuilder)paramObject).append(i);
      localObject2 = ((StringBuilder)paramObject).toString();
      paramObject = a(((List)localObject1).get(i));
      if (!((n)paramObject).isEmpty()) {
        paramn.put(b.j((String)localObject2), paramObject);
      }
    }
    if (((Map)paramObject).isEmpty()) {
      return g.W();
    }
    paramObject = new c(c.a.d((Map)paramObject, c.r), localn1);
    return (n)paramObject;
    label517:
    throw new d("Failed to parse node", (Throwable)paramObject);
  }
  
  public static int c(b paramb1, n paramn1, b paramb2, n paramn2)
  {
    int i = paramn1.compareTo(paramn2);
    if (i != 0) {
      return i;
    }
    return paramb1.h(paramb2);
  }
}

/* Location:
 * Qualified Name:     d4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */