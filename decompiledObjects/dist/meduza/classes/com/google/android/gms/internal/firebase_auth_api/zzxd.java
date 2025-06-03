package com.google.android.gms.internal.firebase_auth_api;

public enum zzxd
  implements zzakl
{
  private final int zzh;
  
  static
  {
    zzxd localzzxd1 = new zzxd("UNKNOWN_PREFIX", 0, 0);
    zza = localzzxd1;
    zzxd localzzxd2 = new zzxd("TINK", 1, 1);
    zzb = localzzxd2;
    zzxd localzzxd3 = new zzxd("LEGACY", 2, 2);
    zzc = localzzxd3;
    zzxd localzzxd4 = new zzxd("RAW", 3, 3);
    zzd = localzzxd4;
    zzxd localzzxd5 = new zzxd("CRUNCHY", 4, 4);
    zze = localzzxd5;
    zzxd localzzxd6 = new zzxd("UNRECOGNIZED", 5, -1);
    zzf = localzzxd6;
    zzg = new zzxd[] { localzzxd1, localzzxd2, localzzxd3, localzzxd4, localzzxd5, localzzxd6 };
  }
  
  private zzxd(int paramInt)
  {
    zzh = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxd[] values()
  {
    return (zzxd[])zzg.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzxd zza(int paramInt)
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzxd.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != zzf)
    {
      localStringBuilder.append(" number=");
      localStringBuilder.append(zza());
    }
    localStringBuilder.append(" name=");
    localStringBuilder.append(name());
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    if (this != zzf) {
      return zzh;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */