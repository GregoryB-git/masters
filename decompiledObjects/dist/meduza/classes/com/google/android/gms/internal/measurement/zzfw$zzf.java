package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfw$zzf
  extends zzkg<zzf, zzb>
  implements zzlo
{
  private static final zzf zzc;
  private static volatile zzlz<zzf> zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private boolean zzh;
  private zzkm<String> zzi = zzkg.zzcl();
  
  static
  {
    zzf localzzf = new zzf();
    zzc = localzzf;
    zzkg.zza(zzf.class, localzzf);
  }
  
  public static zzf zzd()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzi.size();
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
      paramObject1 = zza.zzb();
      return zzkg.zza(zzc, "\004\004\000\001\001\004\004\000\001\000\001᠌\000\002ဈ\001\003ဇ\002\004\032", new Object[] { "zze", "zzf", paramObject1, "zzg", "zzh", "zzi" });
    case 2: 
      return new zzb(null);
    }
    return new zzf();
  }
  
  public final zza zzb()
  {
    zza localzza1 = zza.zza(zzf);
    zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zza.zza;
    }
    return localzza2;
  }
  
  public final String zze()
  {
    return zzg;
  }
  
  public final List<String> zzf()
  {
    return zzi;
  }
  
  public final boolean zzg()
  {
    return zzh;
  }
  
  public final boolean zzh()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean zzi()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean zzj()
  {
    return (zze & 0x1) != 0;
  }
  
  public static enum zza
    implements zzki
  {
    private final int zzi;
    
    static
    {
      zza localzza1 = new zza("UNKNOWN_MATCH_TYPE", 0, 0);
      zza = localzza1;
      zza localzza2 = new zza("REGEXP", 1, 1);
      zzb = localzza2;
      zza localzza3 = new zza("BEGINS_WITH", 2, 2);
      zzc = localzza3;
      zza localzza4 = new zza("ENDS_WITH", 3, 3);
      zzd = localzza4;
      zza localzza5 = new zza("PARTIAL", 4, 4);
      zze = localzza5;
      zza localzza6 = new zza("EXACT", 5, 5);
      zzf = localzza6;
      zza localzza7 = new zza("IN_LIST", 6, 6);
      zzg = localzza7;
      zzh = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5, localzza6, localzza7 };
    }
    
    private zza(int paramInt)
    {
      zzi = paramInt;
    }
    
    public static zza zza(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 6: 
        return zzg;
      case 5: 
        return zzf;
      case 4: 
        return zze;
      case 3: 
        return zzd;
      case 2: 
        return zzc;
      case 1: 
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzga.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zza.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzi);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzi;
    }
  }
  
  public static final class zzb
    extends zzkg.zza<zzfw.zzf, zzb>
    implements zzlo
  {
    private zzb()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */