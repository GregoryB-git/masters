package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzll;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

final class zzku
  implements zzll
{
  private final int zza;
  
  public zzku(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(j.g("Unsupported key length: ", paramInt));
    }
    zza = paramInt;
  }
  
  public final int zza()
  {
    return zza;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt, byte[] paramArrayOfByte4)
  {
    if (paramArrayOfByte1.length == zza) {
      return new zzhk(paramArrayOfByte1).zza(paramArrayOfByte2, paramArrayOfByte3, paramInt, paramArrayOfByte4);
    }
    throw new InvalidAlgorithmParameterException(j.g("Unexpected key length: ", paramArrayOfByte1.length));
  }
  
  public final int zzb()
  {
    return 12;
  }
  
  public final byte[] zzc()
  {
    int i = zza;
    if (i != 16)
    {
      if (i == 32) {
        return zzlu.zzj;
      }
      throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
    return zzlu.zzi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzku
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */