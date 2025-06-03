package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;

final class zu$c<K, V>
  implements Map.Entry<K, V>
{
  public c<K, V> a;
  public c<K, V> b;
  public c<K, V> c;
  public c<K, V> d;
  public c<K, V> e;
  public final K f;
  public V g;
  public int h;
  
  public zu$c()
  {
    f = null;
    e = this;
    d = this;
  }
  
  public zu$c(c<K, V> paramc1, K paramK, c<K, V> paramc2, c<K, V> paramc3)
  {
    a = paramc1;
    f = paramK;
    h = 1;
    d = paramc2;
    e = paramc3;
    d = this;
    e = this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      Object localObject = f;
      if (localObject == null ? ((Map.Entry)paramObject).getKey() == null : localObject.equals(((Map.Entry)paramObject).getKey()))
      {
        localObject = g;
        if (localObject == null ? ((Map.Entry)paramObject).getValue() == null : localObject.equals(((Map.Entry)paramObject).getValue())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final K getKey()
  {
    return (K)f;
  }
  
  public final V getValue()
  {
    return (V)g;
  }
  
  public final int hashCode()
  {
    Object localObject = f;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = g;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final V setValue(V paramV)
  {
    Object localObject = g;
    g = paramV;
    return (V)localObject;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(f);
    localStringBuilder.append("=");
    localStringBuilder.append(g);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zu.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */