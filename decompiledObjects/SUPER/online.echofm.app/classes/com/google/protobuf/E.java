package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class E
  extends LinkedHashMap
{
  public static final E p;
  public boolean o = true;
  
  static
  {
    E localE = new E();
    p = localE;
    localE.o();
  }
  
  public E() {}
  
  public E(Map paramMap)
  {
    super(paramMap);
  }
  
  public static int a(Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      int j = b(paramMap.getKey());
      i += (b(paramMap.getValue()) ^ j);
    }
    return i;
  }
  
  public static int b(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return t.d((byte[])paramObject);
    }
    if (!(paramObject instanceof t.a)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public static void d(Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      t.a(localObject);
      t.a(paramMap.get(localObject));
    }
  }
  
  public static E f()
  {
    return p;
  }
  
  public static boolean j(Object paramObject1, Object paramObject2)
  {
    if (((paramObject1 instanceof byte[])) && ((paramObject2 instanceof byte[]))) {
      return Arrays.equals((byte[])paramObject1, (byte[])paramObject2);
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean l(Map paramMap1, Map paramMap2)
  {
    if (paramMap1 == paramMap2) {
      return true;
    }
    if (paramMap1.size() != paramMap2.size()) {
      return false;
    }
    Iterator localIterator = paramMap1.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap1 = (Map.Entry)localIterator.next();
      if (!paramMap2.containsKey(paramMap1.getKey())) {
        return false;
      }
      if (!j(paramMap1.getValue(), paramMap2.get(paramMap1.getKey()))) {
        return false;
      }
    }
    return true;
  }
  
  public void clear()
  {
    g();
    super.clear();
  }
  
  public Set entrySet()
  {
    Set localSet;
    if (isEmpty()) {
      localSet = Collections.emptySet();
    } else {
      localSet = super.entrySet();
    }
    return localSet;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Map)) && (l(this, (Map)paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void g()
  {
    if (n()) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean n()
  {
    return o;
  }
  
  public void o()
  {
    o = false;
  }
  
  public void p(E paramE)
  {
    g();
    if (!paramE.isEmpty()) {
      putAll(paramE);
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    g();
    t.a(paramObject1);
    t.a(paramObject2);
    return super.put(paramObject1, paramObject2);
  }
  
  public void putAll(Map paramMap)
  {
    g();
    d(paramMap);
    super.putAll(paramMap);
  }
  
  public Object remove(Object paramObject)
  {
    g();
    return super.remove(paramObject);
  }
  
  public E s()
  {
    E localE;
    if (isEmpty()) {
      localE = new E();
    } else {
      localE = new E(this);
    }
    return localE;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */