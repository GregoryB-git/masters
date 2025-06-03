package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.Objects;

final class zzpv
{
  private final Class<? extends zzpq> zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzb;
  
  private zzpv(Class<? extends zzpq> paramClass, zzzn paramzzzn)
  {
    zza = paramClass;
    zzb = paramzzzn;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzpv)) {
      return false;
    }
    paramObject = (zzpv)paramObject;
    return (zza.equals(zza)) && (zzb.equals(zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza, zzb });
  }
  
  public final String toString()
  {
    return g.e(zza.getSimpleName(), ", object identifier: ", String.valueOf(zzb));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */