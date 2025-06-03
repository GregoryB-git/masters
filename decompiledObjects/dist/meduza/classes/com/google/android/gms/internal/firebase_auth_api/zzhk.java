package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class zzhk
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zzb;
  private final SecretKey zzb;
  
  public zzhk(byte[] paramArrayOfByte)
  {
    if (zza.zza())
    {
      zzb = zzgl.zzb(paramArrayOfByte);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1.length == 12)
    {
      if (paramArrayOfByte2.length >= paramInt + 16)
      {
        paramArrayOfByte1 = zzgl.zza(paramArrayOfByte1);
        Cipher localCipher = zzgl.zza();
        localCipher.init(2, zzb, paramArrayOfByte1);
        if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
          localCipher.updateAAD(paramArrayOfByte3);
        }
        return localCipher.doFinal(paramArrayOfByte2, paramInt, paramArrayOfByte2.length - paramInt);
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new GeneralSecurityException("iv is wrong size");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1.length == 12)
    {
      AlgorithmParameterSpec localAlgorithmParameterSpec = zzgl.zza(paramArrayOfByte1);
      paramArrayOfByte1 = zzgl.zza();
      paramArrayOfByte1.init(1, zzb, localAlgorithmParameterSpec);
      if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
        paramArrayOfByte1.updateAAD(paramArrayOfByte3);
      }
      int i = paramArrayOfByte1.getOutputSize(paramArrayOfByte2.length);
      if (i <= Integer.MAX_VALUE - paramInt)
      {
        paramArrayOfByte3 = new byte[paramInt + i];
        if (paramArrayOfByte1.doFinal(paramArrayOfByte2, 0, paramArrayOfByte2.length, paramArrayOfByte3, paramInt) == i) {
          return paramArrayOfByte3;
        }
        throw new GeneralSecurityException("not enough data written");
      }
      throw new GeneralSecurityException("plaintext too long");
    }
    throw new GeneralSecurityException("iv is wrong size");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */