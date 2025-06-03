package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class zzk
  extends zzal
{
  private final zzac zzk;
  
  public zzk(zzac paramzzac)
  {
    super("internal.eventLogger");
    zzk = paramzzac;
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zza(zza, 3, paramList);
    String str = paramzzh.zza((zzaq)paramList.get(0)).zzf();
    long l = zzg.zza(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue());
    paramzzh = paramzzh.zza((zzaq)paramList.get(2));
    if ((paramzzh instanceof zzap)) {
      paramzzh = zzg.zza((zzap)paramzzh);
    } else {
      paramzzh = new HashMap();
    }
    zzk.zza(str, l, paramzzh);
    return zzaq.zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */