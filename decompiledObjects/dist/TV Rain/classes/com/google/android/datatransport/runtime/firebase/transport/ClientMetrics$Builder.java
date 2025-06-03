package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics$Builder
{
  private String app_namespace_ = "";
  private GlobalMetrics global_metrics_ = null;
  private List<LogSourceMetrics> log_source_metrics_ = new ArrayList();
  private TimeWindow window_ = null;
  
  public Builder addLogSourceMetrics(LogSourceMetrics paramLogSourceMetrics)
  {
    log_source_metrics_.add(paramLogSourceMetrics);
    return this;
  }
  
  public ClientMetrics build()
  {
    return new ClientMetrics(window_, Collections.unmodifiableList(log_source_metrics_), global_metrics_, app_namespace_);
  }
  
  public Builder setAppNamespace(String paramString)
  {
    app_namespace_ = paramString;
    return this;
  }
  
  public Builder setGlobalMetrics(GlobalMetrics paramGlobalMetrics)
  {
    global_metrics_ = paramGlobalMetrics;
    return this;
  }
  
  public Builder setLogSourceMetricsList(List<LogSourceMetrics> paramList)
  {
    log_source_metrics_ = paramList;
    return this;
  }
  
  public Builder setWindow(TimeWindow paramTimeWindow)
  {
    window_ = paramTimeWindow;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */