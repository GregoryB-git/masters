package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import b8.h;
import b8.r;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzach
  extends zzaeg<g, z0>
{
  private final h zzu;
  
  public zzach(h paramh)
  {
    super(2);
    if (paramh != null)
    {
      zzu = paramh;
      return;
    }
    throw new NullPointerException("credential cannot be null");
  }
  
  public final String zza()
  {
    return "linkEmailAuthCredential";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    h localh = zzu;
    paramTaskCompletionSource = zzd;
    localh.getClass();
    d = paramTaskCompletionSource.zze();
    e = true;
    paramzzado.zza(new zzafy(localh, null, null), zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzach
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */