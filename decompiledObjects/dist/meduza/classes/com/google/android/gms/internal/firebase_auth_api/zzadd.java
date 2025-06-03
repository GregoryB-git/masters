package com.google.android.gms.internal.firebase_auth_api;

import b8.f0;
import b8.h0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadd
  extends zzaeg<Void, f0>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzq zzu;
  
  public zzadd(h0 paramh0, String paramString1, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, String paramString3, String paramString4, String paramString5, boolean paramBoolean3)
  {
    super(8);
    j.i(paramh0);
    j.e(paramString1);
    zzu = new zzzq(paramh0, paramString1, paramString2, paramLong, paramBoolean1, paramBoolean2, paramString3, paramString4, paramString5, paramBoolean3);
  }
  
  public final String zza()
  {
    return "startMfaSignInWithPhoneNumber";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */