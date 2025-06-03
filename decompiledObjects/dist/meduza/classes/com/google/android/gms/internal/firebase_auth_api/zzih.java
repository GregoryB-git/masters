package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzih
  implements zzbe
{
  private static final byte[] zza = zzza.zza("7a806c");
  private static final byte[] zzb = zzza.zza("46bb91c3c5");
  private static final byte[] zzc = zzza.zza("36864200e0eaf5284d884a0e77d31646");
  private static final byte[] zzd = zzza.zza("bae8e37fc83441b16034566b");
  private static final byte[] zze = zzza.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
  private static final ThreadLocal<Cipher> zzf = new zzik();
  private final SecretKey zzg;
  private final byte[] zzh;
  
  private zzih(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zzh = paramArrayOfByte2;
    zzzi.zza(paramArrayOfByte1.length);
    zzg = new SecretKeySpec(paramArrayOfByte1, "AES");
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzdt paramzzdt)
  {
    return new zzih(paramzzdt.zze().zza(zzbl.zza()), paramzzdt.zzd().zzb());
  }
  
  private static AlgorithmParameterSpec zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new GCMParameterSpec(128, paramArrayOfByte, 0, paramInt2);
  }
  
  private static Cipher zza()
  {
    Cipher localCipher = (Cipher)zzf.get();
    if (localCipher != null) {
      return localCipher;
    }
    throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
  }
  
  private static boolean zzb(Cipher paramCipher)
  {
    try
    {
      Object localObject = zzd;
      AlgorithmParameterSpec localAlgorithmParameterSpec = zza((byte[])localObject, 0, localObject.length);
      localObject = new javax/crypto/spec/SecretKeySpec;
      ((SecretKeySpec)localObject).<init>(zzc, "AES");
      paramCipher.init(2, (Key)localObject, localAlgorithmParameterSpec);
      paramCipher.updateAAD(zzb);
      localObject = zze;
      boolean bool = MessageDigest.isEqual(paramCipher.doFinal((byte[])localObject, 0, localObject.length), zza);
      return bool;
    }
    catch (GeneralSecurityException paramCipher) {}
    return false;
  }
  
  private final byte[] zzc(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Cipher localCipher = zza();
    if (paramArrayOfByte1.length >= 28)
    {
      AlgorithmParameterSpec localAlgorithmParameterSpec = zza(paramArrayOfByte1, 0, 12);
      localCipher.init(2, zzg, localAlgorithmParameterSpec);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        localCipher.updateAAD(paramArrayOfByte2);
      }
      return localCipher.doFinal(paramArrayOfByte1, 12, paramArrayOfByte1.length - 12);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzh;
    if (arrayOfByte.length == 0) {
      return zzc(paramArrayOfByte1, paramArrayOfByte2);
    }
    if (zzpy.zza(arrayOfByte, paramArrayOfByte1)) {
      return zzc(Arrays.copyOfRange(paramArrayOfByte1, zzh.length, paramArrayOfByte1.length), paramArrayOfByte2);
    }
    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Cipher localCipher = zza();
    if (paramArrayOfByte1.length <= 2147483619)
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte1.length + 12 + 16];
      Object localObject = zzpp.zza(12);
      System.arraycopy(localObject, 0, arrayOfByte, 0, 12);
      localObject = zza((byte[])localObject, 0, localObject.length);
      localCipher.init(1, zzg, (AlgorithmParameterSpec)localObject);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        localCipher.updateAAD(paramArrayOfByte2);
      }
      int i = localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte, 12);
      if (i == paramArrayOfByte1.length + 16)
      {
        paramArrayOfByte1 = zzh;
        if (paramArrayOfByte1.length == 0) {
          return arrayOfByte;
        }
        return zzyc.zza(new byte[][] { paramArrayOfByte1, arrayOfByte });
      }
      throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[] { Integer.valueOf(16), Integer.valueOf(i - paramArrayOfByte1.length) }));
    }
    throw new GeneralSecurityException("plaintext too long");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzih
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */