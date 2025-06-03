package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;
import z2;

final class AutoValue_LogEvent
  extends LogEvent
{
  private final Integer eventCode;
  private final long eventTimeMs;
  private final long eventUptimeMs;
  private final NetworkConnectionInfo networkConnectionInfo;
  private final byte[] sourceExtension;
  private final String sourceExtensionJsonProto3;
  private final long timezoneOffsetSeconds;
  
  private AutoValue_LogEvent(long paramLong1, @Nullable Integer paramInteger, long paramLong2, @Nullable byte[] paramArrayOfByte, @Nullable String paramString, long paramLong3, @Nullable NetworkConnectionInfo paramNetworkConnectionInfo)
  {
    eventTimeMs = paramLong1;
    eventCode = paramInteger;
    eventUptimeMs = paramLong2;
    sourceExtension = paramArrayOfByte;
    sourceExtensionJsonProto3 = paramString;
    timezoneOffsetSeconds = paramLong3;
    networkConnectionInfo = paramNetworkConnectionInfo;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof LogEvent))
    {
      LogEvent localLogEvent = (LogEvent)paramObject;
      if (eventTimeMs == localLogEvent.getEventTimeMs())
      {
        paramObject = eventCode;
        if ((paramObject == null ? localLogEvent.getEventCode() == null : ((Integer)paramObject).equals(localLogEvent.getEventCode())) && (eventUptimeMs == localLogEvent.getEventUptimeMs()))
        {
          byte[] arrayOfByte = sourceExtension;
          if ((localLogEvent instanceof AutoValue_LogEvent)) {
            paramObject = sourceExtension;
          } else {
            paramObject = localLogEvent.getSourceExtension();
          }
          if (Arrays.equals(arrayOfByte, (byte[])paramObject))
          {
            paramObject = sourceExtensionJsonProto3;
            if ((paramObject == null ? localLogEvent.getSourceExtensionJsonProto3() == null : ((String)paramObject).equals(localLogEvent.getSourceExtensionJsonProto3())) && (timezoneOffsetSeconds == localLogEvent.getTimezoneOffsetSeconds()))
            {
              paramObject = networkConnectionInfo;
              if (paramObject == null ? localLogEvent.getNetworkConnectionInfo() == null : paramObject.equals(localLogEvent.getNetworkConnectionInfo())) {
                break label190;
              }
            }
          }
        }
      }
      bool = false;
      label190:
      return bool;
    }
    return false;
  }
  
  @Nullable
  public Integer getEventCode()
  {
    return eventCode;
  }
  
  public long getEventTimeMs()
  {
    return eventTimeMs;
  }
  
  public long getEventUptimeMs()
  {
    return eventUptimeMs;
  }
  
  @Nullable
  public NetworkConnectionInfo getNetworkConnectionInfo()
  {
    return networkConnectionInfo;
  }
  
  @Nullable
  public byte[] getSourceExtension()
  {
    return sourceExtension;
  }
  
  @Nullable
  public String getSourceExtensionJsonProto3()
  {
    return sourceExtensionJsonProto3;
  }
  
  public long getTimezoneOffsetSeconds()
  {
    return timezoneOffsetSeconds;
  }
  
  public int hashCode()
  {
    long l = eventTimeMs;
    int i = (int)(l ^ l >>> 32);
    Object localObject = eventCode;
    int j = 0;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((Integer)localObject).hashCode();
    }
    l = eventUptimeMs;
    int m = (int)(l ^ l >>> 32);
    int n = Arrays.hashCode(sourceExtension);
    localObject = sourceExtensionJsonProto3;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    l = timezoneOffsetSeconds;
    int i2 = (int)(l >>> 32 ^ l);
    localObject = networkConnectionInfo;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("LogEvent{eventTimeMs=");
    localStringBuilder.append(eventTimeMs);
    localStringBuilder.append(", eventCode=");
    localStringBuilder.append(eventCode);
    localStringBuilder.append(", eventUptimeMs=");
    localStringBuilder.append(eventUptimeMs);
    localStringBuilder.append(", sourceExtension=");
    localStringBuilder.append(Arrays.toString(sourceExtension));
    localStringBuilder.append(", sourceExtensionJsonProto3=");
    localStringBuilder.append(sourceExtensionJsonProto3);
    localStringBuilder.append(", timezoneOffsetSeconds=");
    localStringBuilder.append(timezoneOffsetSeconds);
    localStringBuilder.append(", networkConnectionInfo=");
    localStringBuilder.append(networkConnectionInfo);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
    extends LogEvent.Builder
  {
    private Integer eventCode;
    private Long eventTimeMs;
    private Long eventUptimeMs;
    private NetworkConnectionInfo networkConnectionInfo;
    private byte[] sourceExtension;
    private String sourceExtensionJsonProto3;
    private Long timezoneOffsetSeconds;
    
    public LogEvent build()
    {
      if (eventTimeMs == null) {
        localObject1 = " eventTimeMs";
      } else {
        localObject1 = "";
      }
      Object localObject2 = localObject1;
      if (eventUptimeMs == null) {
        localObject2 = z2.o((String)localObject1, " eventUptimeMs");
      }
      Object localObject1 = localObject2;
      if (timezoneOffsetSeconds == null) {
        localObject1 = z2.o((String)localObject2, " timezoneOffsetSeconds");
      }
      if (((String)localObject1).isEmpty()) {
        return new AutoValue_LogEvent(eventTimeMs.longValue(), eventCode, eventUptimeMs.longValue(), sourceExtension, sourceExtensionJsonProto3, timezoneOffsetSeconds.longValue(), networkConnectionInfo, null);
      }
      throw new IllegalStateException(z2.o("Missing required properties:", (String)localObject1));
    }
    
    public LogEvent.Builder setEventCode(@Nullable Integer paramInteger)
    {
      eventCode = paramInteger;
      return this;
    }
    
    public LogEvent.Builder setEventTimeMs(long paramLong)
    {
      eventTimeMs = Long.valueOf(paramLong);
      return this;
    }
    
    public LogEvent.Builder setEventUptimeMs(long paramLong)
    {
      eventUptimeMs = Long.valueOf(paramLong);
      return this;
    }
    
    public LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo paramNetworkConnectionInfo)
    {
      networkConnectionInfo = paramNetworkConnectionInfo;
      return this;
    }
    
    public LogEvent.Builder setSourceExtension(@Nullable byte[] paramArrayOfByte)
    {
      sourceExtension = paramArrayOfByte;
      return this;
    }
    
    public LogEvent.Builder setSourceExtensionJsonProto3(@Nullable String paramString)
    {
      sourceExtensionJsonProto3 = paramString;
      return this;
    }
    
    public LogEvent.Builder setTimezoneOffsetSeconds(long paramLong)
    {
      timezoneOffsetSeconds = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_LogEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */