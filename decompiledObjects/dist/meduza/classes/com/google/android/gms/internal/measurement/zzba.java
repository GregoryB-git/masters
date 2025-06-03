package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzba
  extends zzay
{
  public zzba()
  {
    zza.add(zzbv.zzv);
    zza.add(zzbv.zzai);
    zza.add(zzbv.zzaj);
    zza.add(zzbv.zzak);
    zza.add(zzbv.zzal);
    zza.add(zzbv.zzan);
    zza.add(zzbv.zzao);
    zza.add(zzbv.zzat);
  }
  
  private static boolean zza(zzaq paramzzaq1, zzaq paramzzaq2)
  {
    zzaq localzzaq = paramzzaq1;
    boolean bool1;
    for (;;)
    {
      if (localzzaq.getClass().equals(paramzzaq2.getClass()))
      {
        if ((!(localzzaq instanceof zzax)) && (!(localzzaq instanceof zzao)))
        {
          if ((localzzaq instanceof zzai)) {
            return (!Double.isNaN(localzzaq.zze().doubleValue())) && (!Double.isNaN(paramzzaq2.zze().doubleValue())) && (localzzaq.zze().doubleValue() == paramzzaq2.zze().doubleValue());
          }
          if ((localzzaq instanceof zzas)) {
            return localzzaq.zzf().equals(paramzzaq2.zzf());
          }
          if ((localzzaq instanceof zzag)) {
            return localzzaq.zzd().equals(paramzzaq2.zzd());
          }
          return localzzaq == paramzzaq2;
        }
        return true;
      }
      if ((((localzzaq instanceof zzax)) || ((localzzaq instanceof zzao))) && (((paramzzaq2 instanceof zzax)) || ((paramzzaq2 instanceof zzao)))) {
        break label380;
      }
      bool1 = localzzaq instanceof zzai;
      if ((!bool1) || (!(paramzzaq2 instanceof zzas))) {
        break;
      }
      paramzzaq1 = new zzai(paramzzaq2.zze());
      label217:
      paramzzaq2 = paramzzaq1;
    }
    boolean bool2 = localzzaq instanceof zzas;
    if ((bool2) && ((paramzzaq2 instanceof zzai))) {
      paramzzaq1 = new zzai(localzzaq.zze());
    } else {
      if (!(localzzaq instanceof zzag)) {
        break label283;
      }
    }
    for (paramzzaq1 = new zzai(localzzaq.zze());; paramzzaq1 = new zzas(localzzaq.zzf()))
    {
      localzzaq = paramzzaq1;
      break;
      label283:
      if ((paramzzaq2 instanceof zzag))
      {
        paramzzaq1 = new zzai(paramzzaq2.zze());
        break label217;
      }
      if (((bool2) || (bool1)) && ((paramzzaq2 instanceof zzak)))
      {
        paramzzaq1 = new zzas(paramzzaq2.zzf());
        break label217;
      }
      if ((!(localzzaq instanceof zzak)) || ((!(paramzzaq2 instanceof zzas)) && (!(paramzzaq2 instanceof zzai)))) {
        break label378;
      }
    }
    label378:
    return false;
    label380:
    return true;
  }
  
  private static boolean zzb(zzaq paramzzaq1, zzaq paramzzaq2)
  {
    Object localObject = paramzzaq1;
    if ((paramzzaq1 instanceof zzak)) {
      localObject = new zzas(paramzzaq1.zzf());
    }
    paramzzaq1 = paramzzaq2;
    if ((paramzzaq2 instanceof zzak)) {
      paramzzaq1 = new zzas(paramzzaq2.zzf());
    }
    if (((localObject instanceof zzas)) && ((paramzzaq1 instanceof zzas))) {
      return ((zzaq)localObject).zzf().compareTo(paramzzaq1.zzf()) < 0;
    }
    double d1 = ((zzaq)localObject).zze().doubleValue();
    double d2 = paramzzaq1.zze().doubleValue();
    if ((!Double.isNaN(d1)) && (!Double.isNaN(d2)))
    {
      if (((d1 == 0.0D) && (d2 == 0.0D)) || ((d1 == 0.0D) && (d2 == 0.0D))) {
        return false;
      }
      if (Double.compare(d1, d2) < 0) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean zzc(zzaq paramzzaq1, zzaq paramzzaq2)
  {
    Object localObject = paramzzaq1;
    if ((paramzzaq1 instanceof zzak)) {
      localObject = new zzas(paramzzaq1.zzf());
    }
    paramzzaq1 = paramzzaq2;
    if ((paramzzaq2 instanceof zzak)) {
      paramzzaq1 = new zzas(paramzzaq2.zzf());
    }
    return (((localObject instanceof zzas)) && ((paramzzaq1 instanceof zzas))) || ((!Double.isNaN(((zzaq)localObject).zze().doubleValue())) && (!Double.isNaN(paramzzaq1.zze().doubleValue())) && (!zzb(paramzzaq1, (zzaq)localObject)));
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zza(zzg.zza(paramString), 2, paramList);
    zzaq localzzaq = paramzzh.zza((zzaq)paramList.get(0));
    paramzzh = paramzzh.zza((zzaq)paramList.get(1));
    switch (zzbd.zza[zzg.zza(paramString).ordinal()])
    {
    default: 
      return super.zza(paramString);
    case 8: 
      bool = zza(localzzaq, paramzzh);
      break;
    case 7: 
      bool = zzc(localzzaq, paramzzh);
      break;
    case 6: 
      bool = zzb(localzzaq, paramzzh);
      break;
    case 5: 
      bool = zzg.zza(localzzaq, paramzzh);
      bool ^= true;
      break;
    case 4: 
      bool = zzg.zza(localzzaq, paramzzh);
      break;
    case 3: 
      bool = zzc(paramzzh, localzzaq);
      break;
    case 2: 
      bool = zzb(paramzzh, localzzaq);
      break;
    }
    boolean bool = zza(localzzaq, paramzzh);
    if (bool) {
      return zzaq.zzh;
    }
    return zzaq.zzi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */