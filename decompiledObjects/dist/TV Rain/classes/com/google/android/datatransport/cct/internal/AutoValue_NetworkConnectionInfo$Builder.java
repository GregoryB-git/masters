package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class AutoValue_NetworkConnectionInfo$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */