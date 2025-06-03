package com.google.android.recaptcha.internal;

public final class zzpz
{
  static
  {
    Object localObject = zzml.zzi();
    ((zzmj)localObject).zzf(-315576000000L);
    ((zzmj)localObject).zze(-999999999);
    localObject = (zzml)((zzmx)localObject).zzi();
    localObject = zzml.zzi();
    ((zzmj)localObject).zzf(315576000000L);
    ((zzmj)localObject).zze(999999999);
    localObject = (zzml)((zzmx)localObject).zzi();
    localObject = zzml.zzi();
    ((zzmj)localObject).zzf(0L);
    ((zzmj)localObject).zze(0);
    localObject = (zzml)((zzmx)localObject).zzi();
  }
  
  public static zzml zza(long paramLong)
  {
    int i = (int)(paramLong % 1000000000L);
    long l = paramLong / 1000000000L;
    if (i > -1000000000)
    {
      j = i;
      paramLong = l;
      if (i < 1000000000) {}
    }
    else
    {
      paramLong = zzkk.zza(l, i / 1000000000);
      j = i % 1000000000;
    }
    i = j;
    l = paramLong;
    if (paramLong > 0L)
    {
      i = j;
      l = paramLong;
      if (j < 0)
      {
        i = j + 1000000000;
        l = paramLong - 1L;
      }
    }
    int j = i;
    paramLong = l;
    if (l < 0L)
    {
      j = i;
      paramLong = l;
      if (i > 0)
      {
        j = i - 1000000000;
        paramLong = l + 1L;
      }
    }
    Object localObject = zzml.zzi();
    ((zzmj)localObject).zzf(paramLong);
    ((zzmj)localObject).zze(j);
    localObject = (zzml)((zzmx)localObject).zzi();
    paramLong = ((zzml)localObject).zzg();
    i = ((zzml)localObject).zzf();
    if ((paramLong >= -315576000000L) && (paramLong <= 315576000000L) && (i >= -999999999L) && (i < 1000000000))
    {
      boolean bool = paramLong < 0L;
      if (((!bool) && (i >= 0)) || ((!bool) && (i <= 0))) {
        return (zzml)localObject;
      }
    }
    throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */