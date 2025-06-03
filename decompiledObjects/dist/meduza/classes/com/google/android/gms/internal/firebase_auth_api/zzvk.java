package com.google.android.gms.internal.firebase_auth_api;

public enum zzvk
  implements zzakl
{
  private final int zzg;
  
  static
  {
    zzvk localzzvk1 = new zzvk("AEAD_UNKNOWN", 0, 0);
    zze = localzzvk1;
    zzvk localzzvk2 = new zzvk("AES_128_GCM", 1, 1);
    zza = localzzvk2;
    zzvk localzzvk3 = new zzvk("AES_256_GCM", 2, 2);
    zzb = localzzvk3;
    zzvk localzzvk4 = new zzvk("CHACHA20_POLY1305", 3, 3);
    zzc = localzzvk4;
    zzvk localzzvk5 = new zzvk("UNRECOGNIZED", 4, -1);
    zzd = localzzvk5;
    zzf = new zzvk[] { localzzvk1, localzzvk2, localzzvk3, localzzvk4, localzzvk5 };
  }
  
  private zzvk(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvk[] values()
  {
    return (zzvk[])zzf.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvk zza(int paramInt)
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
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzvk.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */