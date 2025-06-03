package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzlg<K, V>
  extends LinkedHashMap<K, V>
{
  private static final zzlg<?, ?> zza;
  private boolean zzb = true;
  
  static
  {
    zzlg localzzlg = new zzlg();
    zza = localzzlg;
    zzb = false;
  }
  
  private zzlg() {}
  
  private zzlg(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  private static int zza(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return zzkj.zza((byte[])paramObject);
    }
    if (!(paramObject instanceof zzki)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public static <K, V> zzlg<K, V> zza()
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
      paramObject = (Map)paramObject;
      if (this != paramObject)
      {
        if (size() != ((Map)paramObject).size()) {}
        for (;;)
        {
          i = 0;
          break label163;
          Iterator localIterator = entrySet().iterator();
          boolean bool;
          do
          {
            if (!localIterator.hasNext()) {
              break label161;
            }
            Object localObject1 = (Map.Entry)localIterator.next();
            if (!((Map)paramObject).containsKey(((Map.Entry)localObject1).getKey())) {
              break;
            }
            Object localObject2 = ((Map.Entry)localObject1).getValue();
            localObject1 = ((Map)paramObject).get(((Map.Entry)localObject1).getKey());
            if (((localObject2 instanceof byte[])) && ((localObject1 instanceof byte[]))) {
              bool = Arrays.equals((byte[])localObject2, (byte[])localObject1);
            } else {
              bool = localObject2.equals(localObject1);
            }
          } while (bool);
        }
      }
      label161:
      int i = 1;
      label163:
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
    zzkj.zza(paramK);
    zzkj.zza(paramV);
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    zze();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zzkj.zza(localObject);
      zzkj.zza(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    zze();
    return (V)super.remove(paramObject);
  }
  
  public final void zza(zzlg<K, V> paramzzlg)
  {
    zze();
    if (!paramzzlg.isEmpty()) {
      putAll(paramzzlg);
    }
  }
  
  public final zzlg<K, V> zzb()
  {
    if (isEmpty()) {
      return new zzlg();
    }
    return new zzlg(this);
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzlg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */