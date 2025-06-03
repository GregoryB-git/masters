package com.google.android.gms.internal.measurement;

import a0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzaf
  implements zzak, zzaq, Iterable<zzaq>
{
  private final SortedMap<Integer, zzaq> zza = new TreeMap();
  private final Map<String, zzaq> zzb = new TreeMap();
  
  public zzaf() {}
  
  public zzaf(List<zzaq> paramList)
  {
    this();
    if (paramList != null) {
      for (int i = 0; i < paramList.size(); i++) {
        zzb(i, (zzaq)paramList.get(i));
      }
    }
  }
  
  public zzaf(zzaq... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzaf)) {
      return false;
    }
    paramObject = (zzaf)paramObject;
    if (zzb() != ((zzaf)paramObject).zzb()) {
      return false;
    }
    if (zza.isEmpty()) {
      return zza.isEmpty();
    }
    for (int i = ((Integer)zza.firstKey()).intValue(); i <= ((Integer)zza.lastKey()).intValue(); i++) {
      if (!zza(i).equals(((zzaf)paramObject).zza(i))) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    return zza.hashCode() * 31;
  }
  
  public final Iterator<zzaq> iterator()
  {
    return new zzah(this);
  }
  
  public final String toString()
  {
    return zzb(",");
  }
  
  public final int zza()
  {
    return zza.size();
  }
  
  public final zzaq zza(int paramInt)
  {
    if (paramInt < zzb())
    {
      if (zzc(paramInt))
      {
        zzaq localzzaq = (zzaq)zza.get(Integer.valueOf(paramInt));
        if (localzzaq != null) {
          return localzzaq;
        }
      }
      return zzaq.zzc;
    }
    throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
  }
  
  public final zzaq zza(String paramString)
  {
    if ("length".equals(paramString)) {
      return new zzai(Double.valueOf(zzb()));
    }
    if (zzc(paramString))
    {
      paramString = (zzaq)zzb.get(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return zzaq.zzc;
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    int i;
    if ((!"concat".equals(paramString)) && (!"every".equals(paramString)) && (!"filter".equals(paramString)) && (!"forEach".equals(paramString)) && (!"indexOf".equals(paramString)) && (!"join".equals(paramString)) && (!"lastIndexOf".equals(paramString)) && (!"map".equals(paramString)) && (!"pop".equals(paramString)) && (!"push".equals(paramString)) && (!"reduce".equals(paramString)) && (!"reduceRight".equals(paramString)) && (!"reverse".equals(paramString)) && (!"shift".equals(paramString)) && (!"slice".equals(paramString)) && (!"some".equals(paramString)) && (!"sort".equals(paramString)) && (!"splice".equals(paramString)) && (!"toString".equals(paramString)) && (!"unshift".equals(paramString))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      return zzbe.zza(paramString, this, paramzzh, paramList);
    }
    return zzan.zza(this, new zzas(paramString), paramzzh, paramList);
  }
  
  public final void zza(int paramInt, zzaq paramzzaq)
  {
    if (paramInt >= 0)
    {
      if (paramInt >= zzb())
      {
        zzb(paramInt, paramzzaq);
        return;
      }
      for (int i = ((Integer)zza.lastKey()).intValue(); i >= paramInt; i--)
      {
        zzaq localzzaq = (zzaq)zza.get(Integer.valueOf(i));
        if (localzzaq != null)
        {
          zzb(i + 1, localzzaq);
          zza.remove(Integer.valueOf(i));
        }
      }
      zzb(paramInt, paramzzaq);
      return;
    }
    throw new IllegalArgumentException(j.g("Invalid value index: ", paramInt));
  }
  
  public final void zza(zzaq paramzzaq)
  {
    zzb(zzb(), paramzzaq);
  }
  
  public final void zza(String paramString, zzaq paramzzaq)
  {
    if (paramzzaq == null)
    {
      zzb.remove(paramString);
      return;
    }
    zzb.put(paramString, paramzzaq);
  }
  
  public final int zzb()
  {
    if (zza.isEmpty()) {
      return 0;
    }
    return ((Integer)zza.lastKey()).intValue() + 1;
  }
  
  public final String zzb(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (!zza.isEmpty())
    {
      for (int i = 0; i < zzb(); i++)
      {
        paramString = zza(i);
        localStringBuilder.append(str);
        if ((!(paramString instanceof zzax)) && (!(paramString instanceof zzao))) {
          localStringBuilder.append(paramString.zzf());
        }
      }
      localStringBuilder.delete(0, str.length());
    }
    return localStringBuilder.toString();
  }
  
  public final void zzb(int paramInt)
  {
    int i = ((Integer)zza.lastKey()).intValue();
    if ((paramInt <= i) && (paramInt >= 0))
    {
      zza.remove(Integer.valueOf(paramInt));
      int j = paramInt;
      Object localObject;
      if (paramInt == i)
      {
        localObject = zza;
        paramInt--;
        if ((!((Map)localObject).containsKey(Integer.valueOf(paramInt))) && (paramInt >= 0)) {
          zza.put(Integer.valueOf(paramInt), zzaq.zzc);
        }
        return;
      }
      for (;;)
      {
        j++;
        if (j > ((Integer)zza.lastKey()).intValue()) {
          break;
        }
        localObject = (zzaq)zza.get(Integer.valueOf(j));
        if (localObject != null)
        {
          zza.put(Integer.valueOf(j - 1), localObject);
          zza.remove(Integer.valueOf(j));
        }
      }
    }
  }
  
  public final void zzb(int paramInt, zzaq paramzzaq)
  {
    if (paramInt <= 32468)
    {
      if (paramInt >= 0)
      {
        if (paramzzaq == null)
        {
          zza.remove(Integer.valueOf(paramInt));
          return;
        }
        zza.put(Integer.valueOf(paramInt), paramzzaq);
        return;
      }
      throw new IndexOutOfBoundsException(j.g("Out of bounds index: ", paramInt));
    }
    throw new IllegalStateException("Array too large");
  }
  
  public final zzaq zzc()
  {
    zzaf localzzaf = new zzaf();
    Iterator localIterator = zza.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      SortedMap localSortedMap;
      Integer localInteger;
      if ((((Map.Entry)localObject).getValue() instanceof zzak))
      {
        localSortedMap = zza;
        localInteger = (Integer)((Map.Entry)localObject).getKey();
        localObject = (zzaq)((Map.Entry)localObject).getValue();
      }
      else
      {
        localSortedMap = zza;
        localInteger = (Integer)((Map.Entry)localObject).getKey();
        localObject = ((zzaq)((Map.Entry)localObject).getValue()).zzc();
      }
      localSortedMap.put(localInteger, localObject);
    }
    return localzzaf;
  }
  
  public final boolean zzc(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= ((Integer)zza.lastKey()).intValue())) {
      return zza.containsKey(Integer.valueOf(paramInt));
    }
    throw new IndexOutOfBoundsException(j.g("Out of bounds index: ", paramInt));
  }
  
  public final boolean zzc(String paramString)
  {
    return ("length".equals(paramString)) || (zzb.containsKey(paramString));
  }
  
  public final Boolean zzd()
  {
    return Boolean.TRUE;
  }
  
  public final Double zze()
  {
    if (zza.size() == 1) {
      return zza(0).zze();
    }
    if (zza.size() <= 0) {
      return Double.valueOf(0.0D);
    }
    return Double.valueOf(NaN.0D);
  }
  
  public final String zzf()
  {
    return toString();
  }
  
  public final Iterator<Integer> zzg()
  {
    return zza.keySet().iterator();
  }
  
  public final Iterator<zzaq> zzh()
  {
    return new zzae(this, zza.keySet().iterator(), zzb.keySet().iterator());
  }
  
  public final List<zzaq> zzi()
  {
    ArrayList localArrayList = new ArrayList(zzb());
    for (int i = 0; i < zzb(); i++) {
      localArrayList.add(zza(i));
    }
    return localArrayList;
  }
  
  public final void zzj()
  {
    zza.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */