package ma;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class o0
  implements n0
{
  public final m0 a(Object paramObject1, Object paramObject2)
  {
    m0 localm01 = (m0)paramObject1;
    m0 localm02 = (m0)paramObject2;
    paramObject2 = localm01;
    if (!localm02.isEmpty())
    {
      paramObject1 = localm01;
      if (!a) {
        paramObject1 = localm01.d();
      }
      ((m0)paramObject1).c();
      paramObject2 = paramObject1;
      if (!localm02.isEmpty())
      {
        ((m0)paramObject1).putAll(localm02);
        paramObject2 = paramObject1;
      }
    }
    return (m0)paramObject2;
  }
  
  public final Object b(Object paramObject)
  {
    a = false;
    return paramObject;
  }
  
  public final l0.a<?, ?> c(Object paramObject)
  {
    return a;
  }
  
  public final m0 d()
  {
    return m0.b.d();
  }
  
  public final m0 e(Object paramObject)
  {
    return (m0)paramObject;
  }
  
  public final int f(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1 = (m0)paramObject1;
    paramObject1 = (l0)paramObject2;
    boolean bool = ((AbstractMap)localObject1).isEmpty();
    int i = 0;
    int j = 0;
    if (!bool)
    {
      paramObject2 = ((m0)localObject1).entrySet().iterator();
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
        int k = k.N(paramInt);
        i = l0.a(a, localObject1, localObject2);
        j += k.P(i) + i + k;
      }
    }
    return i;
  }
  
  public final boolean g(Object paramObject)
  {
    return a ^ true;
  }
  
  public final m0 h(Object paramObject)
  {
    return (m0)paramObject;
  }
}

/* Location:
 * Qualified Name:     ma.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */