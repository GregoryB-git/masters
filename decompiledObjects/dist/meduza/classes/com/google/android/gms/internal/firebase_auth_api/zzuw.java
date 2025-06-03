package com.google.android.gms.internal.firebase_auth_api;

public enum zzuw
  implements zzakl
{
  private final int zzh;
  
  static
  {
    zzuw localzzuw1 = new zzuw("UNKNOWN_CURVE", 0, 0);
    zzf = localzzuw1;
    zzuw localzzuw2 = new zzuw("NIST_P256", 1, 2);
    zza = localzzuw2;
    zzuw localzzuw3 = new zzuw("NIST_P384", 2, 3);
    zzb = localzzuw3;
    zzuw localzzuw4 = new zzuw("NIST_P521", 3, 4);
    zzc = localzzuw4;
    zzuw localzzuw5 = new zzuw("CURVE25519", 4, 5);
    zzd = localzzuw5;
    zzuw localzzuw6 = new zzuw("UNRECOGNIZED", 5, -1);
    zze = localzzuw6;
    zzg = new zzuw[] { localzzuw1, localzzuw2, localzzuw3, localzzuw4, localzzuw5, localzzuw6 };
  }
  
  private zzuw(int paramInt)
  {
    zzh = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuw[] values()
  {
    return (zzuw[])zzg.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuw zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
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
    return zzf;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzuw.class.getName());
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
      return zzh;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */