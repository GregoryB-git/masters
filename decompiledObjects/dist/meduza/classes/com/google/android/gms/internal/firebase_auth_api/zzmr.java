package com.google.android.gms.internal.firebase_auth_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.Security;

public final class zzmr
{
  private static final String[] zza = { "GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt" };
  
  public static Provider zza()
  {
    String[] arrayOfString = zza;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      Provider localProvider = Security.getProvider(arrayOfString[j]);
      if (localProvider != null) {
        return localProvider;
      }
    }
    return null;
  }
  
  public static Provider zzb()
  {
    try
    {
      Provider localProvider = (Provider)Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
      return localProvider;
    }
    catch (ClassNotFoundException|NoSuchMethodException|IllegalArgumentException|InvocationTargetException|IllegalAccessException localClassNotFoundException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */