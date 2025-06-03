package com.google.android.recaptcha.internal;

import java.math.BigInteger;

public final class zzhv
{
  private static final zzhu zza = new zzhu(11L, Math.pow(2.0D, 32.0D) ^ 0x4DEECE66D, Math.pow(2.0D, 48.0D));
  private final zzhu zzb;
  private long zzc;
  
  public zzhv(long paramLong1, long paramLong2, zzhu paramzzhu)
  {
    zzb = paramzzhu;
    zzc = Math.abs(paramLong1);
  }
  
  public final long zza()
  {
    zzhu localzzhu = zzb;
    long l1 = localzzhu.zzb();
    long l2 = zzc;
    long l3 = localzzhu.zza();
    l2 = (BigInteger.valueOf(l1).multiply(BigInteger.valueOf(l2)).mod(BigInteger.valueOf(l3)).longValue() + 11L) % zzb.zza();
    zzc = l2;
    return l2 % 255L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */