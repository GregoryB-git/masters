package com.facebook.messenger;

import java.util.List;

public class MessengerThreadParams
{
  public final String metadata;
  public final Origin origin;
  public final List<String> participants;
  public final String threadToken;
  
  public MessengerThreadParams(Origin paramOrigin, String paramString1, String paramString2, List<String> paramList)
  {
    threadToken = paramString1;
    metadata = paramString2;
    participants = paramList;
    origin = paramOrigin;
  }
  
  public static enum Origin
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
    
    private Origin() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.messenger.MessengerThreadParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */