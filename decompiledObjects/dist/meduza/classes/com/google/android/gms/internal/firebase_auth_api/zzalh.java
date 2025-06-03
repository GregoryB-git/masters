package com.google.android.gms.internal.firebase_auth_api;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzalh<K, V>
  extends LinkedHashMap<K, V>
{
  private static final zzalh<?, ?> zza;
  private boolean zzb = true;
  
  static
  {
    zzalh localzzalh = new zzalh();
    zza = localzzalh;
    zzb = false;
  }
  
  private zzalh() {}
  
  private zzalh(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  private static int zza(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return zzaki.zza((byte[])paramObject);
    }
    if (!(paramObject instanceof zzakl)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public static <K, V> zzalh<K, V> zza()
  {
    return zza;
  }
  
  private final void zze()
  {
    if (zzb) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zze();
    super.clear();
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
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
        if (size() != localMap.size()) {}
        for (;;)
        {
          i = 0;
          break label162;
          Iterator localIterator = entrySet().iterator();
          boolean bool;
          do
          {
            if (!localIterator.hasNext()) {
              break label160;
            }
            Object localObject = (Map.Entry)localIterator.next();
            if (!localMap.containsKey(((Map.Entry)localObject).getKey())) {
              break;
            }
            paramObject = ((Map.Entry)localObject).getValue();
            localObject = localMap.get(((Map.Entry)localObject).getKey());
            if (((paramObject instanceof byte[])) && ((localObject instanceof byte[]))) {
              bool = Arrays.equals((byte[])paramObject, (byte[])localObject);
            } else {
              bool = paramObject.equals(localObject);
            }
          } while (bool);
        }
      }
      label160:
      int i = 1;
      label162:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = zza(localEntry.getKey());
      i += (zza(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final V put(K paramK, V paramV)
  {
    zze();
    zzaki.zza(paramK);
    zzaki.zza(paramV);
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    zze();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zzaki.zza(localObject);
      zzaki.zza(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    zze();
    return (V)super.remove(paramObject);
  }
  
  public final void zza(zzalh<K, V> paramzzalh)
  {
    zze();
    if (!paramzzalh.isEmpty()) {
      putAll(paramzzalh);
    }
  }
  
  public final zzalh<K, V> zzb()
  {
    if (isEmpty()) {
      return new zzalh();
    }
    return new zzalh(this);
  }
  
  public final void zzc()
  {
    zzb = false;
  }
  
  public final boolean zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */