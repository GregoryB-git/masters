package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class zzal
  implements zzak, zzaq
{
  public final String zza;
  public final Map<String, zzaq> zzb = new HashMap();
  
  public zzal(String paramString)
  {
    zza = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzal)) {
      return false;
    }
    zzal localzzal = (zzal)paramObject;
    paramObject = zza;
    if (paramObject != null) {
      return ((String)paramObject).equals(zza);
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = zza;
    if (str != null) {
      return str.hashCode();
    }
    return 0;
  }
  
  public abstract zzaq zza(zzh paramzzh, List<zzaq> paramList);
  
  public final zzaq zza(String paramString)
  {
    if (zzb.containsKey(paramString)) {
      return (zzaq)zzb.get(paramString);
    }
    return zzaq.zzc;
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    if ("toString".equals(paramString)) {
      return new zzas(zza);
    }
    return zzan.zza(this, new zzas(paramString), paramzzh, paramList);
  }
  
  public final String zza()
  {
    return zza;
  }
  
  public final void zza(String paramString, zzaq paramzzaq)
  {
    if (paramzzaq == null)
    {
      zzb.remove(paramString);
      return;
    }
    zzb.put(paramString, paramzzaq);
  }
  
  public zzaq zzc()
  {
    return this;
  }
  
  public final boolean zzc(String paramString)
  {
    return zzb.containsKey(paramString);
  }
  
  public final Boolean zzd()
  {
    return Boolean.TRUE;
  }
  
  public final Double zze()
  {
    return Double.valueOf(NaN.0D);
  }
  
  public final String zzf()
  {
    return zza;
  }
  
  public final Iterator<zzaq> zzh()
  {
    return zzan.zza(zzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */