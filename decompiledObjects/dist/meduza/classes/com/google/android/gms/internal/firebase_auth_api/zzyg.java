package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzyk;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zzyg
{
  private ECPrivateKey zza;
  
  public zzyg(ECPrivateKey paramECPrivateKey)
  {
    zza = paramECPrivateKey;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, String paramString, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt, zzyk paramzzyk)
  {
    paramzzyk = zzyi.zza(zza.getParams(), paramzzyk, paramArrayOfByte1);
    paramzzyk = zzyi.zza(zza, paramzzyk);
    int i = 1;
    paramArrayOfByte1 = zzyc.zza(new byte[][] { paramArrayOfByte1, paramzzyk });
    paramzzyk = (Mac)zzym.zzb.zza(paramString);
    if (paramInt <= paramzzyk.getMacLength() * 255)
    {
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        paramzzyk.init(new SecretKeySpec(paramArrayOfByte2, paramString));
      } else {
        paramzzyk.init(new SecretKeySpec(new byte[paramzzyk.getMacLength()], paramString));
      }
      paramArrayOfByte1 = paramzzyk.doFinal(paramArrayOfByte1);
      paramArrayOfByte2 = new byte[paramInt];
      paramzzyk.init(new SecretKeySpec(paramArrayOfByte1, paramString));
      paramArrayOfByte1 = new byte[0];
      int j = 0;
      for (;;)
      {
        paramzzyk.update(paramArrayOfByte1);
        paramzzyk.update(paramArrayOfByte3);
        paramzzyk.update((byte)i);
        paramArrayOfByte1 = paramzzyk.doFinal();
        if (paramArrayOfByte1.length + j >= paramInt) {
          break;
        }
        System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, j, paramArrayOfByte1.length);
        j += paramArrayOfByte1.length;
        i++;
      }
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, j, paramInt - j);
      return paramArrayOfByte2;
    }
    throw new GeneralSecurityException("size too large");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */