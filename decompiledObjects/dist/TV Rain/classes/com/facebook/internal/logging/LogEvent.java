package com.facebook.internal.logging;

import java.io.Serializable;

public class LogEvent
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String eventName;
  private LogCategory logCategory;
  
  public LogEvent(String paramString, LogCategory paramLogCategory)
  {
    eventName = paramString;
    logCategory = paramLogCategory;
  }
  
  public String getEventName()
  {
    return eventName;
  }
  
  public LogCategory getLogCategory()
  {
    return logCategory;
  }
  
  public String upperCaseEventName()
  {
    String str = eventName.toUpperCase();
    eventName = str;
    return str;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.LogEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */