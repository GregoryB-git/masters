package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import b8.r;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzadf
  extends zzaeg<g, z0>
{
  public zzadf()
  {
    super(2);
  }
  
  public final String zza()
  {
    return "unlinkEmailCredential";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zze(zzd.zze(), zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */