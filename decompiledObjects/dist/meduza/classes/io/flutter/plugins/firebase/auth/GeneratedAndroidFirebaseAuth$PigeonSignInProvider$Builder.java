package io.flutter.plugins.firebase.auth;

import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonSignInProvider$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonSignInProvider.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */