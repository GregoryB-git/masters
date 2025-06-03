package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzla;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;

final class zzky
  implements zzla
{
  private final int zza;
  
  public zzky(com.google.android.gms.internal.firebase-auth-api.zzdr paramzzdr)
  {
    if (paramzzdr.zzb() == 12)
    {
      if (paramzzdr.zzd() == 16)
      {
        if (paramzzdr.zzf() == zzdr.zza.zzc)
        {
          zza = paramzzdr.zzc();
          return;
        }
        throw new GeneralSecurityException("invalid variant");
      }
      throw new GeneralSecurityException("invalid tag size");
    }
    throw new GeneralSecurityException("invalid IV size");
  }
  
  public final int zza()
  {
    return zza;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (paramArrayOfByte2.length >= paramInt)
    {
      if (paramArrayOfByte1.length == zza)
      {
        paramArrayOfByte1 = zzgl.zzb(paramArrayOfByte1);
        int i = paramArrayOfByte2.length;
        int j = paramInt + 12;
        if (i >= j + 16)
        {
          AlgorithmParameterSpec localAlgorithmParameterSpec = zzgl.zza(paramArrayOfByte2, paramInt, 12);
          Cipher localCipher = zzgl.zza();
          localCipher.init(2, paramArrayOfByte1, localAlgorithmParameterSpec);
          return localCipher.doFinal(paramArrayOfByte2, j, paramArrayOfByte2.length - paramInt - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
      }
      throw new GeneralSecurityException("invalid key size");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzky
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */