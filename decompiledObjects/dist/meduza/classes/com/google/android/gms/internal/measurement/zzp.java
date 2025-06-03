package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzp
  extends zzal
{
  public zzp(zzm paramzzm, String paramString, zzo paramzzo)
  {
    super(paramString);
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zza("getValue", 2, paramList);
    zzaq localzzaq = paramzzh.zza((zzaq)paramList.get(0));
    paramzzh = paramzzh.zza((zzaq)paramList.get(1));
    paramList = localzzaq.zzf();
    paramList = zzk.zza(paramList);
    if (paramList != null) {
      paramzzh = new zzas(paramList);
    }
    return paramzzh;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */