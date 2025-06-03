package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import java.util.List;

@AutoValue.Builder
public abstract class LogRequest$Builder
{
  @NonNull
  public abstract LogRequest build();
  
  @NonNull
  public abstract Builder setClientInfo(@Nullable ClientInfo paramClientInfo);
  
  @NonNull
  public abstract Builder setLogEvents(@Nullable List<LogEvent> paramList);
  
  @NonNull
  public abstract Builder setLogSource(@Nullable Integer paramInteger);
  
  @NonNull
  public abstract Builder setLogSourceName(@Nullable String paramString);
  
  @NonNull
  public abstract Builder setQosTier(@Nullable QosTier paramQosTier);
  
  @NonNull
  public abstract Builder setRequestTimeMs(long paramLong);
  
  @NonNull
  public abstract Builder setRequestUptimeMs(long paramLong);
  
  @NonNull
  public Builder setSource(int paramInt)
  {
    return setLogSource(Integer.valueOf(paramInt));
  }
  
  @NonNull
  public Builder setSource(@NonNull String paramString)
  {
    return setLogSourceName(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.LogRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */