package com.google.android.gms.internal.firebase_auth_api;

import java.util.Set;

public abstract class zzas<E>
  extends zzai<E>
  implements Set<E>
{
  private transient zzaj<E> zza;
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    return zzax.zza(this, paramObject);
  }
  
  public int hashCode()
  {
    return zzax.zza(this);
  }
  
  public zzaj<E> zzc()
  {
    com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj1 = zza;
    com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj2 = localzzaj1;
    if (localzzaj1 == null)
    {
      localzzaj2 = zzg();
      zza = localzzaj2;
    }
    return localzzaj2;
  }
  
  public zzaj<E> zzg()
  {
    return zzaj.zza(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */