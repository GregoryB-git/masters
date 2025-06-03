package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzaw
  extends zzay
{
  public zzaw()
  {
    zza.add(zzbv.zze);
    zza.add(zzbv.zzf);
    zza.add(zzbv.zzg);
    zza.add(zzbv.zzh);
    zza.add(zzbv.zzi);
    zza.add(zzbv.zzj);
    zza.add(zzbv.zzk);
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    switch (zzaz.zza[zzg.zza(paramString).ordinal()])
    {
    default: 
      return super.zza(paramString);
    case 7: 
      zzg.zza(zzbv.zzk, 2, paramList);
      return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) ^ zzg.zzb(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue())));
    case 6: 
      zzg.zza(zzbv.zzj, 2, paramList);
      return new zzai(Double.valueOf(zzg.zzc(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) >>> (int)(zzg.zzc(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()) & 0x1F)));
    case 5: 
      zzg.zza(zzbv.zzi, 2, paramList);
      return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) >> (int)(zzg.zzc(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()) & 0x1F)));
    case 4: 
      zzg.zza(zzbv.zzh, 2, paramList);
      return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) | zzg.zzb(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue())));
    case 3: 
      zzg.zza(zzbv.zzg, 1, paramList);
      return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue())));
    case 2: 
      zzg.zza(zzbv.zzf, 2, paramList);
      return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) << (int)(zzg.zzc(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()) & 0x1F)));
    }
    zzg.zza(zzbv.zze, 2, paramList);
    return new zzai(Double.valueOf(zzg.zzb(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue()) & zzg.zzb(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */