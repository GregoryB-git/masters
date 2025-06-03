package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgf$zzm
  extends zzkg<zzm, zza>
  implements zzlo
{
  private static final zzm zzc;
  private static volatile zzlz<zzm> zzd;
  private zzkn zze = zzkg.zzck();
  private zzkn zzf = zzkg.zzck();
  private zzkm<zzgf.zze> zzg = zzkg.zzcl();
  private zzkm<zzgf.zzn> zzh = zzkg.zzcl();
  
  static
  {
    zzm localzzm = new zzm();
    zzc = localzzm;
    zzkg.zza(zzm.class, localzzm);
  }
  
  public static zza zze()
  {
    return (zza)zzc.zzcg();
  }
  
  public static zzm zzg()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzg.size();
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
      return zzkg.zza(zzc, "\004\004\000\000\001\004\004\000\004\000\001\025\002\025\003\033\004\033", new Object[] { "zze", "zzf", "zzg", zzgf.zze.class, "zzh", zzgf.zzn.class });
    case 2: 
      return new zza(null);
    }
    return new zzm();
  }
  
  public final int zzb()
  {
    return zzf.size();
  }
  
  public final int zzc()
  {
    return zzh.size();
  }
  
  public final int zzd()
  {
    return zze.size();
  }
  
  public final List<zzgf.zze> zzh()
  {
    return zzg;
  }
  
  public final List<Long> zzi()
  {
    return zzf;
  }
  
  public final List<zzgf.zzn> zzj()
  {
    return zzh;
  }
  
  public final List<Long> zzk()
  {
    return zze;
  }
  
  public static final class zza
    extends zzkg.zza<zzgf.zzm, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final zza zza()
    {
      zzam();
      zzgf.zzm.zza((zzgf.zzm)zza);
      return this;
    }
    
    public final zza zza(Iterable<? extends zzgf.zze> paramIterable)
    {
      zzam();
      zzgf.zzm.zza((zzgf.zzm)zza, paramIterable);
      return this;
    }
    
    public final zza zzb()
    {
      zzam();
      zzgf.zzm.zzb((zzgf.zzm)zza);
      return this;
    }
    
    public final zza zzb(Iterable<? extends Long> paramIterable)
    {
      zzam();
      zzgf.zzm.zzb((zzgf.zzm)zza, paramIterable);
      return this;
    }
    
    public final zza zzc()
    {
      zzam();
      zzgf.zzm.zzc((zzgf.zzm)zza);
      return this;
    }
    
    public final zza zzc(Iterable<? extends zzgf.zzn> paramIterable)
    {
      zzam();
      zzgf.zzm.zzc((zzgf.zzm)zza, paramIterable);
      return this;
    }
    
    public final zza zzd()
    {
      zzam();
      zzgf.zzm.zzd((zzgf.zzm)zza);
      return this;
    }
    
    public final zza zzd(Iterable<? extends Long> paramIterable)
    {
      zzam();
      zzgf.zzm.zzd((zzgf.zzm)zza, paramIterable);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */