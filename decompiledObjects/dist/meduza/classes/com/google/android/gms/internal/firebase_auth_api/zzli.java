package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzlp;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

final class zzli
  implements zzlp
{
  private final String zza;
  
  public zzli(String paramString)
  {
    zza = paramString;
  }
  
  private final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Mac localMac = (Mac)zzym.zzb.zza(zza);
    if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
      localMac.init(new SecretKeySpec(paramArrayOfByte2, zza));
    } else {
      localMac.init(new SecretKeySpec(new byte[localMac.getMacLength()], zza));
    }
    return localMac.doFinal(paramArrayOfByte1);
  }
  
  private final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    Mac localMac = (Mac)zzym.zzb.zza(zza);
    if (paramInt <= localMac.getMacLength() * 255)
    {
      byte[] arrayOfByte = new byte[paramInt];
      localMac.init(new SecretKeySpec(paramArrayOfByte1, zza));
      paramArrayOfByte1 = new byte[0];
      int i = 1;
      int j = 0;
      for (;;)
      {
        localMac.update(paramArrayOfByte1);
        localMac.update(paramArrayOfByte2);
        localMac.update((byte)i);
        paramArrayOfByte1 = localMac.doFinal();
        if (paramArrayOfByte1.length + j >= paramInt) {
          break;
        }
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, j, paramArrayOfByte1.length);
        j += paramArrayOfByte1.length;
        i++;
      }
      System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, j, paramInt - j);
      return arrayOfByte;
    }
    throw new GeneralSecurityException("size too large");
  }
  
  public final int zza()
  {
    return Mac.getInstance(zza).getMacLength();
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, byte[] paramArrayOfByte3)
  {
    return zza(zzlu.zza(paramString, paramArrayOfByte2, paramArrayOfByte3), paramArrayOfByte1);
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString, byte[] paramArrayOfByte3, int paramInt)
  {
    return zza(paramArrayOfByte1, zzlu.zza(paramString, paramArrayOfByte2, paramArrayOfByte3, paramInt), paramInt);
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString1, byte[] paramArrayOfByte3, String paramString2, byte[] paramArrayOfByte4, int paramInt)
  {
    return zza(zza(zzlu.zza(paramString1, paramArrayOfByte2, paramArrayOfByte4), null), zzlu.zza(paramString2, paramArrayOfByte3, paramArrayOfByte4, paramInt), paramInt);
  }
  
  public final byte[] zzb()
  {
    String str = zza;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 984525777: 
      if (str.equals("HmacSha512")) {
        j = 2;
      }
      break;
    case 984524074: 
      if (str.equals("HmacSha384")) {
        j = 1;
      }
      break;
    case 984523022: 
      if (str.equals("HmacSha256")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    case 2: 
      return zzlu.zzh;
    case 1: 
      return zzlu.zzg;
    }
    return zzlu.zzf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzli
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */