package com.google.android.gms.internal.firebase_auth_api;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class zzan<K, V>
  implements Serializable, Map<K, V>
{
  private transient zzas<Map.Entry<K, V>> zza;
  private transient zzas<K> zzb;
  private transient zzai<V> zzc;
  
  public static <K, V> zzan<K, V> zza(Map<? extends K, ? extends V> paramMap)
  {
    if (((paramMap instanceof zzan)) && (!(paramMap instanceof SortedMap)))
    {
      paramMap = (zzan)paramMap;
      paramMap.zzd();
      return paramMap;
    }
    Set localSet = paramMap.entrySet();
    int i;
    if ((localSet instanceof Collection)) {
      i = localSet.size();
    } else {
      i = 4;
    }
    paramMap = new zzaq(i);
    paramMap.zza(localSet);
    return paramMap.zza();
  }
  
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
    return ((zzai)values()).contains(paramObject);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
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
    return zzax.zza((zzas)entrySet());
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
    int i = size();
    zzag.zza(i, "size");
    StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i << 3, 1073741824L));
    localStringBuilder.append('{');
    Iterator localIterator = entrySet().iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      i = 0;
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public abstract zzai<V> zza();
  
  public abstract zzas<Map.Entry<K, V>> zzb();
  
  public abstract zzas<K> zzc();
  
  public abstract boolean zzd();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */