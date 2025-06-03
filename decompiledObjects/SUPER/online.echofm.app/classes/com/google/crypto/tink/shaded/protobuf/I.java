package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class I
  extends LinkedHashMap
{
  public static final I p;
  public boolean o = true;
  
  static
  {
    I localI = new I();
    p = localI;
    localI.o();
  }
  
  public I() {}
  
  public I(Map paramMap)
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
      return z.d((byte[])paramObject);
    }
    if (!(paramObject instanceof z.a)) {
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
      z.a(localObject);
      z.a(paramMap.get(localObject));
    }
  }
  
  public static I f()
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
    paramMap1 = paramMap1.entrySet().iterator();
    while (paramMap1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap1.next();
      if (!paramMap2.containsKey(localEntry.getKey())) {
        return false;
      }
      if (!j(localEntry.getValue(), paramMap2.get(localEntry.getKey()))) {
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
  
  public void p(I paramI)
  {
    g();
    if (!paramI.isEmpty()) {
      putAll(paramI);
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    g();
    z.a(paramObject1);
    z.a(paramObject2);
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
  
  public I s()
  {
    I localI;
    if (isEmpty()) {
      localI = new I();
    } else {
      localI = new I(this);
    }
    return localI;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */