package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class LogEvent
{
  private static Builder builder()
  {
    return new AutoValue_LogEvent.Builder();
  }
  
  @NonNull
  public static Builder jsonBuilder(@NonNull String paramString)
  {
    return builder().setSourceExtensionJsonProto3(paramString);
  }
  
  @NonNull
  public static Builder protoBuilder(@NonNull byte[] paramArrayOfByte)
  {
    return builder().setSourceExtension(paramArrayOfByte);
  }
  
  @Nullable
  public abstract Integer getEventCode();
  
  public abstract long getEventTimeMs();
  
  public abstract long getEventUptimeMs();
  
  @Nullable
  public abstract NetworkConnectionInfo getNetworkConnectionInfo();
  
  @Nullable
  public abstract byte[] getSourceExtension();
  
  @Nullable
  public abstract String getSourceExtensionJsonProto3();
  
  public abstract long getTimezoneOffsetSeconds();
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    @NonNull
    public abstract LogEvent build();
    
    @NonNull
    public abstract Builder setEventCode(@Nullable Integer paramInteger);
    
    @NonNull
    public abstract Builder setEventTimeMs(long paramLong);
    
    @NonNull
    public abstract Builder setEventUptimeMs(long paramLong);
    
    @NonNull
    public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo paramNetworkConnectionInfo);
    
    @NonNull
    public abstract Builder setSourceExtension(@Nullable byte[] paramArrayOfByte);
    
    @NonNull
    public abstract Builder setSourceExtensionJsonProto3(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setTimezoneOffsetSeconds(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.LogEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */