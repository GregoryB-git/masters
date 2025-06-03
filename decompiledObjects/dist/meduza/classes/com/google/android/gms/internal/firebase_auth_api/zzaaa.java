package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.firebase-auth-api.zzzv;
import java.util.ArrayList;
import java.util.List;
import m6.j;

final class zzaaa
  implements zzaew<zzahl>
{
  public final void zza(Object paramObject)
  {
    zzahl localzzahl = (zzahl)paramObject;
    boolean bool = zza.zzi("EMAIL");
    com.google.android.gms.internal.firebase-auth-api.zzadp localzzadp = null;
    if (bool) {
      zzb.zzb(null);
    } else if (zza.zzc() != null) {
      zzb.zzb(zza.zzc());
    }
    if (zza.zzi("DISPLAY_NAME")) {
      zzb.zza(null);
    } else if (zza.zzb() != null) {
      zzb.zza(zza.zzb());
    }
    if (zza.zzi("PHOTO_URL"))
    {
      localObject = zzb;
      paramObject = null;
    }
    else
    {
      if (zza.zze() == null) {
        break label162;
      }
      localObject = zzb;
      paramObject = zza.zze();
    }
    ((zzagl)localObject).zzc((String)paramObject);
    label162:
    if (!TextUtils.isEmpty(zza.zzd()))
    {
      paramObject = "redacted".getBytes();
      if (paramObject == null) {
        paramObject = localzzadp;
      } else {
        paramObject = Base64.encodeToString((byte[])paramObject, 0);
      }
      j.e((String)paramObject);
    }
    if (zza.zzi("delete_passkey")) {
      zzb.zza(zzaj.zzh());
    }
    paramObject = localzzahl.zze();
    if (paramObject == null) {
      paramObject = new ArrayList();
    }
    zzb.zza((List)paramObject);
    localzzadp = zzc;
    Object localObject = zzd;
    j.i(localObject);
    String str1 = localzzahl.zzc();
    String str2 = localzzahl.zzd();
    paramObject = localObject;
    if (!TextUtils.isEmpty(str1))
    {
      paramObject = localObject;
      if (!TextUtils.isEmpty(str2)) {
        paramObject = new zzagw(str2, str1, Long.valueOf(localzzahl.zza()), ((zzagw)localObject).zze());
      }
    }
    localzzadp.zza((com.google.android.gms.internal.firebase-auth-api.zzagw)paramObject, zzb);
  }
  
  public final void zza(String paramString)
  {
    zze.zza(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */