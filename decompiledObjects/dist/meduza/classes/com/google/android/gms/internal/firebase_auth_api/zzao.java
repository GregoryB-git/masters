package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;

final class zzao
  extends zzaj
{
  private final transient int zza;
  private final transient int zzb;
  
  public zzao(com.google.android.gms.internal.firebase-auth-api.zzaj paramzzaj, int paramInt1, int paramInt2)
  {
    zza = paramInt1;
    zzb = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzw.zza(paramInt, zzb);
    return zzc.get(paramInt + zza);
  }
  
  public final int size()
  {
    return zzb;
  }
  
  public final int zza()
  {
    return zzc.zzb() + zza + zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaj zza(int paramInt1, int paramInt2)
  {
    zzw.zza(paramInt1, paramInt2, zzb);
    com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj = zzc;
    int i = zza;
    return (zzaj)localzzaj.subList(paramInt1 + i, paramInt2 + i);
  }
  
  public final int zzb()
  {
    return zzc.zzb() + zza;
  }
  
  public final boolean zze()
  {
    return true;
  }
  
  public final Object[] zzf()
  {
    return zzc.zzf();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */