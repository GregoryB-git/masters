package com.google.android.gms.internal.measurement;

public enum zzgf$zzl$zza
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
  
  private zzgf$zzl$zza(int paramInt)
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgf.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */