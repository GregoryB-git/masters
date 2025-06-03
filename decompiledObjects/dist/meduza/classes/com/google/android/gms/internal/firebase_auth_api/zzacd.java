package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacd
  extends zzaeg<zzagt, Void>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzagu zzu;
  
  public zzacd(String paramString1, String paramString2)
  {
    super(10);
    j.e(paramString2);
    zzu = zzagu.zza(paramString1, paramString2);
  }
  
  public final String zza()
  {
    return "getRecaptchaConfig";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(zzr);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */