package com.google.android.gms.internal.measurement;

public enum zzgf$zzo$zza
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
  
  private zzgf$zzo$zza(int paramInt)
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzo.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */