package com.google.android.gms.internal.firebase_auth_api;

import b8.h;
import b8.r;
import c8.e;
import c8.i;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaci
  extends zzaeg<Void, z0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzafy zzu;
  
  public zzaci(h paramh, String paramString)
  {
    super(2);
    if (paramh != null)
    {
      zzu = new zzafy(paramh, null, paramString);
      return;
    }
    throw new NullPointerException("Credential cannot be null");
  }
  
  public final String zza()
  {
    return "reauthenticateWithEmailLink";
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */