package com.google.android.recaptcha.internal;

import g;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzjh
{
  private boolean zza;
  private long zzb;
  private long zzc;
  
  public static zzjh zzb()
  {
    zzjh localzzjh = new zzjh();
    localzzjh.zze();
    return localzzjh;
  }
  
  public static zzjh zzc()
  {
    return new zzjh();
  }
  
  private final long zzg()
  {
    long l;
    if (zza) {
      l = System.nanoTime() - zzc + zzb;
    } else {
      l = zzb;
    }
    return l;
  }
  
  public final String toString()
  {
    long l = zzg();
    Object localObject1 = TimeUnit.DAYS;
    Object localObject2 = TimeUnit.NANOSECONDS;
    if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
    {
      localObject1 = TimeUnit.HOURS;
      if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
      {
        localObject1 = TimeUnit.MINUTES;
        if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
        {
          localObject1 = TimeUnit.SECONDS;
          if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
          {
            localObject1 = TimeUnit.MILLISECONDS;
            if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
            {
              localObject1 = TimeUnit.MICROSECONDS;
              if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L) {
                localObject1 = localObject2;
              }
            }
          }
        }
      }
    }
    double d1 = l;
    double d2 = ((TimeUnit)localObject2).convert(1L, (TimeUnit)localObject1);
    localObject2 = String.format(Locale.ROOT, "%.4g", new Object[] { Double.valueOf(d1 / d2) });
    switch (zzjg.zza[localObject1.ordinal()])
    {
    default: 
      throw new AssertionError();
    case 7: 
      localObject1 = "d";
      break;
    case 6: 
      localObject1 = "h";
      break;
    case 5: 
      localObject1 = "min";
      break;
    case 4: 
      localObject1 = "s";
      break;
    case 3: 
      localObject1 = "ms";
      break;
    case 2: 
      localObject1 = "μs";
      break;
    case 1: 
      localObject1 = "ns";
    }
    return g.e((String)localObject2, " ", (String)localObject1);
  }
  
  public final long zza(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
  }
  
  public final zzjh zzd()
  {
    zzb = 0L;
    zza = false;
    return this;
  }
  
  public final zzjh zze()
  {
    zzjf.zze(zza ^ true, "This stopwatch is already running.");
    zza = true;
    zzc = System.nanoTime();
    return this;
  }
  
  public final zzjh zzf()
  {
    long l1 = System.nanoTime();
    zzjf.zze(zza, "This stopwatch is already stopped.");
    zza = false;
    long l2 = zzb;
    zzb = (l1 - zzc + l2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */