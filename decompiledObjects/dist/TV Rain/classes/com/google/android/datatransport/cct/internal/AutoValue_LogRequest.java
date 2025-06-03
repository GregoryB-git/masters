package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable.Field;
import java.util.List;
import z2;

final class AutoValue_LogRequest
  extends LogRequest
{
  private final ClientInfo clientInfo;
  private final List<LogEvent> logEvents;
  private final Integer logSource;
  private final String logSourceName;
  private final QosTier qosTier;
  private final long requestTimeMs;
  private final long requestUptimeMs;
  
  private AutoValue_LogRequest(long paramLong1, long paramLong2, @Nullable ClientInfo paramClientInfo, @Nullable Integer paramInteger, @Nullable String paramString, @Nullable List<LogEvent> paramList, @Nullable QosTier paramQosTier)
  {
    requestTimeMs = paramLong1;
    requestUptimeMs = paramLong2;
    clientInfo = paramClientInfo;
    logSource = paramInteger;
    logSourceName = paramString;
    logEvents = paramList;
    qosTier = paramQosTier;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof LogRequest))
    {
      paramObject = (LogRequest)paramObject;
      if ((requestTimeMs == ((LogRequest)paramObject).getRequestTimeMs()) && (requestUptimeMs == ((LogRequest)paramObject).getRequestUptimeMs()))
      {
        Object localObject = clientInfo;
        if (localObject == null ? ((LogRequest)paramObject).getClientInfo() == null : localObject.equals(((LogRequest)paramObject).getClientInfo()))
        {
          localObject = logSource;
          if (localObject == null ? ((LogRequest)paramObject).getLogSource() == null : ((Integer)localObject).equals(((LogRequest)paramObject).getLogSource()))
          {
            localObject = logSourceName;
            if (localObject == null ? ((LogRequest)paramObject).getLogSourceName() == null : ((String)localObject).equals(((LogRequest)paramObject).getLogSourceName()))
            {
              localObject = logEvents;
              if (localObject == null ? ((LogRequest)paramObject).getLogEvents() == null : ((List)localObject).equals(((LogRequest)paramObject).getLogEvents()))
              {
                localObject = qosTier;
                if (localObject == null ? ((LogRequest)paramObject).getQosTier() == null : localObject.equals(((LogRequest)paramObject).getQosTier())) {
                  break label202;
                }
              }
            }
          }
        }
      }
      bool = false;
      label202:
      return bool;
    }
    return false;
  }
  
  @Nullable
  public ClientInfo getClientInfo()
  {
    return clientInfo;
  }
  
  @Encodable.Field(name="logEvent")
  @Nullable
  public List<LogEvent> getLogEvents()
  {
    return logEvents;
  }
  
  @Nullable
  public Integer getLogSource()
  {
    return logSource;
  }
  
  @Nullable
  public String getLogSourceName()
  {
    return logSourceName;
  }
  
  @Nullable
  public QosTier getQosTier()
  {
    return qosTier;
  }
  
  public long getRequestTimeMs()
  {
    return requestTimeMs;
  }
  
  public long getRequestUptimeMs()
  {
    return requestUptimeMs;
  }
  
  public int hashCode()
  {
    long l = requestTimeMs;
    int i = (int)(l ^ l >>> 32);
    l = requestUptimeMs;
    int j = (int)(l >>> 32 ^ l);
    Object localObject = clientInfo;
    int k = 0;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = localObject.hashCode();
    }
    localObject = logSource;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((Integer)localObject).hashCode();
    }
    localObject = logSourceName;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = logEvents;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((List)localObject).hashCode();
    }
    localObject = qosTier;
    if (localObject != null) {
      k = localObject.hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("LogRequest{requestTimeMs=");
    localStringBuilder.append(requestTimeMs);
    localStringBuilder.append(", requestUptimeMs=");
    localStringBuilder.append(requestUptimeMs);
    localStringBuilder.append(", clientInfo=");
    localStringBuilder.append(clientInfo);
    localStringBuilder.append(", logSource=");
    localStringBuilder.append(logSource);
    localStringBuilder.append(", logSourceName=");
    localStringBuilder.append(logSourceName);
    localStringBuilder.append(", logEvents=");
    localStringBuilder.append(logEvents);
    localStringBuilder.append(", qosTier=");
    localStringBuilder.append(qosTier);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_LogRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */