package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import b8.s;
import c8.d0;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacb
  extends zzaeg<s, z0>
{
  private final String zzu;
  
  public zzacb(String paramString)
  {
    super(1);
    j.f("refresh token cannot be null", paramString);
    zzu = paramString;
  }
  
  public final String zza()
  {
    return "getAccessToken";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzb(zzu, zzb);
  }
  
  public final void zzb()
  {
    if (TextUtils.isEmpty(zzj.zzd())) {
      zzj.zzc(zzu);
    }
    ((z0)zze).a(zzj, zzd);
    zzb(d0.a(zzj.zzc()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */