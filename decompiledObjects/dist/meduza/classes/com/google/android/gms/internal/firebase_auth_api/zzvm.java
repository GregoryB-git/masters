package com.google.android.gms.internal.firebase_auth_api;

public enum zzvm
  implements zzakl
{
  private final int zzh;
  
  static
  {
    zzvm localzzvm1 = new zzvm("KEM_UNKNOWN", 0, 0);
    zzf = localzzvm1;
    zzvm localzzvm2 = new zzvm("DHKEM_X25519_HKDF_SHA256", 1, 1);
    zza = localzzvm2;
    zzvm localzzvm3 = new zzvm("DHKEM_P256_HKDF_SHA256", 2, 2);
    zzb = localzzvm3;
    zzvm localzzvm4 = new zzvm("DHKEM_P384_HKDF_SHA384", 3, 3);
    zzc = localzzvm4;
    zzvm localzzvm5 = new zzvm("DHKEM_P521_HKDF_SHA512", 4, 4);
    zzd = localzzvm5;
    zzvm localzzvm6 = new zzvm("UNRECOGNIZED", 5, -1);
    zze = localzzvm6;
    zzg = new zzvm[] { localzzvm1, localzzvm2, localzzvm3, localzzvm4, localzzvm5, localzzvm6 };
  }
  
  private zzvm(int paramInt)
  {
    zzh = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvm[] values()
  {
    return (zzvm[])zzg.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvm zza(int paramInt)
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
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzvm.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */