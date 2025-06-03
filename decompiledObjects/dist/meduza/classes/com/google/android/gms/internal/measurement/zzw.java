package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzw
  extends zzal
{
  private zzaa zzk;
  
  public zzw(zzaa paramzzaa)
  {
    super("internal.registerCallback");
    zzk = paramzzaa;
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zza(zza, 3, paramList);
    String str = paramzzh.zza((zzaq)paramList.get(0)).zzf();
    zzaq localzzaq = paramzzh.zza((zzaq)paramList.get(1));
    if ((localzzaq instanceof zzar))
    {
      paramzzh = paramzzh.zza((zzaq)paramList.get(2));
      if ((paramzzh instanceof zzap))
      {
        paramzzh = (zzap)paramzzh;
        if (paramzzh.zzc("type"))
        {
          paramList = paramzzh.zza("type").zzf();
          int i = 1000;
          if (paramzzh.zzc("priority")) {
            i = zzg.zzb(paramzzh.zza("priority").zze().doubleValue());
          }
          zzk.zza(str, i, (zzar)localzzaq, paramList);
          return zzaq.zzc;
        }
        throw new IllegalArgumentException("Undefined rule type");
      }
      throw new IllegalArgumentException("Invalid callback params");
    }
    throw new IllegalArgumentException("Invalid callback type");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */