package com.google.android.gms.internal.measurement;

public enum zzfw$zzd$zza
  implements zzki
{
  private final int zzg;
  
  static
  {
    zza localzza1 = new zza("UNKNOWN_COMPARISON_TYPE", 0, 0);
    zza = localzza1;
    zza localzza2 = new zza("LESS_THAN", 1, 1);
    zzb = localzza2;
    zza localzza3 = new zza("GREATER_THAN", 2, 2);
    zzc = localzza3;
    zza localzza4 = new zza("EQUAL", 3, 3);
    zzd = localzza4;
    zza localzza5 = new zza("BETWEEN", 4, 4);
    zze = localzza5;
    zzf = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5 };
  }
  
  private zzfw$zzd$zza(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static zza zza(int paramInt)
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
    return zzfy.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zza.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */