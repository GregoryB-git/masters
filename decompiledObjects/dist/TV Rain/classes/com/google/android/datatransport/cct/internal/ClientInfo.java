package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class ClientInfo
{
  @NonNull
  public static Builder builder()
  {
    return new AutoValue_ClientInfo.Builder();
  }
  
  @Nullable
  public abstract AndroidClientInfo getAndroidClientInfo();
  
  @Nullable
  public abstract ClientType getClientType();
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    @NonNull
    public abstract ClientInfo build();
    
    @NonNull
    public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo paramAndroidClientInfo);
    
    @NonNull
    public abstract Builder setClientType(@Nullable ClientInfo.ClientType paramClientType);
  }
  
  public static enum ClientType
  {
    private final int value;
    
    static
    {
      ClientType localClientType1 = new ClientType("UNKNOWN", 0, 0);
      UNKNOWN = localClientType1;
      ClientType localClientType2 = new ClientType("ANDROID_FIREBASE", 1, 23);
      ANDROID_FIREBASE = localClientType2;
      $VALUES = new ClientType[] { localClientType1, localClientType2 };
    }
    
    private ClientType(int paramInt)
    {
      value = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.ClientInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */