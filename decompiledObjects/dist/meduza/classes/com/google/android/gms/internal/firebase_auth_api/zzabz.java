package com.google.android.gms.internal.firebase_auth_api;

import b8.w;
import c8.i;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzabz
  extends zzaeg<Void, z0>
{
  private final w zzu;
  private final String zzv;
  private final String zzw;
  private final String zzx;
  
  public zzabz(w paramw, String paramString1, String paramString2, String paramString3)
  {
    super(2);
    j.i(paramw);
    zzu = paramw;
    j.e(paramString1);
    zzv = paramString1;
    zzw = paramString2;
    zzx = paramString3;
  }
  
  public final String zza()
  {
    return "finalizeMfaEnrollment";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzv, zzw, zzx, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */