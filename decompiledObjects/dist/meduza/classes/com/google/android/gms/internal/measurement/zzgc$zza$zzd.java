package com.google.android.gms.internal.measurement;

public enum zzgc$zza$zzd
  implements zzki
{
  private final int zze;
  
  static
  {
    zzd localzzd1 = new zzd("CONSENT_STATUS_UNSPECIFIED", 0, 0);
    zza = localzzd1;
    zzd localzzd2 = new zzd("GRANTED", 1, 1);
    zzb = localzzd2;
    zzd localzzd3 = new zzd("DENIED", 2, 2);
    zzc = localzzd3;
    zzd = new zzd[] { localzzd1, localzzd2, localzzd3 };
  }
  
  private zzgc$zza$zzd(int paramInt)
  {
    zze = paramInt;
  }
  
  public static zzd zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return null;
        }
        return zzc;
      }
      return zzb;
    }
    return zza;
  }
  
  public static zzkl zzb()
  {
    return zzgd.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zzd.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" number=");
    localStringBuilder.append(zze);
    localStringBuilder.append(" name=");
    localStringBuilder.append(name());
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgc.zza.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */