package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgf$zzh
  extends zzkg<zzh, zza>
  implements zzlo
{
  private static final zzh zzc;
  private static volatile zzlz<zzh> zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private long zzh;
  private float zzi;
  private double zzj;
  private zzkm<zzh> zzk = zzkg.zzcl();
  
  static
  {
    zzh localzzh = new zzh();
    zzc = localzzh;
    zzkg.zza(zzh.class, localzzh);
  }
  
  public static zza zze()
  {
    return (zza)zzc.zzcg();
  }
  
  private final void zzo()
  {
    zzkm localzzkm = zzk;
    if (!localzzkm.zzc()) {
      zzk = zzkg.zza(localzzkm);
    }
  }
  
  public final double zza()
  {
    return zzj;
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
      return zzkg.zza(zzc, "\004\006\000\001\001\006\006\000\001\000\001ဈ\000\002ဈ\001\003ဂ\002\004ခ\003\005က\004\006\033", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzh.class });
    case 2: 
      return new zza(null);
    }
    return new zzh();
  }
  
  public final float zzb()
  {
    return zzi;
  }
  
  public final int zzc()
  {
    return zzk.size();
  }
  
  public final long zzd()
  {
    return zzh;
  }
  
  public final String zzg()
  {
    return zzf;
  }
  
  public final String zzh()
  {
    return zzg;
  }
  
  public final List<zzh> zzi()
  {
    return zzk;
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
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzm()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzn()
  {
    return (zze & 0x2) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzh, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzgf.zzh)zza).zzc();
    }
    
    public final zza zza(double paramDouble)
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza, paramDouble);
      return this;
    }
    
    public final zza zza(long paramLong)
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza, paramLong);
      return this;
    }
    
    public final zza zza(zza paramzza)
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza, (zzgf.zzh)paramzza.zzaj());
      return this;
    }
    
    public final zza zza(Iterable<? extends zzgf.zzh> paramIterable)
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza, paramIterable);
      return this;
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza, paramString);
      return this;
    }
    
    public final zza zzb()
    {
      zzam();
      zzgf.zzh.zza((zzgf.zzh)zza);
      return this;
    }
    
    public final zza zzb(String paramString)
    {
      zzam();
      zzgf.zzh.zzb((zzgf.zzh)zza, paramString);
      return this;
    }
    
    public final zza zzc()
    {
      zzam();
      zzgf.zzh.zzb((zzgf.zzh)zza);
      return this;
    }
    
    public final zza zzd()
    {
      zzam();
      zzgf.zzh.zzc((zzgf.zzh)zza);
      return this;
    }
    
    public final zza zze()
    {
      zzam();
      zzgf.zzh.zzd((zzgf.zzh)zza);
      return this;
    }
    
    public final String zzf()
    {
      return ((zzgf.zzh)zza).zzg();
    }
    
    public final String zzg()
    {
      return ((zzgf.zzh)zza).zzh();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */