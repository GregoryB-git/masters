package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzrx;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzzc
  implements zzrx
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private static final ThreadLocal<Cipher> zzb = new zzzf();
  private final SecretKey zzc;
  private byte[] zzd;
  private byte[] zze;
  
  public zzzc(byte[] paramArrayOfByte)
  {
    zzzi.zza(paramArrayOfByte.length);
    paramArrayOfByte = new SecretKeySpec(paramArrayOfByte, "AES");
    zzc = paramArrayOfByte;
    Cipher localCipher = zza();
    localCipher.init(1, paramArrayOfByte);
    paramArrayOfByte = zzrn.zzb(localCipher.doFinal(new byte[16]));
    zzd = paramArrayOfByte;
    zze = zzrn.zzb(paramArrayOfByte);
  }
  
  private static Cipher zza()
  {
    if (zza.zza()) {
      return (Cipher)zzb.get();
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
  
  private static void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3)
  {
    for (int i = 0; i < 16; i++) {
      paramArrayOfByte3[i] = ((byte)(byte)(paramArrayOfByte1[i] ^ paramArrayOfByte2[(i + paramInt)]));
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt <= 16)
    {
      Cipher localCipher = zza();
      localCipher.init(1, zzc);
      int i = paramArrayOfByte.length;
      if (i == 0) {
        i = 1;
      } else {
        i = (i - 1) / 16 + 1;
      }
      byte[] arrayOfByte1;
      if (i << 4 == paramArrayOfByte.length) {
        arrayOfByte1 = zzyc.zza(paramArrayOfByte, i - 1 << 4, zzd, 0, 16);
      } else {
        arrayOfByte1 = zzyc.zza(zzrn.zza(Arrays.copyOfRange(paramArrayOfByte, i - 1 << 4, paramArrayOfByte.length)), zze);
      }
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[16];
      int j = 0;
      while (j < i - 1)
      {
        zza(arrayOfByte2, paramArrayOfByte, j << 4, arrayOfByte3);
        if (localCipher.doFinal(arrayOfByte3, 0, 16, arrayOfByte2) == 16) {
          j++;
        } else {
          throw new IllegalStateException("Cipher didn't write full block");
        }
      }
      zza(arrayOfByte2, arrayOfByte1, 0, arrayOfByte3);
      if (localCipher.doFinal(arrayOfByte3, 0, 16, arrayOfByte2) == 16)
      {
        if (16 == paramInt) {
          return arrayOfByte2;
        }
        return Arrays.copyOf(arrayOfByte2, paramInt);
      }
      throw new IllegalStateException("Cipher didn't write full block");
    }
    throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */