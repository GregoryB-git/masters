package com.google.android.gms.internal.common;

public class zzj
{
  private final Class zza;
  private final Object zzb;
  
  private zzj(Class paramClass, Object paramObject)
  {
    zza = paramClass;
    zzb = paramObject;
  }
  
  public static zzj zzb(Class paramClass, Object paramObject)
  {
    return new zzj(paramClass, paramObject);
  }
  
  public final Class zzc()
  {
    return zza;
  }
  
  public final Object zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */