package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcm;
import java.math.BigInteger;

public final class zzzm
{
  private final BigInteger zza;
  
  private zzzm(BigInteger paramBigInteger)
  {
    zza = paramBigInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzzm zza(BigInteger paramBigInteger, zzcm paramzzcm)
  {
    if (paramzzcm != null) {
      return new zzzm(paramBigInteger);
    }
    throw new NullPointerException("SecretKeyAccess required");
  }
  
  public final BigInteger zza(zzcm paramzzcm)
  {
    if (paramzzcm != null) {
      return zza;
    }
    throw new NullPointerException("SecretKeyAccess required");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */