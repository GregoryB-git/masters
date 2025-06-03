package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;

public class ServerTrustChallenge
  extends URLAuthenticationChallenge
{
  public ServerTrustChallenge(URLProtectionSpace paramURLProtectionSpace)
  {
    super(paramURLProtectionSpace);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("ServerTrustChallenge{} ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */