package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzgf$zzj
  extends zzkg<zzj, zzb>
  implements zzlo
{
  private static final zzj zzc;
  private static volatile zzlz<zzj> zzd;
  private int zze;
  private zzkm<zzgf.zzk> zzf = zzkg.zzcl();
  private String zzg = "";
  private String zzh = "";
  private int zzi;
  
  static
  {
    zzj localzzj = new zzj();
    zzc = localzzj;
    zzkg.zza(zzj.class, localzzj);
  }
  
  public static zzb zza(zzj paramzzj)
  {
    return (zzb)zzc.zza(paramzzj);
  }
  
  public static zzb zzb()
  {
    return (zzb)zzc.zzcg();
  }
  
  private final void zzi()
  {
    zzkm localzzkm = zzf;
    if (!localzzkm.zzc()) {
      zzf = zzkg.zza(localzzkm);
    }
  }
  
  public final int zza()
  {
    return zzf.size();
  }
  
  public final zzgf.zzk zza(int paramInt)
  {
    return (zzgf.zzk)zzf.get(paramInt);
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
      paramObject1 = zza.zzb();
      return zzkg.zza(zzc, "\004\004\000\001\001\t\004\000\001\000\001\033\007ဈ\000\bဈ\001\t᠌\002", new Object[] { "zze", "zzf", zzgf.zzk.class, "zzg", "zzh", "zzi", paramObject1 });
    case 2: 
      return new zzb(null);
    }
    return new zzj();
  }
  
  public final String zzd()
  {
    return zzg;
  }
  
  public final String zze()
  {
    return zzh;
  }
  
  public final List<zzgf.zzk> zzf()
  {
    return zzf;
  }
  
  public final boolean zzg()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x2) != 0;
  }
  
  public static enum zza
    implements zzki
  {
    private final int zzd;
    
    static
    {
      zza localzza1 = new zza("SDK", 0, 0);
      zza = localzza1;
      zza localzza2 = new zza("SGTM", 1, 1);
      zzb = localzza2;
      zzc = new zza[] { localzza1, localzza2 };
    }
    
    private zza(int paramInt)
    {
      zzd = paramInt;
    }
    
    public static zza zza(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1) {
          return null;
        }
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzgk.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zza.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzd);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzd;
    }
  }
  
  public static final class zzb
    extends zzkg.zza<zzgf.zzj, zzb>
    implements zzlo
  {
    private zzb()
    {
      super();
    }
    
    public final int zza()
    {
      return ((zzgf.zzj)zza).zza();
    }
    
    public final zzb zza(int paramInt, zzgf.zzk.zza paramzza)
    {
      zzam();
      zzgf.zzj.zza((zzgf.zzj)zza, paramInt, (zzgf.zzk)paramzza.zzaj());
      return this;
    }
    
    public final zzb zza(zzgf.zzk.zza paramzza)
    {
      zzam();
      zzgf.zzj.zza((zzgf.zzj)zza, (zzgf.zzk)paramzza.zzaj());
      return this;
    }
    
    public final zzb zza(Iterable<? extends zzgf.zzk> paramIterable)
    {
      zzam();
      zzgf.zzj.zza((zzgf.zzj)zza, paramIterable);
      return this;
    }
    
    public final zzb zza(String paramString)
    {
      zzam();
      zzgf.zzj.zza((zzgf.zzj)zza, paramString);
      return this;
    }
    
    public final zzgf.zzk zza(int paramInt)
    {
      return ((zzgf.zzj)zza).zza(paramInt);
    }
    
    public final zzb zzb()
    {
      zzam();
      zzgf.zzj.zzb((zzgf.zzj)zza);
      return this;
    }
    
    public final zzb zzb(String paramString)
    {
      zzam();
      zzgf.zzj.zzb((zzgf.zzj)zza, paramString);
      return this;
    }
    
    public final String zzc()
    {
      return ((zzgf.zzj)zza).zzd();
    }
    
    public final List<zzgf.zzk> zzd()
    {
      return Collections.unmodifiableList(((zzgf.zzj)zza).zzf());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */