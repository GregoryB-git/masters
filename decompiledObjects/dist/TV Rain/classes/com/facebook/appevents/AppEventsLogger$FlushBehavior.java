package com.facebook.appevents;

public enum AppEventsLogger$FlushBehavior
{
  static
  {
    FlushBehavior localFlushBehavior1 = new FlushBehavior("AUTO", 0);
    AUTO = localFlushBehavior1;
    FlushBehavior localFlushBehavior2 = new FlushBehavior("EXPLICIT_ONLY", 1);
    EXPLICIT_ONLY = localFlushBehavior2;
    $VALUES = new FlushBehavior[] { localFlushBehavior1, localFlushBehavior2 };
  }
  
  private AppEventsLogger$FlushBehavior() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.FlushBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */