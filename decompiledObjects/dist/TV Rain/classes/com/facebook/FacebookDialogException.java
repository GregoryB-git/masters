package com.facebook;

import z2;

public class FacebookDialogException
  extends FacebookException
{
  public static final long serialVersionUID = 1L;
  private int errorCode;
  private String failingUrl;
  
  public FacebookDialogException(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    errorCode = paramInt;
    failingUrl = paramString2;
  }
  
  public int getErrorCode()
  {
    return errorCode;
  }
  
  public String getFailingUrl()
  {
    return failingUrl;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = z2.u("{FacebookDialogException: ", "errorCode: ");
    localStringBuilder.append(getErrorCode());
    localStringBuilder.append(", message: ");
    localStringBuilder.append(getMessage());
    localStringBuilder.append(", url: ");
    localStringBuilder.append(getFailingUrl());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookDialogException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */