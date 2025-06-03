package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest$Builder
{
  private String autoRetrievedSmsCodeForTesting;
  private Long forceResendingToken;
  private String multiFactorInfoId;
  private String multiFactorSessionId;
  private String phoneNumber;
  private Long timeout;
  
  public GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest build()
  {
    GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest localPigeonVerifyPhoneNumberRequest = new GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest();
    localPigeonVerifyPhoneNumberRequest.setPhoneNumber(phoneNumber);
    localPigeonVerifyPhoneNumberRequest.setTimeout(timeout);
    localPigeonVerifyPhoneNumberRequest.setForceResendingToken(forceResendingToken);
    localPigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting(autoRetrievedSmsCodeForTesting);
    localPigeonVerifyPhoneNumberRequest.setMultiFactorInfoId(multiFactorInfoId);
    localPigeonVerifyPhoneNumberRequest.setMultiFactorSessionId(multiFactorSessionId);
    return localPigeonVerifyPhoneNumberRequest;
  }
  
  public Builder setAutoRetrievedSmsCodeForTesting(String paramString)
  {
    autoRetrievedSmsCodeForTesting = paramString;
    return this;
  }
  
  public Builder setForceResendingToken(Long paramLong)
  {
    forceResendingToken = paramLong;
    return this;
  }
  
  public Builder setMultiFactorInfoId(String paramString)
  {
    multiFactorInfoId = paramString;
    return this;
  }
  
  public Builder setMultiFactorSessionId(String paramString)
  {
    multiFactorSessionId = paramString;
    return this;
  }
  
  public Builder setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
    return this;
  }
  
  public Builder setTimeout(Long paramLong)
  {
    timeout = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */