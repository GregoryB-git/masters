package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics
{
  private static final ClientMetrics DEFAULT_INSTANCE = new Builder().build();
  private final String app_namespace_;
  private final GlobalMetrics global_metrics_;
  private final List<LogSourceMetrics> log_source_metrics_;
  private final TimeWindow window_;
  
  public ClientMetrics(TimeWindow paramTimeWindow, List<LogSourceMetrics> paramList, GlobalMetrics paramGlobalMetrics, String paramString)
  {
    window_ = paramTimeWindow;
    log_source_metrics_ = paramList;
    global_metrics_ = paramGlobalMetrics;
    app_namespace_ = paramString;
  }
  
  public static ClientMetrics getDefaultInstance()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Protobuf(tag=4)
  public String getAppNamespace()
  {
    return app_namespace_;
  }
  
  @Encodable.Ignore
  public GlobalMetrics getGlobalMetrics()
  {
    GlobalMetrics localGlobalMetrics1 = global_metrics_;
    GlobalMetrics localGlobalMetrics2 = localGlobalMetrics1;
    if (localGlobalMetrics1 == null) {
      localGlobalMetrics2 = GlobalMetrics.getDefaultInstance();
    }
    return localGlobalMetrics2;
  }
  
  @Encodable.Field(name="globalMetrics")
  @Protobuf(tag=3)
  public GlobalMetrics getGlobalMetricsInternal()
  {
    return global_metrics_;
  }
  
  @Encodable.Field(name="logSourceMetrics")
  @Protobuf(tag=2)
  public List<LogSourceMetrics> getLogSourceMetricsList()
  {
    return log_source_metrics_;
  }
  
  @Encodable.Ignore
  public TimeWindow getWindow()
  {
    TimeWindow localTimeWindow1 = window_;
    TimeWindow localTimeWindow2 = localTimeWindow1;
    if (localTimeWindow1 == null) {
      localTimeWindow2 = TimeWindow.getDefaultInstance();
    }
    return localTimeWindow2;
  }
  
  @Encodable.Field(name="window")
  @Protobuf(tag=1)
  public TimeWindow getWindowInternal()
  {
    return window_;
  }
  
  public byte[] toByteArray()
  {
    return ProtoEncoderDoNotUse.encode(this);
  }
  
  public void writeTo(OutputStream paramOutputStream)
    throws IOException
  {
    ProtoEncoderDoNotUse.encode(this, paramOutputStream);
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.firebase.transport.ClientMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */