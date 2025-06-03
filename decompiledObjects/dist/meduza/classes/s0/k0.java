package s0;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class k0
  implements j0
{
  public final i0 a(Object paramObject1, Object paramObject2)
  {
    i0 locali01 = (i0)paramObject1;
    i0 locali02 = (i0)paramObject2;
    paramObject2 = locali01;
    if (!locali02.isEmpty())
    {
      paramObject1 = locali01;
      if (!a) {
        paramObject1 = locali01.d();
      }
      ((i0)paramObject1).c();
      paramObject2 = paramObject1;
      if (!locali02.isEmpty())
      {
        ((i0)paramObject1).putAll(locali02);
        paramObject2 = paramObject1;
      }
    }
    return (i0)paramObject2;
  }
  
  public final Object b(Object paramObject)
  {
    a = false;
    return paramObject;
  }
  
  public final h0.a<?, ?> c(Object paramObject)
  {
    return a;
  }
  
  public final i0 d()
  {
    return i0.b.d();
  }
  
  public final i0 e(Object paramObject)
  {
    return (i0)paramObject;
  }
  
  public final int f(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1 = (i0)paramObject1;
    paramObject1 = (h0)paramObject2;
    boolean bool = ((AbstractMap)localObject1).isEmpty();
    int i = 0;
    int j = 0;
    if (!bool)
    {
      paramObject2 = ((i0)localObject1).entrySet().iterator();
      for (;;)
      {
        i = j;
        if (!((Iterator)paramObject2).hasNext()) {
          break;
        }
        Object localObject2 = (Map.Entry)((Iterator)paramObject2).next();
        localObject1 = ((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        paramObject1.getClass();
        i = j.N(paramInt);
        int k = h0.a(a, localObject1, localObject2);
        j += j.P(k) + k + i;
      }
    }
    return i;
  }
  
  public final boolean g(Object paramObject)
  {
    return a ^ true;
  }
  
  public final i0 h(Object paramObject)
  {
    return (i0)paramObject;
  }
}

/* Location:
 * Qualified Name:     s0.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */