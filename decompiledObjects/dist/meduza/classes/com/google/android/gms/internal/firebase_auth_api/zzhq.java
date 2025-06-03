package com.google.android.gms.internal.firebase_auth_api;

public final class zzhq
  extends zzhm
{
  public zzhq(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt);
  }
  
  public final int zza()
  {
    return 24;
  }
  
  public final int[] zza(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt.length == 6)
    {
      int[] arrayOfInt = new int[16];
      zzhh.zza(arrayOfInt, zzhh.zzb(zza, paramArrayOfInt));
      arrayOfInt[12] = paramInt;
      arrayOfInt[13] = 0;
      arrayOfInt[14] = paramArrayOfInt[4];
      arrayOfInt[15] = paramArrayOfInt[5];
      return arrayOfInt;
    }
    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfInt.length << 5) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */