package com.appsflyer;

public enum AFLogger$LogLevel
{
  private int AFKeystoreWrapper;
  
  static
  {
    LogLevel localLogLevel1 = new LogLevel("NONE", 0, 0);
    NONE = localLogLevel1;
    LogLevel localLogLevel2 = new LogLevel("ERROR", 1, 1);
    ERROR = localLogLevel2;
    LogLevel localLogLevel3 = new LogLevel("WARNING", 2, 2);
    WARNING = localLogLevel3;
    LogLevel localLogLevel4 = new LogLevel("INFO", 3, 3);
    INFO = localLogLevel4;
    LogLevel localLogLevel5 = new LogLevel("DEBUG", 4, 4);
    DEBUG = localLogLevel5;
    LogLevel localLogLevel6 = new LogLevel("VERBOSE", 5, 5);
    VERBOSE = localLogLevel6;
    AFInAppEventParameterName = new LogLevel[] { localLogLevel1, localLogLevel2, localLogLevel3, localLogLevel4, localLogLevel5, localLogLevel6 };
  }
  
  private AFLogger$LogLevel(int paramInt)
  {
    AFKeystoreWrapper = paramInt;
  }
  
  public final int getLevel()
  {
    return AFKeystoreWrapper;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.AFLogger.LogLevel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */