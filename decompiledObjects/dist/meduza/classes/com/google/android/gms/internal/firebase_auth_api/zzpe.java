package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.Objects;

final class zzpe
{
  private final Class<?> zza;
  private final Class<?> zzb;
  
  private zzpe(Class<?> paramClass1, Class<?> paramClass2)
  {
    zza = paramClass1;
    zzb = paramClass2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzpe)) {
      return false;
    }
    paramObject = (zzpe)paramObject;
    return (zza.equals(zza)) && (zzb.equals(zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza, zzb });
  }
  
  public final String toString()
  {
    return g.e(zza.getSimpleName(), " with primitive type: ", zzb.getSimpleName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */