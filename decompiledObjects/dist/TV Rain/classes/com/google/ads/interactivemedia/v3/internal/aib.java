package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class aib<K, V>
  implements Serializable, Map<K, V>
{
  private transient aid<Map.Entry<K, V>> a;
  private transient aid<K> b;
  private transient ahx<V> c;
  
  public static <K, V> aib<K, V> a(K paramK, V paramV)
  {
    aim.a(paramK, paramV);
    return aig.a(1, new Object[] { paramK, paramV });
  }
  
  public static <K, V> aib<K, V> a(Map<? extends K, ? extends V> paramMap)
  {
    if (((paramMap instanceof aib)) && (!(paramMap instanceof SortedMap)))
    {
      paramMap = (aib)paramMap;
      paramMap.e();
      return paramMap;
    }
    Set localSet = paramMap.entrySet();
    int i;
    if ((localSet instanceof Collection)) {
      i = localSet.size();
    } else {
      i = 4;
    }
    paramMap = new aim(i);
    paramMap.a(localSet);
    return paramMap.a();
  }
  
  private final ahx<V> f()
  {
    ahx localahx1 = c;
    ahx localahx2 = localahx1;
    if (localahx1 == null)
    {
      localahx2 = d();
      c = localahx2;
    }
    return localahx2;
  }
  
  public final aid<Map.Entry<K, V>> a()
  {
    aid localaid1 = a;
    aid localaid2 = localaid1;
    if (localaid1 == null)
    {
      localaid2 = b();
      a = localaid2;
    }
    return localaid2;
  }
  
  public abstract aid<Map.Entry<K, V>> b();
  
  public abstract aid<K> c();
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return f().contains(paramObject);
  }
  
  public abstract ahx<V> d();
  
  public abstract boolean e();
  
  public boolean equals(Object paramObject)
  {
    return aim.a(this, paramObject);
  }
  
  public abstract V get(Object paramObject);
  
  public final V getOrDefault(Object paramObject, V paramV)
  {
    paramObject = get(paramObject);
    if (paramObject != null) {
      return (V)paramObject;
    }
    return paramV;
  }
  
  public int hashCode()
  {
    return aim.a(a());
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  @Deprecated
  public final V put(K paramK, V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    return aim.a(this);
  }
  
  public Object writeReplace()
  {
    return new aia(this);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */