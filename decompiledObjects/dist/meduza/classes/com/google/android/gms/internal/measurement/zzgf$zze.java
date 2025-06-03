package com.google.android.gms.internal.measurement;

public final class zzgf$zze
  extends zzkg<zze, zza>
  implements zzlo
{
  private static final zze zzc;
  private static volatile zzlz<zze> zzd;
  private int zze;
  private int zzf;
  private long zzg;
  
  static
  {
    zze localzze = new zze();
    zzc = localzze;
    zzkg.zza(zze.class, localzze);
  }
  
  public static zza zzc()
  {
    return (zza)zzc.zzcg();
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgi.zza[(paramInt - 1)])
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
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\000\000\001င\000\002ဂ\001", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      return new zza(null);
    }
    return new zze();
  }
  
  public final long zzb()
  {
    return zzg;
  }
  
  public final boolean zze()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzf()
  {
    return (zze & 0x1) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zze, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza(int paramInt)
    {
      zzam();
      zzgf.zze.zza((zzgf.zze)zza, paramInt);
      return this;
    }
    
    public final zza zza(long paramLong)
    {
      zzam();
      zzgf.zze.zza((zzgf.zze)zza, paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */