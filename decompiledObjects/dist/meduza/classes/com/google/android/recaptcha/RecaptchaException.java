package com.google.android.recaptcha;

public final class RecaptchaException
  extends Exception
{
  private final RecaptchaErrorCode errorCode;
  private final String errorMessage;
  
  public RecaptchaException(RecaptchaErrorCode paramRecaptchaErrorCode, String paramString)
  {
    super(paramString);
    errorCode = paramRecaptchaErrorCode;
    errorMessage = paramString;
  }
  
  public final RecaptchaErrorCode getErrorCode()
  {
    return errorCode;
  }
  
  public final String getErrorMessage()
  {
    return errorMessage;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.RecaptchaException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */