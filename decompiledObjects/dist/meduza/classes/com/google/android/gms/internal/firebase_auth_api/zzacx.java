package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacx
  extends zzaeg<g, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzaid zzu;
  
  public zzacx(String paramString1, String paramString2)
  {
    super(2);
    j.f("token cannot be null or empty", paramString1);
    zzu = new zzaid(paramString1, paramString2);
  }
  
  public final String zza()
  {
    return "signInWithCustomToken";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */