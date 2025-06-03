package io.flutter.plugins.googlesignin;

import java.util.ArrayList;
import java.util.List;

public final class Messages$InitParams
{
  private String clientId;
  private Boolean forceCodeForRefreshToken;
  private String hostedDomain;
  private List<String> scopes;
  private String serverClientId;
  private Messages.SignInType signInType;
  
  public static InitParams fromList(ArrayList<Object> paramArrayList)
  {
    InitParams localInitParams = new InitParams();
    localInitParams.setScopes((List)paramArrayList.get(0));
    Object localObject = paramArrayList.get(1);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Messages.SignInType.values()[((Integer)localObject).intValue()];
    }
    localInitParams.setSignInType((Messages.SignInType)localObject);
    localInitParams.setHostedDomain((String)paramArrayList.get(2));
    localInitParams.setClientId((String)paramArrayList.get(3));
    localInitParams.setServerClientId((String)paramArrayList.get(4));
    localInitParams.setForceCodeForRefreshToken((Boolean)paramArrayList.get(5));
    return localInitParams;
  }
  
  public String getClientId()
  {
    return clientId;
  }
  
  public Boolean getForceCodeForRefreshToken()
  {
    return forceCodeForRefreshToken;
  }
  
  public String getHostedDomain()
  {
    return hostedDomain;
  }
  
  public List<String> getScopes()
  {
    return scopes;
  }
  
  public String getServerClientId()
  {
    return serverClientId;
  }
  
  public Messages.SignInType getSignInType()
  {
    return signInType;
  }
  
  public void setClientId(String paramString)
  {
    clientId = paramString;
  }
  
  public void setForceCodeForRefreshToken(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      forceCodeForRefreshToken = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
  }
  
  public void setHostedDomain(String paramString)
  {
    hostedDomain = paramString;
  }
  
  public void setScopes(List<String> paramList)
  {
    if (paramList != null)
    {
      scopes = paramList;
      return;
    }
    throw new IllegalStateException("Nonnull field \"scopes\" is null.");
  }
  
  public void setServerClientId(String paramString)
  {
    serverClientId = paramString;
  }
  
  public void setSignInType(Messages.SignInType paramSignInType)
  {
    if (paramSignInType != null)
    {
      signInType = paramSignInType;
      return;
    }
    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(6);
    localArrayList.add(scopes);
    Object localObject = signInType;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Integer.valueOf(index);
    }
    localArrayList.add(localObject);
    localArrayList.add(hostedDomain);
    localArrayList.add(clientId);
    localArrayList.add(serverClientId);
    localArrayList.add(forceCodeForRefreshToken);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.InitParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */