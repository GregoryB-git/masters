package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzgc$zzd
  extends zzkg<zzd, zza>
  implements zzlo
{
  private static final zzd zzc;
  private static volatile zzlz<zzd> zzd;
  private int zze;
  private long zzf;
  private String zzg = "";
  private int zzh;
  private zzkm<zzgc.zzh> zzi = zzkg.zzcl();
  private zzkm<zzgc.zzc> zzj = zzkg.zzcl();
  private zzkm<zzfw.zza> zzk = zzkg.zzcl();
  private String zzl = "";
  private boolean zzm;
  private zzkm<zzgr.zzc> zzn = zzkg.zzcl();
  private zzkm<zzgc.zzb> zzo = zzkg.zzcl();
  private String zzp = "";
  private String zzq = "";
  private zzgc.zza zzr;
  private zzgc.zzf zzs;
  private zzgc.zzi zzt;
  private zzgc.zzg zzu;
  private zzgc.zze zzv;
  
  static
  {
    zzd localzzd = new zzd();
    zzc = localzzd;
    zzkg.zza(zzd.class, localzzd);
  }
  
  public static zza zze()
  {
    return (zza)zzc.zzcg();
  }
  
  public static zzd zzg()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzn.size();
  }
  
  public final zzgc.zzc zza(int paramInt)
  {
    return (zzgc.zzc)zzj.get(paramInt);
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
      return zzkg.zza(zzc, "\004\021\000\001\001\023\021\000\005\000\001ဂ\000\002ဈ\001\003င\002\004\033\005\033\006\033\007ဈ\003\bဇ\004\t\033\n\033\013ဈ\005\016ဈ\006\017ဉ\007\020ဉ\b\021ဉ\t\022ဉ\n\023ဉ\013", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", zzgc.zzh.class, "zzj", zzgc.zzc.class, "zzk", zzfw.zza.class, "zzl", "zzm", "zzn", zzgr.zzc.class, "zzo", zzgc.zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv" });
    case 2: 
      return new zza(null);
    }
    return new zzd();
  }
  
  public final int zzb()
  {
    return zzj.size();
  }
  
  public final long zzc()
  {
    return zzf;
  }
  
  public final zzgc.zza zzd()
  {
    zzgc.zza localzza1 = zzr;
    zzgc.zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zzgc.zza.zzb();
    }
    return localzza2;
  }
  
  public final zzgc.zzi zzh()
  {
    zzgc.zzi localzzi1 = zzt;
    zzgc.zzi localzzi2 = localzzi1;
    if (localzzi1 == null) {
      localzzi2 = zzgc.zzi.zzc();
    }
    return localzzi2;
  }
  
  public final String zzi()
  {
    return zzg;
  }
  
  public final String zzj()
  {
    return zzp;
  }
  
  public final List<zzfw.zza> zzk()
  {
    return zzk;
  }
  
  public final List<zzgc.zzb> zzl()
  {
    return zzo;
  }
  
  public final List<zzgr.zzc> zzm()
  {
    return zzn;
  }
  
  public final List<zzgc.zzh> zzn()
  {
    return zzi;
  }
  
  public final boolean zzo()
  {
    return (zze & 0x80) != 0;
  }
  
  public final boolean zzp()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzq()
  {
    return (zze & 0x200) != 0;
  }
  
  public final boolean zzr()
  {
    return (zze & 0x1) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgc.zzd, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzgc.zzd)zza).zzb();
    }
    
    public final zzgc.zzc zza(int paramInt)
    {
      return ((zzgc.zzd)zza).zza(paramInt);
    }
    
    public final zza zza(int paramInt, zzgc.zzc.zza paramzza)
    {
      zzam();
      zzgc.zzd.zza((zzgc.zzd)zza, paramInt, (zzgc.zzc)paramzza.zzaj());
      return this;
    }
    
    public final zza zzb()
    {
      zzam();
      zzgc.zzd.zza((zzgc.zzd)zza);
      return this;
    }
    
    public final String zzc()
    {
      return ((zzgc.zzd)zza).zzj();
    }
    
    public final List<zzfw.zza> zzd()
    {
      return Collections.unmodifiableList(((zzgc.zzd)zza).zzk());
    }
    
    public final List<zzgc.zzb> zze()
    {
      return Collections.unmodifiableList(((zzgc.zzd)zza).zzl());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */