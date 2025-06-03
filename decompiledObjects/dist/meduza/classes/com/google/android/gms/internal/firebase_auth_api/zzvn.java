package com.google.android.gms.internal.firebase_auth_api;

public enum zzvn
  implements zzakl
{
  private final int zzg;
  
  static
  {
    zzvn localzzvn1 = new zzvn("KDF_UNKNOWN", 0, 0);
    zze = localzzvn1;
    zzvn localzzvn2 = new zzvn("HKDF_SHA256", 1, 1);
    zza = localzzvn2;
    zzvn localzzvn3 = new zzvn("HKDF_SHA384", 2, 2);
    zzb = localzzvn3;
    zzvn localzzvn4 = new zzvn("HKDF_SHA512", 3, 3);
    zzc = localzzvn4;
    zzvn localzzvn5 = new zzvn("UNRECOGNIZED", 4, -1);
    zzd = localzzvn5;
    zzf = new zzvn[] { localzzvn1, localzzvn2, localzzvn3, localzzvn4, localzzvn5 };
  }
  
  private zzvn(int paramInt)
  {
    zzg = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvn[] values()
  {
    return (zzvn[])zzf.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvn zza(int paramInt)
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
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzvn.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */