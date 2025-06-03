package com.google.android.gms.internal.auth;

import g;

final class zzdi
  extends zzdh
{
  private final Object zza;
  
  public zzdi(Object paramObject)
  {
    zza = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzdi))
    {
      paramObject = (zzdi)paramObject;
      return zza.equals(zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return zza.hashCode() + 1502476572;
  }
  
  public final String toString()
  {
    return g.e("Optional.of(", zza.toString(), ")");
  }
  
  public final Object zza()
  {
    return zza;
  }
  
  public final boolean zzb()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */