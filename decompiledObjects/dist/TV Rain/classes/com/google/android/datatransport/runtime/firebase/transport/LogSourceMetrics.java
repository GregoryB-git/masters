package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics
{
  private static final LogSourceMetrics DEFAULT_INSTANCE = new Builder().build();
  private final List<LogEventDropped> log_event_dropped_;
  private final String log_source_;
  
  public LogSourceMetrics(String paramString, List<LogEventDropped> paramList)
  {
    log_source_ = paramString;
    log_event_dropped_ = paramList;
  }
  
  public static LogSourceMetrics getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Encodable.Field(name="logEventDropped")
  @Protobuf(tag=2)
  public List<LogEventDropped> getLogEventDroppedList()
  {
    return log_event_dropped_;
  }
  
  @Protobuf(tag=1)
  public String getLogSource()
  {
    return log_source_;
  }
  
  public static final class Builder
  {
    private List<LogEventDropped> log_event_dropped_ = new ArrayList();
    private String log_source_ = "";
    
    public Builder addLogEventDropped(LogEventDropped paramLogEventDropped)
    {
      log_event_dropped_.add(paramLogEventDropped);
      return this;
    }
    
    public LogSourceMetrics build()
    {
      return new LogSourceMetrics(log_source_, Collections.unmodifiableList(log_event_dropped_));
    }
    
    public Builder setLogEventDroppedList(List<LogEventDropped> paramList)
    {
      log_event_dropped_ = paramList;
      return this;
    }
    
    public Builder setLogSource(String paramString)
    {
      log_source_ = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */