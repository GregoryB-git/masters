package com.google.android.gms.internal.measurement;

public final class zzgc$zzc
  extends zzkg<zzc, zza>
  implements zzlo
{
  private static final zzc zzc;
  private static volatile zzlz<zzc> zzd;
  private int zze;
  private String zzf = "";
  private boolean zzg;
  private boolean zzh;
  private int zzi;
  
  static
  {
    zzc localzzc = new zzc();
    zzc = localzzc;
    zzkg.zza(zzc.class, localzzc);
  }
  
  public final int zza()
  {
    return zzi;
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
      return zzkg.zza(zzc, "\004\004\000\001\001\004\004\000\000\000\001ဈ\000\002ဇ\001\003ဇ\002\004င\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      return new zza(null);
    }
    return new zzc();
  }
  
  public final String zzc()
  {
    return zzf;
  }
  
  public final boolean zzd()
  {
    return zzg;
  }
  
  public final boolean zze()
  {
    return zzh;
  }
  
  public final boolean zzf()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzg()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x8) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zzc, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzgc.zzc)zza).zza();
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzgc.zzc.zza((zzgc.zzc)zza, paramString);
      return this;
    }
    
    public final String zzb()
    {
      return ((zzgc.zzc)zza).zzc();
    }
    
    public final boolean zzc()
    {
      return ((zzgc.zzc)zza).zzd();
    }
    
    public final boolean zzd()
    {
      return ((zzgc.zzc)zza).zze();
    }
    
    public final boolean zze()
    {
      return ((zzgc.zzc)zza).zzf();
    }
    
    public final boolean zzf()
    {
      return ((zzgc.zzc)zza).zzg();
    }
    
    public final boolean zzg()
    {
      return ((zzgc.zzc)zza).zzh();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */