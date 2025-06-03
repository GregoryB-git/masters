package com.google.android.gms.internal.fido;

import a0.j;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;

public final class zzbg
  extends zzbh
  implements NavigableMap
{
  private static final Comparator zzc;
  private static final zzbg zzd;
  private final transient zzbu zze;
  private final transient zzaz zzf;
  private final transient zzbg zzg;
  
  static
  {
    Object localObject = zzbp.zza;
    zzc = (Comparator)localObject;
    localObject = zzbi.zzq((Comparator)localObject);
    int i = zzaz.zzd;
    zzd = new zzbg((zzbu)localObject, zzbs.zza, null);
  }
  
  public zzbg(zzbu paramzzbu, zzaz paramzzaz, zzbg paramzzbg)
  {
    zze = paramzzbu;
    zzf = paramzzaz;
    zzg = paramzzbg;
  }
  
  public static zzbg zzf(Map paramMap)
  {
    Comparator localComparator = zzc;
    Object localObject1 = paramMap.comparator();
    int i = 1;
    boolean bool;
    if (localObject1 == null) {
      bool = true;
    } else {
      bool = localComparator.equals(localObject1);
    }
    localObject1 = paramMap.entrySet();
    Object localObject2 = zzba.zza;
    paramMap = (Map)localObject1;
    if (!(localObject1 instanceof Collection))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      paramMap = new ArrayList();
      localObject1.getClass();
      while (((Iterator)localObject1).hasNext()) {
        paramMap.add(((Iterator)localObject1).next());
      }
    }
    Map.Entry[] arrayOfEntry = (Map.Entry[])paramMap.toArray((Object[])localObject2);
    int j = arrayOfEntry.length;
    if (j != 0)
    {
      int k = 0;
      if (j != 1)
      {
        Object[] arrayOfObject = new Object[j];
        localObject2 = new Object[j];
        if (bool) {
          for (i = k; i < j; i++)
          {
            localObject1 = arrayOfEntry[i];
            localObject1.getClass();
            paramMap = ((Map.Entry)localObject1).getKey();
            localObject1 = ((Map.Entry)localObject1).getValue();
            zzas.zza(paramMap, localObject1);
            arrayOfObject[i] = paramMap;
            localObject2[i] = localObject1;
          }
        }
        Arrays.sort(arrayOfEntry, 0, j, new zzbd(localComparator));
        localObject1 = arrayOfEntry[0];
        localObject1.getClass();
        paramMap = ((Map.Entry)localObject1).getKey();
        arrayOfObject[0] = paramMap;
        localObject1 = ((Map.Entry)localObject1).getValue();
        localObject2[0] = localObject1;
        zzas.zza(arrayOfObject[0], localObject1);
        while (i < j)
        {
          Map.Entry localEntry1 = arrayOfEntry[(i - 1)];
          localEntry1.getClass();
          Map.Entry localEntry2 = arrayOfEntry[i];
          localEntry2.getClass();
          localObject1 = localEntry2.getKey();
          Object localObject3 = localEntry2.getValue();
          zzas.zza(localObject1, localObject3);
          arrayOfObject[i] = localObject1;
          localObject2[i] = localObject3;
          if (localComparator.compare(paramMap, localObject1) != 0)
          {
            i++;
            paramMap = (Map)localObject1;
          }
          else
          {
            throw new IllegalArgumentException(j.k("Multiple entries with same key: ", String.valueOf(localEntry1), " and ", String.valueOf(localEntry2)));
          }
        }
        paramMap = new zzbg(new zzbu(zzaz.zzh(arrayOfObject, j), localComparator), zzaz.zzh((Object[])localObject2, j), null);
      }
      else
      {
        localObject1 = arrayOfEntry[0];
        localObject1.getClass();
        paramMap = ((Map.Entry)localObject1).getKey();
        localObject1 = ((Map.Entry)localObject1).getValue();
        paramMap = new zzbg(new zzbu(zzaz.zzj(paramMap), localComparator), zzaz.zzj(localObject1), null);
      }
    }
    else
    {
      paramMap = zzg(localComparator);
    }
    return paramMap;
  }
  
  public static zzbg zzg(Comparator paramComparator)
  {
    if (zzbp.zza.equals(paramComparator)) {
      return zzd;
    }
    paramComparator = zzbi.zzq(paramComparator);
    int i = zzaz.zzd;
    return new zzbg(paramComparator, zzbs.zza, null);
  }
  
  private final zzbg zzl(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 0) {
      if (paramInt2 != zzf.size()) {
        i = 0;
      } else {
        return this;
      }
    }
    if (i == paramInt2) {
      return zzg(zze.zza);
    }
    return new zzbg(zze.zzu(i, paramInt2), zzf.zzg(i, paramInt2), null);
  }
  
  public final Map.Entry ceilingEntry(Object paramObject)
  {
    return zzj(paramObject, true).firstEntry();
  }
  
  public final Object ceilingKey(Object paramObject)
  {
    return zzbn.zza(ceilingEntry(paramObject));
  }
  
  public final Comparator comparator()
  {
    return zze.zza;
  }
  
  public final Map.Entry firstEntry()
  {
    if (isEmpty()) {
      return null;
    }
    return (Map.Entry)zzc().zzi().get(0);
  }
  
  public final Object firstKey()
  {
    return zze.first();
  }
  
  public final Map.Entry floorEntry(Object paramObject)
  {
    return zzh(paramObject, true).lastEntry();
  }
  
  public final Object floorKey(Object paramObject)
  {
    return zzbn.zza(floorEntry(paramObject));
  }
  
  public final Object get(Object paramObject)
  {
    zzbu localzzbu = zze;
    if (paramObject == null) {}
    for (;;)
    {
      int i = -1;
      try
      {
        int j = Collections.binarySearch(zzd, paramObject, zza);
        i = j;
        if (j >= 0)
        {
          if (i == -1) {
            return null;
          }
          return zzf.get(i);
        }
      }
      catch (ClassCastException paramObject) {}
    }
  }
  
  public final Map.Entry higherEntry(Object paramObject)
  {
    return zzj(paramObject, false).firstEntry();
  }
  
  public final Object higherKey(Object paramObject)
  {
    return zzbn.zza(higherEntry(paramObject));
  }
  
  public final Map.Entry lastEntry()
  {
    if (isEmpty()) {
      return null;
    }
    return (Map.Entry)zzc().zzi().get(zzf.size() - 1);
  }
  
  public final Object lastKey()
  {
    return zze.last();
  }
  
  public final Map.Entry lowerEntry(Object paramObject)
  {
    return zzh(paramObject, false).lastEntry();
  }
  
  public final Object lowerKey(Object paramObject)
  {
    return zzbn.zza(lowerEntry(paramObject));
  }
  
  @Deprecated
  public final Map.Entry pollFirstEntry()
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final Map.Entry pollLastEntry()
  {
    throw new UnsupportedOperationException();
  }
  
  public final int size()
  {
    return zzf.size();
  }
  
  public final zzav zza()
  {
    return zzf;
  }
  
  public final zzbc zzb()
  {
    Object localObject;
    if (isEmpty()) {
      localObject = zzbt.zza;
    } else {
      localObject = new zzbf(this);
    }
    return (zzbc)localObject;
  }
  
  public final zzbg zzh(Object paramObject, boolean paramBoolean)
  {
    zzbu localzzbu = zze;
    paramObject.getClass();
    return zzl(0, localzzbu.zzs(paramObject, paramBoolean));
  }
  
  public final zzbg zzi(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    paramObject1.getClass();
    paramObject2.getClass();
    if (zze.zza.compare(paramObject1, paramObject2) <= 0) {
      return zzh(paramObject2, paramBoolean2).zzj(paramObject1, paramBoolean1);
    }
    throw new IllegalArgumentException(zzaq.zza("expected fromKey <= toKey but %s > %s", new Object[] { paramObject1, paramObject2 }));
  }
  
  public final zzbg zzj(Object paramObject, boolean paramBoolean)
  {
    zzbu localzzbu = zze;
    paramObject.getClass();
    return zzl(localzzbu.zzt(paramObject, paramBoolean), zzf.size());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */