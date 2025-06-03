package com.facebook.internal.logging;

import java.util.Collection;

public abstract interface LoggingStore
{
  public abstract Collection<ExternalLog> readAndClearStore();
  
  public abstract void saveLogsToDisk(Collection<ExternalLog> paramCollection);
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.LoggingStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */