package V3;

import Y3.a;
import Y3.m;
import d4.c;
import d4.c.c;
import d4.n;
import d4.o;
import d4.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class s
{
  public static boolean b(Number paramNumber)
  {
    boolean bool;
    if ((!(paramNumber instanceof Double)) && (!(paramNumber instanceof Float))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Map c(a parama)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("timestamp", Long.valueOf(parama.a()));
    return localHashMap;
  }
  
  public static Object d(Map paramMap1, E paramE, Map paramMap2)
  {
    if (!paramMap1.containsKey("increment")) {
      return null;
    }
    paramMap1 = paramMap1.get("increment");
    if (!(paramMap1 instanceof Number)) {
      return null;
    }
    paramMap2 = (Number)paramMap1;
    paramE = paramE.b();
    paramMap1 = paramMap2;
    if (paramE.B()) {
      if (!(paramE.getValue() instanceof Number))
      {
        paramMap1 = paramMap2;
      }
      else
      {
        paramMap1 = (Number)paramE.getValue();
        if ((b(paramMap2)) && (b(paramMap1)))
        {
          long l1 = paramMap2.longValue();
          long l2 = paramMap1.longValue();
          long l3 = l1 + l2;
          if (((l1 ^ l3) & (l2 ^ l3)) >= 0L) {
            return Long.valueOf(l3);
          }
        }
        paramMap1 = Double.valueOf(paramMap2.doubleValue() + paramMap1.doubleValue());
      }
    }
    return paramMap1;
  }
  
  public static Object e(Object paramObject, E paramE, Map paramMap)
  {
    if (!(paramObject instanceof Map)) {
      return paramObject;
    }
    Object localObject = (Map)paramObject;
    if (!((Map)localObject).containsKey(".sv")) {
      return paramObject;
    }
    localObject = ((Map)localObject).get(".sv");
    if ((localObject instanceof String)) {
      paramE = j((String)localObject, paramMap);
    } else if ((localObject instanceof Map)) {
      paramE = d((Map)localObject, paramE, paramMap);
    } else {
      paramE = null;
    }
    if (paramE == null) {
      return paramObject;
    }
    return paramE;
  }
  
  public static b f(b paramb, x paramx, k paramk, Map paramMap)
  {
    Object localObject = b.s();
    Iterator localIterator = paramb.iterator();
    Map.Entry localEntry;
    for (paramb = (b)localObject; localIterator.hasNext(); paramb = paramb.a((k)localEntry.getKey(), h((n)localEntry.getValue(), (E)localObject, paramMap)))
    {
      localEntry = (Map.Entry)localIterator.next();
      localObject = new E.a(paramx, paramk.T((k)localEntry.getKey()));
    }
    return paramb;
  }
  
  public static n g(n paramn, x paramx, k paramk, Map paramMap)
  {
    return h(paramn, new E.a(paramx, paramk), paramMap);
  }
  
  public static n h(final n paramn, E paramE, final Map paramMap)
  {
    Object localObject1 = paramn.t().getValue();
    Object localObject2 = e(localObject1, paramE.a(d4.b.j(".priority")), paramMap);
    if (paramn.B())
    {
      paramE = e(paramn.getValue(), paramE, paramMap);
      if ((paramE.equals(paramn.getValue())) && (m.d(localObject2, localObject1))) {
        return paramn;
      }
      return o.b(paramE, r.d(localObject2));
    }
    if (paramn.isEmpty()) {
      return paramn;
    }
    localObject1 = (c)paramn;
    paramn = new t((n)localObject1);
    ((c)localObject1).M(new a(paramE, paramMap, paramn));
    if (!paramn.b().t().equals(localObject2)) {
      return paramn.b().J(r.d(localObject2));
    }
    return paramn.b();
  }
  
  public static n i(n paramn1, n paramn2, Map paramMap)
  {
    return h(paramn1, new E.b(paramn2), paramMap);
  }
  
  public static Object j(String paramString, Map paramMap)
  {
    if (("timestamp".equals(paramString)) && (paramMap.containsKey(paramString))) {
      return paramMap.get(paramString);
    }
    return null;
  }
  
  public class a
    extends c.c
  {
    public a(Map paramMap, t paramt) {}
    
    public void b(d4.b paramb, n paramn)
    {
      n localn = s.a(paramn, a(paramb), paramMap);
      if (localn != paramn) {
        paramn.c(new k(paramb.e()), localn);
      }
    }
  }
}

/* Location:
 * Qualified Name:     V3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */