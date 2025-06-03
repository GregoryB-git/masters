package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzhn
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private final SecretKey zzb;
  
  private zzhn(byte[] paramArrayOfByte)
  {
    if (zza.zza())
    {
      if (zza())
      {
        if (paramArrayOfByte.length == 32)
        {
          zzb = new SecretKeySpec(paramArrayOfByte, "ChaCha20");
          return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
      }
      throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzhn zza(byte[] paramArrayOfByte)
  {
    return new zzhn(paramArrayOfByte);
  }
  
  public static boolean zza()
  {
    return zzgz.zza() != null;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte2 != null)
    {
      if (paramArrayOfByte1.length == 12)
      {
        if (paramArrayOfByte2.length >= paramInt + 16)
        {
          IvParameterSpec localIvParameterSpec = new IvParameterSpec(paramArrayOfByte1);
          paramArrayOfByte1 = zzgz.zza();
          paramArrayOfByte1.init(2, zzb, localIvParameterSpec);
          if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
            paramArrayOfByte1.updateAAD(paramArrayOfByte3);
          }
          return paramArrayOfByte1.doFinal(paramArrayOfByte2, paramInt, paramArrayOfByte2.length - paramInt);
        }
        throw new GeneralSecurityException("ciphertext too short");
      }
      throw new GeneralSecurityException("nonce length must be 12 bytes.");
    }
    throw new NullPointerException("ciphertext is null");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */