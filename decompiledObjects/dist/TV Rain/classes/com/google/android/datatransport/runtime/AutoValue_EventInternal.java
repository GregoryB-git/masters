package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import java.util.Map;
import z2;

final class AutoValue_EventInternal
  extends EventInternal
{
  private final Map<String, String> autoMetadata;
  private final Integer code;
  private final EncodedPayload encodedPayload;
  private final long eventMillis;
  private final String transportName;
  private final long uptimeMillis;
  
  private AutoValue_EventInternal(String paramString, @Nullable Integer paramInteger, EncodedPayload paramEncodedPayload, long paramLong1, long paramLong2, Map<String, String> paramMap)
  {
    transportName = paramString;
    code = paramInteger;
    encodedPayload = paramEncodedPayload;
    eventMillis = paramLong1;
    uptimeMillis = paramLong2;
    autoMetadata = paramMap;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof EventInternal))
    {
      paramObject = (EventInternal)paramObject;
      if (transportName.equals(((EventInternal)paramObject).getTransportName()))
      {
        Integer localInteger = code;
        if ((localInteger == null ? ((EventInternal)paramObject).getCode() == null : localInteger.equals(((EventInternal)paramObject).getCode())) && (encodedPayload.equals(((EventInternal)paramObject).getEncodedPayload())) && (eventMillis == ((EventInternal)paramObject).getEventMillis()) && (uptimeMillis == ((EventInternal)paramObject).getUptimeMillis()) && (autoMetadata.equals(((EventInternal)paramObject).getAutoMetadata()))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Map<String, String> getAutoMetadata()
  {
    return autoMetadata;
  }
  
  @Nullable
  public Integer getCode()
  {
    return code;
  }
  
  public EncodedPayload getEncodedPayload()
  {
    return encodedPayload;
  }
  
  public long getEventMillis()
  {
    return eventMillis;
  }
  
  public String getTransportName()
  {
    return transportName;
  }
  
  public long getUptimeMillis()
  {
    return uptimeMillis;
  }
  
  public int hashCode()
  {
    int i = transportName.hashCode();
    Integer localInteger = code;
    int j;
    if (localInteger == null) {
      j = 0;
    } else {
      j = localInteger.hashCode();
    }
    int k = encodedPayload.hashCode();
    long l = eventMillis;
    int m = (int)(l ^ l >>> 32);
    l = uptimeMillis;
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ (int)(l ^ l >>> 32)) * 1000003 ^ autoMetadata.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("EventInternal{transportName=");
    localStringBuilder.append(transportName);
    localStringBuilder.append(", code=");
    localStringBuilder.append(code);
    localStringBuilder.append(", encodedPayload=");
    localStringBuilder.append(encodedPayload);
    localStringBuilder.append(", eventMillis=");
    localStringBuilder.append(eventMillis);
    localStringBuilder.append(", uptimeMillis=");
    localStringBuilder.append(uptimeMillis);
    localStringBuilder.append(", autoMetadata=");
    localStringBuilder.append(autoMetadata);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.AutoValue_EventInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */