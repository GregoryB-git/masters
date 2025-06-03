package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonAuthCredential$Builder
{
  private String accessToken;
  private Long nativeId;
  private String providerId;
  private String signInMethod;
  
  public GeneratedAndroidFirebaseAuth.PigeonAuthCredential build()
  {
    GeneratedAndroidFirebaseAuth.PigeonAuthCredential localPigeonAuthCredential = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential();
    localPigeonAuthCredential.setProviderId(providerId);
    localPigeonAuthCredential.setSignInMethod(signInMethod);
    localPigeonAuthCredential.setNativeId(nativeId);
    localPigeonAuthCredential.setAccessToken(accessToken);
    return localPigeonAuthCredential;
  }
  
  public Builder setAccessToken(String paramString)
  {
    accessToken = paramString;
    return this;
  }
  
  public Builder setNativeId(Long paramLong)
  {
    nativeId = paramLong;
    return this;
  }
  
  public Builder setProviderId(String paramString)
  {
    providerId = paramString;
    return this;
  }
  
  public Builder setSignInMethod(String paramString)
  {
    signInMethod = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */