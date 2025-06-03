package com.google.android.gms.internal.measurement;

public final class zzgf$zzl
  extends zzkg<zzl, zzb>
  implements zzlo
{
  private static final zzl zzc;
  private static volatile zzlz<zzl> zzd;
  private int zze;
  private int zzf = 1;
  private zzkm<zzgf.zzg> zzg = zzkg.zzcl();
  
  static
  {
    zzl localzzl = new zzl();
    zzc = localzzl;
    zzkg.zza(zzl.class, localzzl);
  }
  
  public static zzb zza()
  {
    return (zzb)zzc.zzcg();
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
      return zzkg.zza(zzc, "\004\002\000\001\001\002\002\000\001\000\001᠌\000\002\033", new Object[] { "zze", "zzf", paramObject1, "zzg", zzgf.zzg.class });
    case 2: 
      return new zzb(null);
    }
    return new zzl();
  }
  
  public static enum zza
    implements zzki
  {
    private final int zzd;
    
    static
    {
      zza localzza1 = new zza("RADS", 0, 1);
      zza = localzza1;
      zza localzza2 = new zza("PROVISIONING", 1, 2);
      zzb = localzza2;
      zzc = new zza[] { localzza1, localzza2 };
    }
    
    private zza(int paramInt)
    {
      zzd = paramInt;
    }
    
    public static zza zza(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return null;
        }
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzgl.zza;
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
    extends zzkg.zza<zzgf.zzl, zzb>
    implements zzlo
  {
    private zzb()
    {
      super();
    }
    
    public final zzb zza(zzgf.zzg.zza paramzza)
    {
      zzam();
      zzgf.zzl.zza((zzgf.zzl)zza, (zzgf.zzg)paramzza.zzaj());
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */