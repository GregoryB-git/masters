package com.facebook.internal.logging;

public enum LogCategory
{
  static
  {
    LogCategory localLogCategory1 = new LogCategory("PERFORMANCE", 0);
    PERFORMANCE = localLogCategory1;
    LogCategory localLogCategory2 = new LogCategory("METHOD_USAGE", 1);
    METHOD_USAGE = localLogCategory2;
    $VALUES = new LogCategory[] { localLogCategory1, localLogCategory2 };
  }
  
  private LogCategory() {}
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.LogCategory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */