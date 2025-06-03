package com.facebook.login;

 enum LoginClient$Result$Code
{
  private final String loggingValue;
  
  static
  {
    Code localCode1 = new Code("SUCCESS", 0, "success");
    SUCCESS = localCode1;
    Code localCode2 = new Code("CANCEL", 1, "cancel");
    CANCEL = localCode2;
    Code localCode3 = new Code("ERROR", 2, "error");
    ERROR = localCode3;
    $VALUES = new Code[] { localCode1, localCode2, localCode3 };
  }
  
  private LoginClient$Result$Code(String paramString)
  {
    loggingValue = paramString;
  }
  
  public String getLoggingValue()
  {
    return loggingValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginClient.Result.Code
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */