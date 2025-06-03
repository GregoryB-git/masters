package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbj;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

public final class zzye
  implements zzbj
{
  private final ECPrivateKey zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzyg zzb;
  private final String zzc;
  private final byte[] zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzyk zze;
  private final com.google.android.gms.internal.firebase-auth-api.zzla zzf;
  private final byte[] zzg;
  
  private zzye(ECPrivateKey paramECPrivateKey, byte[] paramArrayOfByte1, String paramString, com.google.android.gms.internal.firebase-auth-api.zzyk paramzzyk, com.google.android.gms.internal.firebase-auth-api.zzla paramzzla, byte[] paramArrayOfByte2)
  {
    zza = paramECPrivateKey;
    zzb = new zzyg(paramECPrivateKey);
    zzd = paramArrayOfByte1;
    zzc = paramString;
    zze = paramzzyk;
    zzf = paramzzla;
    zzg = paramArrayOfByte2;
  }
  
  public static zzbj zza(com.google.android.gms.internal.firebase-auth-api.zzjt paramzzjt)
  {
    ECPrivateKey localECPrivateKey = zzyi.zza((zzyl)zzyh.zza.zza(paramzzjt.zzc().zzd()), zzmo.zza(paramzzjt.zze().zza(zzbl.zza())));
    byte[] arrayOfByte = new byte[0];
    if (paramzzjt.zzc().zzh() != null) {
      arrayOfByte = paramzzjt.zzc().zzh().zzb();
    }
    return new zzye(localECPrivateKey, arrayOfByte, zzyh.zza(paramzzjt.zzc().zze()), (zzyk)zzyh.zzb.zza(paramzzjt.zzc().zzf()), zzkw.zza(paramzzjt.zzc()), paramzzjt.zzg().zzb());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (zzpy.zza(zzg, paramArrayOfByte1))
    {
      int i = zzg.length;
      Object localObject = zza.getParams().getCurve();
      com.google.android.gms.internal.firebase-auth-api.zzyk localzzyk = zze;
      int j = zzyi.zza((EllipticCurve)localObject);
      int k = localzzyk.ordinal();
      int m;
      if (k != 0)
      {
        m = j;
        if (k != 1)
        {
          if (k == 2)
          {
            m = j * 2;
            break label100;
          }
          throw new GeneralSecurityException("unknown EC point format");
        }
      }
      else
      {
        m = j * 2;
      }
      m++;
      label100:
      j = paramArrayOfByte1.length;
      m += i;
      if (j >= m)
      {
        localObject = Arrays.copyOfRange(paramArrayOfByte1, i, m);
        paramArrayOfByte2 = zzb.zza((byte[])localObject, zzc, zzd, paramArrayOfByte2, zzf.zza(), zze);
        return zzf.zza(paramArrayOfByte2, paramArrayOfByte1, m);
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzye
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */