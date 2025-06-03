package com.facebook.internal.logging;

public abstract interface LoggingManager
{
  public abstract void addLog(ExternalLog paramExternalLog);
  
  public abstract void flushAndWait();
  
  public abstract void flushLoggingStore();
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.LoggingManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */