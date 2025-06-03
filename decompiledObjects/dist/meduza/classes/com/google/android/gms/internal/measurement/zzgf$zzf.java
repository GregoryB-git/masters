package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzgf$zzf
  extends zzkg<zzf, zza>
  implements zzlo
{
  private static final zzf zzc;
  private static volatile zzlz<zzf> zzd;
  private int zze;
  private zzkm<zzgf.zzh> zzf = zzkg.zzcl();
  private String zzg = "";
  private long zzh;
  private long zzi;
  private int zzj;
  
  static
  {
    zzf localzzf = new zzf();
    zzc = localzzf;
    zzkg.zza(zzf.class, localzzf);
  }
  
  public static zza zze()
  {
    return (zza)zzc.zzcg();
  }
  
  private final void zzl()
  {
    zzkm localzzkm = zzf;
    if (!localzzkm.zzc()) {
      zzf = zzkg.zza(localzzkm);
    }
  }
  
  public final int zza()
  {
    return zzj;
  }
  
  public final zzgf.zzh zza(int paramInt)
  {
    return (zzgf.zzh)zzf.get(paramInt);
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
      return zzkg.zza(zzc, "\004\005\000\001\001\005\005\000\001\000\001\033\002ဈ\000\003ဂ\001\004ဂ\002\005င\003", new Object[] { "zze", "zzf", zzgf.zzh.class, "zzg", "zzh", "zzi", "zzj" });
    case 2: 
      return new zza(null);
    }
    return new zzf();
  }
  
  public final int zzb()
  {
    return zzf.size();
  }
  
  public final long zzc()
  {
    return zzi;
  }
  
  public final long zzd()
  {
    return zzh;
  }
  
  public final String zzg()
  {
    return zzg;
  }
  
  public final List<zzgf.zzh> zzh()
  {
    return zzf;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzk()
  {
    return (zze & 0x2) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzf, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzgf.zzf)zza).zzb();
    }
    
    public final zza zza(int paramInt)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramInt);
      return this;
    }
    
    public final zza zza(int paramInt, zzgf.zzh.zza paramzza)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramInt, (zzgf.zzh)paramzza.zzaj());
      return this;
    }
    
    public final zza zza(int paramInt, zzgf.zzh paramzzh)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramInt, paramzzh);
      return this;
    }
    
    public final zza zza(long paramLong)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramLong);
      return this;
    }
    
    public final zza zza(zzgf.zzh.zza paramzza)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, (zzgf.zzh)paramzza.zzaj());
      return this;
    }
    
    public final zza zza(zzgf.zzh paramzzh)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramzzh);
      return this;
    }
    
    public final zza zza(Iterable<? extends zzgf.zzh> paramIterable)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramIterable);
      return this;
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza, paramString);
      return this;
    }
    
    public final long zzb()
    {
      return ((zzgf.zzf)zza).zzc();
    }
    
    public final zza zzb(long paramLong)
    {
      zzam();
      zzgf.zzf.zzb((zzgf.zzf)zza, paramLong);
      return this;
    }
    
    public final zzgf.zzh zzb(int paramInt)
    {
      return ((zzgf.zzf)zza).zza(paramInt);
    }
    
    public final long zzc()
    {
      return ((zzgf.zzf)zza).zzd();
    }
    
    public final zza zzd()
    {
      zzam();
      zzgf.zzf.zza((zzgf.zzf)zza);
      return this;
    }
    
    public final String zze()
    {
      return ((zzgf.zzf)zza).zzg();
    }
    
    public final List<zzgf.zzh> zzf()
    {
      return Collections.unmodifiableList(((zzgf.zzf)zza).zzh());
    }
    
    public final boolean zzg()
    {
      return ((zzgf.zzf)zza).zzk();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */