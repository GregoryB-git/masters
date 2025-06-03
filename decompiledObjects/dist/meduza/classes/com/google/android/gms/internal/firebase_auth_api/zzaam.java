package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import b8.c0;
import com.google.android.gms.common.api.Status;

final class zzaam
  implements zzaew<zzaik>
{
  public final void zza(Object paramObject)
  {
    paramObject = (zzaik)paramObject;
    if (!TextUtils.isEmpty(((zzaik)paramObject).zze()))
    {
      localObject = new Status(17025, null, null, null);
      zza.zza((Status)localObject, new c0(null, null, ((zzaik)paramObject).zzc(), ((zzaik)paramObject).zze(), true));
      return;
    }
    Object localObject = new zzagw(((zzaik)paramObject).zzd(), ((zzaik)paramObject).zzb(), Long.valueOf(((zzaik)paramObject).zza()), "Bearer");
    zzzv.zza(zzc.zza, (com.google.android.gms.internal.firebase-auth-api.zzagw)localObject, null, "phone", Boolean.valueOf(((zzaik)paramObject).zzf()), null, zza, zzb);
  }
  
  public final void zza(String paramString)
  {
    zzb.zza(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */