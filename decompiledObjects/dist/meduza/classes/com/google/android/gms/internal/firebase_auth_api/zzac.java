package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzf;

abstract class zzac
  extends zzd<String>
{
  public final CharSequence zza;
  private final zzf zzb;
  private final boolean zzc;
  private int zzd = 0;
  private int zze;
  
  public zzac(com.google.android.gms.internal.firebase-auth-api.zzv paramzzv, CharSequence paramCharSequence)
  {
    zzb = zzv.zzb(paramzzv);
    zzc = false;
    zze = zzv.zza(paramzzv);
    zza = paramCharSequence;
  }
  
  public abstract int zza(int paramInt);
  
  public abstract int zzb(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */