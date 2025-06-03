package com.facebook.internal;

import androidx.annotation.Nullable;

public class NativeProtocol$ProtocolVersionQueryResult
{
  private NativeProtocol.NativeAppInfo nativeAppInfo;
  private int protocolVersion;
  
  public static ProtocolVersionQueryResult create(NativeProtocol.NativeAppInfo paramNativeAppInfo, int paramInt)
  {
    ProtocolVersionQueryResult localProtocolVersionQueryResult = new ProtocolVersionQueryResult();
    nativeAppInfo = paramNativeAppInfo;
    protocolVersion = paramInt;
    return localProtocolVersionQueryResult;
  }
  
  public static ProtocolVersionQueryResult createEmpty()
  {
    ProtocolVersionQueryResult localProtocolVersionQueryResult = new ProtocolVersionQueryResult();
    protocolVersion = -1;
    return localProtocolVersionQueryResult;
  }
  
  @Nullable
  public NativeProtocol.NativeAppInfo getAppInfo()
  {
    return nativeAppInfo;
  }
  
  public int getProtocolVersion()
  {
    return protocolVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */