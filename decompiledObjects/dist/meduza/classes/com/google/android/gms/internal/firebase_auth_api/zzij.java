package com.google.android.gms.internal.firebase_auth_api;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzij
{
  private static final Logger zza = Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzij.class.getName());
  private static final AtomicBoolean zzb = new AtomicBoolean(false);
  
  public static Boolean zza()
  {
    try
    {
      Boolean localBoolean = (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
      return localBoolean;
    }
    catch (Exception localException)
    {
      zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
    }
    return Boolean.FALSE;
  }
  
  public static boolean zzb()
  {
    return zzb.get();
  }
  
  public static abstract enum zza
  {
    static
    {
      zzil localzzil = new zzil("ALGORITHM_NOT_FIPS", 0, null);
      zza = localzzil;
      zzin localzzin = new zzin("ALGORITHM_REQUIRES_BORINGCRYPTO", 1, null);
      zzb = localzzin;
      zzc = new zza[] { localzzil, localzzin };
    }
    
    private zza() {}
    
    public static com.google.android.gms.internal.firebase-auth-api.zzij.zza[] values()
    {
      return (zza[])zzc.clone();
    }
    
    public abstract boolean zza();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzij
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */