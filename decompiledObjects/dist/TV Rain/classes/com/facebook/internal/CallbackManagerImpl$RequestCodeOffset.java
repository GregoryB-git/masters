package com.facebook.internal;

import com.facebook.FacebookSdk;

public enum CallbackManagerImpl$RequestCodeOffset
{
  private final int offset;
  
  static
  {
    RequestCodeOffset localRequestCodeOffset1 = new RequestCodeOffset("Login", 0, 0);
    Login = localRequestCodeOffset1;
    RequestCodeOffset localRequestCodeOffset2 = new RequestCodeOffset("Share", 1, 1);
    Share = localRequestCodeOffset2;
    RequestCodeOffset localRequestCodeOffset3 = new RequestCodeOffset("Message", 2, 2);
    Message = localRequestCodeOffset3;
    RequestCodeOffset localRequestCodeOffset4 = new RequestCodeOffset("Like", 3, 3);
    Like = localRequestCodeOffset4;
    RequestCodeOffset localRequestCodeOffset5 = new RequestCodeOffset("GameRequest", 4, 4);
    GameRequest = localRequestCodeOffset5;
    RequestCodeOffset localRequestCodeOffset6 = new RequestCodeOffset("AppGroupCreate", 5, 5);
    AppGroupCreate = localRequestCodeOffset6;
    RequestCodeOffset localRequestCodeOffset7 = new RequestCodeOffset("AppGroupJoin", 6, 6);
    AppGroupJoin = localRequestCodeOffset7;
    RequestCodeOffset localRequestCodeOffset8 = new RequestCodeOffset("AppInvite", 7, 7);
    AppInvite = localRequestCodeOffset8;
    RequestCodeOffset localRequestCodeOffset9 = new RequestCodeOffset("DeviceShare", 8, 8);
    DeviceShare = localRequestCodeOffset9;
    RequestCodeOffset localRequestCodeOffset10 = new RequestCodeOffset("GamingFriendFinder", 9, 9);
    GamingFriendFinder = localRequestCodeOffset10;
    RequestCodeOffset localRequestCodeOffset11 = new RequestCodeOffset("GamingGroupIntegration", 10, 10);
    GamingGroupIntegration = localRequestCodeOffset11;
    RequestCodeOffset localRequestCodeOffset12 = new RequestCodeOffset("Referral", 11, 11);
    Referral = localRequestCodeOffset12;
    $VALUES = new RequestCodeOffset[] { localRequestCodeOffset1, localRequestCodeOffset2, localRequestCodeOffset3, localRequestCodeOffset4, localRequestCodeOffset5, localRequestCodeOffset6, localRequestCodeOffset7, localRequestCodeOffset8, localRequestCodeOffset9, localRequestCodeOffset10, localRequestCodeOffset11, localRequestCodeOffset12 };
  }
  
  private CallbackManagerImpl$RequestCodeOffset(int paramInt)
  {
    offset = paramInt;
  }
  
  public int toRequestCode()
  {
    return FacebookSdk.getCallbackRequestCodeOffset() + offset;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.CallbackManagerImpl.RequestCodeOffset
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */