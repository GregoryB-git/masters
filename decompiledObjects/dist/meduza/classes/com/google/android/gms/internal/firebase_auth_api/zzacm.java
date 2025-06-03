package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.r;
import c8.e;
import c8.i;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzacm
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzr zzu;
  
  public zzacm(c0 paramc0, String paramString)
  {
    super(2);
    if (paramc0 != null)
    {
      d = false;
      zzu = new zzzr(paramc0, paramString);
      return;
    }
    throw new NullPointerException("credential cannot be null");
  }
  
  public final String zza()
  {
    return "reauthenticateWithPhoneCredential";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    if (zzd.a().equalsIgnoreCase(b.a))
    {
      ((z0)zze).a(zzj, locali);
      zzb(null);
      return;
    }
    zza(new Status(17024, null, null, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */