package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag
  implements zzaq
{
  private final boolean zza;
  
  public zzag(Boolean paramBoolean)
  {
    if (paramBoolean == null) {}
    for (boolean bool = false;; bool = paramBoolean.booleanValue())
    {
      zza = bool;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzag)) {
      return false;
    }
    paramObject = (zzag)paramObject;
    return zza == zza;
  }
  
  public final int hashCode()
  {
    return Boolean.valueOf(zza).hashCode();
  }
  
  public final String toString()
  {
    return String.valueOf(zza);
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    if ("toString".equals(paramString)) {
      return new zzas(Boolean.toString(zza));
    }
    throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[] { Boolean.toString(zza), paramString }));
  }
  
  public final zzaq zzc()
  {
    return new zzag(Boolean.valueOf(zza));
  }
  
  public final Boolean zzd()
  {
    return Boolean.valueOf(zza);
  }
  
  public final Double zze()
  {
    double d;
    if (zza) {
      d = 1.0D;
    } else {
      d = 0.0D;
    }
    return Double.valueOf(d);
  }
  
  public final String zzf()
  {
    return Boolean.toString(zza);
  }
  
  public final Iterator<zzaq> zzh()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */