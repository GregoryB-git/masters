package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import z2;

final class AutoValue_LogEvent$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_LogEvent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */