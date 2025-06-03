package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzxy
  extends ThreadLocal<Cipher>
{
  private static Cipher zza()
  {
    try
    {
      Cipher localCipher = (Cipher)zzym.zza.zza("AES/CTR/NOPADDING");
      return localCipher;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */