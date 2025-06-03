package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfw$zzb
  extends zzkg<zzb, zza>
  implements zzlo
{
  private static final zzb zzc;
  private static volatile zzlz<zzb> zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private zzkm<zzfw.zzc> zzh = zzkg.zzcl();
  private boolean zzi;
  private zzfw.zzd zzj;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  
  static
  {
    zzb localzzb = new zzb();
    zzc = localzzb;
    zzkg.zza(zzb.class, localzzb);
  }
  
  public static zza zzc()
  {
    return (zza)zzc.zzcg();
  }
  
  public final int zza()
  {
    return zzh.size();
  }
  
  public final zzfw.zzc zza(int paramInt)
  {
    return (zzfw.zzc)zzh.get(paramInt);
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
      return zzkg.zza(zzc, "\004\b\000\001\001\b\b\000\001\000\001င\000\002ဈ\001\003\033\004ဇ\002\005ဉ\003\006ဇ\004\007ဇ\005\bဇ\006", new Object[] { "zze", "zzf", "zzg", "zzh", zzfw.zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
    case 2: 
      return new zza(null);
    }
    return new zzb();
  }
  
  public final int zzb()
  {
    return zzf;
  }
  
  public final zzfw.zzd zze()
  {
    zzfw.zzd localzzd1 = zzj;
    zzfw.zzd localzzd2 = localzzd1;
    if (localzzd1 == null) {
      localzzd2 = zzfw.zzd.zzc();
    }
    return localzzd2;
  }
  
  public final String zzf()
  {
    return zzg;
  }
  
  public final List<zzfw.zzc> zzg()
  {
    return zzh;
  }
  
  public final boolean zzh()
  {
    return zzk;
  }
  
  public final boolean zzi()
  {
    return zzl;
  }
  
  public final boolean zzj()
  {
    return zzm;
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
    return (zze & 0x40) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzfw.zzb, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzfw.zzb)zza).zza();
    }
    
    public final zza zza(int paramInt, zzfw.zzc paramzzc)
    {
      zzam();
      zzfw.zzb.zza((zzfw.zzb)zza, paramInt, paramzzc);
      return this;
    }
    
    public final zza zza(String paramString)
    {
      zzam();
      zzfw.zzb.zza((zzfw.zzb)zza, paramString);
      return this;
    }
    
    public final zzfw.zzc zza(int paramInt)
    {
      return ((zzfw.zzb)zza).zza(paramInt);
    }
    
    public final String zzb()
    {
      return ((zzfw.zzb)zza).zzf();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */