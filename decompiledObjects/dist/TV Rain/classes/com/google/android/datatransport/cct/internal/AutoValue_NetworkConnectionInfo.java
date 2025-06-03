package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import z2;

final class AutoValue_NetworkConnectionInfo
  extends NetworkConnectionInfo
{
  private final NetworkConnectionInfo.MobileSubtype mobileSubtype;
  private final NetworkConnectionInfo.NetworkType networkType;
  
  private AutoValue_NetworkConnectionInfo(@Nullable NetworkConnectionInfo.NetworkType paramNetworkType, @Nullable NetworkConnectionInfo.MobileSubtype paramMobileSubtype)
  {
    networkType = paramNetworkType;
    mobileSubtype = paramMobileSubtype;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof NetworkConnectionInfo))
    {
      paramObject = (NetworkConnectionInfo)paramObject;
      Object localObject = networkType;
      if (localObject == null ? ((NetworkConnectionInfo)paramObject).getNetworkType() == null : localObject.equals(((NetworkConnectionInfo)paramObject).getNetworkType()))
      {
        localObject = mobileSubtype;
        if (localObject == null ? ((NetworkConnectionInfo)paramObject).getMobileSubtype() == null : localObject.equals(((NetworkConnectionInfo)paramObject).getMobileSubtype())) {}
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
  public NetworkConnectionInfo.MobileSubtype getMobileSubtype()
  {
    return mobileSubtype;
  }
  
  @Nullable
  public NetworkConnectionInfo.NetworkType getNetworkType()
  {
    return networkType;
  }
  
  public int hashCode()
  {
    Object localObject = networkType;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = mobileSubtype;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("NetworkConnectionInfo{networkType=");
    localStringBuilder.append(networkType);
    localStringBuilder.append(", mobileSubtype=");
    localStringBuilder.append(mobileSubtype);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
    extends NetworkConnectionInfo.Builder
  {
    private NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private NetworkConnectionInfo.NetworkType networkType;
    
    public NetworkConnectionInfo build()
    {
      return new AutoValue_NetworkConnectionInfo(networkType, mobileSubtype, null);
    }
    
    public NetworkConnectionInfo.Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype paramMobileSubtype)
    {
      mobileSubtype = paramMobileSubtype;
      return this;
    }
    
    public NetworkConnectionInfo.Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType paramNetworkType)
    {
      networkType = paramNetworkType;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */