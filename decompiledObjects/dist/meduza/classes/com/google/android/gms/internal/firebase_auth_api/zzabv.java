package com.google.android.gms.internal.firebase_auth_api;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzabv
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzahd zzu;
  
  public zzabv(String paramString1, String paramString2, String paramString3)
  {
    super(4);
    j.f("code cannot be null or empty", paramString1);
    j.f("new password cannot be null or empty", paramString2);
    zzu = new zzahd(paramString1, paramString2, paramString3);
  }
  
  public final String zza()
  {
    return "confirmPasswordReset";
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */