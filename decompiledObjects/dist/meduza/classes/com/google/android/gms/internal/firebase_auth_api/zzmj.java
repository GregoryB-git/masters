package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

public final class zzmj
{
  public static zzbe zza(String paramString)
  {
    return new zzmm(paramString, zza());
  }
  
  private static KeyStore zza()
  {
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
      localKeyStore.load(null);
      return localKeyStore;
    }
    catch (IOException localIOException)
    {
      throw new GeneralSecurityException(localIOException);
    }
  }
  
  public static boolean zzb(String paramString)
  {
    return zza().containsAlias(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */