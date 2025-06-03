package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class E4
  implements F4
{
  public final D4 b(Object paramObject)
  {
    a.a(paramObject);
    throw new NoSuchMethodError();
  }
  
  public final Map c(Object paramObject)
  {
    return (C4)paramObject;
  }
  
  public final Object d(Object paramObject1, Object paramObject2)
  {
    C4 localC4 = (C4)paramObject1;
    paramObject2 = (C4)paramObject2;
    paramObject1 = localC4;
    if (!((AbstractMap)paramObject2).isEmpty())
    {
      paramObject1 = localC4;
      if (!localC4.j()) {
        paramObject1 = localC4.f();
      }
      ((C4)paramObject1).d((C4)paramObject2);
    }
    return paramObject1;
  }
  
  public final Object e(Object paramObject)
  {
    ((C4)paramObject).g();
    return paramObject;
  }
  
  public final Object f(Object paramObject)
  {
    return C4.b().f();
  }
  
  public final boolean g(Object paramObject)
  {
    return !((C4)paramObject).j();
  }
  
  public final Map h(Object paramObject)
  {
    return (C4)paramObject;
  }
  
  public final int i(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (C4)paramObject1;
    a.a(paramObject2);
    if (((AbstractMap)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((C4)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw new NoSuchMethodError();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.E4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */