package com.google.android.gms.internal.firebase_auth_api;

import b8.c;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzact
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzagn zzu;
  private final String zzv;
  
  public zzact(String paramString1, c paramc, String paramString2, String paramString3, String paramString4)
  {
    super(4);
    j.f("email cannot be null or empty", paramString1);
    zzagn localzzagn = new zzagn(q);
    zzu = localzzagn;
    localzzagn.zzb(paramString1);
    localzzagn.zza(paramc);
    localzzagn.zzc(paramString2);
    localzzagn.zza(paramString3);
    zzv = paramString4;
  }
  
  public final String zza()
  {
    return zzv;
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzb(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzact
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */