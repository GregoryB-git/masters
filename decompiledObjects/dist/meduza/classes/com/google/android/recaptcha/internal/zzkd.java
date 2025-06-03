package com.google.android.recaptcha.internal;

import f;
import java.math.RoundingMode;
import java.util.Arrays;

final class zzkd
{
  public final int zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  private final String zze;
  private final char[] zzf;
  private final byte[] zzg;
  private final boolean[] zzh;
  private final boolean zzi;
  
  public zzkd(String paramString, char[] paramArrayOfChar)
  {
    this(paramString, paramArrayOfChar, arrayOfByte, false);
  }
  
  private zzkd(String paramString, char[] paramArrayOfChar, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    zze = paramString;
    paramArrayOfChar.getClass();
    zzf = paramArrayOfChar;
    try
    {
      int i = paramArrayOfChar.length;
      int j = zzkj.zzb(i, RoundingMode.UNNECESSARY);
      zzb = j;
      int k = Integer.numberOfTrailingZeros(j);
      int m = 1 << 3 - k;
      zzc = m;
      zzd = (j >> k);
      zza = (i - 1);
      zzg = paramArrayOfByte;
      paramString = new boolean[m];
      for (k = 0; k < zzd; k++) {
        paramString[zzkj.zza(k * 8, zzb, RoundingMode.CEILING)] = 1;
      }
      zzh = paramString;
      zzi = false;
      return;
    }
    catch (ArithmeticException paramString)
    {
      throw new IllegalArgumentException(f.h("Illegal alphabet length ", paramArrayOfChar.length), paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzkd))
    {
      paramObject = (zzkd)paramObject;
      boolean bool = zzi;
      if (Arrays.equals(zzf, zzf)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(zzf) + 1237;
  }
  
  public final String toString()
  {
    return zze;
  }
  
  public final char zza(int paramInt)
  {
    return zzf[paramInt];
  }
  
  public final int zzb(char paramChar)
  {
    if (paramChar <= '')
    {
      int i = zzg[paramChar];
      if (i == -1)
      {
        if ((paramChar > ' ') && (paramChar != ''))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unrecognized character: ");
          localStringBuilder.append(paramChar);
          throw new zzkf(localStringBuilder.toString());
        }
        throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(paramChar))));
      }
      return i;
    }
    throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(paramChar))));
  }
  
  public final boolean zzc(int paramInt)
  {
    int i = zzc;
    return zzh[(paramInt % i)];
  }
  
  public final boolean zzd(char paramChar)
  {
    return zzg[61] != -1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */