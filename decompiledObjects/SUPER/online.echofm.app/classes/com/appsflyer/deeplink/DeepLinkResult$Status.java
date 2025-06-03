package com.appsflyer.deeplink;

public enum DeepLinkResult$Status
{
  static
  {
    Status localStatus1 = new Status("FOUND", 0);
    FOUND = localStatus1;
    Status localStatus2 = new Status("NOT_FOUND", 1);
    NOT_FOUND = localStatus2;
    Status localStatus3 = new Status("ERROR", 2);
    ERROR = localStatus3;
    AFInAppEventType = new Status[] { localStatus1, localStatus2, localStatus3 };
  }
  
  private DeepLinkResult$Status() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.deeplink.DeepLinkResult.Status
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */