package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class EventInternal
{
  public static Builder builder()
  {
    return new AutoValue_EventInternal.Builder().setAutoMetadata(new HashMap());
  }
  
  public final String get(String paramString)
  {
    String str = (String)getAutoMetadata().get(paramString);
    paramString = str;
    if (str == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public abstract Map<String, String> getAutoMetadata();
  
  @Nullable
  public abstract Integer getCode();
  
  public abstract EncodedPayload getEncodedPayload();
  
  public abstract long getEventMillis();
  
  public final int getInteger(String paramString)
  {
    paramString = (String)getAutoMetadata().get(paramString);
    int i;
    if (paramString == null) {
      i = 0;
    } else {
      i = Integer.valueOf(paramString).intValue();
    }
    return i;
  }
  
  public final long getLong(String paramString)
  {
    paramString = (String)getAutoMetadata().get(paramString);
    long l;
    if (paramString == null) {
      l = 0L;
    } else {
      l = Long.valueOf(paramString).longValue();
    }
    return l;
  }
  
  public final Map<String, String> getMetadata()
  {
    return Collections.unmodifiableMap(getAutoMetadata());
  }
  
  public final String getOrDefault(String paramString1, String paramString2)
  {
    paramString1 = (String)getAutoMetadata().get(paramString1);
    if (paramString1 == null) {
      paramString1 = paramString2;
    }
    return paramString1;
  }
  
  @Deprecated
  public byte[] getPayload()
  {
    return getEncodedPayload().getBytes();
  }
  
  public abstract String getTransportName();
  
  public abstract long getUptimeMillis();
  
  public Builder toBuilder()
  {
    return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new HashMap(getAutoMetadata()));
  }
  
  @AutoValue.Builder
  public static abstract class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.EventInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */