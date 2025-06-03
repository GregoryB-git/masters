package com.google.android.gms.internal.measurement;

public final class zzgf$zzp
  extends zzkg<zzp, zza>
  implements zzlo
{
  private static final zzp zzc;
  private static volatile zzlz<zzp> zzd;
  private int zze;
  private long zzf;
  private String zzg = "";
  private String zzh = "";
  private long zzi;
  private float zzj;
  private double zzk;
  
  static
  {
    zzp localzzp = new zzp();
    zzc = localzzp;
    zzkg.zza(zzp.class, localzzp);
  }
  
  public static zza zze()
  {
    return (zza)zzc.zzcg();
  }
  
  public final double zza()
  {
    return zzk;
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
      return zzkg.zza(zzc, "\004\006\000\001\001\006\006\000\000\000\001ဂ\000\002ဈ\001\003ဈ\002\004ဂ\003\005ခ\004\006က\005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      return new zza(null);
    }
    return new zzp();
  }
  
  public final float zzb()
  {
    return zzj;
  }
  
  public final long zzc()
  {
    return zzi;
  }
  
  public final long zzd()
  {
    return zzf;
  }
  
  public final String zzg()
  {
    return zzg;
  }
  
  public final String zzh()
  {
    return zzh;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x20) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean zzk()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean zzl()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzm()
  {
    return (zze & 0x4) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzp, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza()
    {
      zzam();
      zzgf.zzp.zza((zzgf.zzp)zza);
      return this;
    }
    
    public final zza zza(double paramDouble)
    {
      zzam();
      zzgf.zzp.zza((zzgf.zzp)zza, paramDouble);
      return this;
    }
    
    public final zza zza(long paramLong)
    {
      zzam();
      zzgf.zzp.zza((zzgf.zzp)zza, paramLong);
      return this;
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzgf.zzp.zza((zzgf.zzp)zza, paramString);
      return this;
    }
    
    public final zza zzb()
    {
      zzam();
      zzgf.zzp.zzb((zzgf.zzp)zza);
      return this;
    }
    
    public final zza zzb(long paramLong)
    {
      zzam();
      zzgf.zzp.zzb((zzgf.zzp)zza, paramLong);
      return this;
    }
    
    public final zza zzb(String paramString)
    {
      zzam();
      zzgf.zzp.zzb((zzgf.zzp)zza, paramString);
      return this;
    }
    
    public final zza zzc()
    {
      zzam();
      zzgf.zzp.zzc((zzgf.zzp)zza);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */