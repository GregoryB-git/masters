package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzat
  implements zzaq
{
  private final String zza;
  private final ArrayList<zzaq> zzb;
  
  public zzat(String paramString, List<zzaq> paramList)
  {
    zza = paramString;
    paramString = new ArrayList();
    zzb = paramString;
    paramString.addAll(paramList);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzat)) {
      return false;
    }
    Object localObject = (zzat)paramObject;
    paramObject = zza;
    if (paramObject != null ? !((String)paramObject).equals(zza) : zza != null) {
      return false;
    }
    paramObject = zzb;
    localObject = zzb;
    if (paramObject != null) {
      return ((ArrayList)paramObject).equals(localObject);
    }
    return localObject == null;
  }
  
  public final int hashCode()
  {
    Object localObject = zza;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = zzb;
    if (localObject != null) {
      i = ((ArrayList)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    throw new IllegalStateException("Statement is not an evaluated entity");
  }
  
  public final String zza()
  {
    return zza;
  }
  
  public final ArrayList<zzaq> zzb()
  {
    return zzb;
  }
  
  public final zzaq zzc()
  {
    return this;
  }
  
  public final Boolean zzd()
  {
    throw new IllegalStateException("Statement cannot be cast as Boolean");
  }
  
  public final Double zze()
  {
    throw new IllegalStateException("Statement cannot be cast as Double");
  }
  
  public final String zzf()
  {
    throw new IllegalStateException("Statement cannot be cast as String");
  }
  
  public final Iterator<zzaq> zzh()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */