package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class AutoValue_ClientInfo$Builder
  extends ClientInfo.Builder
{
  private AndroidClientInfo androidClientInfo;
  private ClientInfo.ClientType clientType;
  
  public ClientInfo build()
  {
    return new AutoValue_ClientInfo(clientType, androidClientInfo, null);
  }
  
  public ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo paramAndroidClientInfo)
  {
    androidClientInfo = paramAndroidClientInfo;
    return this;
  }
  
  public ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType paramClientType)
  {
    clientType = paramClientType;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */