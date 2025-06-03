package com.google.android.gms.internal.firebase_auth_api;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadc
  extends zzaeg<Void, z0>
{
  private final String zzu;
  private final String zzv;
  private final String zzw;
  
  public zzadc(String paramString1, String paramString2, String paramString3)
  {
    super(2);
    j.e(paramString1);
    zzu = paramString1;
    j.e(paramString2);
    zzv = paramString2;
    zzw = paramString3;
  }
  
  public final String zza()
  {
    return "unenrollMfa";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzv, zzw, zzb);
  }
  
  public final void zzb()
  {
    ((z0)zze).a(zzj, zzabq.zza(zzc, zzk));
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */