package io.flutter.plugins.firebase.auth;

import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonIdTokenResult$Builder
{
  private Long authTimestamp;
  private Map<String, Object> claims;
  private Long expirationTimestamp;
  private Long issuedAtTimestamp;
  private String signInProvider;
  private String signInSecondFactor;
  private String token;
  
  public GeneratedAndroidFirebaseAuth.PigeonIdTokenResult build()
  {
    GeneratedAndroidFirebaseAuth.PigeonIdTokenResult localPigeonIdTokenResult = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult();
    localPigeonIdTokenResult.setToken(token);
    localPigeonIdTokenResult.setExpirationTimestamp(expirationTimestamp);
    localPigeonIdTokenResult.setAuthTimestamp(authTimestamp);
    localPigeonIdTokenResult.setIssuedAtTimestamp(issuedAtTimestamp);
    localPigeonIdTokenResult.setSignInProvider(signInProvider);
    localPigeonIdTokenResult.setClaims(claims);
    localPigeonIdTokenResult.setSignInSecondFactor(signInSecondFactor);
    return localPigeonIdTokenResult;
  }
  
  public Builder setAuthTimestamp(Long paramLong)
  {
    authTimestamp = paramLong;
    return this;
  }
  
  public Builder setClaims(Map<String, Object> paramMap)
  {
    claims = paramMap;
    return this;
  }
  
  public Builder setExpirationTimestamp(Long paramLong)
  {
    expirationTimestamp = paramLong;
    return this;
  }
  
  public Builder setIssuedAtTimestamp(Long paramLong)
  {
    issuedAtTimestamp = paramLong;
    return this;
  }
  
  public Builder setSignInProvider(String paramString)
  {
    signInProvider = paramString;
    return this;
  }
  
  public Builder setSignInSecondFactor(String paramString)
  {
    signInSecondFactor = paramString;
    return this;
  }
  
  public Builder setToken(String paramString)
  {
    token = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */