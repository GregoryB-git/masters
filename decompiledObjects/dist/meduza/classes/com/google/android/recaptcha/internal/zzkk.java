package com.google.android.recaptcha.internal;

public final class zzkk
{
  public static long zza(long paramLong1, long paramLong2)
  {
    int i = 1;
    int j;
    if ((paramLong1 ^ paramLong2) < 0L) {
      j = 1;
    } else {
      j = 0;
    }
    long l = paramLong1 + paramLong2;
    if ((paramLong1 ^ l) < 0L) {
      i = 0;
    }
    zzkl.zza(j | i, "checkedAdd", paramLong1, paramLong2);
    return l;
  }
  
  public static long zzb(long paramLong1, long paramLong2)
  {
    int i = 1;
    int j;
    if ((1L ^ paramLong1) >= 0L) {
      j = 1;
    } else {
      j = 0;
    }
    paramLong2 = -1L + paramLong1;
    if ((paramLong1 ^ paramLong2) < 0L) {
      i = 0;
    }
    zzkl.zza(j | i, "checkedSubtract", paramLong1, 1L);
    return paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */