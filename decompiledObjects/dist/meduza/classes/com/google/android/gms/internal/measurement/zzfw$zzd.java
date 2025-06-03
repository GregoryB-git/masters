package com.google.android.gms.internal.measurement;

public final class zzfw$zzd
  extends zzkg<zzd, zzb>
  implements zzlo
{
  private static final zzd zzc;
  private static volatile zzlz<zzd> zzd;
  private int zze;
  private int zzf;
  private boolean zzg;
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  
  static
  {
    zzd localzzd = new zzd();
    zzc = localzzd;
    zzkg.zza(zzd.class, localzzd);
  }
  
  public static zzd zzc()
  {
    return zzc;
  }
  
  public final zza zza()
  {
    zza localzza1 = zza.zza(zzf);
    zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zza.zza;
    }
    return localzza2;
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
      paramObject1 = zza.zzb();
      return zzkg.zza(zzc, "\004\005\000\001\001\005\005\000\000\000\001᠌\000\002ဇ\001\003ဈ\002\004ဈ\003\005ဈ\004", new Object[] { "zze", "zzf", paramObject1, "zzg", "zzh", "zzi", "zzj" });
    case 2: 
      return new zzb(null);
    }
    return new zzd();
  }
  
  public final String zzd()
  {
    return zzh;
  }
  
  public final String zze()
  {
    return zzj;
  }
  
  public final String zzf()
  {
    return zzi;
  }
  
  public final boolean zzg()
  {
    return zzg;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzk()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean zzl()
  {
    return (zze & 0x8) != 0;
  }
  
  public static enum zza
    implements zzki
  {
    private final int zzg;
    
    static
    {
      zza localzza1 = new zza("UNKNOWN_COMPARISON_TYPE", 0, 0);
      zza = localzza1;
      zza localzza2 = new zza("LESS_THAN", 1, 1);
      zzb = localzza2;
      zza localzza3 = new zza("GREATER_THAN", 2, 2);
      zzc = localzza3;
      zza localzza4 = new zza("EQUAL", 3, 3);
      zzd = localzza4;
      zza localzza5 = new zza("BETWEEN", 4, 4);
      zze = localzza5;
      zzf = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5 };
    }
    
    private zza(int paramInt)
    {
      zzg = paramInt;
    }
    
    public static zza zza(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return zze;
            }
            return zzd;
          }
          return zzc;
        }
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzfy.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zza.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzg);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzg;
    }
  }
  
  public static final class zzb
    extends zzkg.zza<zzfw.zzd, zzb>
    implements zzlo
  {
    private zzb()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */