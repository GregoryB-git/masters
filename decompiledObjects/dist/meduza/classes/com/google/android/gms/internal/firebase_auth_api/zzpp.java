package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

public final class zzpp
{
  private static final ThreadLocal<SecureRandom> zza = new zzpo();
  
  public static byte[] zza(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    ((SecureRandom)zza.get()).nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  private static SecureRandom zzb()
  {
    Object localObject = zzmr.zza();
    if (localObject != null) {}
    try
    {
      localObject = SecureRandom.getInstance("SHA1PRNG", (Provider)localObject);
      return (SecureRandom)localObject;
    }
    catch (GeneralSecurityException localGeneralSecurityException1)
    {
      for (;;) {}
    }
    localObject = zzmr.zzb();
    if (localObject != null) {}
    try
    {
      localObject = SecureRandom.getInstance("SHA1PRNG", (Provider)localObject);
      return (SecureRandom)localObject;
    }
    catch (GeneralSecurityException localGeneralSecurityException2)
    {
      for (;;) {}
    }
    return new SecureRandom();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */