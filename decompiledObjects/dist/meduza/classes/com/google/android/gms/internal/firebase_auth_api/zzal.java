package com.google.android.gms.internal.firebase_auth_api;

import java.util.AbstractCollection;
import java.util.List;

final class zzal<E>
  extends zzad<E>
{
  private final zzaj<E> zza;
  
  public zzal(zzaj<E> paramzzaj, int paramInt)
  {
    super(paramzzaj.size(), paramInt);
    zza = paramzzaj;
  }
  
  public final E zza(int paramInt)
  {
    return (E)zza.get(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */