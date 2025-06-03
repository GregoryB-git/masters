package com.facebook.gamingservices.cloudgaming.internal;

import androidx.annotation.Nullable;

public enum SDKShareIntentEnum
{
  private final String mStringValue;
  
  static
  {
    SDKShareIntentEnum localSDKShareIntentEnum1 = new SDKShareIntentEnum("INVITE", 0, "INVITE");
    INVITE = localSDKShareIntentEnum1;
    SDKShareIntentEnum localSDKShareIntentEnum2 = new SDKShareIntentEnum("REQUEST", 1, "REQUEST");
    REQUEST = localSDKShareIntentEnum2;
    SDKShareIntentEnum localSDKShareIntentEnum3 = new SDKShareIntentEnum("CHALLENGE", 2, "CHALLENGE");
    CHALLENGE = localSDKShareIntentEnum3;
    SDKShareIntentEnum localSDKShareIntentEnum4 = new SDKShareIntentEnum("SHARE", 3, "SHARE");
    SHARE = localSDKShareIntentEnum4;
    $VALUES = new SDKShareIntentEnum[] { localSDKShareIntentEnum1, localSDKShareIntentEnum2, localSDKShareIntentEnum3, localSDKShareIntentEnum4 };
  }
  
  private SDKShareIntentEnum(String paramString)
  {
    mStringValue = paramString;
  }
  
  @Nullable
  public static SDKShareIntentEnum fromString(String paramString)
  {
    for (SDKShareIntentEnum localSDKShareIntentEnum : ) {
      if (localSDKShareIntentEnum.toString().equals(paramString)) {
        return localSDKShareIntentEnum;
      }
    }
    return null;
  }
  
  @Nullable
  public static String validate(String paramString)
  {
    SDKShareIntentEnum[] arrayOfSDKShareIntentEnum = values();
    int i = arrayOfSDKShareIntentEnum.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfSDKShareIntentEnum[j].toString().equals(paramString)) {
        return paramString;
      }
    }
    return null;
  }
  
  public String toString()
  {
    return mStringValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.internal.SDKShareIntentEnum
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */