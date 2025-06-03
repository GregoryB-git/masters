package com.google.android.gms.internal.firebase_auth_api;

public enum zzuf
  implements zzakl
{
  private final int zzg;
  
  static
  {
    zzuf localzzuf1 = new zzuf("UNKNOWN_FORMAT", 0, 0);
    zze = localzzuf1;
    zzuf localzzuf2 = new zzuf("UNCOMPRESSED", 1, 1);
    zza = localzzuf2;
    zzuf localzzuf3 = new zzuf("COMPRESSED", 2, 2);
    zzb = localzzuf3;
    zzuf localzzuf4 = new zzuf("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
    zzc = localzzuf4;
    zzuf localzzuf5 = new zzuf("UNRECOGNIZED", 4, -1);
    zzd = localzzuf5;
    zzf = new zzuf[] { localzzuf1, localzzuf2, localzzuf3, localzzuf4, localzzuf5 };
  }
  
  private zzuf(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuf[] values()
  {
    return (zzuf[])zzf.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzuf zza(int paramInt)
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
          return zzc;
        }
        return zzb;
      }
      return zza;
    }
    return zze;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzuf.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != zzd)
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
    if (this != zzd) {
      return zzg;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzuf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */