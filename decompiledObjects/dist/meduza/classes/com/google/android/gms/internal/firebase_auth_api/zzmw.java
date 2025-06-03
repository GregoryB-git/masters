package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;

public final class zzmw
{
  private static final int[] zza = { 0, 3, 6, 9, 12, 16, 19, 22, 25, 28 };
  private static final int[] zzb = { 0, 2, 3, 5, 6, 0, 1, 3, 4, 6 };
  private static final int[] zzc = { 67108863, 33554431 };
  private static final int[] zzd = { 26, 25 };
  
  public static void zza(long[] paramArrayOfLong)
  {
    paramArrayOfLong[10] = 0L;
    int i = 0;
    while (i < 10)
    {
      l1 = paramArrayOfLong[i];
      l2 = l1 / 67108864L;
      paramArrayOfLong[i] = (l1 - (l2 << 26));
      int j = i + 1;
      l1 = paramArrayOfLong[j] + l2;
      paramArrayOfLong[j] = l1;
      l2 = l1 / 33554432L;
      paramArrayOfLong[j] = (l1 - (l2 << 25));
      i += 2;
      paramArrayOfLong[i] += l2;
    }
    long l2 = paramArrayOfLong[0];
    long l1 = paramArrayOfLong[10];
    l2 += (l1 << 4);
    paramArrayOfLong[0] = l2;
    l2 += (l1 << 1);
    paramArrayOfLong[0] = l2;
    l2 += l1;
    paramArrayOfLong[0] = l2;
    paramArrayOfLong[10] = 0L;
    l1 = l2 / 67108864L;
    paramArrayOfLong[0] = (l2 - (l1 << 26));
    paramArrayOfLong[1] += l1;
  }
  
  public static void zza(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    long[] arrayOfLong1 = new long[10];
    long[] arrayOfLong2 = new long[10];
    long[] arrayOfLong3 = new long[10];
    long[] arrayOfLong4 = new long[10];
    long[] arrayOfLong5 = new long[10];
    long[] arrayOfLong6 = new long[10];
    long[] arrayOfLong7 = new long[10];
    long[] arrayOfLong8 = new long[10];
    long[] arrayOfLong9 = new long[10];
    long[] arrayOfLong10 = new long[10];
    zzb(arrayOfLong1, paramArrayOfLong2);
    zzb(arrayOfLong10, arrayOfLong1);
    zzb(arrayOfLong9, arrayOfLong10);
    zza(arrayOfLong2, arrayOfLong9, paramArrayOfLong2);
    zza(arrayOfLong3, arrayOfLong2, arrayOfLong1);
    zzb(arrayOfLong9, arrayOfLong3);
    zza(arrayOfLong4, arrayOfLong9, arrayOfLong2);
    zzb(arrayOfLong9, arrayOfLong4);
    zzb(arrayOfLong10, arrayOfLong9);
    zzb(arrayOfLong9, arrayOfLong10);
    zzb(arrayOfLong10, arrayOfLong9);
    zzb(arrayOfLong9, arrayOfLong10);
    zza(arrayOfLong5, arrayOfLong9, arrayOfLong4);
    zzb(arrayOfLong9, arrayOfLong5);
    zzb(arrayOfLong10, arrayOfLong9);
    int i = 2;
    for (int j = 2; j < 10; j += 2)
    {
      zzb(arrayOfLong9, arrayOfLong10);
      zzb(arrayOfLong10, arrayOfLong9);
    }
    zza(arrayOfLong6, arrayOfLong10, arrayOfLong5);
    zzb(arrayOfLong9, arrayOfLong6);
    zzb(arrayOfLong10, arrayOfLong9);
    for (j = 2; j < 20; j += 2)
    {
      zzb(arrayOfLong9, arrayOfLong10);
      zzb(arrayOfLong10, arrayOfLong9);
    }
    zza(arrayOfLong9, arrayOfLong10, arrayOfLong6);
    zzb(arrayOfLong10, arrayOfLong9);
    zzb(arrayOfLong9, arrayOfLong10);
    for (j = 2; j < 10; j += 2)
    {
      zzb(arrayOfLong10, arrayOfLong9);
      zzb(arrayOfLong9, arrayOfLong10);
    }
    zza(arrayOfLong7, arrayOfLong9, arrayOfLong5);
    zzb(arrayOfLong9, arrayOfLong7);
    zzb(arrayOfLong10, arrayOfLong9);
    for (j = 2; j < 50; j += 2)
    {
      zzb(arrayOfLong9, arrayOfLong10);
      zzb(arrayOfLong10, arrayOfLong9);
    }
    zza(arrayOfLong8, arrayOfLong10, arrayOfLong7);
    zzb(arrayOfLong10, arrayOfLong8);
    zzb(arrayOfLong9, arrayOfLong10);
    for (j = 2; j < 100; j += 2)
    {
      zzb(arrayOfLong10, arrayOfLong9);
      zzb(arrayOfLong9, arrayOfLong10);
    }
    zza(arrayOfLong10, arrayOfLong9, arrayOfLong8);
    zzb(arrayOfLong9, arrayOfLong10);
    zzb(arrayOfLong10, arrayOfLong9);
    for (j = i; j < 50; j += 2)
    {
      zzb(arrayOfLong9, arrayOfLong10);
      zzb(arrayOfLong10, arrayOfLong9);
    }
    zza(arrayOfLong9, arrayOfLong10, arrayOfLong7);
    zzb(arrayOfLong10, arrayOfLong9);
    zzb(arrayOfLong9, arrayOfLong10);
    zzb(arrayOfLong10, arrayOfLong9);
    zzb(arrayOfLong9, arrayOfLong10);
    zzb(arrayOfLong10, arrayOfLong9);
    zza(paramArrayOfLong1, arrayOfLong10, arrayOfLong3);
  }
  
  public static void zza(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    for (int i = 0; i < 10; i++) {
      paramArrayOfLong2[i] *= paramLong;
    }
  }
  
  public static void zza(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    long[] arrayOfLong = new long[19];
    zzb(arrayOfLong, paramArrayOfLong2, paramArrayOfLong3);
    zze(arrayOfLong, paramArrayOfLong1);
  }
  
  public static long[] zza(byte[] paramArrayOfByte)
  {
    long[] arrayOfLong = new long[10];
    for (int i = 0; i < 10; i++)
    {
      int j = zza[i];
      arrayOfLong[i] = ((paramArrayOfByte[j] & 0xFF | (paramArrayOfByte[(j + 1)] & 0xFF) << 8 | (paramArrayOfByte[(j + 2)] & 0xFF) << 16 | (paramArrayOfByte[(j + 3)] & 0xFF) << 24) >> zzb[i] & zzc[(i & 0x1)]);
    }
    return arrayOfLong;
  }
  
  public static void zzb(long[] paramArrayOfLong)
  {
    long l1 = paramArrayOfLong[8];
    long l2 = paramArrayOfLong[18];
    l1 += (l2 << 4);
    paramArrayOfLong[8] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[8] = l1;
    paramArrayOfLong[8] = (l1 + l2);
    l1 = paramArrayOfLong[7];
    l2 = paramArrayOfLong[17];
    l1 += (l2 << 4);
    paramArrayOfLong[7] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[7] = l1;
    paramArrayOfLong[7] = (l1 + l2);
    l1 = paramArrayOfLong[6];
    l2 = paramArrayOfLong[16];
    l1 += (l2 << 4);
    paramArrayOfLong[6] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[6] = l1;
    paramArrayOfLong[6] = (l1 + l2);
    l1 = paramArrayOfLong[5];
    l2 = paramArrayOfLong[15];
    l1 += (l2 << 4);
    paramArrayOfLong[5] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[5] = l1;
    paramArrayOfLong[5] = (l1 + l2);
    l1 = paramArrayOfLong[4];
    l2 = paramArrayOfLong[14];
    l1 += (l2 << 4);
    paramArrayOfLong[4] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[4] = l1;
    paramArrayOfLong[4] = (l1 + l2);
    l1 = paramArrayOfLong[3];
    l2 = paramArrayOfLong[13];
    l1 += (l2 << 4);
    paramArrayOfLong[3] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[3] = l1;
    paramArrayOfLong[3] = (l1 + l2);
    l1 = paramArrayOfLong[2];
    l2 = paramArrayOfLong[12];
    l1 += (l2 << 4);
    paramArrayOfLong[2] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[2] = l1;
    paramArrayOfLong[2] = (l1 + l2);
    l1 = paramArrayOfLong[1];
    l2 = paramArrayOfLong[11];
    l1 += (l2 << 4);
    paramArrayOfLong[1] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[1] = l1;
    paramArrayOfLong[1] = (l1 + l2);
    l1 = paramArrayOfLong[0];
    l2 = paramArrayOfLong[10];
    l1 += (l2 << 4);
    paramArrayOfLong[0] = l1;
    l1 += (l2 << 1);
    paramArrayOfLong[0] = l1;
    paramArrayOfLong[0] = (l1 + l2);
  }
  
  public static void zzb(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    long l1 = paramArrayOfLong2[0];
    long l2 = paramArrayOfLong2[0];
    long l3 = paramArrayOfLong2[1];
    long l4 = paramArrayOfLong2[1];
    long l5 = paramArrayOfLong2[2];
    long l6 = paramArrayOfLong2[2];
    long l7 = paramArrayOfLong2[3];
    long l8 = paramArrayOfLong2[3];
    long l9 = paramArrayOfLong2[4];
    long l10 = paramArrayOfLong2[4];
    long l11 = paramArrayOfLong2[5];
    long l12 = paramArrayOfLong2[6];
    long l13 = paramArrayOfLong2[5];
    long l14 = paramArrayOfLong2[6];
    long l15 = paramArrayOfLong2[7];
    long l16 = paramArrayOfLong2[8];
    long l17 = paramArrayOfLong2[7];
    long l18 = paramArrayOfLong2[8];
    long l19 = paramArrayOfLong2[9];
    long l20 = paramArrayOfLong2[9];
    zze(new long[] { l1 * l1, l2 * 2L * l3, (l5 * l2 + l4 * l4) * 2L, (l7 * l2 + l4 * l6) * 2L, l2 * 2L * l9 + (l4 * 4L * l8 + l6 * l6), (l11 * l2 + (l4 * l10 + l6 * l8)) * 2L, (l4 * 2L * l13 + (l12 * l2 + (l6 * l10 + l8 * l8))) * 2L, (l15 * l2 + (l4 * l14 + (l6 * l13 + l8 * l10))) * 2L, ((l8 * l13 + l4 * l17) * 2L + (l16 * l2 + l6 * l14)) * 2L + l10 * l10, (l2 * l19 + (l4 * l18 + (l6 * l17 + (l8 * l14 + l10 * l13)))) * 2L, ((l4 * l20 + l8 * l17) * 2L + (l6 * l18 + (l10 * l14 + l13 * l13))) * 2L, (l6 * l20 + (l8 * l18 + (l10 * l17 + l13 * l14))) * 2L, ((l8 * l20 + l13 * l17) * 2L + l10 * l18) * 2L + l14 * l14, (l10 * l20 + (l13 * l18 + l14 * l17)) * 2L, (l13 * 2L * l20 + (l14 * l18 + l17 * l17)) * 2L, (l14 * l20 + l17 * l18) * 2L, l17 * 4L * l20 + l18 * l18, l18 * 2L * l20, 2L * l20 * l20 }, paramArrayOfLong1);
  }
  
  public static void zzb(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    paramArrayOfLong2[0] *= paramArrayOfLong3[0];
    long l1 = paramArrayOfLong2[0];
    long l2 = paramArrayOfLong3[1];
    long l3 = paramArrayOfLong2[1];
    long l4 = paramArrayOfLong3[0];
    paramArrayOfLong1[1] = (l3 * l4 + l2 * l1);
    l2 = paramArrayOfLong2[1];
    l3 = paramArrayOfLong3[1];
    long l5 = paramArrayOfLong3[2];
    paramArrayOfLong1[2] = (paramArrayOfLong2[2] * l4 + (l5 * l1 + l2 * 2L * l3));
    l5 = paramArrayOfLong3[2];
    long l6 = paramArrayOfLong2[2];
    long l7 = paramArrayOfLong3[3];
    paramArrayOfLong1[3] = (paramArrayOfLong2[3] * l4 + (l7 * l1 + (l6 * l3 + l2 * l5)));
    long l8 = paramArrayOfLong3[3];
    l7 = paramArrayOfLong2[3];
    long l9 = paramArrayOfLong3[4];
    paramArrayOfLong1[4] = (paramArrayOfLong2[4] * l4 + (l9 * l1 + ((l7 * l3 + l2 * l8) * 2L + l6 * l5)));
    l9 = paramArrayOfLong3[4];
    long l10 = paramArrayOfLong2[4];
    long l11 = paramArrayOfLong3[5];
    paramArrayOfLong1[5] = (paramArrayOfLong2[5] * l4 + (l11 * l1 + (l10 * l3 + (l2 * l9 + (l7 * l5 + l6 * l8)))));
    long l12 = paramArrayOfLong3[5];
    l11 = paramArrayOfLong2[5];
    long l13 = paramArrayOfLong3[6];
    paramArrayOfLong1[6] = (paramArrayOfLong2[6] * l4 + (l13 * l1 + (l10 * l5 + (l6 * l9 + (l11 * l3 + (l2 * l12 + l7 * l8)) * 2L))));
    l13 = paramArrayOfLong3[6];
    long l14 = paramArrayOfLong2[6];
    long l15 = paramArrayOfLong3[7];
    paramArrayOfLong1[7] = (paramArrayOfLong2[7] * l4 + (l15 * l1 + (l14 * l3 + (l2 * l13 + (l11 * l5 + (l6 * l12 + (l10 * l8 + l7 * l9)))))));
    l15 = paramArrayOfLong3[7];
    long l16 = paramArrayOfLong2[7];
    long l17 = paramArrayOfLong3[8];
    paramArrayOfLong1[8] = (paramArrayOfLong2[8] * l4 + (l17 * l1 + (l14 * l5 + (l6 * l13 + ((l16 * l3 + (l2 * l15 + (l11 * l8 + l7 * l12))) * 2L + l10 * l9)))));
    l17 = paramArrayOfLong3[8];
    long l18 = paramArrayOfLong2[8];
    long l19 = paramArrayOfLong3[9];
    paramArrayOfLong1[9] = (paramArrayOfLong2[9] * l4 + (l1 * l19 + (l18 * l3 + (l2 * l17 + (l16 * l5 + (l6 * l15 + (l14 * l8 + (l7 * l13 + (l11 * l9 + l10 * l12)))))))));
    l4 = paramArrayOfLong3[9];
    l1 = paramArrayOfLong2[9];
    paramArrayOfLong1[10] = (l18 * l5 + (l6 * l17 + (l14 * l9 + (l10 * l13 + (l3 * l1 + (l2 * l4 + (l16 * l8 + (l7 * l15 + l11 * l12)))) * 2L))));
    paramArrayOfLong1[11] = (l5 * l1 + (l6 * l4 + (l18 * l8 + (l7 * l17 + (l16 * l9 + (l10 * l15 + (l14 * l12 + l11 * l13)))))));
    paramArrayOfLong1[12] = (l18 * l9 + (l10 * l17 + ((l8 * l1 + (l7 * l4 + (l16 * l12 + l11 * l15))) * 2L + l14 * l13)));
    paramArrayOfLong1[13] = (l9 * l1 + (l10 * l4 + (l18 * l12 + (l11 * l17 + (l16 * l13 + l14 * l15)))));
    paramArrayOfLong1[14] = (l18 * l13 + (l14 * l17 + (l12 * l1 + (l11 * l4 + l16 * l15)) * 2L));
    paramArrayOfLong1[15] = (l13 * l1 + (l14 * l4 + (l18 * l15 + l16 * l17)));
    paramArrayOfLong1[16] = ((l15 * l1 + l16 * l4) * 2L + l18 * l17);
    paramArrayOfLong1[17] = (l17 * l1 + l18 * l4);
    paramArrayOfLong1[18] = (l1 * 2L * l4);
  }
  
  public static void zzc(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    zzc(paramArrayOfLong1, paramArrayOfLong2, paramArrayOfLong1);
  }
  
  public static void zzc(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    for (int i = 0; i < 10; i++) {
      paramArrayOfLong2[i] -= paramArrayOfLong3[i];
    }
  }
  
  public static byte[] zzc(long[] paramArrayOfLong)
  {
    paramArrayOfLong = Arrays.copyOf(paramArrayOfLong, 10);
    int i = 0;
    int m;
    int n;
    for (int j = 0; j < 2; j++)
    {
      k = 0;
      while (k < 9)
      {
        l1 = paramArrayOfLong[k];
        m = zzd[(k & 0x1)];
        n = -(int)((l1 >> 31 & l1) >> m);
        paramArrayOfLong[k] = (l1 + (n << m));
        k++;
        paramArrayOfLong[k] -= n;
      }
      l1 = paramArrayOfLong[9];
      k = -(int)((l1 >> 31 & l1) >> 25);
      paramArrayOfLong[9] = (l1 + (k << 25));
      paramArrayOfLong[0] -= k * 19L;
    }
    long l1 = paramArrayOfLong[0];
    j = -(int)((l1 >> 31 & l1) >> 26);
    paramArrayOfLong[0] = (l1 + (j << 26));
    paramArrayOfLong[1] -= j;
    for (j = 0; j < 2; j++)
    {
      k = 0;
      while (k < 9)
      {
        l1 = paramArrayOfLong[k];
        localObject = zzd;
        m = k & 0x1;
        n = (int)(l1 >> localObject[m]);
        paramArrayOfLong[k] = (l1 & zzc[m]);
        k++;
        paramArrayOfLong[k] += n;
      }
    }
    l1 = paramArrayOfLong[9];
    j = (int)(l1 >> 25);
    paramArrayOfLong[9] = (l1 & 0x1FFFFFF);
    l1 = paramArrayOfLong[0];
    l1 = j * 19L + l1;
    paramArrayOfLong[0] = l1;
    j = (int)l1 - 67108845 >> 31;
    for (int k = 1; k < 10; k++)
    {
      n = (int)paramArrayOfLong[k] ^ zzc[(k & 0x1)];
      n &= n << 16;
      n &= n << 8;
      n &= n << 4;
      n &= n << 2;
      j &= (n & n << 1) >> 31;
    }
    paramArrayOfLong[0] -= (0x3FFFFED & j);
    long l2 = paramArrayOfLong[1];
    l1 = 0x1FFFFFF & j;
    paramArrayOfLong[1] = (l2 - l1);
    for (k = 2; k < 10; k += 2)
    {
      paramArrayOfLong[k] -= (0x3FFFFFF & j);
      n = k + 1;
      paramArrayOfLong[n] -= l1;
    }
    for (j = 0; j < 10; j++) {
      paramArrayOfLong[j] <<= zzb[j];
    }
    Object localObject = new byte[32];
    for (j = i; j < 10; j++)
    {
      k = zza[j];
      l2 = localObject[k];
      l1 = paramArrayOfLong[j];
      localObject[k] = ((byte)(byte)(int)(l2 | l1 & 0xFF));
      i = k + 1;
      localObject[i] = ((byte)(byte)(int)(localObject[i] | l1 >> 8 & 0xFF));
      i = k + 2;
      localObject[i] = ((byte)(byte)(int)(localObject[i] | l1 >> 16 & 0xFF));
      k += 3;
      localObject[k] = ((byte)(byte)(int)(localObject[k] | l1 >> 24 & 0xFF));
    }
    return (byte[])localObject;
  }
  
  public static void zzd(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    zzd(paramArrayOfLong1, paramArrayOfLong1, paramArrayOfLong2);
  }
  
  public static void zzd(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    for (int i = 0; i < 10; i++) {
      paramArrayOfLong2[i] += paramArrayOfLong3[i];
    }
  }
  
  private static void zze(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (paramArrayOfLong1.length != 19)
    {
      long[] arrayOfLong = new long[19];
      System.arraycopy(paramArrayOfLong1, 0, arrayOfLong, 0, paramArrayOfLong1.length);
      paramArrayOfLong1 = arrayOfLong;
    }
    zzb(paramArrayOfLong1);
    zza(paramArrayOfLong1);
    System.arraycopy(paramArrayOfLong1, 0, paramArrayOfLong2, 0, 10);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */