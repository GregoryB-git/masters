package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzacr
  extends zzaeg<Void, Void>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzahf zzu;
  
  public zzacr(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(15);
    zzu = zzahf.zzg().zzd(paramString1).zza(paramString2).zzc(paramString4).zzb(paramString3).zza(zzagh.zza).zza();
  }
  
  public final String zza()
  {
    return "revokeAccessToken";
  }
  
  public final void zza(TaskCompletionSource<Void> paramTaskCompletionSource, zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzb);
  }
  
  public final void zzb()
  {
    zzb(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzacr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */