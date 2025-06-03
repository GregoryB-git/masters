package com.google.android.datatransport.runtime.firebase.transport;

public final class LogEventDropped$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */