package com.google.android.gms.internal.firebase_auth_api;

public enum zzvc
  implements zzakl
{
  private final int zzi;
  
  static
  {
    zzvc localzzvc1 = new zzvc("UNKNOWN_HASH", 0, 0);
    zzg = localzzvc1;
    zzvc localzzvc2 = new zzvc("SHA1", 1, 1);
    zza = localzzvc2;
    zzvc localzzvc3 = new zzvc("SHA384", 2, 2);
    zzb = localzzvc3;
    zzvc localzzvc4 = new zzvc("SHA256", 3, 3);
    zzc = localzzvc4;
    zzvc localzzvc5 = new zzvc("SHA512", 4, 4);
    zzd = localzzvc5;
    zzvc localzzvc6 = new zzvc("SHA224", 5, 5);
    zze = localzzvc6;
    zzvc localzzvc7 = new zzvc("UNRECOGNIZED", 6, -1);
    zzf = localzzvc7;
    zzh = new zzvc[] { localzzvc1, localzzvc2, localzzvc3, localzzvc4, localzzvc5, localzzvc6, localzzvc7 };
  }
  
  private zzvc(int paramInt)
  {
    zzi = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvc[] values()
  {
    return (zzvc[])zzh.clone();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzvc zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
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
    return zzg;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(com.google.android.gms.internal.firebase-auth-api.zzvc.class.getName());
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
      return zzi;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzvc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */