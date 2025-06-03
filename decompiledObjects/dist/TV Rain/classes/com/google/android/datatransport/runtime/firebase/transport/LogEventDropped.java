package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

public final class LogEventDropped
{
  private static final LogEventDropped DEFAULT_INSTANCE = new Builder().build();
  private final long events_dropped_count_;
  private final Reason reason_;
  
  public LogEventDropped(long paramLong, Reason paramReason)
  {
    events_dropped_count_ = paramLong;
    reason_ = paramReason;
  }
  
  public static LogEventDropped getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Protobuf(tag=1)
  public long getEventsDroppedCount()
  {
    return events_dropped_count_;
  }
  
  @Protobuf(tag=3)
  public Reason getReason()
  {
    return reason_;
  }
  
  public static final class Builder
  {
    private long events_dropped_count_ = 0L;
    private LogEventDropped.Reason reason_ = LogEventDropped.Reason.REASON_UNKNOWN;
    
    public LogEventDropped build()
    {
      return new LogEventDropped(events_dropped_count_, reason_);
    }
    
    public Builder setEventsDroppedCount(long paramLong)
    {
      events_dropped_count_ = paramLong;
      return this;
    }
    
    public Builder setReason(LogEventDropped.Reason paramReason)
    {
      reason_ = paramReason;
      return this;
    }
  }
  
  public static enum Reason
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
    
    private Reason(int paramInt)
    {
      number_ = paramInt;
    }
    
    public int getNumber()
    {
      return number_;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.LogEventDropped
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */