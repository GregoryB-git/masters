package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonUserCredential$Builder
{
  private GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo additionalUserInfo;
  private GeneratedAndroidFirebaseAuth.PigeonAuthCredential credential;
  private GeneratedAndroidFirebaseAuth.PigeonUserDetails user;
  
  public GeneratedAndroidFirebaseAuth.PigeonUserCredential build()
  {
    GeneratedAndroidFirebaseAuth.PigeonUserCredential localPigeonUserCredential = new GeneratedAndroidFirebaseAuth.PigeonUserCredential();
    localPigeonUserCredential.setUser(user);
    localPigeonUserCredential.setAdditionalUserInfo(additionalUserInfo);
    localPigeonUserCredential.setCredential(credential);
    return localPigeonUserCredential;
  }
  
  public Builder setAdditionalUserInfo(GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo paramPigeonAdditionalUserInfo)
  {
    additionalUserInfo = paramPigeonAdditionalUserInfo;
    return this;
  }
  
  public Builder setCredential(GeneratedAndroidFirebaseAuth.PigeonAuthCredential paramPigeonAuthCredential)
  {
    credential = paramPigeonAuthCredential;
    return this;
  }
  
  public Builder setUser(GeneratedAndroidFirebaseAuth.PigeonUserDetails paramPigeonUserDetails)
  {
    user = paramPigeonUserDetails;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */