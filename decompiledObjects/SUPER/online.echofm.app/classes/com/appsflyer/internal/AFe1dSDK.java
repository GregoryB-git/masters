package com.appsflyer.internal;

public abstract class AFe1dSDK
  extends AFe1jSDK
{
  public AFe1dSDK()
  {
    this(null, null);
  }
  
  public AFe1dSDK(String paramString, Boolean paramBoolean)
  {
    super(paramString, null, Boolean.FALSE, null, paramBoolean);
  }
  
  public final boolean afDebugLog()
  {
    return false;
  }
  
  public final boolean afErrorLog()
  {
    return false;
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1dSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */