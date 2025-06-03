package com.google.android.gms.internal.measurement;

public enum zzgr$zzd$zzb
  implements zzki
{
  private final int zzg;
  
  static
  {
    zzb localzzb1 = new zzb("UNKNOWN", 0, 0);
    zza = localzzb1;
    zzb localzzb2 = new zzb("STRING", 1, 1);
    zzb = localzzb2;
    zzb localzzb3 = new zzb("NUMBER", 2, 2);
    zzc = localzzb3;
    zzb localzzb4 = new zzb("BOOLEAN", 3, 3);
    zzd = localzzb4;
    zzb localzzb5 = new zzb("STATEMENT", 4, 4);
    zze = localzzb5;
    zzf = new zzb[] { localzzb1, localzzb2, localzzb3, localzzb4, localzzb5 };
  }
  
  private zzgr$zzd$zzb(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static zzb zza(int paramInt)
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
    return zzgs.zza;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zzb.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgr.zzd.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */