package com.google.android.gms.internal.measurement;

import g;
import java.util.List;

public final class zzbo
  extends zzay
{
  public zzbo()
  {
    zza.add(zzbv.zza);
    zza.add(zzbv.zzu);
    zza.add(zzbv.zzap);
    zza.add(zzbv.zzaq);
    zza.add(zzbv.zzar);
    zza.add(zzbv.zzaw);
    zza.add(zzbv.zzax);
    zza.add(zzbv.zzaz);
    zza.add(zzbv.zzba);
    zza.add(zzbv.zzbd);
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    double d;
    switch (zzbr.zza[zzg.zza(paramString).ordinal()])
    {
    default: 
      return super.zza(paramString);
    case 10: 
      zzg.zza(zzbv.zzbd, 2, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      paramzzh = new zzai(Double.valueOf(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue() * -1.0D));
      d = paramString.zze().doubleValue();
      return new zzai(Double.valueOf(paramzzh.zze().doubleValue() + d));
    case 8: 
    case 9: 
      zzg.zza(paramString, 1, paramList);
      return paramzzh.zza((zzaq)paramList.get(0));
    case 6: 
    case 7: 
      zzg.zza(paramString, 2, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      paramzzh.zza((zzaq)paramList.get(1));
      return paramString;
    case 5: 
      zzg.zza(zzbv.zzar, 1, paramList);
      return new zzai(Double.valueOf(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue() * -1.0D));
    case 4: 
      zzg.zza(zzbv.zzaq, 2, paramList);
      return new zzai(Double.valueOf(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue() * paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()));
    case 3: 
      zzg.zza(zzbv.zzap, 2, paramList);
      return new zzai(Double.valueOf(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue() % paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()));
    case 2: 
      zzg.zza(zzbv.zzu, 2, paramList);
      return new zzai(Double.valueOf(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue() / paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()));
    }
    zzg.zza(zzbv.zza, 2, paramList);
    paramString = paramzzh.zza((zzaq)paramList.get(0));
    paramzzh = paramzzh.zza((zzaq)paramList.get(1));
    if ((!(paramString instanceof zzak)) && (!(paramString instanceof zzas)) && (!(paramzzh instanceof zzak)) && (!(paramzzh instanceof zzas)))
    {
      d = paramString.zze().doubleValue();
      return new zzai(Double.valueOf(paramzzh.zze().doubleValue() + d));
    }
    return new zzas(g.d(paramString.zzf(), paramzzh.zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */