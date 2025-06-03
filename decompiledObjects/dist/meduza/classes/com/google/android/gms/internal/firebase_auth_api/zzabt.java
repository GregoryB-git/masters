package com.google.android.gms.internal.firebase_auth_api;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzabt
  extends zzaeg<Void, z0>
{
  private final String zzu;
  private final String zzv;
  
  public zzabt(String paramString1, String paramString2)
  {
    super(7);
    j.f("code cannot be null or empty", paramString1);
    zzu = paramString1;
    zzv = paramString2;
  }
  
  public final String zza()
  {
    return "applyActionCode";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzv, zzb);
  }
  
  public final void zzb()
  {
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */