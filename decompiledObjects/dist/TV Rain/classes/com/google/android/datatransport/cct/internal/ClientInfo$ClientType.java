package com.google.android.datatransport.cct.internal;

public enum ClientInfo$ClientType
{
  private final int value;
  
  static
  {
    ClientType localClientType1 = new ClientType("UNKNOWN", 0, 0);
    UNKNOWN = localClientType1;
    ClientType localClientType2 = new ClientType("ANDROID_FIREBASE", 1, 23);
    ANDROID_FIREBASE = localClientType2;
    $VALUES = new ClientType[] { localClientType1, localClientType2 };
  }
  
  private ClientInfo$ClientType(int paramInt)
  {
    value = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.ClientInfo.ClientType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */