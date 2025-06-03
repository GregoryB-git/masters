package com.google.android.gms.internal.firebase_auth_api;

import b8.c;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacq
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzagn zzu;
  
  public zzacq(String paramString, c paramc)
  {
    super(6);
    j.f("token cannot be null or empty", paramString);
    zzagn localzzagn = new zzagn(4);
    zzu = localzzagn;
    localzzagn.zzd(paramString);
    if (paramc != null) {
      localzzagn.zza(paramc);
    }
  }
  
  public final String zza()
  {
    return "sendEmailVerification";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */