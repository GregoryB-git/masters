package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import f;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

final class zzmm
  implements zzbe
{
  private final SecretKey zza;
  
  public zzmm(String paramString, KeyStore paramKeyStore)
  {
    paramKeyStore = (SecretKey)paramKeyStore.getKey(paramString, null);
    zza = paramKeyStore;
    if (paramKeyStore != null) {
      return;
    }
    throw new InvalidKeyException(f.j("Keystore cannot load the key with ID: ", paramString));
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 28)
    {
      GCMParameterSpec localGCMParameterSpec = new GCMParameterSpec(128, paramArrayOfByte1, 0, 12);
      Cipher localCipher = Cipher.getInstance("AES/GCM/NoPadding");
      localCipher.init(2, zza, localGCMParameterSpec);
      localCipher.updateAAD(paramArrayOfByte2);
      return localCipher.doFinal(paramArrayOfByte1, 12, paramArrayOfByte1.length - 12);
    }
    throw new BadPaddingException("ciphertext too short");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length <= 2147483619)
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte1.length + 12 + 16];
      Cipher localCipher = Cipher.getInstance("AES/GCM/NoPadding");
      localCipher.init(1, zza);
      localCipher.updateAAD(paramArrayOfByte2);
      localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte, 12);
      paramArrayOfByte1 = localCipher.getIV();
      if (paramArrayOfByte1.length == 12)
      {
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, 12);
        return arrayOfByte;
      }
      throw new GeneralSecurityException("IV has unexpected length");
    }
    throw new GeneralSecurityException("plaintext too long");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */