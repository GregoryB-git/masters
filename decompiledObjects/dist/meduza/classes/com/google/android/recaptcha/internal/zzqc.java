package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public final class zzqc
{
  public static final Charset zza = StandardCharsets.UTF_16;
  public int[] zzb;
  public int[] zzc;
  private final int[] zzd = { 511133343, 1277647508, 107287496, 338123662 };
  private byte[] zze;
  private byte[] zzf;
  private int zzg;
  
  public zzqc() {}
  
  public zzqc(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == 32)
    {
      zze = paramArrayOfByte1;
      zzg = 1;
      zzf = paramArrayOfByte2;
      zzb = new int[16];
      for (int i = 0; i < 4; i++) {
        zzb[i] = zza(zzd[i], 2131181306);
      }
      for (i = 4; i < 12; i++) {
        zzb[i] = zzg(zze, (i - 4) * 4);
      }
      zzb[12] = zzg;
      for (i = 13; i < 16; i++) {
        zzb[i] = zzg(zzf, (i - 13) * 4);
      }
      paramArrayOfByte1 = new int[16];
      zzc = paramArrayOfByte1;
      paramArrayOfByte2 = zzb;
      i = paramArrayOfByte2.length;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, 0, 16);
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static int zza(int paramInt1, int paramInt2)
  {
    if (paramInt1 % 2 == 0) {
      return paramInt1 & paramInt2 | paramInt2 & paramInt1;
    }
    return (paramInt1 | paramInt2) - (paramInt1 & paramInt2);
  }
  
  public static String zze(String paramString, byte[] paramArrayOfByte, zzqd paramzzqd)
  {
    paramzzqd = Base64.decode(paramString, 0);
    byte[] arrayOfByte = new byte[12];
    int i = paramzzqd.length - 12;
    paramString = new byte[i];
    System.arraycopy(paramzzqd, 0, arrayOfByte, 0, 12);
    System.arraycopy(paramzzqd, 12, paramString, 0, i);
    return new String(new zzqc(paramArrayOfByte, arrayOfByte).zzd(paramString), zza);
  }
  
  public static String zzf(String paramString, byte[] paramArrayOfByte, zzqd paramzzqd)
  {
    paramzzqd = new byte[12];
    new SecureRandom().nextBytes(paramzzqd);
    paramString = new zzqc(paramArrayOfByte, paramzzqd).zzd(paramString.getBytes(zza));
    int i = paramString.length;
    paramArrayOfByte = new byte[i + 12];
    System.arraycopy(paramzzqd, 0, paramArrayOfByte, 0, 12);
    System.arraycopy(paramString, 0, paramArrayOfByte, 12, i);
    return Base64.encodeToString(paramArrayOfByte, 2);
  }
  
  private static final int zzg(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (j & 0xFF) << 8 | i & 0xFF | (k & 0xFF) << 16;
  }
  
  public final void zzb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzc(paramInt1, paramInt2, paramInt4, 16);
    zzc(paramInt3, paramInt4, paramInt2, 12);
    zzc(paramInt1, paramInt2, paramInt4, 8);
    zzc(paramInt3, paramInt4, paramInt2, 7);
  }
  
  public final void zzc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int[] arrayOfInt = zzb;
    paramInt2 = arrayOfInt[paramInt1] + arrayOfInt[paramInt2];
    arrayOfInt[paramInt1] = paramInt2;
    paramInt1 = zza(arrayOfInt[paramInt3], paramInt2);
    arrayOfInt[paramInt3] = paramInt1;
    arrayOfInt[paramInt3] = (paramInt1 << paramInt4 | paramInt1 >>> 32 - paramInt4);
  }
  
  public final byte[] zzd(byte[] paramArrayOfByte)
  {
    if (zzg == 1)
    {
      int i = paramArrayOfByte.length;
      byte[] arrayOfByte = new byte[i];
      for (int j = 0; i > 0; j += 64)
      {
        Object localObject = zzc;
        int[] arrayOfInt = zzb;
        int k = localObject.length;
        System.arraycopy(localObject, 0, arrayOfInt, 0, 16);
        zzb[12] = zzg;
        for (k = 0; k < 10; k++)
        {
          zzb(0, 4, 8, 12);
          zzb(1, 5, 9, 13);
          zzb(2, 6, 10, 14);
          zzb(3, 7, 11, 15);
          zzb(0, 5, 10, 15);
          zzb(1, 6, 11, 12);
          zzb(2, 7, 8, 13);
          zzb(3, 4, 9, 14);
        }
        localObject = new byte[64];
        int n;
        for (k = 0; k < 16; k++)
        {
          int m = zzb[k];
          n = k * 4;
          localObject[n] = ((byte)(byte)(m & 0xFF));
          localObject[(n + 1)] = ((byte)(byte)(m >> 8 & 0xFF));
          localObject[(n + 2)] = ((byte)(byte)(m >> 16 & 0xFF));
          localObject[(n + 3)] = ((byte)(byte)(m >> 24 & 0xFF));
        }
        for (k = 0; k < Math.min(64, i); k++)
        {
          n = j + k;
          arrayOfByte[n] = ((byte)(byte)zza(localObject[k], paramArrayOfByte[n]));
        }
        zzg += 1;
        i -= 64;
      }
      return arrayOfByte;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */