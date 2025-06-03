package com.google.android.gms.internal.measurement;

public enum zzgf$zzj$zza
  implements zzki
{
  private final int zzd;
  
  static
  {
    zza localzza1 = new zza("SDK", 0, 0);
    zza = localzza1;
    zza localzza2 = new zza("SGTM", 1, 1);
    zzb = localzza2;
    zzc = new zza[] { localzza1, localzza2 };
  }
  
  private zzgf$zzj$zza(int paramInt)
  {
    zzd = paramInt;
  }
  
  public static zza zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
      return zzb;
    }
    return zza;
  }
  
  public static zzkl zzb()
  {
    return zzgk.zza;
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */