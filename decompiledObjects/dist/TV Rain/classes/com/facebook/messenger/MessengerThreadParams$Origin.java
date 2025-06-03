package com.facebook.messenger;

public enum MessengerThreadParams$Origin
{
  static
  {
    Origin localOrigin1 = new Origin("REPLY_FLOW", 0);
    REPLY_FLOW = localOrigin1;
    Origin localOrigin2 = new Origin("COMPOSE_FLOW", 1);
    COMPOSE_FLOW = localOrigin2;
    Origin localOrigin3 = new Origin("UNKNOWN", 2);
    UNKNOWN = localOrigin3;
    $VALUES = new Origin[] { localOrigin1, localOrigin2, localOrigin3 };
  }
  
  private MessengerThreadParams$Origin() {}
}

/* Location:
 * Qualified Name:     com.facebook.messenger.MessengerThreadParams.Origin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */