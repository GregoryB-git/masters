package com.google.android.recaptcha.internal;

final class zzmn
{
  private final Object zza;
  private final int zzb;
  
  public zzmn(Object paramObject, int paramInt)
  {
    zza = paramObject;
    zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzmn)) {
      return false;
    }
    paramObject = (zzmn)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(zza) * 65535 + zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */