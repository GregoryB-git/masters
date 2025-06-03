package com.google.android.gms.internal.measurement;

public enum zzgf$zzo$zzd
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
  
  private zzgf$zzo$zzd(int paramInt)
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzo.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */