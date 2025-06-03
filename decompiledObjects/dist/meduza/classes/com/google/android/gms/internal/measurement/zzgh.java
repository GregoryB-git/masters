package com.google.android.gms.internal.measurement;

public enum zzgh
  implements zzki
{
  private final int zzh;
  
  static
  {
    zzgh localzzgh1 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN", 0, 0);
    zza = localzzgh1;
    zzgh localzzgh2 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED", 1, 1);
    zzb = localzzgh2;
    zzgh localzzgh3 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED", 2, 2);
    zzc = localzzgh3;
    zzgh localzzgh4 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED", 3, 3);
    zzd = localzzgh4;
    zzgh localzzgh5 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED", 4, 4);
    zze = localzzgh5;
    zzgh localzzgh6 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED", 5, 5);
    zzf = localzzgh6;
    zzg = new zzgh[] { localzzgh1, localzzgh2, localzzgh3, localzzgh4, localzzgh5, localzzgh6 };
  }
  
  private zzgh(int paramInt)
  {
    zzh = paramInt;
  }
  
  public static zzgh zza(int paramInt)
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
              return zzf;
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
    return zzgj.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zzgh.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */