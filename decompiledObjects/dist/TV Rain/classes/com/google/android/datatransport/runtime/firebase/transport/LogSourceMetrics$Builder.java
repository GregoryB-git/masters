package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */