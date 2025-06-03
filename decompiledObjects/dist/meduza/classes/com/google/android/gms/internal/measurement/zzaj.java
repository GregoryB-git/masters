package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaj
  implements zzaq
{
  private final zzaq zza;
  private final String zzb;
  
  public zzaj()
  {
    zza = zzaq.zzc;
    zzb = "return";
  }
  
  public zzaj(String paramString)
  {
    zza = zzaq.zzc;
    zzb = paramString;
  }
  
  public zzaj(String paramString, zzaq paramzzaq)
  {
    zza = paramzzaq;
    zzb = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzaj)) {
      return false;
    }
    String str = zzb;
    paramObject = (zzaj)paramObject;
    return (str.equals(zzb)) && (zza.equals(zza));
  }
  
  public final int hashCode()
  {
    int i = zzb.hashCode();
    return zza.hashCode() + i * 31;
  }
  
  public final zzaq zza()
  {
    return zza;
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    throw new IllegalStateException("Control does not have functions");
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final zzaq zzc()
  {
    return new zzaj(zzb, zza.zzc());
  }
  
  public final Boolean zzd()
  {
    throw new IllegalStateException("Control is not a boolean");
  }
  
  public final Double zze()
  {
    throw new IllegalStateException("Control is not a double");
  }
  
  public final String zzf()
  {
    throw new IllegalStateException("Control is not a String");
  }
  
  public final Iterator<zzaq> zzh()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */