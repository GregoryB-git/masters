package com.google.android.gms.internal.measurement;

public final class zzgf$zzo
  extends zzkg<zzo, zzb>
  implements zzlo
{
  private static final zzo zzc;
  private static volatile zzlz<zzo> zzd;
  private int zze;
  private int zzf;
  private int zzg;
  private int zzh;
  
  static
  {
    zzo localzzo = new zzo();
    zzc = localzzo;
    zzkg.zza(zzo.class, localzzo);
  }
  
  public static zzb zza()
  {
    return (zzb)zzc.zzcg();
  }
  
  public static zzo zzf()
  {
    return zzc;
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
      paramObject2 = zzd.zzb();
      paramObject1 = zza.zzb();
      zzkl localzzkl = zzc.zzb();
      return zzkg.zza(zzc, "\004\003\000\001\001\003\003\000\000\000\001᠌\000\002᠌\001\003᠌\002", new Object[] { "zze", "zzf", paramObject2, "zzg", paramObject1, "zzh", localzzkl });
    case 2: 
      return new zzb(null);
    }
    return new zzo();
  }
  
  public final zza zzb()
  {
    zza localzza1 = zza.zza(zzg);
    zza localzza2 = localzza1;
    if (localzza1 == null) {
      localzza2 = zza.zza;
    }
    return localzza2;
  }
  
  public final zzc zzc()
  {
    zzc localzzc1 = zzc.zza(zzh);
    zzc localzzc2 = localzzc1;
    if (localzzc1 == null) {
      localzzc2 = zzc.zza;
    }
    return localzzc2;
  }
  
  public final zzd zzd()
  {
    zzd localzzd1 = zzd.zza(zzf);
    zzd localzzd2 = localzzd1;
    if (localzzd1 == null) {
      localzzd2 = zzd.zza;
    }
    return localzzd2;
  }
  
  public static enum zza
    implements zzki
  {
    private final int zzn;
    
    static
    {
      zza localzza1 = new zza("CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN", 0, 0);
      zza = localzza1;
      zza localzza2 = new zza("CLIENT_UPLOAD_ELIGIBLE", 1, 1);
      zzb = localzza2;
      zza localzza3 = new zza("MEASUREMENT_SERVICE_NOT_ENABLED", 2, 2);
      zzc = localzza3;
      zza localzza4 = new zza("ANDROID_TOO_OLD", 3, 3);
      zzd = localzza4;
      zza localzza5 = new zza("NON_PLAY_MODE", 4, 4);
      zze = localzza5;
      zza localzza6 = new zza("SDK_TOO_OLD", 5, 5);
      zzf = localzza6;
      zza localzza7 = new zza("MISSING_JOB_SCHEDULER", 6, 6);
      zzg = localzza7;
      zza localzza8 = new zza("NOT_ENABLED_IN_MANIFEST", 7, 7);
      zzh = localzza8;
      zza localzza9 = new zza("CLIENT_FLAG_OFF", 8, 8);
      zzi = localzza9;
      zza localzza10 = new zza("SERVICE_FLAG_OFF", 9, 20);
      zzj = localzza10;
      zza localzza11 = new zza("PINNED_TO_SERVICE_UPLOAD", 10, 21);
      zzk = localzza11;
      zza localzza12 = new zza("MISSING_SGTM_SERVER_URL", 11, 22);
      zzl = localzza12;
      zzm = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5, localzza6, localzza7, localzza8, localzza9, localzza10, localzza11, localzza12 };
    }
    
    private zza(int paramInt)
    {
      zzn = paramInt;
    }
    
    public static zza zza(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          return null;
        case 22: 
          return zzl;
        case 21: 
          return zzk;
        }
        return zzj;
      case 8: 
        return zzi;
      case 7: 
        return zzh;
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
      return zzgm.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zza.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzn);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzn;
    }
  }
  
  public static final class zzb
    extends zzkg.zza<zzgf.zzo, zzb>
    implements zzlo
  {
    private zzb()
    {
      super();
    }
    
    public final zzb zza(zzgf.zzo.zza paramzza)
    {
      zzam();
      zzgf.zzo.zza((zzgf.zzo)zza, paramzza);
      return this;
    }
    
    public final zzb zza(zzgf.zzo.zzc paramzzc)
    {
      zzam();
      zzgf.zzo.zza((zzgf.zzo)zza, paramzzc);
      return this;
    }
    
    public final zzb zza(zzgf.zzo.zzd paramzzd)
    {
      zzam();
      zzgf.zzo.zza((zzgf.zzo)zza, paramzzd);
      return this;
    }
  }
  
  public static enum zzc
    implements zzki
  {
    private final int zzh;
    
    static
    {
      zzc localzzc1 = new zzc("SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN", 0, 0);
      zza = localzzc1;
      zzc localzzc2 = new zzc("SERVICE_UPLOAD_ELIGIBLE", 1, 1);
      zzb = localzzc2;
      zzc localzzc3 = new zzc("NOT_IN_ROLLOUT", 2, 2);
      zzc = localzzc3;
      zzc localzzc4 = new zzc("MISSING_SGTM_SETTINGS", 3, 3);
      zzd = localzzc4;
      zzc localzzc5 = new zzc("MISSING_SGTM_PROXY_INFO", 4, 4);
      zzf = localzzc5;
      zzc localzzc6 = new zzc("NON_PLAY_MISSING_SGTM_SERVER_URL", 5, 5);
      zze = localzzc6;
      zzg = new zzc[] { localzzc1, localzzc2, localzzc3, localzzc4, localzzc5, localzzc6 };
    }
    
    private zzc(int paramInt)
    {
      zzh = paramInt;
    }
    
    public static zzc zza(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4)
              {
                if (paramInt != 5) {
                  return null;
                }
                return zze;
              }
              return zzf;
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
      return zzgn.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zzc.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(zzh);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
    
    public final int zza()
    {
      return zzh;
    }
  }
  
  public static enum zzd
    implements zzki
  {
    private final int zzg;
    
    static
    {
      zzd localzzd1 = new zzd("UPLOAD_TYPE_UNKNOWN", 0, 0);
      zza = localzzd1;
      zzd localzzd2 = new zzd("GA_UPLOAD", 1, 1);
      zzb = localzzd2;
      zzd localzzd3 = new zzd("SDK_CLIENT_UPLOAD", 2, 2);
      zzc = localzzd3;
      zzd localzzd4 = new zzd("PACKAGE_SERVICE_UPLOAD", 3, 3);
      zze = localzzd4;
      zzd localzzd5 = new zzd("SDK_SERVICE_UPLOAD", 4, 4);
      zzd = localzzd5;
      zzf = new zzd[] { localzzd1, localzzd2, localzzd3, localzzd4, localzzd5 };
    }
    
    private zzd(int paramInt)
    {
      zzg = paramInt;
    }
    
    public static zzd zza(int paramInt)
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
              return zzd;
            }
            return zze;
          }
          return zzc;
        }
        return zzb;
      }
      return zza;
    }
    
    public static zzkl zzb()
    {
      return zzgo.zza;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(zzd.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */