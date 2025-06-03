package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.r;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadj
  extends zzaeg<Void, z0>
{
  private final c0 zzu;
  
  public zzadj(c0 paramc0)
  {
    super(2);
    j.i(paramc0);
    zzu = paramc0;
  }
  
  public final String zza()
  {
    return "updatePhoneNumber";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(new zzaha(zzd.zze(), zzaex.zza(zzu)), zzb);
  }
  
  public final void zzb()
  {
    ((z0)zze).a(zzj, zzabq.zza(zzc, zzk));
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */