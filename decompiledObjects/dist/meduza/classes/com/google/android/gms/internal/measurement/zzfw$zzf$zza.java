package com.google.android.gms.internal.measurement;

public enum zzfw$zzf$zza
  implements zzki
{
  private final int zzi;
  
  static
  {
    zza localzza1 = new zza("UNKNOWN_MATCH_TYPE", 0, 0);
    zza = localzza1;
    zza localzza2 = new zza("REGEXP", 1, 1);
    zzb = localzza2;
    zza localzza3 = new zza("BEGINS_WITH", 2, 2);
    zzc = localzza3;
    zza localzza4 = new zza("ENDS_WITH", 3, 3);
    zzd = localzza4;
    zza localzza5 = new zza("PARTIAL", 4, 4);
    zze = localzza5;
    zza localzza6 = new zza("EXACT", 5, 5);
    zzf = localzza6;
    zza localzza7 = new zza("IN_LIST", 6, 6);
    zzg = localzza7;
    zzh = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5, localzza6, localzza7 };
  }
  
  private zzfw$zzf$zza(int paramInt)
  {
    zzi = paramInt;
  }
  
  public static zza zza(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
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
    return zzga.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zza.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" number=");
    localStringBuilder.append(zzi);
    localStringBuilder.append(" name=");
    localStringBuilder.append(name());
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return zzi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzfw.zzf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */