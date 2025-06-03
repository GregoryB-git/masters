package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzoh
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzoh zza = new zzoh();
  private final Map<Class<? extends zzcg>, zzog<? extends zzcg>> zzb = new HashMap();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzoh zza()
  {
    return zza;
  }
  
  public final <ParametersT extends zzcg> void zza(zzog<ParametersT> paramzzog, Class<ParametersT> paramClass)
  {
    try
    {
      zzog localzzog = (zzog)zzb.get(paramClass);
      if ((localzzog != null) && (!localzzog.equals(paramzzog)))
      {
        paramzzog = new java/security/GeneralSecurityException;
        paramzzog.<init>("Different key creator for parameters class already inserted");
        throw paramzzog;
      }
      zzb.put(paramClass, paramzzog);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzoh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */