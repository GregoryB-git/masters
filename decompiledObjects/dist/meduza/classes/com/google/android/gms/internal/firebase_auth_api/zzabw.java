package com.google.android.gms.internal.firebase_auth_api;

import b8.j0;
import c8.s;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import m6.j;

final class zzabw
  extends zzaeg<j0, z0>
{
  private final String zzu;
  private final String zzv;
  
  public zzabw(String paramString1, String paramString2)
  {
    super(3);
    j.f("email cannot be null or empty", paramString1);
    zzu = paramString1;
    zzv = paramString2;
  }
  
  public final String zza()
  {
    return "fetchSignInMethodsForEmail";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zze(zzu, zzv, zzb);
  }
  
  public final void zzb()
  {
    Object localObject;
    if (zzl.zza() == null)
    {
      localObject = zzaj.zzh();
    }
    else
    {
      localObject = zzl.zza();
      j.i(localObject);
    }
    zzb(new s((List)localObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */