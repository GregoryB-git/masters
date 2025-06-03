package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

public final class TimeWindow
{
  private static final TimeWindow DEFAULT_INSTANCE = new Builder().build();
  private final long end_ms_;
  private final long start_ms_;
  
  public TimeWindow(long paramLong1, long paramLong2)
  {
    start_ms_ = paramLong1;
    end_ms_ = paramLong2;
  }
  
  public static TimeWindow getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Protobuf(tag=2)
  public long getEndMs()
  {
    return end_ms_;
  }
  
  @Protobuf(tag=1)
  public long getStartMs()
  {
    return start_ms_;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.TimeWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */