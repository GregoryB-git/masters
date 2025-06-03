package com.google.android.gms.internal.firebase_auth_api;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;

public final class zzzi
{
  static
  {
    String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" });
    String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" });
  }
  
  public static String zza(String paramString1, String paramString2)
  {
    if (paramString2.toLowerCase(Locale.US).startsWith(paramString1)) {
      return paramString2.substring(paramString1.length());
    }
    throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[] { paramString1 }));
  }
  
  public static void zza(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt << 3) }));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */