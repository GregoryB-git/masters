package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzqb
{
  private static final ThreadLocal zza;
  
  static
  {
    Object localObject = zzpj.zzi();
    ((zzph)localObject).zzf(-62135596800L);
    ((zzph)localObject).zze(0);
    localObject = (zzpj)((zzmx)localObject).zzi();
    localObject = zzpj.zzi();
    ((zzph)localObject).zzf(253402300799L);
    ((zzph)localObject).zze(999999999);
    localObject = (zzpj)((zzmx)localObject).zzi();
    localObject = zzpj.zzi();
    ((zzph)localObject).zzf(0L);
    ((zzph)localObject).zze(0);
    localObject = (zzpj)((zzmx)localObject).zzi();
    zza = new zzqa();
    zzd("now");
    zzd("getEpochSecond");
    zzd("getNano");
  }
  
  public static zzpj zza(zzpj paramzzpj)
  {
    long l = paramzzpj.zzg();
    boolean bool = zze(l);
    int i = paramzzpj.zzf();
    if ((bool) && (i >= 0) && (i < 1000000000)) {
      return paramzzpj;
    }
    throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[] { Long.valueOf(l), Integer.valueOf(i) }));
  }
  
  public static zzpj zzb(long paramLong)
  {
    long l = paramLong / 1000L;
    if (zze(l))
    {
      int i = (int)(paramLong % 1000L * 1000000L);
      int j;
      if (i > -1000000000)
      {
        paramLong = l;
        j = i;
        if (i < 1000000000) {}
      }
      else
      {
        paramLong = zzkk.zza(l, i / 1000000000);
        j = i % 1000000000;
      }
      l = paramLong;
      i = j;
      if (j < 0)
      {
        i = j + 1000000000;
        l = zzkk.zzb(paramLong, 1L);
      }
      Object localObject = zzpj.zzi();
      ((zzph)localObject).zzf(l);
      ((zzph)localObject).zze(i);
      localObject = (zzpj)((zzmx)localObject).zzi();
      zza((zzpj)localObject);
      return (zzpj)localObject;
    }
    throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[] { Long.valueOf(l) }));
  }
  
  public static String zzc(zzpj paramzzpj)
  {
    zza(paramzzpj);
    long l = paramzzpj.zzg();
    int i = paramzzpj.zzf();
    StringBuilder localStringBuilder = new StringBuilder();
    paramzzpj = new Date(l * 1000L);
    localStringBuilder.append(((SimpleDateFormat)zza.get()).format(paramzzpj));
    if (i != 0)
    {
      localStringBuilder.append(".");
      if (i % 1000000 == 0) {
        paramzzpj = String.format(Locale.ENGLISH, "%1$03d", new Object[] { Integer.valueOf(i / 1000000) });
      } else if (i % 1000 == 0) {
        paramzzpj = String.format(Locale.ENGLISH, "%1$06d", new Object[] { Integer.valueOf(i / 1000) });
      } else {
        paramzzpj = String.format(Locale.ENGLISH, "%1$09d", new Object[] { Integer.valueOf(i) });
      }
      localStringBuilder.append(paramzzpj);
    }
    localStringBuilder.append("Z");
    return localStringBuilder.toString();
  }
  
  private static Method zzd(String paramString)
  {
    try
    {
      paramString = Class.forName("java.time.Instant").getMethod(paramString, new Class[0]);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  private static boolean zze(long paramLong)
  {
    return (paramLong >= -62135596800L) && (paramLong <= 253402300799L);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */