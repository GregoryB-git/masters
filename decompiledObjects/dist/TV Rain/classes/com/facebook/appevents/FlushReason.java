package com.facebook.appevents;

 enum FlushReason
{
  static
  {
    FlushReason localFlushReason1 = new FlushReason("EXPLICIT", 0);
    EXPLICIT = localFlushReason1;
    FlushReason localFlushReason2 = new FlushReason("TIMER", 1);
    TIMER = localFlushReason2;
    FlushReason localFlushReason3 = new FlushReason("SESSION_CHANGE", 2);
    SESSION_CHANGE = localFlushReason3;
    FlushReason localFlushReason4 = new FlushReason("PERSISTED_EVENTS", 3);
    PERSISTED_EVENTS = localFlushReason4;
    FlushReason localFlushReason5 = new FlushReason("EVENT_THRESHOLD", 4);
    EVENT_THRESHOLD = localFlushReason5;
    FlushReason localFlushReason6 = new FlushReason("EAGER_FLUSHING_EVENT", 5);
    EAGER_FLUSHING_EVENT = localFlushReason6;
    $VALUES = new FlushReason[] { localFlushReason1, localFlushReason2, localFlushReason3, localFlushReason4, localFlushReason5, localFlushReason6 };
  }
  
  private FlushReason() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.FlushReason
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */