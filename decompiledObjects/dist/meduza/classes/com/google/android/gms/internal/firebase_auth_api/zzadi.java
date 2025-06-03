package com.google.android.gms.internal.firebase_auth_api;

import b8.p0;
import b8.r;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzadi
  extends zzaeg<Void, z0>
{
  private final p0 zzu;
  
  public zzadi(p0 paramp0)
  {
    super(2);
    if (paramp0 != null)
    {
      zzu = paramp0;
      return;
    }
    throw new NullPointerException("request cannot be null");
  }
  
  public final String zza()
  {
    return "updateProfile";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzd.zze(), zzu, zzb);
  }
  
  public final void zzb()
  {
    ((z0)zze).a(zzj, zzabq.zza(zzc, zzk));
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */