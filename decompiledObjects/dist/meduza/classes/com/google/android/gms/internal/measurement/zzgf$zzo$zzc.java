package com.google.android.gms.internal.measurement;

public enum zzgf$zzo$zzc
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
  
  private zzgf$zzo$zzc(int paramInt)
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzo.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */