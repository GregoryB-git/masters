package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.Objects;

final class zzpu
{
  private final Class<?> zza;
  private final Class<? extends zzpq> zzb;
  
  private zzpu(Class<?> paramClass, Class<? extends zzpq> paramClass1)
  {
    zza = paramClass;
    zzb = paramClass1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzpu)) {
      return false;
    }
    paramObject = (zzpu)paramObject;
    return (zza.equals(zza)) && (zzb.equals(zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza, zzb });
  }
  
  public final String toString()
  {
    return g.e(zza.getSimpleName(), " with serialization type: ", zzb.getSimpleName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */