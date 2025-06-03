package com.facebook.appevents.ondeviceprocessing;

 enum RemoteServiceWrapper$EventType
{
  private String eventType;
  
  static
  {
    EventType localEventType1 = new EventType("MOBILE_APP_INSTALL", 0, "MOBILE_APP_INSTALL");
    MOBILE_APP_INSTALL = localEventType1;
    EventType localEventType2 = new EventType("CUSTOM_APP_EVENTS", 1, "CUSTOM_APP_EVENTS");
    CUSTOM_APP_EVENTS = localEventType2;
    $VALUES = new EventType[] { localEventType1, localEventType2 };
  }
  
  private RemoteServiceWrapper$EventType(String paramString)
  {
    eventType = paramString;
  }
  
  public String toString()
  {
    return eventType;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */