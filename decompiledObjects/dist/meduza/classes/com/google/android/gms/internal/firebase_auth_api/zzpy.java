package com.google.android.gms.internal.firebase_auth_api;

import android.os.Build.VERSION;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;

public final class zzpy
{
  public static final Charset zza = Charset.forName("UTF-8");
  
  public static int zza()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    byte[] arrayOfByte = new byte[4];
    for (int i = 0; i == 0; i = (arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF) {
      localSecureRandom.nextBytes(arrayOfByte);
    }
    return i;
  }
  
  public static final com.google.android.gms.internal.firebase-auth-api.zzzn zza(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    int i = 0;
    while (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if ((c >= '!') && (c <= '~'))
      {
        arrayOfByte[i] = ((byte)(byte)c);
        i++;
      }
      else
      {
        paramString = new StringBuilder("Not a printable ASCII character: ");
        paramString.append(c);
        throw new GeneralSecurityException(paramString.toString());
      }
    }
    return zzzn.zza(arrayOfByte);
  }
  
  public static boolean zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte2.length < paramArrayOfByte1.length) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte1.length; i++) {
      if (paramArrayOfByte2[i] != paramArrayOfByte1[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static final com.google.android.gms.internal.firebase-auth-api.zzzn zzb(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    int i = 0;
    while (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if ((c >= '!') && (c <= '~'))
      {
        arrayOfByte[i] = ((byte)(byte)c);
        i++;
      }
      else
      {
        paramString = new StringBuilder("Not a printable ASCII character: ");
        paramString.append(c);
        throw new zzpw(paramString.toString());
      }
    }
    return zzzn.zza(arrayOfByte);
  }
  
  public static Integer zzb()
  {
    if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
      return null;
    }
    return Integer.valueOf(Build.VERSION.SDK_INT);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */