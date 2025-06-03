package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import b8.h;
import b8.r;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacc
  extends zzaeg<g, z0>
{
  private final h zzu;
  private final String zzv;
  
  public zzacc(h paramh, String paramString)
  {
    super(2);
    if (paramh != null)
    {
      zzu = paramh;
      j.f("email cannot be null", a);
      j.f("password cannot be null", b);
      zzv = paramString;
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
    Object localObject = zzu;
    paramTaskCompletionSource = a;
    localObject = b;
    j.e((String)localObject);
    paramzzado.zza(paramTaskCompletionSource, (String)localObject, zzd.zze(), zzd.G(), zzv, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    ((z0)zze).a(zzj, locali);
    zzb(new k1(locali));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */