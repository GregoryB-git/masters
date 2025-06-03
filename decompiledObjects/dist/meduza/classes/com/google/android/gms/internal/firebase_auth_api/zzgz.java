package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgz
  implements zzbe
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private static final byte[] zzb = zzza.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
  private static final byte[] zzc = zzza.zza("070000004041424344454647");
  private static final byte[] zzd = zzza.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
  private static final ThreadLocal<Cipher> zze = new zzhc();
  private final SecretKey zzf;
  private final byte[] zzg;
  
  private zzgz(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (zza.zza())
    {
      if (zzb())
      {
        if (paramArrayOfByte1.length == 32)
        {
          zzf = new SecretKeySpec(paramArrayOfByte1, "ChaCha20");
          zzg = paramArrayOfByte2;
          return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
      }
      throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzed paramzzed)
  {
    return new zzgz(paramzzed.zzd().zza(zzbl.zza()), paramzzed.zzc().zzb());
  }
  
  public static Cipher zza()
  {
    return (Cipher)zze.get();
  }
  
  public static boolean zzb()
  {
    return zze.get() != null;
  }
  
  private static boolean zzb(Cipher paramCipher)
  {
    try
    {
      IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
      localIvParameterSpec.<init>(zzc);
      Object localObject = new javax/crypto/spec/SecretKeySpec;
      byte[] arrayOfByte = zzb;
      ((SecretKeySpec)localObject).<init>(arrayOfByte, "ChaCha20");
      paramCipher.init(2, (Key)localObject, localIvParameterSpec);
      localObject = zzd;
      if (paramCipher.doFinal((byte[])localObject).length != 0) {
        return false;
      }
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(arrayOfByte, "ChaCha20");
      paramCipher.init(2, localSecretKeySpec, localIvParameterSpec);
      int i = paramCipher.doFinal((byte[])localObject).length;
      return i == 0;
    }
    catch (GeneralSecurityException paramCipher) {}
    return false;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      int i = paramArrayOfByte1.length;
      Object localObject = zzg;
      if (i >= localObject.length + 12 + 16)
      {
        if (zzpy.zza((byte[])localObject, paramArrayOfByte1))
        {
          localObject = new byte[12];
          System.arraycopy(paramArrayOfByte1, zzg.length, localObject, 0, 12);
          IvParameterSpec localIvParameterSpec = new IvParameterSpec((byte[])localObject);
          localObject = (Cipher)zze.get();
          ((Cipher)localObject).init(2, zzf, localIvParameterSpec);
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
            ((Cipher)localObject).updateAAD(paramArrayOfByte2);
          }
          paramArrayOfByte2 = zzg;
          return ((Cipher)localObject).doFinal(paramArrayOfByte1, paramArrayOfByte2.length + 12, paramArrayOfByte1.length - paramArrayOfByte2.length - 12);
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
      byte[] arrayOfByte = zzpp.zza(12);
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(arrayOfByte);
      Cipher localCipher = (Cipher)zze.get();
      localCipher.init(1, zzf, localIvParameterSpec);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        localCipher.updateAAD(paramArrayOfByte2);
      }
      int i = localCipher.getOutputSize(paramArrayOfByte1.length);
      paramArrayOfByte2 = zzg;
      if (i <= Integer.MAX_VALUE - paramArrayOfByte2.length - 12)
      {
        paramArrayOfByte2 = Arrays.copyOf(paramArrayOfByte2, paramArrayOfByte2.length + 12 + i);
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte2, zzg.length, 12);
        if (localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2, zzg.length + 12) == i) {
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzgz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */