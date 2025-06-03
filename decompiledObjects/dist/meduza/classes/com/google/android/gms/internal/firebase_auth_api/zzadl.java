package com.google.android.gms.internal.firebase_auth_api;

import b8.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadl
  extends zzaeg<Void, Void>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzagn zzu;
  
  public zzadl(String paramString1, String paramString2, c paramc)
  {
    super(6);
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramc);
    zzu = zzagn.zza(paramc, paramString1, paramString2);
  }
  
  public final String zza()
  {
    return "verifyBeforeUpdateEmail";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzc(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */