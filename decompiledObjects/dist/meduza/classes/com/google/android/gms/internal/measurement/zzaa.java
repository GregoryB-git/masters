package com.google.android.gms.internal.measurement;

import f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public final class zzaa
{
  private final TreeMap<Integer, zzar> zza = new TreeMap();
  private final TreeMap<Integer, zzar> zzb = new TreeMap();
  
  private static int zza(zzh paramzzh, zzar paramzzar, zzaq paramzzaq)
  {
    paramzzh = paramzzar.zza(paramzzh, Collections.singletonList(paramzzaq));
    if ((paramzzh instanceof zzai)) {
      return zzg.zzb(paramzzh.zze().doubleValue());
    }
    return -1;
  }
  
  public final void zza(zzh paramzzh, zzac paramzzac)
  {
    zzn localzzn = new zzn(paramzzac);
    Object localObject = zza.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      zzad localzzad = (zzad)paramzzac.zzb().clone();
      int i = zza(paramzzh, (zzar)zza.get(localInteger), localzzn);
      if ((i == 2) || (i == -1)) {
        paramzzac.zzb(localzzad);
      }
    }
    paramzzac = zzb.keySet().iterator();
    while (paramzzac.hasNext())
    {
      localObject = (Integer)paramzzac.next();
      zza(paramzzh, (zzar)zzb.get(localObject), localzzn);
    }
  }
  
  public final void zza(String paramString1, int paramInt, zzar paramzzar, String paramString2)
  {
    if ("create".equals(paramString2))
    {
      paramString1 = zzb;
    }
    else
    {
      if (!"edit".equals(paramString2)) {
        break label73;
      }
      paramString1 = zza;
    }
    int i = paramInt;
    if (paramString1.containsKey(Integer.valueOf(paramInt))) {
      i = ((Integer)paramString1.lastKey()).intValue() + 1;
    }
    paramString1.put(Integer.valueOf(i), paramzzar);
    return;
    label73:
    throw new IllegalStateException(f.j("Unknown callback type: ", paramString2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */