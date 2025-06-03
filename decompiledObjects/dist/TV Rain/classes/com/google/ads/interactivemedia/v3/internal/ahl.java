package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;
import z2;

abstract class ahl<K, V>
  implements Map.Entry<K, V>
{
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if ((ahf.a(getKey(), ((Map.Entry)paramObject).getKey())) && (ahf.a(getValue(), ((Map.Entry)paramObject).getValue()))) {
        return true;
      }
    }
    return false;
  }
  
  public abstract K getKey();
  
  public abstract V getValue();
  
  public int hashCode()
  {
    Object localObject1 = getKey();
    Object localObject2 = getValue();
    int i = 0;
    int j;
    if (localObject1 == null) {
      j = 0;
    } else {
      j = localObject1.hashCode();
    }
    if (localObject2 != null) {
      i = localObject2.hashCode();
    }
    return j ^ i;
  }
  
  public V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    String str1 = String.valueOf(getKey());
    String str2 = String.valueOf(getValue());
    int i = str1.length();
    return z2.l(str2.length() + (i + 1), str1, "=", str2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */