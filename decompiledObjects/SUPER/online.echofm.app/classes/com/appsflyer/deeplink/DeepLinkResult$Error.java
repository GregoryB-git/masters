package com.appsflyer.deeplink;

public enum DeepLinkResult$Error
{
  static
  {
    Error localError1 = new Error("TIMEOUT", 0);
    TIMEOUT = localError1;
    Error localError2 = new Error("NETWORK", 1);
    NETWORK = localError2;
    Error localError3 = new Error("HTTP_STATUS_CODE", 2);
    HTTP_STATUS_CODE = localError3;
    Error localError4 = new Error("UNEXPECTED", 3);
    UNEXPECTED = localError4;
    Error localError5 = new Error("DEVELOPER_ERROR", 4);
    DEVELOPER_ERROR = localError5;
    AFKeystoreWrapper = new Error[] { localError1, localError2, localError3, localError4, localError5 };
  }
  
  private DeepLinkResult$Error() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.deeplink.DeepLinkResult.Error
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */