package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzlx
  implements com.google.android.gms.internal.firebase-auth-api.zzbj
{
  private final com.google.android.gms.internal.firebase-auth-api.zzbj zza;
  private final byte[] zzb;
  
  private zzlx(com.google.android.gms.internal.firebase-auth-api.zzbj paramzzbj, byte[] paramArrayOfByte)
  {
    zza = paramzzbj;
    zzb = paramArrayOfByte;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbj zza(com.google.android.gms.internal.firebase-auth-api.zznn paramzznn)
  {
    Object localObject = paramzznn.zza(zzbl.zza());
    zzbj localzzbj = (zzbj)zzcj.zza((zzwb)zzwb.zza().zza(((zzpn)localObject).zzf()).zza(((zzpn)localObject).zzd()).zza(((zzpn)localObject).zza()).zze(), com.google.android.gms.internal.firebase-auth-api.zzbj.class);
    localObject = ((zzpn)localObject).zzc();
    int i = zzlw.zza[localObject.ordinal()];
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
    return new zzlx(localzzbj, paramzznn.zzb());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzb;
    if (arrayOfByte.length == 0) {
      return zza.zza(paramArrayOfByte1, paramArrayOfByte2);
    }
    if (zzpy.zza(arrayOfByte, paramArrayOfByte1))
    {
      paramArrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, zzb.length, paramArrayOfByte1.length);
      return zza.zza(paramArrayOfByte1, paramArrayOfByte2);
    }
    throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */