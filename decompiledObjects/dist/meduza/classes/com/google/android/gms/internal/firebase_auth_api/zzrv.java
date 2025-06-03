package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzrv
  implements com.google.android.gms.internal.firebase-auth-api.zzcd
{
  private static final byte[] zza = { 0 };
  private final com.google.android.gms.internal.firebase-auth-api.zzcd zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzxd zzc;
  private final byte[] zzd;
  
  private zzrv(com.google.android.gms.internal.firebase-auth-api.zzcd paramzzcd, com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, byte[] paramArrayOfByte)
  {
    zzb = paramzzcd;
    zzc = paramzzxd;
    zzd = paramArrayOfByte;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzcd zza(com.google.android.gms.internal.firebase-auth-api.zznn paramzznn)
  {
    Object localObject1 = paramzznn.zza(zzbl.zza());
    Object localObject2 = (zzwb)zzwb.zza().zza(((zzpn)localObject1).zzf()).zza(((zzpn)localObject1).zzd()).zza(((zzpn)localObject1).zza()).zze();
    zzpr.zza();
    localObject2 = (zzcd)zzpr.zza((com.google.android.gms.internal.firebase-auth-api.zzwb)localObject2, com.google.android.gms.internal.firebase-auth-api.zzcd.class);
    localObject1 = ((zzpn)localObject1).zzc();
    int i = zzry.zza[localObject1.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          paramzznn = zzor.zzb(paramzznn.zza().intValue());
        } else {
          throw new GeneralSecurityException("unknown output prefix type");
        }
      }
      else {
        paramzznn = zzor.zza(paramzznn.zza().intValue());
      }
    }
    else {
      paramzznn = zzor.zza;
    }
    return new zzrv((com.google.android.gms.internal.firebase-auth-api.zzcd)localObject2, (com.google.android.gms.internal.firebase-auth-api.zzxd)localObject1, paramzznn.zzb());
  }
  
  public final void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 10)
    {
      byte[] arrayOfByte1 = paramArrayOfByte2;
      if (zzc.equals(zzxd.zzc)) {
        arrayOfByte1 = zzyc.zza(new byte[][] { paramArrayOfByte2, zza });
      }
      byte[] arrayOfByte2 = new byte[0];
      paramArrayOfByte2 = paramArrayOfByte1;
      if (!zzc.equals(zzxd.zzd))
      {
        arrayOfByte2 = Arrays.copyOf(paramArrayOfByte1, 5);
        paramArrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length);
        paramArrayOfByte1 = arrayOfByte2;
        arrayOfByte2 = paramArrayOfByte1;
      }
      if (Arrays.equals(zzd, arrayOfByte2))
      {
        zzb.zza(paramArrayOfByte2, arrayOfByte1);
        return;
      }
      throw new GeneralSecurityException("wrong prefix");
    }
    throw new GeneralSecurityException("tag too short");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (zzc.equals(zzxd.zzc)) {
      arrayOfByte = zzyc.zza(new byte[][] { paramArrayOfByte, zza });
    }
    return zzyc.zza(new byte[][] { zzd, zzb.zza(arrayOfByte) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzrv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */