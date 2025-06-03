package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import b8.r;
import b8.w;
import c8.e;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzaby
  extends zzaeg<g, z0>
{
  private final w zzu;
  private final String zzv;
  private final String zzw;
  
  public zzaby(w paramw, String paramString1, String paramString2)
  {
    super(2);
    j.i(paramw);
    zzu = paramw;
    j.e(paramString1);
    zzv = paramString1;
    zzw = paramString2;
  }
  
  public final String zza()
  {
    return "finalizeMfaSignIn";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzv, zzu, zzw, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    r localr = zzd;
    if ((localr != null) && (!localr.a().equalsIgnoreCase(b.a)))
    {
      zza(new Status(17024, null, null, null));
      return;
    }
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaby
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */