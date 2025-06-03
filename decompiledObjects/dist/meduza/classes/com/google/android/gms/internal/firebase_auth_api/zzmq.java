package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

public final class zzmq
{
  private static final byte[][] zza;
  
  static
  {
    byte[] arrayOfByte1 = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    byte[] arrayOfByte2 = { -32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0 };
    byte[] arrayOfByte3 = { 95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87 };
    byte[] arrayOfByte4 = { -18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127 };
    zza = new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, arrayOfByte1, arrayOfByte2, arrayOfByte3, { -20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127 }, { -19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127 }, arrayOfByte4 };
  }
  
  public static void zza(long[] paramArrayOfLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte2.length == 32)
    {
      Object localObject1 = Arrays.copyOf(paramArrayOfByte2, paramArrayOfByte2.length);
      localObject1[31] = ((byte)(byte)(localObject1[31] & 0x7F));
      int i = 0;
      for (int j = 0;; j++)
      {
        localObject2 = zza;
        if (j >= localObject2.length) {
          break label85;
        }
        if (MessageDigest.isEqual(localObject2[j], (byte[])localObject1)) {
          break;
        }
      }
      throw new InvalidKeyException(f.j("Banned public key: ", zzza.zza(localObject2[j])));
      label85:
      long[] arrayOfLong1 = zzmw.zza((byte[])localObject1);
      Object localObject3 = new long[19];
      Object localObject4 = new long[19];
      localObject4[0] = 1L;
      Object localObject2 = new long[19];
      localObject2[0] = 1L;
      Object localObject5 = new long[19];
      Object localObject6 = new long[19];
      Object localObject7 = new long[19];
      localObject7[0] = 1L;
      localObject1 = new long[19];
      Object localObject8 = new long[19];
      localObject8[0] = 1L;
      System.arraycopy(arrayOfLong1, 0, localObject3, 0, 10);
      j = i;
      for (;;)
      {
        int k = 0;
        if (j >= 32) {
          break;
        }
        i = paramArrayOfByte1[(32 - j - 1)] & 0xFF;
        Object localObject9 = localObject3;
        localObject3 = localObject8;
        while (k < 8)
        {
          int m = i >> 7 - k & 0x1;
          zza((long[])localObject2, (long[])localObject9, m);
          zza((long[])localObject5, (long[])localObject4, m);
          long[] arrayOfLong2 = Arrays.copyOf((long[])localObject2, 10);
          Object localObject10 = new long[19];
          Object localObject11 = new long[19];
          localObject8 = new long[19];
          long[] arrayOfLong3 = new long[19];
          Object localObject12 = new long[19];
          long[] arrayOfLong4 = new long[19];
          long[] arrayOfLong5 = new long[19];
          zzmw.zzd((long[])localObject2, (long[])localObject5);
          zzmw.zzc((long[])localObject5, arrayOfLong2);
          arrayOfLong2 = Arrays.copyOf((long[])localObject9, 10);
          zzmw.zzd((long[])localObject9, (long[])localObject4);
          zzmw.zzc((long[])localObject4, arrayOfLong2);
          zzmw.zzb(arrayOfLong3, (long[])localObject9, (long[])localObject5);
          zzmw.zzb((long[])localObject12, (long[])localObject2, (long[])localObject4);
          zzmw.zzb(arrayOfLong3);
          zzmw.zza(arrayOfLong3);
          zzmw.zzb((long[])localObject12);
          zzmw.zza((long[])localObject12);
          System.arraycopy(arrayOfLong3, 0, arrayOfLong2, 0, 10);
          zzmw.zzd(arrayOfLong3, (long[])localObject12);
          zzmw.zzc((long[])localObject12, arrayOfLong2);
          zzmw.zzb(arrayOfLong5, arrayOfLong3);
          zzmw.zzb(arrayOfLong4, (long[])localObject12);
          zzmw.zzb((long[])localObject12, arrayOfLong4, arrayOfLong1);
          zzmw.zzb((long[])localObject12);
          zzmw.zza((long[])localObject12);
          System.arraycopy(arrayOfLong5, 0, localObject6, 0, 10);
          System.arraycopy(localObject12, 0, localObject7, 0, 10);
          zzmw.zzb((long[])localObject11, (long[])localObject2);
          zzmw.zzb((long[])localObject8, (long[])localObject5);
          zzmw.zzb((long[])localObject1, (long[])localObject11, (long[])localObject8);
          zzmw.zzb((long[])localObject1);
          zzmw.zza((long[])localObject1);
          zzmw.zzc((long[])localObject8, (long[])localObject11);
          Arrays.fill((long[])localObject10, 10, 18, 0L);
          zzmw.zza((long[])localObject10, (long[])localObject8, 121665L);
          zzmw.zza((long[])localObject10);
          zzmw.zzd((long[])localObject10, (long[])localObject11);
          zzmw.zzb((long[])localObject3, (long[])localObject8, (long[])localObject10);
          zzmw.zzb((long[])localObject3);
          zzmw.zza((long[])localObject3);
          zza((long[])localObject1, (long[])localObject6, m);
          zza((long[])localObject3, (long[])localObject7, m);
          k++;
          localObject11 = localObject6;
          localObject6 = localObject9;
          localObject10 = localObject3;
          localObject3 = localObject5;
          localObject8 = localObject4;
          localObject12 = localObject2;
          localObject9 = localObject11;
          localObject4 = localObject7;
          localObject2 = localObject1;
          localObject5 = localObject10;
          localObject7 = localObject8;
          localObject1 = localObject12;
        }
        j++;
        localObject8 = localObject3;
        localObject3 = localObject9;
      }
      paramArrayOfByte1 = new long[10];
      zzmw.zza(paramArrayOfByte1, (long[])localObject5);
      zzmw.zza(paramArrayOfLong, (long[])localObject2, paramArrayOfByte1);
      localObject2 = new long[10];
      paramArrayOfByte1 = new long[10];
      localObject6 = new long[11];
      localObject1 = new long[11];
      localObject7 = new long[11];
      zzmw.zza((long[])localObject2, arrayOfLong1, paramArrayOfLong);
      zzmw.zzd(paramArrayOfByte1, arrayOfLong1, paramArrayOfLong);
      paramArrayOfLong = new long[10];
      paramArrayOfLong[0] = 486662L;
      zzmw.zzd((long[])localObject1, paramArrayOfByte1, paramArrayOfLong);
      zzmw.zza((long[])localObject1, (long[])localObject1, (long[])localObject4);
      zzmw.zzd((long[])localObject1, (long[])localObject3);
      zzmw.zza((long[])localObject1, (long[])localObject1, (long[])localObject2);
      zzmw.zza((long[])localObject1, (long[])localObject1, (long[])localObject3);
      zzmw.zza((long[])localObject6, (long[])localObject1, 4L);
      zzmw.zza((long[])localObject6);
      zzmw.zza((long[])localObject1, (long[])localObject2, (long[])localObject4);
      zzmw.zzc((long[])localObject1, (long[])localObject1, (long[])localObject4);
      zzmw.zza((long[])localObject7, paramArrayOfByte1, (long[])localObject3);
      zzmw.zzd((long[])localObject1, (long[])localObject1, (long[])localObject7);
      zzmw.zzb((long[])localObject1, (long[])localObject1);
      if (MessageDigest.isEqual(zzmw.zzc((long[])localObject6), zzmw.zzc((long[])localObject1))) {
        return;
      }
      throw new IllegalStateException(f.j("Arithmetic error in curve multiplication with the public key: ", zzza.zza(paramArrayOfByte2)));
    }
    throw new InvalidKeyException("Public key length is not 32-byte");
  }
  
  private static void zza(long[] paramArrayOfLong1, long[] paramArrayOfLong2, int paramInt)
  {
    int i = -paramInt;
    for (paramInt = 0; paramInt < 10; paramInt++)
    {
      long l = paramArrayOfLong1[paramInt];
      int j = ((int)l ^ (int)paramArrayOfLong2[paramInt]) & i;
      paramArrayOfLong1[paramInt] = ((int)l ^ j);
      paramArrayOfLong2[paramInt] = ((int)paramArrayOfLong2[paramInt] ^ j);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */