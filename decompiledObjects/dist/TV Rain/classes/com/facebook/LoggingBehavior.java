package com.facebook;

public enum LoggingBehavior
{
  static
  {
    LoggingBehavior localLoggingBehavior1 = new LoggingBehavior("REQUESTS", 0);
    REQUESTS = localLoggingBehavior1;
    LoggingBehavior localLoggingBehavior2 = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
    INCLUDE_ACCESS_TOKENS = localLoggingBehavior2;
    LoggingBehavior localLoggingBehavior3 = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
    INCLUDE_RAW_RESPONSES = localLoggingBehavior3;
    LoggingBehavior localLoggingBehavior4 = new LoggingBehavior("CACHE", 3);
    CACHE = localLoggingBehavior4;
    LoggingBehavior localLoggingBehavior5 = new LoggingBehavior("APP_EVENTS", 4);
    APP_EVENTS = localLoggingBehavior5;
    LoggingBehavior localLoggingBehavior6 = new LoggingBehavior("DEVELOPER_ERRORS", 5);
    DEVELOPER_ERRORS = localLoggingBehavior6;
    LoggingBehavior localLoggingBehavior7 = new LoggingBehavior("GRAPH_API_DEBUG_WARNING", 6);
    GRAPH_API_DEBUG_WARNING = localLoggingBehavior7;
    LoggingBehavior localLoggingBehavior8 = new LoggingBehavior("GRAPH_API_DEBUG_INFO", 7);
    GRAPH_API_DEBUG_INFO = localLoggingBehavior8;
    $VALUES = new LoggingBehavior[] { localLoggingBehavior1, localLoggingBehavior2, localLoggingBehavior3, localLoggingBehavior4, localLoggingBehavior5, localLoggingBehavior6, localLoggingBehavior7, localLoggingBehavior8 };
  }
  
  private LoggingBehavior() {}
}

/* Location:
 * Qualified Name:     com.facebook.LoggingBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */