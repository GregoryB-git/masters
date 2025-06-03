package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbg
  extends zzay
{
  public zzbg()
  {
    zza.add(zzbv.zzb);
    zza.add(zzbv.zzas);
    zza.add(zzbv.zzav);
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    int i = zzbj.zza[zzg.zza(paramString).ordinal()];
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3) {
          return super.zza(paramString);
        }
        zzg.zza(zzbv.zzav, 2, paramList);
        paramString = paramzzh.zza((zzaq)paramList.get(0));
        if (paramString.zzd().booleanValue()) {
          return paramString;
        }
      }
    }
    do
    {
      return paramzzh.zza((zzaq)paramList.get(1));
      zzg.zza(zzbv.zzas, 1, paramList);
      return new zzag(Boolean.valueOf(paramzzh.zza((zzaq)paramList.get(0)).zzd().booleanValue() ^ true));
      zzg.zza(zzbv.zzb, 2, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
    } while (paramString.zzd().booleanValue());
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */