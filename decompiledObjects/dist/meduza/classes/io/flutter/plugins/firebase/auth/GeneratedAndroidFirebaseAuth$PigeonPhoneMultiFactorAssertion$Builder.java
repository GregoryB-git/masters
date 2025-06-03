package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonPhoneMultiFactorAssertion$Builder
{
  private String verificationCode;
  private String verificationId;
  
  public GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion build()
  {
    GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion localPigeonPhoneMultiFactorAssertion = new GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion();
    localPigeonPhoneMultiFactorAssertion.setVerificationId(verificationId);
    localPigeonPhoneMultiFactorAssertion.setVerificationCode(verificationCode);
    return localPigeonPhoneMultiFactorAssertion;
  }
  
  public Builder setVerificationCode(String paramString)
  {
    verificationCode = paramString;
    return this;
  }
  
  public Builder setVerificationId(String paramString)
  {
    verificationId = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */