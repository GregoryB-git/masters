package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonMultiFactorInfo$Builder
{
  private String displayName;
  private Double enrollmentTimestamp;
  private String factorId;
  private String phoneNumber;
  private String uid;
  
  public GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo build()
  {
    GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo localPigeonMultiFactorInfo = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo();
    localPigeonMultiFactorInfo.setDisplayName(displayName);
    localPigeonMultiFactorInfo.setEnrollmentTimestamp(enrollmentTimestamp);
    localPigeonMultiFactorInfo.setFactorId(factorId);
    localPigeonMultiFactorInfo.setUid(uid);
    localPigeonMultiFactorInfo.setPhoneNumber(phoneNumber);
    return localPigeonMultiFactorInfo;
  }
  
  public Builder setDisplayName(String paramString)
  {
    displayName = paramString;
    return this;
  }
  
  public Builder setEnrollmentTimestamp(Double paramDouble)
  {
    enrollmentTimestamp = paramDouble;
    return this;
  }
  
  public Builder setFactorId(String paramString)
  {
    factorId = paramString;
    return this;
  }
  
  public Builder setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
    return this;
  }
  
  public Builder setUid(String paramString)
  {
    uid = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */