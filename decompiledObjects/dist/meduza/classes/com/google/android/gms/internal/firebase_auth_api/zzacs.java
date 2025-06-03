package com.google.android.gms.internal.firebase_auth_api;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzacs
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzaho zzu;
  
  public zzacs(String paramString)
  {
    super(9);
    zzu = new zzaho(paramString);
  }
  
  public final String zza()
  {
    return "setFirebaseUIVersion";
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */