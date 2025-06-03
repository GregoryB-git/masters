package com.google.android.gms.internal.firebase_auth_api;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

final class zzhh
{
  private static final int[] zza = zza(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
  
  private static int zza(int paramInt1, int paramInt2)
  {
    return paramInt1 >>> -paramInt2 | paramInt1 << paramInt2;
  }
  
  public static void zza(int[] paramArrayOfInt)
  {
    for (int i = 0; i < 10; i++)
    {
      zza(paramArrayOfInt, 0, 4, 8, 12);
      zza(paramArrayOfInt, 1, 5, 9, 13);
      zza(paramArrayOfInt, 2, 6, 10, 14);
      zza(paramArrayOfInt, 3, 7, 11, 15);
      zza(paramArrayOfInt, 0, 5, 10, 15);
      zza(paramArrayOfInt, 1, 6, 11, 12);
      zza(paramArrayOfInt, 2, 7, 8, 13);
      zza(paramArrayOfInt, 3, 4, 9, 14);
    }
  }
  
  private static void zza(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramArrayOfInt[paramInt1] + paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt1] = i;
    i = zza(i ^ paramArrayOfInt[paramInt4], 16);
    paramArrayOfInt[paramInt4] = i;
    i = paramArrayOfInt[paramInt3] + i;
    paramArrayOfInt[paramInt3] = i;
    i = zza(paramArrayOfInt[paramInt2] ^ i, 12);
    paramArrayOfInt[paramInt2] = i;
    i = paramArrayOfInt[paramInt1] + i;
    paramArrayOfInt[paramInt1] = i;
    paramInt1 = zza(paramArrayOfInt[paramInt4] ^ i, 8);
    paramArrayOfInt[paramInt4] = paramInt1;
    paramInt1 = paramArrayOfInt[paramInt3] + paramInt1;
    paramArrayOfInt[paramInt3] = paramInt1;
    paramArrayOfInt[paramInt2] = zza(paramArrayOfInt[paramInt2] ^ paramInt1, 7);
  }
  
  public static void zza(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt = zza;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt1, 0, arrayOfInt.length);
    System.arraycopy(paramArrayOfInt2, 0, paramArrayOfInt1, arrayOfInt.length, 8);
  }
  
  public static byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = zzb(zza(paramArrayOfByte1), zza(paramArrayOfByte2));
    paramArrayOfByte2 = ByteBuffer.allocate(paramArrayOfByte1.length << 2).order(ByteOrder.LITTLE_ENDIAN);
    paramArrayOfByte2.asIntBuffer().put(paramArrayOfByte1);
    return paramArrayOfByte2.array();
  }
  
  public static int[] zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length % 4 == 0)
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
      int[] arrayOfInt = new int[paramArrayOfByte.remaining()];
      paramArrayOfByte.get(arrayOfInt);
      return arrayOfInt;
    }
    throw new IllegalArgumentException("invalid input length");
  }
  
  public static int[] zzb(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt = new int[16];
    zza(arrayOfInt, paramArrayOfInt1);
    arrayOfInt[12] = paramArrayOfInt2[0];
    arrayOfInt[13] = paramArrayOfInt2[1];
    arrayOfInt[14] = paramArrayOfInt2[2];
    arrayOfInt[15] = paramArrayOfInt2[3];
    zza(arrayOfInt);
    arrayOfInt[4] = arrayOfInt[12];
    arrayOfInt[5] = arrayOfInt[13];
    arrayOfInt[6] = arrayOfInt[14];
    arrayOfInt[7] = arrayOfInt[15];
    return Arrays.copyOf(arrayOfInt, 8);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */