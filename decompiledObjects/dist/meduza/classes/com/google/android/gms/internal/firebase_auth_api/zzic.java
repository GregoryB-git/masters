package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzic
  implements zzbe
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private final byte[] zzb;
  private final byte[] zzc;
  
  private zzic(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (zza.zza())
    {
      if (zza())
      {
        if (paramArrayOfByte1.length == 32)
        {
          zzb = paramArrayOfByte1;
          zzc = paramArrayOfByte2;
          return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
      }
      throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzfv paramzzfv)
  {
    return new zzic(paramzzfv.zzd().zza(zzbl.zza()), paramzzfv.zzc().zzb());
  }
  
  public static boolean zza()
  {
    return zzgz.zza() != null;
  }
  
  private static byte[] zza(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[12];
    System.arraycopy(paramArrayOfByte, 16, arrayOfByte, 4, 8);
    return arrayOfByte;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      int i = paramArrayOfByte1.length;
      Object localObject1 = zzc;
      if (i >= localObject1.length + 24 + 16)
      {
        if (zzpy.zza((byte[])localObject1, paramArrayOfByte1))
        {
          Object localObject2 = new byte[24];
          System.arraycopy(paramArrayOfByte1, zzc.length, localObject2, 0, 24);
          localObject1 = new SecretKeySpec(zzhh.zza(zzb, (byte[])localObject2), "ChaCha20");
          IvParameterSpec localIvParameterSpec = new IvParameterSpec(zza((byte[])localObject2));
          localObject2 = zzgz.zza();
          ((Cipher)localObject2).init(2, (Key)localObject1, localIvParameterSpec);
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
            ((Cipher)localObject2).updateAAD(paramArrayOfByte2);
          }
          paramArrayOfByte2 = zzc;
          return ((Cipher)localObject2).doFinal(paramArrayOfByte1, paramArrayOfByte2.length + 24, paramArrayOfByte1.length - paramArrayOfByte2.length - 24);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new NullPointerException("ciphertext is null");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      byte[] arrayOfByte = zzpp.zza(24);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(zzhh.zza(zzb, arrayOfByte), "ChaCha20");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(zza(arrayOfByte));
      Cipher localCipher = zzgz.zza();
      localCipher.init(1, localSecretKeySpec, localIvParameterSpec);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        localCipher.updateAAD(paramArrayOfByte2);
      }
      int i = localCipher.getOutputSize(paramArrayOfByte1.length);
      paramArrayOfByte2 = zzc;
      if (i <= Integer.MAX_VALUE - paramArrayOfByte2.length - 24)
      {
        paramArrayOfByte2 = Arrays.copyOf(paramArrayOfByte2, paramArrayOfByte2.length + 24 + i);
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte2, zzc.length, 24);
        if (localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2, zzc.length + 24) == i) {
          return paramArrayOfByte2;
        }
        throw new GeneralSecurityException("not enough data written");
      }
      throw new GeneralSecurityException("plaintext too long");
    }
    throw new NullPointerException("plaintext is null");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */