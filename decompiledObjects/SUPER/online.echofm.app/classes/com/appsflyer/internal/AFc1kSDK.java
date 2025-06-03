package com.appsflyer.internal;

public class AFc1kSDK
{
  public final long AFKeystoreWrapper;
  
  public AFc1kSDK(long paramLong)
  {
    AFKeystoreWrapper = paramLong;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (AFc1kSDK)paramObject;
      if (AFKeystoreWrapper == AFKeystoreWrapper) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = AFKeystoreWrapper;
    return (int)(l ^ l >>> 32);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1kSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */