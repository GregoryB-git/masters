package com.google.android.gms.internal.firebase_auth_api;

public final class zzhj
  extends zzhm
{
  public zzhj(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt);
  }
  
  public final int zza()
  {
    return 12;
  }
  
  public final int[] zza(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt.length == 3)
    {
      int[] arrayOfInt = new int[16];
      zzhh.zza(arrayOfInt, zza);
      arrayOfInt[12] = paramInt;
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 13, paramArrayOfInt.length);
      return arrayOfInt;
    }
    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfInt.length << 5) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */