package io.flutter.plugins.googlesignin;

import java.util.List;

public final class Messages$InitParams$Builder
{
  private String clientId;
  private Boolean forceCodeForRefreshToken;
  private String hostedDomain;
  private List<String> scopes;
  private String serverClientId;
  private Messages.SignInType signInType;
  
  public Messages.InitParams build()
  {
    Messages.InitParams localInitParams = new Messages.InitParams();
    localInitParams.setScopes(scopes);
    localInitParams.setSignInType(signInType);
    localInitParams.setHostedDomain(hostedDomain);
    localInitParams.setClientId(clientId);
    localInitParams.setServerClientId(serverClientId);
    localInitParams.setForceCodeForRefreshToken(forceCodeForRefreshToken);
    return localInitParams;
  }
  
  public Builder setClientId(String paramString)
  {
    clientId = paramString;
    return this;
  }
  
  public Builder setForceCodeForRefreshToken(Boolean paramBoolean)
  {
    forceCodeForRefreshToken = paramBoolean;
    return this;
  }
  
  public Builder setHostedDomain(String paramString)
  {
    hostedDomain = paramString;
    return this;
  }
  
  public Builder setScopes(List<String> paramList)
  {
    scopes = paramList;
    return this;
  }
  
  public Builder setServerClientId(String paramString)
  {
    serverClientId = paramString;
    return this;
  }
  
  public Builder setSignInType(Messages.SignInType paramSignInType)
  {
    signInType = paramSignInType;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.InitParams.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */