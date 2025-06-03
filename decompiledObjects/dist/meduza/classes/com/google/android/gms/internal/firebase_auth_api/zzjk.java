package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzjk
  implements com.google.android.gms.internal.firebase-auth-api.zzbk
{
  private final com.google.android.gms.internal.firebase-auth-api.zzbk zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzxd zzb;
  private final byte[] zzc;
  
  private zzjk(com.google.android.gms.internal.firebase-auth-api.zzbk paramzzbk, com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, byte[] paramArrayOfByte)
  {
    zza = paramzzbk;
    zzb = paramzzxd;
    zzc = paramArrayOfByte;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbk zza(com.google.android.gms.internal.firebase-auth-api.zznn paramzznn)
  {
    Object localObject1 = paramzznn.zza(zzbl.zza());
    Object localObject2 = (zzwb)zzwb.zza().zza(((zzpn)localObject1).zzf()).zza(((zzpn)localObject1).zzd()).zza(((zzpn)localObject1).zza()).zze();
    zzpr.zza();
    localObject2 = (zzbk)zzpr.zza((com.google.android.gms.internal.firebase-auth-api.zzwb)localObject2, com.google.android.gms.internal.firebase-auth-api.zzbk.class);
    localObject1 = ((zzpn)localObject1).zzc();
    int i = zzjj.zza[localObject1.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          paramzznn = zzor.zzb(paramzznn.zza().intValue());
        } else {
          throw new GeneralSecurityException(j.g("unknown output prefix type ", ((zzxd)localObject1).zza()));
        }
      }
      else {
        paramzznn = zzor.zza(paramzznn.zza().intValue());
      }
    }
    else {
      paramzznn = zzor.zza;
    }
    return new zzjk((com.google.android.gms.internal.firebase-auth-api.zzbk)localObject2, (com.google.android.gms.internal.firebase-auth-api.zzxd)localObject1, paramzznn.zzb());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (zzb == zzxd.zzd) {
      return zza.zza(paramArrayOfByte1, paramArrayOfByte2);
    }
    if (zzpy.zza(zzc, paramArrayOfByte1)) {
      return zza.zza(Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length), paramArrayOfByte2);
    }
    throw new GeneralSecurityException("wrong prefix");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */