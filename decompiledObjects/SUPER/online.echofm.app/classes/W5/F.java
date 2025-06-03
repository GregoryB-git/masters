package W5;

import V5.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class F
  extends E
{
  public static Map d()
  {
    z localz = z.o;
    Intrinsics.c(localz, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
    return localz;
  }
  
  public static HashMap e(m... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    HashMap localHashMap = new HashMap(C.a(paramVarArgs.length));
    j(localHashMap, paramVarArgs);
    return localHashMap;
  }
  
  public static Map f(m... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    if (paramVarArgs.length > 0) {
      paramVarArgs = n(paramVarArgs, new LinkedHashMap(C.a(paramVarArgs.length)));
    } else {
      paramVarArgs = C.d();
    }
    return paramVarArgs;
  }
  
  public static Map g(m... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(C.a(paramVarArgs.length));
    j(localLinkedHashMap, paramVarArgs);
    return localLinkedHashMap;
  }
  
  public static final Map h(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    int i = paramMap.size();
    if (i != 0)
    {
      if (i == 1) {
        paramMap = E.c(paramMap);
      }
    }
    else {
      paramMap = C.d();
    }
    return paramMap;
  }
  
  public static final void i(Map paramMap, Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramIterable, "pairs");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      m localm = (m)paramIterable.next();
      paramMap.put(localm.a(), localm.b());
    }
  }
  
  public static final void j(Map paramMap, m[] paramArrayOfm)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfm, "pairs");
    int i = paramArrayOfm.length;
    for (int j = 0; j < i; j++)
    {
      m localm = paramArrayOfm[j];
      paramMap.put(localm.a(), localm.b());
    }
  }
  
  public static Map k(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      int i = localCollection.size();
      if (i != 0)
      {
        if (i != 1)
        {
          paramIterable = l(paramIterable, new LinkedHashMap(C.a(localCollection.size())));
        }
        else
        {
          if ((paramIterable instanceof List)) {}
          for (paramIterable = ((List)paramIterable).get(0);; paramIterable = paramIterable.iterator().next())
          {
            paramIterable = (m)paramIterable;
            break;
          }
          paramIterable = C.b(paramIterable);
        }
      }
      else {
        paramIterable = C.d();
      }
      return paramIterable;
    }
    return h(l(paramIterable, new LinkedHashMap()));
  }
  
  public static final Map l(Iterable paramIterable, Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    i(paramMap, paramIterable);
    return paramMap;
  }
  
  public static Map m(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    int i = paramMap.size();
    if (i != 0)
    {
      if (i != 1) {
        paramMap = C.o(paramMap);
      } else {
        paramMap = E.c(paramMap);
      }
    }
    else {
      paramMap = C.d();
    }
    return paramMap;
  }
  
  public static final Map n(m[] paramArrayOfm, Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfm, "<this>");
    Intrinsics.checkNotNullParameter(paramMap, "destination");
    j(paramMap, paramArrayOfm);
    return paramMap;
  }
  
  public static Map o(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    return new LinkedHashMap(paramMap);
  }
}

/* Location:
 * Qualified Name:     W5.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */