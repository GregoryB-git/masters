package com.google.android.gms.internal.firebase_auth_api;

public enum zzwb$zza
  implements zzakl
{
  private final int zzh;
  
  static
  {
    zza localzza1 = new zza("UNKNOWN_KEYMATERIAL", 0, 0);
    zza = localzza1;
    zza localzza2 = new zza("SYMMETRIC", 1, 1);
    zzb = localzza2;
    zza localzza3 = new zza("ASYMMETRIC_PRIVATE", 2, 2);
    zzc = localzza3;
    zza localzza4 = new zza("ASYMMETRIC_PUBLIC", 3, 3);
    zzd = localzza4;
    zza localzza5 = new zza("REMOTE", 4, 4);
    zze = localzza5;
    zza localzza6 = new zza("UNRECOGNIZED", 5, -1);
    zzf = localzza6;
    zzg = new zza[] { localzza1, localzza2, localzza3, localzza4, localzza5, localzza6 };
  }
  
  private zzwb$zza(int paramInt)
  {
    zzh = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwb.zza[] values()
  {
    return (zza[])zzg.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwb.zza zza(int paramInt)
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
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzwb.zza.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzwb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */