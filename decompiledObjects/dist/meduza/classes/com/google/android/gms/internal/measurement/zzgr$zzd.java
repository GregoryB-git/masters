package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgr$zzd
  extends zzkg<zzd, zza>
  implements zzlo
{
  private static final zzd zzc;
  private static volatile zzlz<zzd> zzd;
  private int zze;
  private int zzf;
  private zzkm<zzd> zzg = zzkg.zzcl();
  private String zzh = "";
  private String zzi = "";
  private boolean zzj;
  private double zzk;
  
  static
  {
    zzd localzzd = new zzd();
    zzc = localzzd;
    zzkg.zza(zzd.class, localzzd);
  }
  
  public final double zza()
  {
    return zzk;
  }
  
  public final Object zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (zzgq.zza[(paramInt - 1)])
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
      paramObject1 = zzb.zzb();
      return zzkg.zza(zzc, "\004\006\000\001\001\006\006\000\001\000\001᠌\000\002\033\003ဈ\001\004ဈ\002\005ဇ\003\006က\004", new Object[] { "zze", "zzf", paramObject1, "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      return new zza(null);
    }
    return new zzd();
  }
  
  public final zzb zzb()
  {
    zzb localzzb1 = zzb.zza(zzf);
    zzb localzzb2 = localzzb1;
    if (localzzb1 == null) {
      localzzb2 = zzb.zza;
    }
    return localzzb2;
  }
  
  public final String zzd()
  {
    return zzh;
  }
  
  public final String zze()
  {
    return zzi;
  }
  
  public final List<zzd> zzf()
  {
    return zzg;
  }
  
  public final boolean zzg()
  {
    return zzj;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x4) != 0;
  }
  
  public static final class zza
    extends zzkg.zza<zzgr.zzd, zza>
    implements zzlo
  {
    private zza()
    {
      super();
    }
  }
  
  public static enum zzb
    implements zzki
  {
    private final int zzg;
    
    static
    {
      zzb localzzb1 = new zzb("UNKNOWN", 0, 0);
      zza = localzzb1;
      zzb localzzb2 = new zzb("STRING", 1, 1);
      zzb = localzzb2;
      zzb localzzb3 = new zzb("NUMBER", 2, 2);
      zzc = localzzb3;
      zzb localzzb4 = new zzb("BOOLEAN", 3, 3);
      zzd = localzzb4;
      zzb localzzb5 = new zzb("STATEMENT", 4, 4);
      zze = localzzb5;
      zzf = new zzb[] { localzzb1, localzzb2, localzzb3, localzzb4, localzzb5 };
    }
    
    private zzb(int paramInt)
    {
      zzg = paramInt;
    }
    
    public static zzb zza(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return zze;
            }
            return zzd;
          }
          return zzc;
        }
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzgs.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zzb.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzg);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzg;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgr.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */