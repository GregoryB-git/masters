package com.google.android.gms.internal.measurement;

public final class zzgc$zza$zzc
  extends zzkg<zzc, zza>
  implements zzlo
{
  private static final zzc zzc;
  private static volatile zzlz<zzc> zzd;
  private int zze;
  private int zzf;
  private int zzg;
  
  static
  {
    zzc localzzc = new zzc();
    zzc = localzzc;
    zzkg.zza(zzc.class, localzzc);
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgb.zza[(paramInt - 1)])
    {
    default: 
      throw null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzd;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzd;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/measurement/zzkg$zzc;
            ((zzkg.zzc)paramObject1).<init>(zzc);
            zzd = (zzlz)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      paramObject1 = zzgc.zza.zze.zzb();
      paramObject2 = zzgc.zza.zze.zzb();
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\000\000\001᠌\000\002᠌\001", new Object[] { "zze", "zzf", paramObject1, "zzg", paramObject2 });
    case 2: 
      return new zza(null);
    }
    return new zzc();
  }
  
  public final zzgc.zza.zze zzb()
  {
    zzgc.zza.zze localzze1 = zzgc.zza.zze.zza(zzg);
    zzgc.zza.zze localzze2 = localzze1;
    if (localzze1 == null) {
      localzze2 = zzgc.zza.zze.zza;
    }
    return localzze2;
  }
  
  public final zzgc.zza.zze zzc()
  {
    zzgc.zza.zze localzze1 = zzgc.zza.zze.zza(zzf);
    zzgc.zza.zze localzze2 = localzze1;
    if (localzze1 == null) {
      localzze2 = zzgc.zza.zze.zza;
    }
    return localzze2;
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zza.zzc, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zza.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */