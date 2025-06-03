package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzbb
{
  private Map<String, zzay> zza = new HashMap();
  private zzbq zzb = new zzbq();
  
  public zzbb()
  {
    zza(new zzaw());
    zza(new zzba());
    zza(new zzbc());
    zza(new zzbg());
    zza(new zzbi());
    zza(new zzbo());
    zza(new zzbt());
  }
  
  private final void zza(zzay paramzzay)
  {
    Iterator localIterator = zza.iterator();
    while (localIterator.hasNext())
    {
      String str = ((zzbv)localIterator.next()).toString();
      zza.put(str, paramzzay);
    }
  }
  
  public final zzaq zza(zzh paramzzh, zzaq paramzzaq)
  {
    zzg.zza(paramzzh);
    if ((paramzzaq instanceof zzat))
    {
      paramzzaq = (zzat)paramzzaq;
      ArrayList localArrayList = paramzzaq.zzb();
      String str = paramzzaq.zza();
      if (zza.containsKey(str)) {
        paramzzaq = (zzay)zza.get(str);
      } else {
        paramzzaq = zzb;
      }
      return paramzzaq.zza(str, paramzzh, localArrayList);
    }
    return paramzzaq;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */