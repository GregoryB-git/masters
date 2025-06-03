package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzn
  extends zzap
{
  private final zzac zza;
  
  public zzn(zzac paramzzac)
  {
    zza = paramzzac;
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1570616835: 
      if (paramString.equals("setEventName")) {
        j = 5;
      }
      break;
    case 920706790: 
      if (paramString.equals("setParamValue")) {
        j = 4;
      }
      break;
    case 700587132: 
      if (paramString.equals("getParams")) {
        j = 3;
      }
      break;
    case 146575578: 
      if (paramString.equals("getParamValue")) {
        j = 2;
      }
      break;
    case 45521504: 
      if (paramString.equals("getTimestamp")) {
        j = 1;
      }
      break;
    case 21624207: 
      if (paramString.equals("getEventName")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return super.zza(paramString, paramzzh, paramList);
    case 5: 
      zzg.zza("setEventName", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((!zzaq.zzc.equals(paramString)) && (!zzaq.zzd.equals(paramString)))
      {
        zza.zzb().zzb(paramString.zzf());
        return new zzas(paramString.zzf());
      }
      throw new IllegalArgumentException("Illegal event name");
    case 4: 
      zzg.zza("setParamValue", 2, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0)).zzf();
      paramzzh = paramzzh.zza((zzaq)paramList.get(1));
      zza.zzb().zza(paramString, zzg.zza(paramzzh));
      return paramzzh;
    case 3: 
      zzg.zza("getParams", 0, paramList);
      paramList = zza.zzb().zzc();
      paramzzh = new zzap();
      paramString = paramList.keySet().iterator();
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramzzh.zza(str, zzj.zza(paramList.get(str)));
      }
      return paramzzh;
    case 2: 
      zzg.zza("getParamValue", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0)).zzf();
      return zzj.zza(zza.zzb().zza(paramString));
    case 1: 
      zzg.zza("getTimestamp", 0, paramList);
      return new zzai(Double.valueOf(zza.zzb().zza()));
    }
    zzg.zza("getEventName", 0, paramList);
    return new zzas(zza.zzb().zzb());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */