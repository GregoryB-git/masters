package com.appsflyer.internal;

public abstract class AFe1jSDK
  extends AFa1qSDK
{
  private final boolean AFLogger$LogLevel;
  public boolean afErrorLogForExcManagerOnly;
  private final boolean getLevel;
  
  public AFe1jSDK()
  {
    this(null, null, null, null, null);
  }
  
  public AFe1jSDK(String paramString1, String paramString2, Boolean paramBoolean1, Boolean paramBoolean2, Boolean paramBoolean3)
  {
    super(paramString1, paramString2, Boolean.valueOf(bool1));
    boolean bool2 = true;
    if (paramBoolean1 != null) {
      bool1 = paramBoolean1.booleanValue();
    } else {
      bool1 = true;
    }
    AFLogger$LogLevel = bool1;
    boolean bool1 = bool2;
    if (paramBoolean2 != null) {
      bool1 = paramBoolean2.booleanValue();
    }
    getLevel = bool1;
  }
  
  public final boolean AFVersionDeclaration()
  {
    return getLevel;
  }
  
  public final boolean afErrorLogForExcManagerOnly()
  {
    return AFLogger$LogLevel;
  }
  
  public final boolean getLevel()
  {
    return afErrorLogForExcManagerOnly;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1jSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */