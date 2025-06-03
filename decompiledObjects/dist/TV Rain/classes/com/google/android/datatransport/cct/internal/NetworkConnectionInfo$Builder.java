package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class NetworkConnectionInfo$Builder
{
  @NonNull
  public abstract NetworkConnectionInfo build();
  
  @NonNull
  public abstract Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype paramMobileSubtype);
  
  @NonNull
  public abstract Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType paramNetworkType);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */