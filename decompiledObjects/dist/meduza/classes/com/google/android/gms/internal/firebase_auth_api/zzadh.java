package com.google.android.gms.internal.firebase_auth_api;

import b8.r;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadh
  extends zzaeg<Void, z0>
{
  private final String zzu;
  
  public zzadh(String paramString)
  {
    super(2);
    j.f("email cannot be null or empty", paramString);
    zzu = paramString;
  }
  
  public final String zza()
  {
    return "updateEmail";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzb(zzd.zze(), zzu, zzb);
  }
  
  public final void zzb()
  {
    ((z0)zze).a(zzj, zzabq.zza(zzc, zzk));
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */