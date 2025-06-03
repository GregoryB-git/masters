package ma;

import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class m0<K, V>
  extends LinkedHashMap<K, V>
{
  public static final m0<?, ?> b;
  public boolean a = true;
  
  static
  {
    m0 localm0 = new m0();
    b = localm0;
    a = false;
  }
  
  public m0() {}
  
  public m0(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  public static int b(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = a0.a;
      int i = arrayOfByte.length;
      int j = i;
      for (int k = 0; k < 0 + i; k++) {
        j = j * 31 + arrayOfByte[k];
      }
      k = j;
      if (j == 0) {
        k = 1;
      }
      return k;
    }
    if (!(paramObject instanceof a0.a)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public final void c()
  {
    if (a) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    c();
    super.clear();
  }
  
  public final m0<K, V> d()
  {
    m0 localm0;
    if (isEmpty()) {
      localm0 = new m0();
    } else {
      localm0 = new m0(this);
    }
    return localm0;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    Set localSet;
    if (isEmpty()) {
      localSet = Collections.emptySet();
    } else {
      localSet = super.entrySet();
    }
    return localSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map;
    boolean bool2 = true;
    if (bool1)
    {
      Map localMap = (Map)paramObject;
      label23:
      int i;
      if (this == localMap)
      {
        break label60;
        i = 1;
        break label171;
      }
      else if (size() == localMap.size()) {}
      for (;;)
      {
        i = 0;
        break label171;
        Iterator localIterator = entrySet().iterator();
        label60:
        if (!localIterator.hasNext()) {
          break label23;
        }
        Object localObject = (Map.Entry)localIterator.next();
        if (localMap.containsKey(((Map.Entry)localObject).getKey()))
        {
          paramObject = ((Map.Entry)localObject).getValue();
          localObject = localMap.get(((Map.Entry)localObject).getKey());
          if (((paramObject instanceof byte[])) && ((localObject instanceof byte[]))) {
            bool1 = Arrays.equals((byte[])paramObject, (byte[])localObject);
          } else {
            bool1 = paramObject.equals(localObject);
          }
          if (bool1) {
            break;
          }
        }
      }
      label171:
      if (i != 0) {
        return bool2;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = b(localEntry.getKey());
      i += (b(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final V put(K paramK, V paramV)
  {
    c();
    Charset localCharset = a0.a;
    paramK.getClass();
    paramV.getClass();
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    c();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      Charset localCharset = a0.a;
      localObject.getClass();
      paramMap.get(localObject).getClass();
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    c();
    return (V)super.remove(paramObject);
  }
}

/* Location:
 * Qualified Name:     ma.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */