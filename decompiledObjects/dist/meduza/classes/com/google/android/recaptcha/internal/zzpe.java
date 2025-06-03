package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzpe
  extends AbstractMap
{
  private Object[] zza;
  private int zzb;
  private Map zzc = Collections.emptyMap();
  private boolean zzd;
  private volatile zzpc zze;
  private Map zzf = Collections.emptyMap();
  
  private final int zzl(Comparable paramComparable)
  {
    int i = zzb - 1;
    int j = 0;
    int k = i;
    int m = j;
    if (i >= 0)
    {
      k = paramComparable.compareTo(((zzpa)zza[i]).zza());
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
      j = (m + k) / 2;
      i = paramComparable.compareTo(((zzpa)zza[j]).zza());
      if (i < 0) {
        k = j - 1;
      } else if (i > 0) {
        m = j + 1;
      } else {
        return j;
      }
    }
    return -(m + 1);
  }
  
  private final Object zzm(int paramInt)
  {
    zzo();
    Object localObject1 = ((zzpa)zza[paramInt]).getValue();
    Object localObject2 = zza;
    System.arraycopy(localObject2, paramInt + 1, localObject2, paramInt, zzb - paramInt - 1);
    zzb -= 1;
    if (!zzc.isEmpty())
    {
      localObject2 = zzn().entrySet().iterator();
      Object[] arrayOfObject = zza;
      paramInt = zzb;
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      arrayOfObject[paramInt] = new zzpa(this, (Comparable)localEntry.getKey(), localEntry.getValue());
      zzb += 1;
      ((Iterator)localObject2).remove();
    }
    return localObject1;
  }
  
  private final SortedMap zzn()
  {
    zzo();
    if ((zzc.isEmpty()) && (!(zzc instanceof TreeMap)))
    {
      TreeMap localTreeMap1 = new TreeMap();
      zzc = localTreeMap1;
      TreeMap localTreeMap2 = (TreeMap)localTreeMap1;
      zzf = localTreeMap1.descendingMap();
    }
    return (SortedMap)zzc;
  }
  
  private final void zzo()
  {
    if (!zzd) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzo();
    if (zzb != 0)
    {
      zza = null;
      zzb = 0;
    }
    if (!zzc.isEmpty()) {
      zzc.clear();
    }
  }
  
  public final boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zzl((Comparable)paramObject) >= 0) || (zzc.containsKey(paramObject));
  }
  
  public final Set entrySet()
  {
    if (zze == null) {
      zze = new zzpc(this, null);
    }
    return zze;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzpe)) {
      return super.equals(paramObject);
    }
    paramObject = (zzpe)paramObject;
    int i = size();
    if (i == ((zzpe)paramObject).size())
    {
      int j = zzb;
      Object localObject;
      if (j == zzb)
      {
        for (int k = 0; k < j; k++) {
          if (!zzg(k).equals(((zzpe)paramObject).zzg(k))) {
            return false;
          }
        }
        if (j != i) {
          localObject = zzc;
        }
      }
      for (paramObject = zzc;; paramObject = ((zzpe)paramObject).entrySet())
      {
        return localObject.equals(paramObject);
        return true;
        localObject = entrySet();
      }
    }
    return false;
  }
  
  public final Object get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zzl((Comparable)paramObject);
    if (i >= 0) {
      return ((zzpa)zza[i]).getValue();
    }
    return zzc.get(paramObject);
  }
  
  public final int hashCode()
  {
    int i = zzb;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += zza[j].hashCode();
      j++;
    }
    if (zzc.size() > 0) {
      return zzc.hashCode() + k;
    }
    return k;
  }
  
  public final Object remove(Object paramObject)
  {
    zzo();
    paramObject = (Comparable)paramObject;
    int i = zzl((Comparable)paramObject);
    if (i >= 0) {
      return zzm(i);
    }
    if (zzc.isEmpty()) {
      return null;
    }
    return zzc.remove(paramObject);
  }
  
  public final int size()
  {
    int i = zzb;
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
  
  public final int zzc()
  {
    return zzb;
  }
  
  public final Iterable zzd()
  {
    Set localSet;
    if (zzc.isEmpty()) {
      localSet = Collections.emptySet();
    } else {
      localSet = zzc.entrySet();
    }
    return localSet;
  }
  
  public final Object zzf(Comparable paramComparable, Object paramObject)
  {
    zzo();
    int i = zzl(paramComparable);
    if (i >= 0) {
      return ((zzpa)zza[i]).setValue(paramObject);
    }
    zzo();
    if (zza == null) {
      zza = new Object[16];
    }
    i = -(i + 1);
    if (i >= 16) {
      return zzn().put(paramComparable, paramObject);
    }
    if (zzb == 16)
    {
      localObject = (zzpa)zza[15];
      zzb = 15;
      zzn().put(((zzpa)localObject).zza(), ((zzpa)localObject).getValue());
    }
    Object localObject = zza;
    int j = localObject.length;
    System.arraycopy(localObject, i, localObject, i + 1, 16 - i - 1);
    zza[i] = new zzpa(this, paramComparable, paramObject);
    zzb += 1;
    return null;
  }
  
  public final Map.Entry zzg(int paramInt)
  {
    if (paramInt < zzb) {
      return (zzpa)zza[paramInt];
    }
    throw new ArrayIndexOutOfBoundsException(paramInt);
  }
  
  public final boolean zzj()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */