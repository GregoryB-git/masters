package com.facebook.internal.logging;

import java.util.Collection;

public abstract interface LoggingCache
{
  public abstract boolean addLog(ExternalLog paramExternalLog);
  
  public abstract boolean addLogs(Collection<? extends ExternalLog> paramCollection);
  
  public abstract Collection<ExternalLog> fetchAllLogs();
  
  public abstract ExternalLog fetchLog();
  
  public abstract boolean isEmpty();
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.LoggingCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */