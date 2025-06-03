package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C4
  extends LinkedHashMap
{
  public static final C4 p;
  public boolean o = true;
  
  static
  {
    C4 localC4 = new C4();
    p = localC4;
    o = false;
  }
  
  public C4() {}
  
  public C4(Map paramMap)
  {
    super(paramMap);
  }
  
  public static int a(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return a4.d((byte[])paramObject);
    }
    if (!(paramObject instanceof e4)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public static C4 b()
  {
    return p;
  }
  
  public final void clear()
  {
    l();
    super.clear();
  }
  
  public final void d(C4 paramC4)
  {
    l();
    if (!paramC4.isEmpty()) {
      putAll(paramC4);
    }
  }
  
  public final Set entrySet()
  {
    if (isEmpty()) {
      return Collections.emptySet();
    }
    return super.entrySet();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      if (this != localMap)
      {
        if (size() == localMap.size())
        {
          Iterator localIterator = entrySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (Map.Entry)localIterator.next();
            if (!localMap.containsKey(((Map.Entry)localObject).getKey())) {
              break label159;
            }
            paramObject = ((Map.Entry)localObject).getValue();
            localObject = localMap.get(((Map.Entry)localObject).getKey());
            boolean bool;
            if (((paramObject instanceof byte[])) && ((localObject instanceof byte[]))) {
              bool = Arrays.equals((byte[])paramObject, (byte[])localObject);
            } else {
              bool = paramObject.equals(localObject);
            }
            if (!bool) {
              break label159;
            }
          }
        }
      }
      else {
        return true;
      }
    }
    label159:
    return false;
  }
  
  public final C4 f()
  {
    if (isEmpty()) {
      return new C4();
    }
    return new C4(this);
  }
  
  public final void g()
  {
    o = false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = a(localEntry.getKey());
      i += (a(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final boolean j()
  {
    return o;
  }
  
  public final void l()
  {
    if (o) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    l();
    a4.e(paramObject1);
    a4.e(paramObject2);
    return super.put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map paramMap)
  {
    l();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      a4.e(localObject);
      a4.e(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final Object remove(Object paramObject)
  {
    l();
    return super.remove(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.C4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */