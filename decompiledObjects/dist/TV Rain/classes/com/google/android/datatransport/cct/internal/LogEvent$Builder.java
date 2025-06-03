package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class LogEvent$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.LogEvent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */