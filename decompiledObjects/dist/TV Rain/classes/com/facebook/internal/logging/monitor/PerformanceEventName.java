package com.facebook.internal.logging.monitor;

import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public enum PerformanceEventName
{
  private String eventName;
  
  static
  {
    PerformanceEventName localPerformanceEventName1 = new PerformanceEventName("EVENT_NAME_FOR_TEST_FIRST", 0, "EVENT_NAME_FOR_TEST_FIRST");
    EVENT_NAME_FOR_TEST_FIRST = localPerformanceEventName1;
    PerformanceEventName localPerformanceEventName2 = new PerformanceEventName("EVENT_NAME_FOR_TEST_SECOND", 1, "EVENT_NAME_FOR_TEST_SECOND");
    EVENT_NAME_FOR_TEST_SECOND = localPerformanceEventName2;
    PerformanceEventName localPerformanceEventName3 = new PerformanceEventName("FB_CORE_STARTUP", 2, "FB_CORE_STARTUP");
    FB_CORE_STARTUP = localPerformanceEventName3;
    $VALUES = new PerformanceEventName[] { localPerformanceEventName1, localPerformanceEventName2, localPerformanceEventName3 };
  }
  
  private PerformanceEventName(String paramString)
  {
    eventName = paramString;
  }
  
  public String toString()
  {
    return eventName;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.PerformanceEventName
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */