package com.google.android.gms.internal.firebase_auth_api;

final class zzaju
{
  private final Object zza;
  private final int zzb;
  
  public zzaju(Object paramObject, int paramInt)
  {
    zza = paramObject;
    zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzaju)) {
      return false;
    }
    paramObject = (zzaju)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(zza) * 65535 + zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaju
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */