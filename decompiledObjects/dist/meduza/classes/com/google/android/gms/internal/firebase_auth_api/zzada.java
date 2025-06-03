package com.google.android.gms.internal.firebase_auth_api;

import c8.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzada
  extends zzaeg<zzahs, Void>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzahv zzu;
  
  public zzada(n paramn, String paramString)
  {
    super(12);
    j.i(paramn);
    paramn = a;
    j.e(paramn);
    zzu = zzahv.zza(paramn, paramString);
  }
  
  public final String zza()
  {
    return "startMfaEnrollment";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(zzt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzada
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */