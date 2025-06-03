package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonUserInfo$Builder
{
  private Long creationTimestamp;
  private String displayName;
  private String email;
  private Boolean isAnonymous;
  private Boolean isEmailVerified;
  private Long lastSignInTimestamp;
  private String phoneNumber;
  private String photoUrl;
  private String providerId;
  private String refreshToken;
  private String tenantId;
  private String uid;
  
  public GeneratedAndroidFirebaseAuth.PigeonUserInfo build()
  {
    GeneratedAndroidFirebaseAuth.PigeonUserInfo localPigeonUserInfo = new GeneratedAndroidFirebaseAuth.PigeonUserInfo();
    localPigeonUserInfo.setUid(uid);
    localPigeonUserInfo.setEmail(email);
    localPigeonUserInfo.setDisplayName(displayName);
    localPigeonUserInfo.setPhotoUrl(photoUrl);
    localPigeonUserInfo.setPhoneNumber(phoneNumber);
    localPigeonUserInfo.setIsAnonymous(isAnonymous);
    localPigeonUserInfo.setIsEmailVerified(isEmailVerified);
    localPigeonUserInfo.setProviderId(providerId);
    localPigeonUserInfo.setTenantId(tenantId);
    localPigeonUserInfo.setRefreshToken(refreshToken);
    localPigeonUserInfo.setCreationTimestamp(creationTimestamp);
    localPigeonUserInfo.setLastSignInTimestamp(lastSignInTimestamp);
    return localPigeonUserInfo;
  }
  
  public Builder setCreationTimestamp(Long paramLong)
  {
    creationTimestamp = paramLong;
    return this;
  }
  
  public Builder setDisplayName(String paramString)
  {
    displayName = paramString;
    return this;
  }
  
  public Builder setEmail(String paramString)
  {
    email = paramString;
    return this;
  }
  
  public Builder setIsAnonymous(Boolean paramBoolean)
  {
    isAnonymous = paramBoolean;
    return this;
  }
  
  public Builder setIsEmailVerified(Boolean paramBoolean)
  {
    isEmailVerified = paramBoolean;
    return this;
  }
  
  public Builder setLastSignInTimestamp(Long paramLong)
  {
    lastSignInTimestamp = paramLong;
    return this;
  }
  
  public Builder setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
    return this;
  }
  
  public Builder setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
    return this;
  }
  
  public Builder setProviderId(String paramString)
  {
    providerId = paramString;
    return this;
  }
  
  public Builder setRefreshToken(String paramString)
  {
    refreshToken = paramString;
    return this;
  }
  
  public Builder setTenantId(String paramString)
  {
    tenantId = paramString;
    return this;
  }
  
  public Builder setUid(String paramString)
  {
    uid = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */