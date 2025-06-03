package com.google.android.recaptcha;

import p2.m0;
import xb.a;

public enum RecaptchaErrorCode
{
  private final int errorCode;
  private final String errorMessage;
  
  static
  {
    NETWORK_ERROR = new RecaptchaErrorCode("NETWORK_ERROR", 1, 1, "Network Error");
    INVALID_SITEKEY = new RecaptchaErrorCode("INVALID_SITEKEY", 2, 2, "Site key invalid");
    INVALID_KEYTYPE = new RecaptchaErrorCode("INVALID_KEYTYPE", 3, 3, "Key type invalid");
    INVALID_PACKAGE_NAME = new RecaptchaErrorCode("INVALID_PACKAGE_NAME", 4, 4, "Package name not allowed");
    INVALID_ACTION = new RecaptchaErrorCode("INVALID_ACTION", 5, 5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information");
    INVALID_TIMEOUT = new RecaptchaErrorCode("INVALID_TIMEOUT", 6, 6, "Invalid timeout, minimum value is 5_000L milliseconds");
    NO_NETWORK_FOUND = new RecaptchaErrorCode("NO_NETWORK_FOUND", 7, 7, "No network found on device");
    INTERNAL_ERROR = new RecaptchaErrorCode("INTERNAL_ERROR", 8, 100, "Internal Error");
    RecaptchaErrorCode[] arrayOfRecaptchaErrorCode = $values();
    $VALUES = arrayOfRecaptchaErrorCode;
    $ENTRIES = m0.D(arrayOfRecaptchaErrorCode);
  }
  
  private RecaptchaErrorCode(int paramInt, String paramString)
  {
    errorCode = paramInt;
    errorMessage = paramString;
  }
  
  public static a<RecaptchaErrorCode> getEntries()
  {
    return $ENTRIES;
  }
  
  public final int getErrorCode()
  {
    return errorCode;
  }
  
  public final String getErrorMessage()
  {
    return errorMessage;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.RecaptchaErrorCode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */