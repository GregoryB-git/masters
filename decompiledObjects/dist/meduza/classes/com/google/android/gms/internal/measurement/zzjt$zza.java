package com.google.android.gms.internal.measurement;

final class zzjt$zza
{
  private final Object zza;
  private final int zzb;
  
  public zzjt$zza(Object paramObject, int paramInt)
  {
    zza = paramObject;
    zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zza)) {
      return false;
    }
    paramObject = (zza)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(zza) * 65535 + zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjt.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */