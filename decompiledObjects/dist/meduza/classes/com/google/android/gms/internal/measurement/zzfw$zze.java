package com.google.android.gms.internal.measurement;

public final class zzfw$zze
  extends zzkg<zze, zza>
  implements zzlo
{
  private static final zze zzc;
  private static volatile zzlz<zze> zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private zzfw.zzc zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  
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
      return zzkg.zza(zzc, "\004\006\000\001\001\006\006\000\000\000\001င\000\002ဈ\001\003ဉ\002\004ဇ\003\005ဇ\004\006ဇ\005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      return new zza(null);
    }
    return new zze();
  }
  
  public final zzfw.zzc zzb()
  {
    zzfw.zzc localzzc1 = zzh;
    zzfw.zzc localzzc2 = localzzc1;
    if (localzzc1 == null) {
      localzzc2 = zzfw.zzc.zzb();
    }
    return localzzc2;
  }
  
  public final String zze()
  {
    return zzg;
  }
  
  public final boolean zzf()
  {
    return zzi;
  }
  
  public final boolean zzg()
  {
    return zzj;
  }
  
  public final boolean zzh()
  {
    return zzk;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x20) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzfw.zze, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzfw.zze.zza((zzfw.zze)zza, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */