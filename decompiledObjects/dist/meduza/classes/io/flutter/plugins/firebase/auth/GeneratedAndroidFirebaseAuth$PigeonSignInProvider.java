package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonSignInProvider
{
  private Map<String, String> customParameters;
  private String providerId;
  private List<String> scopes;
  
  public static PigeonSignInProvider fromList(ArrayList<Object> paramArrayList)
  {
    PigeonSignInProvider localPigeonSignInProvider = new PigeonSignInProvider();
    localPigeonSignInProvider.setProviderId((String)paramArrayList.get(0));
    localPigeonSignInProvider.setScopes((List)paramArrayList.get(1));
    localPigeonSignInProvider.setCustomParameters((Map)paramArrayList.get(2));
    return localPigeonSignInProvider;
  }
  
  public Map<String, String> getCustomParameters()
  {
    return customParameters;
  }
  
  public String getProviderId()
  {
    return providerId;
  }
  
  public List<String> getScopes()
  {
    return scopes;
  }
  
  public void setCustomParameters(Map<String, String> paramMap)
  {
    customParameters = paramMap;
  }
  
  public void setProviderId(String paramString)
  {
    if (paramString != null)
    {
      providerId = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"providerId\" is null.");
  }
  
  public void setScopes(List<String> paramList)
  {
    scopes = paramList;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(providerId);
    localArrayList.add(scopes);
    localArrayList.add(customParameters);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Map<String, String> customParameters;
    private String providerId;
    private List<String> scopes;
    
    public GeneratedAndroidFirebaseAuth.PigeonSignInProvider build()
    {
      GeneratedAndroidFirebaseAuth.PigeonSignInProvider localPigeonSignInProvider = new GeneratedAndroidFirebaseAuth.PigeonSignInProvider();
      localPigeonSignInProvider.setProviderId(providerId);
      localPigeonSignInProvider.setScopes(scopes);
      localPigeonSignInProvider.setCustomParameters(customParameters);
      return localPigeonSignInProvider;
    }
    
    public Builder setCustomParameters(Map<String, String> paramMap)
    {
      customParameters = paramMap;
      return this;
    }
    
    public Builder setProviderId(String paramString)
    {
      providerId = paramString;
      return this;
    }
    
    public Builder setScopes(List<String> paramList)
    {
      scopes = paramList;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonSignInProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */