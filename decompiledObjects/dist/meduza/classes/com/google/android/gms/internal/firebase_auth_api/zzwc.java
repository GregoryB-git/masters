package com.google.android.gms.internal.firebase_auth_api;

public enum zzwc
  implements zzakl
{
  private final int zzg;
  
  static
  {
    zzwc localzzwc1 = new zzwc("UNKNOWN_STATUS", 0, 0);
    zza = localzzwc1;
    zzwc localzzwc2 = new zzwc("ENABLED", 1, 1);
    zzb = localzzwc2;
    zzwc localzzwc3 = new zzwc("DISABLED", 2, 2);
    zzc = localzzwc3;
    zzwc localzzwc4 = new zzwc("DESTROYED", 3, 3);
    zzd = localzzwc4;
    zzwc localzzwc5 = new zzwc("UNRECOGNIZED", 4, -1);
    zze = localzzwc5;
    zzf = new zzwc[] { localzzwc1, localzzwc2, localzzwc3, localzzwc4, localzzwc5 };
  }
  
  private zzwc(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwc[] values()
  {
    return (zzwc[])zzf.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwc zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            return null;
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
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzwc.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != zze)
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
    if (this != zze) {
      return zzg;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */