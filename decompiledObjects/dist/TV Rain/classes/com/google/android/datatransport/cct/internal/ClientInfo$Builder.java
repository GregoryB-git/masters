package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class ClientInfo$Builder
{
  @NonNull
  public abstract ClientInfo build();
  
  @NonNull
  public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo paramAndroidClientInfo);
  
  @NonNull
  public abstract Builder setClientType(@Nullable ClientInfo.ClientType paramClientType);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.ClientInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */