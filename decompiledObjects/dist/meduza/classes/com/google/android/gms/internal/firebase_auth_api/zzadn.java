package com.google.android.gms.internal.firebase_auth_api;

import b8.f0;
import com.google.android.gms.internal.firebase-auth-api.zzahk;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadn
  extends zzaeg<Void, f0>
{
  private final zzahk zzu;
  
  public zzadn(zzahk paramzzahk)
  {
    super(8);
    j.i(paramzzahk);
    zzu = paramzzahk;
  }
  
  public final String zza()
  {
    return "verifyPhoneNumber";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */