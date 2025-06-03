package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzna
{
  private static final Logger zza = Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzna.class.getName());
  private static final com.google.android.gms.internal.firebase-auth-api.zzna zzb = new zzna();
  private ConcurrentMap<String, zzbn<?>> zzc = new ConcurrentHashMap();
  private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzna zza()
  {
    return zzb;
  }
  
  private final void zza(zzbn<?> paramzzbn, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      String str = paramzzbn.zzb();
      if ((paramBoolean2) && (zzd.containsKey(str)) && (!((Boolean)zzd.get(str)).booleanValue()))
      {
        localObject1 = new java/security/GeneralSecurityException;
        paramzzbn = new java/lang/StringBuilder;
        paramzzbn.<init>("New keys are already disallowed for key type ");
        paramzzbn.append(str);
        ((GeneralSecurityException)localObject1).<init>(paramzzbn.toString());
        throw ((Throwable)localObject1);
      }
      Object localObject1 = (zzbn)zzc.get(str);
      if ((localObject1 != null) && (!localObject1.getClass().equals(paramzzbn.getClass())))
      {
        Logger localLogger = zza;
        Level localLevel = Level.WARNING;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Attempted overwrite of a registered key manager for key type ");
        ((StringBuilder)localObject2).append(str);
        localLogger.logp(localLevel, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", ((StringBuilder)localObject2).toString());
        localObject2 = new java/security/GeneralSecurityException;
        ((GeneralSecurityException)localObject2).<init>(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[] { str, localObject1.getClass().getName(), paramzzbn.getClass().getName() }));
        throw ((Throwable)localObject2);
      }
      zzc.putIfAbsent(str, paramzzbn);
      zzd.put(str, Boolean.valueOf(paramBoolean2));
      return;
    }
    finally {}
  }
  
  private final zzbn<?> zzc(String paramString)
  {
    try
    {
      if (zzc.containsKey(paramString))
      {
        paramString = (zzbn)zzc.get(paramString);
        return paramString;
      }
      GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("No key manager found for key type ");
      localStringBuilder.append(paramString);
      localGeneralSecurityException.<init>(localStringBuilder.toString());
      throw localGeneralSecurityException;
    }
    finally {}
  }
  
  public final zzbn<?> zza(String paramString)
  {
    return zzc(paramString);
  }
  
  public final <P> zzbn<P> zza(String paramString, Class<P> paramClass)
  {
    Object localObject = zzc(paramString);
    if (((zzbn)localObject).zza().equals(paramClass)) {
      return (zzbn<P>)localObject;
    }
    paramClass = paramClass.getName();
    paramString = String.valueOf(localObject.getClass());
    localObject = String.valueOf(((zzbn)localObject).zza());
    StringBuilder localStringBuilder = new StringBuilder("Primitive type ");
    localStringBuilder.append(paramClass);
    localStringBuilder.append(" not supported by key manager of type ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(", which only supports: ");
    localStringBuilder.append((String)localObject);
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public final <P> void zza(zzbn<P> paramzzbn, zzij.zza paramzza, boolean paramBoolean)
  {
    try
    {
      if (paramzza.zza())
      {
        zza(paramzzbn, false, paramBoolean);
        return;
      }
      paramzzbn = new java/security/GeneralSecurityException;
      paramzzbn.<init>("Cannot register key manager: FIPS compatibility insufficient");
      throw paramzzbn;
    }
    finally {}
  }
  
  public final <P> void zza(zzbn<P> paramzzbn, boolean paramBoolean)
  {
    try
    {
      zza(paramzzbn, zzij.zza.zza, paramBoolean);
      return;
    }
    finally
    {
      paramzzbn = finally;
      throw paramzzbn;
    }
  }
  
  public final boolean zzb(String paramString)
  {
    return ((Boolean)zzd.get(paramString)).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzna
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */