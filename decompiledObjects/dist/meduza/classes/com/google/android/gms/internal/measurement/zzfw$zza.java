package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfw$zza
  extends zzkg<zza, zza>
  implements zzlo
{
  private static final zza zzc;
  private static volatile zzlz<zza> zzd;
  private int zze;
  private int zzf;
  private zzkm<zzfw.zze> zzg = zzkg.zzcl();
  private zzkm<zzfw.zzb> zzh = zzkg.zzcl();
  private boolean zzi;
  private boolean zzj;
  
  static
  {
    zza localzza = new zza();
    zzc = localzza;
    zzkg.zza(zza.class, localzza);
  }
  
  public final int zza()
  {
    return zzf;
  }
  
  public final zzfw.zzb zza(int paramInt)
  {
    return (zzfw.zzb)zzh.get(paramInt);
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
      return zzkg.zza(zzc, "\004\005\000\001\001\005\005\000\002\000\001င\000\002\033\003\033\004ဇ\001\005ဇ\002", new Object[] { "zze", "zzf", "zzg", zzfw.zze.class, "zzh", zzfw.zzb.class, "zzi", "zzj" });
    case 2: 
      return new zza(null);
    }
    return new zza();
  }
  
  public final int zzb()
  {
    return zzh.size();
  }
  
  public final zzfw.zze zzb(int paramInt)
  {
    return (zzfw.zze)zzg.get(paramInt);
  }
  
  public final int zzc()
  {
    return zzg.size();
  }
  
  public final List<zzfw.zzb> zze()
  {
    return zzh;
  }
  
  public final List<zzfw.zze> zzf()
  {
    return zzg;
  }
  
  public final boolean zzg()
  {
    return (zze & 0x1) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzfw.zza, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzfw.zza)zza).zzb();
    }
    
    public final zza zza(int paramInt, zzfw.zzb.zza paramzza)
    {
      zzam();
      zzfw.zza.zza((zzfw.zza)zza, paramInt, (zzfw.zzb)paramzza.zzaj());
      return this;
    }
    
    public final zza zza(int paramInt, zzfw.zze.zza paramzza)
    {
      zzam();
      zzfw.zza.zza((zzfw.zza)zza, paramInt, (zzfw.zze)paramzza.zzaj());
      return this;
    }
    
    public final zzfw.zzb zza(int paramInt)
    {
      return ((zzfw.zza)zza).zza(paramInt);
    }
    
    public final int zzb()
    {
      return ((zzfw.zza)zza).zzc();
    }
    
    public final zzfw.zze zzb(int paramInt)
    {
      return ((zzfw.zza)zza).zzb(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */