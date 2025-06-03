package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzoc
{
  private static final zzoe<zznp> zza = new zzof();
  private static final com.google.android.gms.internal.firebase-auth-api.zzoc zzb = zzb();
  private final Map<Class<? extends zzcg>, zzoe<? extends zzcg>> zzc = new HashMap();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzoc zza()
  {
    return zzb;
  }
  
  private final <ParametersT extends zzcg> zzbo zzb(ParametersT paramParametersT, Integer paramInteger)
  {
    try
    {
      Object localObject = paramParametersT.getClass();
      localObject = (zzoe)zzc.get(localObject);
      if (localObject != null)
      {
        paramParametersT = ((zzoe)localObject).zza(paramParametersT, paramInteger);
        return paramParametersT;
      }
      paramInteger = new java/security/GeneralSecurityException;
      localObject = String.valueOf(paramParametersT);
      paramParametersT = new java/lang/StringBuilder;
      paramParametersT.<init>("Cannot create a new key for parameters ");
      paramParametersT.append((String)localObject);
      paramParametersT.append(": no key creator for this class was registered.");
      paramInteger.<init>(paramParametersT.toString());
      throw paramInteger;
    }
    finally {}
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzoc zzb()
  {
    zzoc localzzoc = new zzoc();
    try
    {
      localzzoc.zza(zza, com.google.android.gms.internal.firebase-auth-api.zznp.class);
      return localzzoc;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException("unexpected error.", localGeneralSecurityException);
    }
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzbo zza(com.google.android.gms.internal.firebase-auth-api.zzcg paramzzcg, Integer paramInteger)
  {
    return zzb(paramzzcg, paramInteger);
  }
  
  public final <ParametersT extends zzcg> void zza(zzoe<ParametersT> paramzzoe, Class<ParametersT> paramClass)
  {
    try
    {
      Object localObject = (zzoe)zzc.get(paramClass);
      if ((localObject != null) && (!localObject.equals(paramzzoe)))
      {
        paramzzoe = new java/security/GeneralSecurityException;
        localObject = String.valueOf(paramClass);
        paramClass = new java/lang/StringBuilder;
        paramClass.<init>("Different key creator for parameters class ");
        paramClass.append((String)localObject);
        paramClass.append(" already inserted");
        paramzzoe.<init>(paramClass.toString());
        throw paramzzoe;
      }
      zzc.put(paramClass, paramzzoe);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzoc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */