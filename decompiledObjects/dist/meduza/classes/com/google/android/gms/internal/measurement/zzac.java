package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzac
{
  private zzad zza;
  private zzad zzb;
  private List<zzad> zzc;
  
  public zzac()
  {
    zza = new zzad("", 0L, null);
    zzb = new zzad("", 0L, null);
    zzc = new ArrayList();
  }
  
  private zzac(zzad paramzzad)
  {
    zza = paramzzad;
    zzb = ((zzad)paramzzad.clone());
    zzc = new ArrayList();
  }
  
  public final zzad zza()
  {
    return zza;
  }
  
  public final void zza(zzad paramzzad)
  {
    zza = paramzzad;
    zzb = ((zzad)paramzzad.clone());
    zzc.clear();
  }
  
  public final void zza(String paramString, long paramLong, Map<String, Object> paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, zzad.zza(str, zza.zza(str), paramMap.get(str)));
    }
    zzc.add(new zzad(paramString, paramLong, localHashMap));
  }
  
  public final zzad zzb()
  {
    return zzb;
  }
  
  public final void zzb(zzad paramzzad)
  {
    zzb = paramzzad;
  }
  
  public final List<zzad> zzc()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */