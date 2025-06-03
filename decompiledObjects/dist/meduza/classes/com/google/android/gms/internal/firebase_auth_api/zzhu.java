package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;

public final class zzhu
{
  private static long zza(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return ((paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16) & 0xFFFFFFFF;
  }
  
  private static long zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza(paramArrayOfByte, paramInt1) >> paramInt2 & 0x3FFFFFF;
  }
  
  private static void zza(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = 0;
    while (i < 4)
    {
      paramArrayOfByte[(paramInt + i)] = ((byte)(byte)(int)(0xFF & paramLong));
      i++;
      paramLong >>= 8;
    }
  }
  
  public static byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == 32)
    {
      long l1 = zza(paramArrayOfByte1, 0, 0) & 0x3FFFFFF;
      long l2 = zza(paramArrayOfByte1, 3, 2) & 0x3FFFF03;
      long l3 = zza(paramArrayOfByte1, 6, 4) & 0x3FFC0FF;
      long l4 = zza(paramArrayOfByte1, 9, 6) & 0x3F03FFF;
      long l5 = zza(paramArrayOfByte1, 12, 8) & 0xFFFFF;
      long l6 = l3 * 5L;
      long l7 = l4 * 5L;
      long l8 = l5 * 5L;
      byte[] arrayOfByte = new byte[17];
      long l9 = 0L;
      int i = 0;
      long l10 = 0L;
      long l11 = l10;
      long l12 = l11;
      long l13 = l12;
      long l14 = l11;
      for (l11 = l9; i < paramArrayOfByte2.length; l11 = (l11 & 0x3FFFFFF) + (l9 >> 26))
      {
        int j = Math.min(16, paramArrayOfByte2.length - i);
        System.arraycopy(paramArrayOfByte2, i, arrayOfByte, 0, j);
        arrayOfByte[j] = ((byte)1);
        if (j != 16) {
          Arrays.fill(arrayOfByte, j + 1, 17, (byte)0);
        }
        l9 = l13 + zza(arrayOfByte, 0, 0);
        long l15 = l11 + zza(arrayOfByte, 3, 2);
        long l16 = l10 + zza(arrayOfByte, 6, 4);
        long l17 = l14 + zza(arrayOfByte, 9, 6);
        l12 += (zza(arrayOfByte, 12, 8) | arrayOfByte[16] << 24);
        l10 = l12 * (l2 * 5L) + (l17 * l6 + (l16 * l7 + (l15 * l8 + l9 * l1)));
        l11 = l12 * l6 + (l17 * l7 + (l16 * l8 + (l15 * l1 + l9 * l2))) + (l10 >> 26);
        l14 = l12 * l7 + (l17 * l8 + (l16 * l1 + (l15 * l2 + l9 * l3))) + (l11 >> 26);
        l13 = l12 * l8 + (l17 * l1 + (l16 * l2 + (l15 * l3 + l9 * l4))) + (l14 >> 26);
        l9 = l12 * l1 + (l17 * l2 + (l16 * l3 + (l15 * l4 + l9 * l5))) + (l13 >> 26);
        l12 = l9 & 0x3FFFFFF;
        l9 = (l9 >> 26) * 5L + (l10 & 0x3FFFFFF);
        i += 16;
        l10 = l14 & 0x3FFFFFF;
        l14 = l13 & 0x3FFFFFF;
        l13 = l9 & 0x3FFFFFF;
      }
      l9 = l10 + (l11 >> 26);
      l10 = l9 & 0x3FFFFFF;
      l9 = l14 + (l9 >> 26);
      l14 = l9 & 0x3FFFFFF;
      l9 = l12 + (l9 >> 26);
      l12 = l9 & 0x3FFFFFF;
      l13 = (l9 >> 26) * 5L + l13;
      l2 = l13 & 0x3FFFFFF;
      l4 = (l11 & 0x3FFFFFF) + (l13 >> 26);
      l3 = l2 + 5L;
      l7 = (l3 >> 26) + l4;
      l1 = l10 + (l7 >> 26);
      l5 = l14 + (l1 >> 26);
      l13 = l12 + (l5 >> 26) - 67108864L;
      l11 = l13 >> 63;
      l9 = l11;
      l4 = l4 & l11 | l7 & 0x3FFFFFF & l9;
      l10 = l10 & l11 | l1 & 0x3FFFFFF & l9;
      l14 = l14 & l11 | l5 & 0x3FFFFFF & l9;
      l2 = ((l2 & l11 | l3 & 0x3FFFFFF & l9 | l4 << 26) & 0xFFFFFFFF) + zza(paramArrayOfByte1, 16);
      l3 = ((l4 >> 6 | l10 << 20) & 0xFFFFFFFF) + zza(paramArrayOfByte1, 20) + (l2 >> 32);
      l10 = ((l10 >> 12 | l14 << 14) & 0xFFFFFFFF) + zza(paramArrayOfByte1, 24) + (l3 >> 32);
      l4 = zza(paramArrayOfByte1, 28);
      paramArrayOfByte1 = new byte[16];
      zza(paramArrayOfByte1, l2 & 0xFFFFFFFF, 0);
      zza(paramArrayOfByte1, l3 & 0xFFFFFFFF, 4);
      zza(paramArrayOfByte1, l10 & 0xFFFFFFFF, 8);
      zza(paramArrayOfByte1, ((l14 >> 18 | (l12 & l11 | l13 & l9) << 8) & 0xFFFFFFFF) + l4 + (l10 >> 32) & 0xFFFFFFFF, 12);
      return paramArrayOfByte1;
    }
    throw new IllegalArgumentException("The key length in bytes must be 32.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */