package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzll;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

final class zzkx
  implements zzll
{
  public final int zza()
  {
    return 32;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt, byte[] paramArrayOfByte4)
  {
    if (paramArrayOfByte1.length == 32)
    {
      if (zzhn.zza()) {
        return zzhn.zza(paramArrayOfByte1).zza(paramArrayOfByte2, paramArrayOfByte3, paramInt, paramArrayOfByte4);
      }
      paramArrayOfByte3 = Arrays.copyOfRange(paramArrayOfByte3, paramInt, paramArrayOfByte3.length);
      return new zzhl(paramArrayOfByte1).zza(paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte4);
    }
    throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
  }
  
  public final int zzb()
  {
    return 12;
  }
  
  public final byte[] zzc()
  {
    return zzlu.zzk;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */