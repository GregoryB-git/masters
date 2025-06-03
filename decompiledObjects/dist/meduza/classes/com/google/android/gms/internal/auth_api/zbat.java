package com.google.android.gms.internal.auth_api;

import android.util.Base64;
import java.security.SecureRandom;

public final class zbat
{
  private static final SecureRandom zba = new SecureRandom();
  
  public static String zba()
  {
    byte[] arrayOfByte = new byte[16];
    zba.nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 11);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */