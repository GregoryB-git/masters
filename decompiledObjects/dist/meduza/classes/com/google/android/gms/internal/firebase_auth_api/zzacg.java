package com.google.android.gms.internal.firebase_auth_api;

import b.z;
import b8.f;
import b8.r;
import c8.e;
import c8.i;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzacg
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzaic zzu;
  
  public zzacg(f paramf, String paramString)
  {
    super(2);
    if (paramf != null)
    {
      zzu = z.K(paramf, paramString).zza(false);
      return;
    }
    throw new NullPointerException("credential cannot be null");
  }
  
  public final String zza()
  {
    return "reauthenticateWithCredential";
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */