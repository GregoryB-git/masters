package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

public enum LogEventDropped$Reason
  implements ProtoEnum
{
  private final int number_;
  
  static
  {
    Reason localReason1 = new Reason("REASON_UNKNOWN", 0, 0);
    REASON_UNKNOWN = localReason1;
    Reason localReason2 = new Reason("MESSAGE_TOO_OLD", 1, 1);
    MESSAGE_TOO_OLD = localReason2;
    Reason localReason3 = new Reason("CACHE_FULL", 2, 2);
    CACHE_FULL = localReason3;
    Reason localReason4 = new Reason("PAYLOAD_TOO_BIG", 3, 3);
    PAYLOAD_TOO_BIG = localReason4;
    Reason localReason5 = new Reason("MAX_RETRIES_REACHED", 4, 4);
    MAX_RETRIES_REACHED = localReason5;
    Reason localReason6 = new Reason("INVALID_PAYLOD", 5, 5);
    INVALID_PAYLOD = localReason6;
    Reason localReason7 = new Reason("SERVER_ERROR", 6, 6);
    SERVER_ERROR = localReason7;
    $VALUES = new Reason[] { localReason1, localReason2, localReason3, localReason4, localReason5, localReason6, localReason7 };
  }
  
  private LogEventDropped$Reason(int paramInt)
  {
    number_ = paramInt;
  }
  
  public int getNumber()
  {
    return number_;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */