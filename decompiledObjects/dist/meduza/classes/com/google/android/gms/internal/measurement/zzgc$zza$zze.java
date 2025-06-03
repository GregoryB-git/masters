package com.google.android.gms.internal.measurement;

public enum zzgc$zza$zze
  implements zzki
{
  private final int zzg;
  
  static
  {
    zze localzze1 = new zze("CONSENT_TYPE_UNSPECIFIED", 0, 0);
    zza = localzze1;
    zze localzze2 = new zze("AD_STORAGE", 1, 1);
    zzb = localzze2;
    zze localzze3 = new zze("ANALYTICS_STORAGE", 2, 2);
    zzc = localzze3;
    zze localzze4 = new zze("AD_USER_DATA", 3, 3);
    zzd = localzze4;
    zze localzze5 = new zze("AD_PERSONALIZATION", 4, 4);
    zze = localzze5;
    zzf = new zze[] { localzze1, localzze2, localzze3, localzze4, localzze5 };
  }
  
  private zzgc$zza$zze(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static zze zza(int paramInt)
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
    return zzge.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zze.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zza.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */