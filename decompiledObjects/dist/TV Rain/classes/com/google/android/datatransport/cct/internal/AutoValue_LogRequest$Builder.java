package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.List;
import z2;

final class AutoValue_LogRequest$Builder
  extends LogRequest.Builder
{
  private ClientInfo clientInfo;
  private List<LogEvent> logEvents;
  private Integer logSource;
  private String logSourceName;
  private QosTier qosTier;
  private Long requestTimeMs;
  private Long requestUptimeMs;
  
  public LogRequest build()
  {
    String str1;
    if (requestTimeMs == null) {
      str1 = " requestTimeMs";
    } else {
      str1 = "";
    }
    String str2 = str1;
    if (requestUptimeMs == null) {
      str2 = z2.o(str1, " requestUptimeMs");
    }
    if (str2.isEmpty()) {
      return new AutoValue_LogRequest(requestTimeMs.longValue(), requestUptimeMs.longValue(), clientInfo, logSource, logSourceName, logEvents, qosTier, null);
    }
    throw new IllegalStateException(z2.o("Missing required properties:", str2));
  }
  
  public LogRequest.Builder setClientInfo(@Nullable ClientInfo paramClientInfo)
  {
    clientInfo = paramClientInfo;
    return this;
  }
  
  public LogRequest.Builder setLogEvents(@Nullable List<LogEvent> paramList)
  {
    logEvents = paramList;
    return this;
  }
  
  public LogRequest.Builder setLogSource(@Nullable Integer paramInteger)
  {
    logSource = paramInteger;
    return this;
  }
  
  public LogRequest.Builder setLogSourceName(@Nullable String paramString)
  {
    logSourceName = paramString;
    return this;
  }
  
  public LogRequest.Builder setQosTier(@Nullable QosTier paramQosTier)
  {
    qosTier = paramQosTier;
    return this;
  }
  
  public LogRequest.Builder setRequestTimeMs(long paramLong)
  {
    requestTimeMs = Long.valueOf(paramLong);
    return this;
  }
  
  public LogRequest.Builder setRequestUptimeMs(long paramLong)
  {
    requestUptimeMs = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_LogRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */