package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.g;
import b8.r;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzace
  extends zzaeg<g, z0>
{
  private final c0 zzu;
  
  public zzace(c0 paramc0)
  {
    super(2);
    if (paramc0 != null)
    {
      zzu = paramc0;
      return;
    }
    throw new NullPointerException("credential cannot be null");
  }
  
  public final String zza()
  {
    return "linkPhoneAuthCredential";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(new zzaha(zzd.zze(), zzaex.zza(zzu)), zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */