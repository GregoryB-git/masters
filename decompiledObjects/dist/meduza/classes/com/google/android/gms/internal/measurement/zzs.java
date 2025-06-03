package com.google.android.gms.internal.measurement;

public enum zzs
{
  static
  {
    zzs localzzs1 = new zzs("DEBUG", 0, 3);
    zza = localzzs1;
    zzs localzzs2 = new zzs("ERROR", 1, 6);
    zzb = localzzs2;
    zzs localzzs3 = new zzs("INFO", 2, 4);
    zzc = localzzs3;
    zzs localzzs4 = new zzs("VERBOSE", 3, 2);
    zzd = localzzs4;
    zzs localzzs5 = new zzs("WARN", 4, 5);
    zze = localzzs5;
    zzf = new zzs[] { localzzs1, localzzs2, localzzs3, localzzs4, localzzs5 };
  }
  
  private zzs(int paramInt) {}
  
  public static zzs zza(int paramInt)
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 5)
        {
          if (paramInt != 6) {
            return zzc;
          }
          return zzb;
        }
        return zze;
      }
      return zza;
    }
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */