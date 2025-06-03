package com.google.android.gms.internal.firebase_auth_api;

import b.z;
import b8.f;
import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.internal.firebase-auth-api.zzaic;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzacu
  extends zzaeg<g, z0>
{
  private final zzaic zzu;
  
  public zzacu(f paramf, String paramString)
  {
    super(2);
    if (paramf != null)
    {
      zzu = z.K(paramf, paramString);
      return;
    }
    throw new NullPointerException("credential cannot be null");
  }
  
  public final String zza()
  {
    return "signInWithCredential";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */