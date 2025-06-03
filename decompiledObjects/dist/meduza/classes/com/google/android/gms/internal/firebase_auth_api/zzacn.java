package com.google.android.gms.internal.firebase_auth_api;

import b8.g;
import b8.r;
import c8.e;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzacn
  extends zzaeg<g, z0>
{
  private final String zzu;
  private final String zzv;
  private final String zzw;
  private final String zzx;
  
  public zzacn(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(2);
    j.f("email cannot be null or empty", paramString1);
    j.f("password cannot be null or empty", paramString2);
    zzu = paramString1;
    zzv = paramString2;
    zzw = paramString3;
    zzx = paramString4;
  }
  
  public final String zza()
  {
    return "reauthenticateWithEmailPasswordWithData";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zzb(zzu, zzv, zzw, zzx, zzb);
  }
  
  public final void zzb()
  {
    i locali = zzabq.zza(zzc, zzk);
    if (zzd.a().equalsIgnoreCase(b.a))
    {
      ((z0)zze).a(zzj, locali);
      zzb(new k1(locali));
      return;
    }
    zza(new Status(17024, null, null, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */