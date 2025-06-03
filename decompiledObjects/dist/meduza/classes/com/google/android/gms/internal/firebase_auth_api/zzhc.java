package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzhc
  extends ThreadLocal<Cipher>
{
  private static Cipher zza()
  {
    try
    {
      Cipher localCipher = (Cipher)zzym.zza.zza("ChaCha20-Poly1305");
      boolean bool = zzgz.zza(localCipher);
      if (!bool) {
        return null;
      }
      return localCipher;
    }
    catch (GeneralSecurityException localGeneralSecurityException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */