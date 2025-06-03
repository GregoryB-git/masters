package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzd;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzxu
  implements zzzd
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zzb;
  private static final ThreadLocal<Cipher> zzb = new zzxx();
  private final SecretKeySpec zzc;
  private final int zzd;
  private final int zze;
  
  public zzxu(byte[] paramArrayOfByte, int paramInt)
  {
    if (zza.zza())
    {
      zzzi.zza(paramArrayOfByte.length);
      zzc = new SecretKeySpec(paramArrayOfByte, "AES");
      int i = ((Cipher)zzb.get()).getBlockSize();
      zze = i;
      if ((paramInt >= 12) && (paramInt <= i))
      {
        zzd = paramInt;
        return;
      }
      throw new GeneralSecurityException("invalid IV size");
    }
    throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  private final void zza(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3, boolean paramBoolean)
  {
    Cipher localCipher = (Cipher)zzb.get();
    byte[] arrayOfByte = new byte[zze];
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, 0, zzd);
    paramArrayOfByte3 = new IvParameterSpec(arrayOfByte);
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = 2;
    }
    localCipher.init(i, zzc, paramArrayOfByte3);
    if (localCipher.doFinal(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3) == paramInt2) {
      return;
    }
    throw new GeneralSecurityException("stored output's length does not match input's length");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = zzd;
    if (i >= j)
    {
      byte[] arrayOfByte1 = new byte[j];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, j);
      i = paramArrayOfByte.length;
      j = zzd;
      byte[] arrayOfByte2 = new byte[i - j];
      zza(paramArrayOfByte, j, paramArrayOfByte.length - j, arrayOfByte2, 0, arrayOfByte1, false);
      return arrayOfByte2;
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = zzd;
    if (i <= Integer.MAX_VALUE - j)
    {
      byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + j];
      byte[] arrayOfByte2 = zzpp.zza(j);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, zzd);
      zza(paramArrayOfByte, 0, paramArrayOfByte.length, arrayOfByte1, zzd, arrayOfByte2, true);
      return arrayOfByte1;
    }
    throw new GeneralSecurityException(j.g("plaintext length can not exceed ", Integer.MAX_VALUE - zzd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */