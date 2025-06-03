package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class zzyb
  implements zzbe
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zzb;
  private final SecretKey zzb;
  private final byte[] zzc;
  
  private zzyb(byte[] paramArrayOfByte, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    if (zza.zza())
    {
      zzb = zzgl.zzb(paramArrayOfByte);
      zzc = paramzzzn.zzb();
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzdm paramzzdm)
  {
    if (paramzzdm.zzc().zzb() == 12)
    {
      if (paramzzdm.zzc().zzd() == 16) {
        return new zzyb(paramzzdm.zze().zza(zzbl.zza()), paramzzdm.zzd());
      }
      throw new GeneralSecurityException(j.g("Expected tag Size 16, got ", paramzzdm.zzc().zzd()));
    }
    throw new GeneralSecurityException(j.g("Expected IV Size 12, got ", paramzzdm.zzc().zzb()));
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      int i = paramArrayOfByte1.length;
      Object localObject = zzc;
      if (i >= localObject.length + 12 + 16)
      {
        if (zzpy.zza((byte[])localObject, paramArrayOfByte1))
        {
          AlgorithmParameterSpec localAlgorithmParameterSpec = zzgl.zza(paramArrayOfByte1, zzc.length, 12);
          localObject = zzgl.zza();
          ((Cipher)localObject).init(2, zzb, localAlgorithmParameterSpec);
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
            ((Cipher)localObject).updateAAD(paramArrayOfByte2);
          }
          paramArrayOfByte2 = zzc;
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
      AlgorithmParameterSpec localAlgorithmParameterSpec = zzgl.zza(arrayOfByte);
      Cipher localCipher = zzgl.zza();
      localCipher.init(1, zzb, localAlgorithmParameterSpec);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        localCipher.updateAAD(paramArrayOfByte2);
      }
      int i = localCipher.getOutputSize(paramArrayOfByte1.length);
      paramArrayOfByte2 = zzc;
      if (i <= Integer.MAX_VALUE - paramArrayOfByte2.length - 12)
      {
        paramArrayOfByte2 = Arrays.copyOf(paramArrayOfByte2, paramArrayOfByte2.length + 12 + i);
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte2, zzc.length, 12);
        if (localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2, zzc.length + 12) == i) {
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */