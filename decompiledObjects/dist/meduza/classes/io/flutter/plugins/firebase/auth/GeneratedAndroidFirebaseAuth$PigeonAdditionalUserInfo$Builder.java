package io.flutter.plugins.firebase.auth;

import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonAdditionalUserInfo$Builder
{
  private String authorizationCode;
  private Boolean isNewUser;
  private Map<String, Object> profile;
  private String providerId;
  private String username;
  
  public GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo build()
  {
    GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo localPigeonAdditionalUserInfo = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo();
    localPigeonAdditionalUserInfo.setIsNewUser(isNewUser);
    localPigeonAdditionalUserInfo.setProviderId(providerId);
    localPigeonAdditionalUserInfo.setUsername(username);
    localPigeonAdditionalUserInfo.setAuthorizationCode(authorizationCode);
    localPigeonAdditionalUserInfo.setProfile(profile);
    return localPigeonAdditionalUserInfo;
  }
  
  public Builder setAuthorizationCode(String paramString)
  {
    authorizationCode = paramString;
    return this;
  }
  
  public Builder setIsNewUser(Boolean paramBoolean)
  {
    isNewUser = paramBoolean;
    return this;
  }
  
  public Builder setProfile(Map<String, Object> paramMap)
  {
    profile = paramMap;
    return this;
  }
  
  public Builder setProviderId(String paramString)
  {
    providerId = paramString;
    return this;
  }
  
  public Builder setUsername(String paramString)
  {
    username = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */