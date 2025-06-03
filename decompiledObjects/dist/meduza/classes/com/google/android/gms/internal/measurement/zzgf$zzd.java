package com.google.android.gms.internal.measurement;

public final class zzgf$zzd
  extends zzkg<zzd, zza>
  implements zzlo
{
  private static final zzd zzc;
  private static volatile zzlz<zzd> zzd;
  private int zze;
  private int zzf;
  private zzgf.zzm zzg;
  private zzgf.zzm zzh;
  private boolean zzi;
  
  static
  {
    zzd localzzd = new zzd();
    zzc = localzzd;
    zzkg.zza(zzd.class, localzzd);
  }
  
  public static zza zzb()
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
      return zzkg.zza(zzc, "\004\004\000\001\001\004\004\000\000\000\001င\000\002ဉ\001\003ဉ\002\004ဇ\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      return new zza(null);
    }
    return new zzd();
  }
  
  public final zzgf.zzm zzd()
  {
    zzgf.zzm localzzm1 = zzg;
    zzgf.zzm localzzm2 = localzzm1;
    if (localzzm1 == null) {
      localzzm2 = zzgf.zzm.zzg();
    }
    return localzzm2;
  }
  
  public final zzgf.zzm zze()
  {
    zzgf.zzm localzzm1 = zzh;
    zzgf.zzm localzzm2 = localzzm1;
    if (localzzm1 == null) {
      localzzm2 = zzgf.zzm.zzg();
    }
    return localzzm2;
  }
  
  public final boolean zzf()
  {
    return zzi;
  }
  
  public final boolean zzg()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x4) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzd, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza(int paramInt)
    {
      zzam();
      zzgf.zzd.zza((zzgf.zzd)zza, paramInt);
      return this;
    }
    
    public final zza zza(zzgf.zzm.zza paramzza)
    {
      zzam();
      zzgf.zzd.zza((zzgf.zzd)zza, (zzgf.zzm)paramzza.zzaj());
      return this;
    }
    
    public final zza zza(zzgf.zzm paramzzm)
    {
      zzam();
      zzgf.zzd.zzb((zzgf.zzd)zza, paramzzm);
      return this;
    }
    
    public final zza zza(boolean paramBoolean)
    {
      zzam();
      zzgf.zzd.zza((zzgf.zzd)zza, paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */