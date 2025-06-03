package com.google.android.gms.internal.firebase_auth_api;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class zzzl
{
  public static byte[] zza()
  {
    byte[] arrayOfByte = zzpp.zza(32);
    arrayOfByte[0] = ((byte)(byte)(arrayOfByte[0] | 0x7));
    int i = (byte)(arrayOfByte[31] & 0x3F);
    arrayOfByte[31] = ((byte)i);
    arrayOfByte[31] = ((byte)(byte)(i | 0x80));
    return arrayOfByte;
  }
  
  public static byte[] zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 32)
    {
      byte[] arrayOfByte = new byte[32];
      arrayOfByte[0] = ((byte)9);
      return zza(paramArrayOfByte, arrayOfByte);
    }
    throw new InvalidKeyException("Private key must have 32 bytes.");
  }
  
  public static byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == 32)
    {
      long[] arrayOfLong = new long[11];
      paramArrayOfByte1 = Arrays.copyOf(paramArrayOfByte1, 32);
      paramArrayOfByte1[0] = ((byte)(byte)(paramArrayOfByte1[0] & 0xF8));
      int i = (byte)(paramArrayOfByte1[31] & 0x7F);
      paramArrayOfByte1[31] = ((byte)i);
      paramArrayOfByte1[31] = ((byte)(byte)(i | 0x40));
      zzmq.zza(arrayOfLong, paramArrayOfByte1, paramArrayOfByte2);
      return zzmw.zzc(arrayOfLong);
    }
    throw new InvalidKeyException("Private key must have 32 bytes.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */