package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzmj<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private Object[] zza;
  private int zzb;
  private Map<K, V> zzc = Collections.emptyMap();
  private boolean zzd;
  private volatile zzmp zze;
  private Map<K, V> zzf = Collections.emptyMap();
  
  private final int zza(K paramK)
  {
    int i = zzb - 1;
    if (i >= 0)
    {
      j = paramK.compareTo((Comparable)((zzmn)zza[i]).getKey());
      if (j > 0) {
        return -(i + 2);
      }
      if (j == 0) {
        return i;
      }
    }
    int j = 0;
    while (j <= i)
    {
      int k = (j + i) / 2;
      int m = paramK.compareTo((Comparable)((zzmn)zza[k]).getKey());
      if (m < 0) {
        i = k - 1;
      } else if (m > 0) {
        j = k + 1;
      } else {
        return k;
      }
    }
    return -(j + 1);
  }
  
  private final V zzb(int paramInt)
  {
    zzg();
    Object localObject1 = ((zzmn)zza[paramInt]).getValue();
    Object localObject2 = zza;
    System.arraycopy(localObject2, paramInt + 1, localObject2, paramInt, zzb - paramInt - 1);
    zzb -= 1;
    if (!zzc.isEmpty())
    {
      localObject2 = zzf().entrySet().iterator();
      zza[zzb] = new zzmn(this, (Map.Entry)((Iterator)localObject2).next());
      zzb += 1;
      ((Iterator)localObject2).remove();
    }
    return (V)localObject1;
  }
  
  private final SortedMap<K, V> zzf()
  {
    zzg();
    if ((zzc.isEmpty()) && (!(zzc instanceof TreeMap)))
    {
      TreeMap localTreeMap1 = new TreeMap();
      zzc = localTreeMap1;
      TreeMap localTreeMap2 = (TreeMap)localTreeMap1;
      zzf = localTreeMap1.descendingMap();
    }
    return (SortedMap)zzc;
  }
  
  private final void zzg()
  {
    if (!zzd) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public void clear()
  {
    zzg();
    if (zzb != 0)
    {
      zza = null;
      zzb = 0;
    }
    if (!zzc.isEmpty()) {
      zzc.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zza((Comparable)paramObject) >= 0) || (zzc.containsKey(paramObject));
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (zze == null) {
      zze = new zzmp(this, null);
    }
    return zze;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzmj)) {
      return super.equals(paramObject);
    }
    Object localObject = (zzmj)paramObject;
    int i = size();
    if (i != ((zzmj)localObject).size()) {
      return false;
    }
    int j = zzb;
    if (j != zzb) {
      paramObject = entrySet();
    }
    for (localObject = ((zzmj)localObject).entrySet();; localObject = zzc)
    {
      return paramObject.equals(localObject);
      for (int k = 0; k < j; k++) {
        if (!zza(k).equals(((zzmj)localObject).zza(k))) {
          return false;
        }
      }
      if (j == i) {
        break;
      }
      paramObject = zzc;
    }
    return true;
  }
  
  public V get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)((zzmn)zza[i]).getValue();
    }
    return (V)zzc.get(paramObject);
  }
  
  public int hashCode()
  {
    int i = zzb;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += zza[j].hashCode();
      j++;
    }
    j = k;
    if (zzc.size() > 0) {
      j = k + zzc.hashCode();
    }
    return j;
  }
  
  public V remove(Object paramObject)
  {
    zzg();
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)zzb(i);
    }
    if (zzc.isEmpty()) {
      return null;
    }
    return (V)zzc.remove(paramObject);
  }
  
  public int size()
  {
    int i = zzb;
    return zzc.size() + i;
  }
  
  public final V zza(K paramK, V paramV)
  {
    zzg();
    int i = zza(paramK);
    if (i >= 0) {
      return (V)((zzmn)zza[i]).setValue(paramV);
    }
    zzg();
    if (zza == null) {
      zza = new Object[16];
    }
    i = -(i + 1);
    if (i >= 16) {
      return (V)zzf().put(paramK, paramV);
    }
    int j = zzb;
    if (j == 16)
    {
      localObject = (zzmn)zza[15];
      zzb = (j - 1);
      zzf().put((Comparable)((zzmn)localObject).getKey(), ((zzmn)localObject).getValue());
    }
    Object localObject = zza;
    System.arraycopy(localObject, i, localObject, i + 1, localObject.length - i - 1);
    zza[i] = new zzmn(this, paramK, paramV);
    zzb += 1;
    return null;
  }
  
  public final Map.Entry<K, V> zza(int paramInt)
  {
    if (paramInt < zzb) {
      return (zzmn)zza[paramInt];
    }
    throw new ArrayIndexOutOfBoundsException(paramInt);
  }
  
  public void zza()
  {
    if (!zzd)
    {
      Map localMap;
      if (zzc.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(zzc);
      }
      zzc = localMap;
      if (zzf.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(zzf);
      }
      zzf = localMap;
      zzd = true;
    }
  }
  
  public final int zzb()
  {
    return zzb;
  }
  
  public final Iterable<Map.Entry<K, V>> zzc()
  {
    if (zzc.isEmpty()) {
      return Collections.emptySet();
    }
    return zzc.entrySet();
  }
  
  public final Set<Map.Entry<K, V>> zzd()
  {
    return new zzmk(this, null);
  }
  
  public final boolean zze()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */