package com.appsflyer;

public enum AppsFlyerProperties$EmailsCryptType
{
  private final int AFInAppEventType;
  
  static
  {
    EmailsCryptType localEmailsCryptType1 = new EmailsCryptType("NONE", 0, 0);
    NONE = localEmailsCryptType1;
    EmailsCryptType localEmailsCryptType2 = new EmailsCryptType("SHA256", 1, 3);
    SHA256 = localEmailsCryptType2;
    valueOf = new EmailsCryptType[] { localEmailsCryptType1, localEmailsCryptType2 };
  }
  
  private AppsFlyerProperties$EmailsCryptType(int paramInt)
  {
    AFInAppEventType = paramInt;
  }
  
  public final int getValue()
  {
    return AFInAppEventType;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.AppsFlyerProperties.EmailsCryptType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */