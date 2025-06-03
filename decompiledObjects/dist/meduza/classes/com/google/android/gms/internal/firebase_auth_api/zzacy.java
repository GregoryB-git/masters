package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacy
  extends zzaeg<g, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzr zzu;
  
  public zzacy(c0 paramc0, String paramString)
  {
    super(2);
    j.i(paramc0);
    zzu = new zzzr(paramc0, paramString);
  }
  
  public final String zza()
  {
    return "signInWithPhoneNumber";
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */