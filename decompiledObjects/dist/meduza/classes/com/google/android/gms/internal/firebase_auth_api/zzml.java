package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

public final class zzml
  implements com.google.android.gms.internal.firebase-auth-api.zzbe
{
  private static final String zza = "zzml";
  private final com.google.android.gms.internal.firebase-auth-api.zzbe zzb;
  
  public zzml(String paramString)
  {
    zzb = zzmj.zza(paramString);
  }
  
  private static void zza()
  {
    long l = (int)(Math.random() * 100.0D);
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      try
      {
        byte[] arrayOfByte = zzb.zza(paramArrayOfByte1, paramArrayOfByte2);
        return arrayOfByte;
      }
      catch (GeneralSecurityException localGeneralSecurityException) {}catch (ProviderException localProviderException) {}
      Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", localProviderException);
      zza();
      return zzb.zza(paramArrayOfByte1, paramArrayOfByte2);
    }
    catch (BadPaddingException paramArrayOfByte1)
    {
      throw paramArrayOfByte1;
    }
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      byte[] arrayOfByte = zzb.zzb(paramArrayOfByte1, paramArrayOfByte2);
      return arrayOfByte;
    }
    catch (GeneralSecurityException localGeneralSecurityException) {}catch (ProviderException localProviderException) {}
    Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", localProviderException);
    zza();
    return zzb.zzb(paramArrayOfByte1, paramArrayOfByte2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzml
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */