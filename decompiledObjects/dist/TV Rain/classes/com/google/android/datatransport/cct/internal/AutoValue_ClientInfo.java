package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import z2;

final class AutoValue_ClientInfo
  extends ClientInfo
{
  private final AndroidClientInfo androidClientInfo;
  private final ClientInfo.ClientType clientType;
  
  private AutoValue_ClientInfo(@Nullable ClientInfo.ClientType paramClientType, @Nullable AndroidClientInfo paramAndroidClientInfo)
  {
    clientType = paramClientType;
    androidClientInfo = paramAndroidClientInfo;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ClientInfo))
    {
      paramObject = (ClientInfo)paramObject;
      Object localObject = clientType;
      if (localObject == null ? ((ClientInfo)paramObject).getClientType() == null : localObject.equals(((ClientInfo)paramObject).getClientType()))
      {
        localObject = androidClientInfo;
        if (localObject == null ? ((ClientInfo)paramObject).getAndroidClientInfo() == null : localObject.equals(((ClientInfo)paramObject).getAndroidClientInfo())) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  @Nullable
  public AndroidClientInfo getAndroidClientInfo()
  {
    return androidClientInfo;
  }
  
  @Nullable
  public ClientInfo.ClientType getClientType()
  {
    return clientType;
  }
  
  public int hashCode()
  {
    Object localObject = clientType;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = androidClientInfo;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ClientInfo{clientType=");
    localStringBuilder.append(clientType);
    localStringBuilder.append(", androidClientInfo=");
    localStringBuilder.append(androidClientInfo);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_ClientInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */