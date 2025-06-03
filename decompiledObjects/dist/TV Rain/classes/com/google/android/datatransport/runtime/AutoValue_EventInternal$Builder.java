package com.google.android.datatransport.runtime;

import java.util.Map;
import z2;

final class AutoValue_EventInternal$Builder
  extends EventInternal.Builder
{
  private Map<String, String> autoMetadata;
  private Integer code;
  private EncodedPayload encodedPayload;
  private Long eventMillis;
  private String transportName;
  private Long uptimeMillis;
  
  public EventInternal build()
  {
    if (transportName == null) {
      localObject1 = " transportName";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (encodedPayload == null) {
      localObject2 = z2.o((String)localObject1, " encodedPayload");
    }
    Object localObject1 = localObject2;
    if (eventMillis == null) {
      localObject1 = z2.o((String)localObject2, " eventMillis");
    }
    localObject2 = localObject1;
    if (uptimeMillis == null) {
      localObject2 = z2.o((String)localObject1, " uptimeMillis");
    }
    localObject1 = localObject2;
    if (autoMetadata == null) {
      localObject1 = z2.o((String)localObject2, " autoMetadata");
    }
    if (((String)localObject1).isEmpty()) {
      return new AutoValue_EventInternal(transportName, code, encodedPayload, eventMillis.longValue(), uptimeMillis.longValue(), autoMetadata, null);
    }
    throw new IllegalStateException(z2.o("Missing required properties:", (String)localObject1));
  }
  
  public Map<String, String> getAutoMetadata()
  {
    Map localMap = autoMetadata;
    if (localMap != null) {
      return localMap;
    }
    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
  }
  
  public EventInternal.Builder setAutoMetadata(Map<String, String> paramMap)
  {
    if (paramMap != null)
    {
      autoMetadata = paramMap;
      return this;
    }
    throw new NullPointerException("Null autoMetadata");
  }
  
  public EventInternal.Builder setCode(Integer paramInteger)
  {
    code = paramInteger;
    return this;
  }
  
  public EventInternal.Builder setEncodedPayload(EncodedPayload paramEncodedPayload)
  {
    if (paramEncodedPayload != null)
    {
      encodedPayload = paramEncodedPayload;
      return this;
    }
    throw new NullPointerException("Null encodedPayload");
  }
  
  public EventInternal.Builder setEventMillis(long paramLong)
  {
    eventMillis = Long.valueOf(paramLong);
    return this;
  }
  
  public EventInternal.Builder setTransportName(String paramString)
  {
    if (paramString != null)
    {
      transportName = paramString;
      return this;
    }
    throw new NullPointerException("Null transportName");
  }
  
  public EventInternal.Builder setUptimeMillis(long paramLong)
  {
    uptimeMillis = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoValue_EventInternal.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */