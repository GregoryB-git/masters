package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonFirebaseAuthSettings$Builder
{
  private Boolean appVerificationDisabledForTesting;
  private Boolean forceRecaptchaFlow;
  private String phoneNumber;
  private String smsCode;
  private String userAccessGroup;
  
  public GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings build()
  {
    GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings localPigeonFirebaseAuthSettings = new GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings();
    localPigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting(appVerificationDisabledForTesting);
    localPigeonFirebaseAuthSettings.setUserAccessGroup(userAccessGroup);
    localPigeonFirebaseAuthSettings.setPhoneNumber(phoneNumber);
    localPigeonFirebaseAuthSettings.setSmsCode(smsCode);
    localPigeonFirebaseAuthSettings.setForceRecaptchaFlow(forceRecaptchaFlow);
    return localPigeonFirebaseAuthSettings;
  }
  
  public Builder setAppVerificationDisabledForTesting(Boolean paramBoolean)
  {
    appVerificationDisabledForTesting = paramBoolean;
    return this;
  }
  
  public Builder setForceRecaptchaFlow(Boolean paramBoolean)
  {
    forceRecaptchaFlow = paramBoolean;
    return this;
  }
  
  public Builder setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
    return this;
  }
  
  public Builder setSmsCode(String paramString)
  {
    smsCode = paramString;
    return this;
  }
  
  public Builder setUserAccessGroup(String paramString)
  {
    userAccessGroup = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */