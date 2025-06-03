package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzu
  extends zzal
{
  private boolean zzk;
  private boolean zzl;
  
  public zzu(zzr paramzzr, boolean paramBoolean1, boolean paramBoolean2)
  {
    super("log");
    zzk = paramBoolean1;
    zzl = paramBoolean2;
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zzb("log", 1, paramList);
    if (paramList.size() == 1)
    {
      zzr.zza(zzm).zza(zzs.zzc, paramzzh.zza((zzaq)paramList.get(0)).zzf(), Collections.emptyList(), zzk, zzl);
      return zzaq.zzc;
    }
    zzs localzzs = zzs.zza(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()));
    String str = paramzzh.zza((zzaq)paramList.get(1)).zzf();
    int i = paramList.size();
    int j = 2;
    if (i == 2) {
      paramList = zzr.zza(zzm);
    }
    ArrayList localArrayList;
    for (paramzzh = Collections.emptyList();; paramzzh = localArrayList)
    {
      paramList.zza(localzzs, str, paramzzh, zzk, zzl);
      break;
      localArrayList = new ArrayList();
      while (j < Math.min(paramList.size(), 5))
      {
        localArrayList.add(paramzzh.zza((zzaq)paramList.get(j)).zzf());
        j++;
      }
      paramList = zzr.zza(zzm);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */