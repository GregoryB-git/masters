package com.google.android.gms.internal.measurement;

public final class zzfw$zzc
  extends zzkg<zzc, zza>
  implements zzlo
{
  private static final zzc zzc;
  private static volatile zzlz<zzc> zzd;
  private int zze;
  private zzfw.zzf zzf;
  private zzfw.zzd zzg;
  private boolean zzh;
  private String zzi = "";
  
  static
  {
    zzc localzzc = new zzc();
    zzc = localzzc;
    zzkg.zza(zzc.class, localzzc);
  }
  
  public static zzc zzb()
  {
    return zzc;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzfx.zza[(paramInt - 1)])
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
      return zzkg.zza(zzc, "\004\004\000\001\001\004\004\000\000\000\001ဉ\000\002ဉ\001\003ဇ\002\004ဈ\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      return new zza(null);
    }
    return new zzc();
  }
  
  public final zzfw.zzd zzc()
  {
    zzfw.zzd localzzd1 = zzg;
    zzfw.zzd localzzd2 = localzzd1;
    if (localzzd1 == null) {
      localzzd2 = zzfw.zzd.zzc();
    }
    return localzzd2;
  }
  
  public final zzfw.zzf zzd()
  {
    zzfw.zzf localzzf1 = zzf;
    zzfw.zzf localzzf2 = localzzf1;
    if (localzzf1 == null) {
      localzzf2 = zzfw.zzf.zzd();
    }
    return localzzf2;
  }
  
  public final String zze()
  {
    return zzi;
  }
  
  public final boolean zzf()
  {
    return zzh;
  }
  
  public final boolean zzg()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x1) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzfw.zzc, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzfw.zzc.zza((zzfw.zzc)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */