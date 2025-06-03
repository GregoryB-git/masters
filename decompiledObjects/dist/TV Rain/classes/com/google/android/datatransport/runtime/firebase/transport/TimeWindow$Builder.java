package com.google.android.datatransport.runtime.firebase.transport;

public final class TimeWindow$Builder
{
  private long end_ms_ = 0L;
  private long start_ms_ = 0L;
  
  public TimeWindow build()
  {
    return new TimeWindow(start_ms_, end_ms_);
  }
  
  public Builder setEndMs(long paramLong)
  {
    end_ms_ = paramLong;
    return this;
  }
  
  public Builder setStartMs(long paramLong)
  {
    start_ms_ = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.TimeWindow.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */