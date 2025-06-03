package com.google.android.gms.internal.firebase_auth_api;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzmo
{
  public static BigInteger zza(byte[] paramArrayOfByte)
  {
    return new BigInteger(1, paramArrayOfByte);
  }
  
  public static byte[] zza(BigInteger paramBigInteger)
  {
    if (paramBigInteger.signum() != -1) {
      return paramBigInteger.toByteArray();
    }
    throw new IllegalArgumentException("n must not be negative");
  }
  
  public static byte[] zza(BigInteger paramBigInteger, int paramInt)
  {
    if (paramBigInteger.signum() != -1)
    {
      byte[] arrayOfByte = paramBigInteger.toByteArray();
      if (arrayOfByte.length == paramInt) {
        return arrayOfByte;
      }
      int i = arrayOfByte.length;
      int j = paramInt + 1;
      if (i <= j)
      {
        if (arrayOfByte.length == j)
        {
          if (arrayOfByte[0] == 0) {
            return Arrays.copyOfRange(arrayOfByte, 1, arrayOfByte.length);
          }
          throw new GeneralSecurityException("integer too large");
        }
        paramBigInteger = new byte[paramInt];
        System.arraycopy(arrayOfByte, 0, paramBigInteger, paramInt - arrayOfByte.length, arrayOfByte.length);
        return paramBigInteger;
      }
      throw new GeneralSecurityException("integer too large");
    }
    throw new IllegalArgumentException("integer must be nonnegative");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */