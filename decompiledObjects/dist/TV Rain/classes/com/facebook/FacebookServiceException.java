package com.facebook;

import z2;

public class FacebookServiceException
  extends FacebookException
{
  private static final long serialVersionUID = 1L;
  private final FacebookRequestError error;
  
  public FacebookServiceException(FacebookRequestError paramFacebookRequestError, String paramString)
  {
    super(paramString);
    error = paramFacebookRequestError;
  }
  
  public final FacebookRequestError getRequestError()
  {
    return error;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = z2.u("{FacebookServiceException: ", "httpResponseCode: ");
    localStringBuilder.append(error.getRequestStatusCode());
    localStringBuilder.append(", facebookErrorCode: ");
    localStringBuilder.append(error.getErrorCode());
    localStringBuilder.append(", facebookErrorType: ");
    localStringBuilder.append(error.getErrorType());
    localStringBuilder.append(", message: ");
    localStringBuilder.append(error.getErrorMessage());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookServiceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */