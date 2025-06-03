package com.google.android.datatransport.runtime;

import com.google.auto.value.AutoValue.Builder;
import java.util.Map;

@AutoValue.Builder
public abstract class EventInternal$Builder
{
  public final Builder addMetadata(String paramString, int paramInt)
  {
    getAutoMetadata().put(paramString, String.valueOf(paramInt));
    return this;
  }
  
  public final Builder addMetadata(String paramString, long paramLong)
  {
    getAutoMetadata().put(paramString, String.valueOf(paramLong));
    return this;
  }
  
  public final Builder addMetadata(String paramString1, String paramString2)
  {
    getAutoMetadata().put(paramString1, paramString2);
    return this;
  }
  
  public abstract EventInternal build();
  
  public abstract Map<String, String> getAutoMetadata();
  
  public abstract Builder setAutoMetadata(Map<String, String> paramMap);
  
  public abstract Builder setCode(Integer paramInteger);
  
  public abstract Builder setEncodedPayload(EncodedPayload paramEncodedPayload);
  
  public abstract Builder setEventMillis(long paramLong);
  
  public abstract Builder setTransportName(String paramString);
  
  public abstract Builder setUptimeMillis(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.EventInternal.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */