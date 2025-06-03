package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;

public final class zzlz
  implements com.google.android.gms.internal.firebase-auth-api.zzbm
{
  private zzlz(com.google.android.gms.internal.firebase-auth-api.zzbm paramzzbm, byte[] paramArrayOfByte) {}
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbm zza(com.google.android.gms.internal.firebase-auth-api.zznn paramzznn)
  {
    Object localObject = paramzznn.zza(zzbl.zza());
    zzbm localzzbm = (zzbm)zzcj.zza((zzwb)zzwb.zza().zza(((zzpn)localObject).zzf()).zza(((zzpn)localObject).zzd()).zza(((zzpn)localObject).zza()).zze(), com.google.android.gms.internal.firebase-auth-api.zzbm.class);
    localObject = ((zzpn)localObject).zzc();
    int i = zzly.zza[localObject.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          paramzznn = zzor.zzb(paramzznn.zza().intValue());
        } else {
          throw new GeneralSecurityException(f.j("unknown output prefix type ", String.valueOf(localObject)));
        }
      }
      else {
        paramzznn = zzor.zza(paramzznn.zza().intValue());
      }
    }
    else {
      paramzznn = zzor.zza;
    }
    return new zzlz(localzzbm, paramzznn.zzb());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */