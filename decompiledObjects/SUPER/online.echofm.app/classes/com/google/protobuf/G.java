package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class G
  implements F
{
  public static int f(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject = (E)paramObject1;
    paramObject1 = (D)paramObject2;
    boolean bool = ((AbstractMap)localObject).isEmpty();
    int i = 0;
    if (bool) {
      return 0;
    }
    paramObject2 = ((E)localObject).entrySet().iterator();
    while (((Iterator)paramObject2).hasNext())
    {
      localObject = (Map.Entry)((Iterator)paramObject2).next();
      i += ((D)paramObject1).a(paramInt, ((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
    return i;
  }
  
  public static E g(Object paramObject1, Object paramObject2)
  {
    E localE = (E)paramObject1;
    paramObject2 = (E)paramObject2;
    paramObject1 = localE;
    if (!((AbstractMap)paramObject2).isEmpty())
    {
      paramObject1 = localE;
      if (!localE.n()) {
        paramObject1 = localE.s();
      }
      ((E)paramObject1).p((E)paramObject2);
    }
    return (E)paramObject1;
  }
  
  public Object a(Object paramObject1, Object paramObject2)
  {
    return g(paramObject1, paramObject2);
  }
  
  public int b(int paramInt, Object paramObject1, Object paramObject2)
  {
    return f(paramInt, paramObject1, paramObject2);
  }
  
  public Object c(Object paramObject)
  {
    ((E)paramObject).o();
    return paramObject;
  }
  
  public D.a d(Object paramObject)
  {
    return ((D)paramObject).c();
  }
  
  public Map e(Object paramObject)
  {
    return (E)paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */