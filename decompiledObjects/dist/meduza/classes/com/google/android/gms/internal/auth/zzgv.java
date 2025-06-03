package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzgv
  extends AbstractMap
{
  private final int zza;
  private List zzb;
  private Map zzc;
  private boolean zzd;
  private volatile zzgt zze;
  private Map zzf;
  
  private final int zzk(Comparable paramComparable)
  {
    int i = zzb.size() - 1;
    int j = 0;
    int k = i;
    int m = j;
    if (i >= 0)
    {
      k = paramComparable.compareTo(((zzgp)zzb.get(i)).zza());
      if (k > 0) {
        return -(i + 2);
      }
      if (k != 0)
      {
        k = i;
        m = j;
      }
      else
      {
        return i;
      }
    }
    while (m <= k)
    {
      i = (m + k) / 2;
      j = paramComparable.compareTo(((zzgp)zzb.get(i)).zza());
      if (j < 0) {
        k = i - 1;
      } else if (j > 0) {
        m = i + 1;
      } else {
        return i;
      }
    }
    return -(m + 1);
  }
  
  private final Object zzl(int paramInt)
  {
    zzn();
    Object localObject = ((zzgp)zzb.remove(paramInt)).getValue();
    if (!zzc.isEmpty())
    {
      Iterator localIterator = zzm().entrySet().iterator();
      List localList = zzb;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localList.add(new zzgp(this, (Comparable)localEntry.getKey(), localEntry.getValue()));
      localIterator.remove();
    }
    return localObject;
  }
  
  private final SortedMap zzm()
  {
    zzn();
    if ((zzc.isEmpty()) && (!(zzc instanceof TreeMap)))
    {
      TreeMap localTreeMap1 = new TreeMap();
      zzc = localTreeMap1;
      TreeMap localTreeMap2 = (TreeMap)localTreeMap1;
      zzf = localTreeMap1.descendingMap();
    }
    return (SortedMap)zzc;
  }
  
  private final void zzn()
  {
    if (!zzd) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzn();
    if (!zzb.isEmpty()) {
      zzb.clear();
    }
    if (!zzc.isEmpty()) {
      zzc.clear();
    }
  }
  
  public final boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zzk((Comparable)paramObject) >= 0) || (zzc.containsKey(paramObject));
  }
  
  public final Set entrySet()
  {
    if (zze == null) {
      zze = new zzgt(this, null);
    }
    return zze;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzgv)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgv)paramObject;
    int i = size();
    if (i != ((zzgv)paramObject).size()) {
      return false;
    }
    int j = zzb();
    Object localObject;
    if (j == ((zzgv)paramObject).zzb())
    {
      for (int k = 0; k < j; k++) {
        if (!zzg(k).equals(((zzgv)paramObject).zzg(k))) {
          return false;
        }
      }
      if (j != i) {
        localObject = zzc;
      }
    }
    for (paramObject = zzc;; paramObject = ((zzgv)paramObject).entrySet())
    {
      return localObject.equals(paramObject);
      return true;
      localObject = entrySet();
    }
  }
  
  public final Object get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zzk((Comparable)paramObject);
    if (i >= 0) {
      return ((zzgp)zzb.get(i)).getValue();
    }
    return zzc.get(paramObject);
  }
  
  public final int hashCode()
  {
    int i = zzb();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((zzgp)zzb.get(j)).hashCode();
      j++;
    }
    if (zzc.size() > 0) {
      return zzc.hashCode() + k;
    }
    return k;
  }
  
  public final Object remove(Object paramObject)
  {
    zzn();
    paramObject = (Comparable)paramObject;
    int i = zzk((Comparable)paramObject);
    if (i >= 0) {
      return zzl(i);
    }
    if (zzc.isEmpty()) {
      return null;
    }
    return zzc.remove(paramObject);
  }
  
  public final int size()
  {
    int i = zzb.size();
    return zzc.size() + i;
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
    return zzb.size();
  }
  
  public final Iterable zzc()
  {
    Object localObject;
    if (zzc.isEmpty()) {
      localObject = zzgo.zza();
    } else {
      localObject = zzc.entrySet();
    }
    return (Iterable)localObject;
  }
  
  public final Object zze(Comparable paramComparable, Object paramObject)
  {
    zzn();
    int i = zzk(paramComparable);
    if (i >= 0) {
      return ((zzgp)zzb.get(i)).setValue(paramObject);
    }
    zzn();
    if ((zzb.isEmpty()) && (!(zzb instanceof ArrayList))) {
      zzb = new ArrayList(zza);
    }
    int j = -(i + 1);
    if (j >= zza) {
      return zzm().put(paramComparable, paramObject);
    }
    int k = zzb.size();
    i = zza;
    if (k == i)
    {
      zzgp localzzgp = (zzgp)zzb.remove(i - 1);
      zzm().put(localzzgp.zza(), localzzgp.getValue());
    }
    zzb.add(j, new zzgp(this, paramComparable, paramObject));
    return null;
  }
  
  public final Map.Entry zzg(int paramInt)
  {
    return (Map.Entry)zzb.get(paramInt);
  }
  
  public final boolean zzj()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */