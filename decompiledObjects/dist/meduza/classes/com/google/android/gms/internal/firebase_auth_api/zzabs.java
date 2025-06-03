package com.google.android.gms.internal.firebase_auth_api;

import b8.b;
import c8.g1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzabs
  extends zzaeg<b, z0>
{
  private final String zzu;
  private final String zzv;
  
  public zzabs(String paramString1, String paramString2)
  {
    super(4);
    j.f("code cannot be null or empty", paramString1);
    zzu = paramString1;
    zzv = paramString2;
  }
  
  public final String zza()
  {
    return "checkActionCode";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzd(zzu, zzv, zzb);
  }
  
  public final void zzb()
  {
    zzb(new g1(zzm));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */