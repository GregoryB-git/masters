package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonTotpSecret$Builder
{
  private Long codeIntervalSeconds;
  private Long codeLength;
  private Long enrollmentCompletionDeadline;
  private String hashingAlgorithm;
  private String secretKey;
  
  public GeneratedAndroidFirebaseAuth.PigeonTotpSecret build()
  {
    GeneratedAndroidFirebaseAuth.PigeonTotpSecret localPigeonTotpSecret = new GeneratedAndroidFirebaseAuth.PigeonTotpSecret();
    localPigeonTotpSecret.setCodeIntervalSeconds(codeIntervalSeconds);
    localPigeonTotpSecret.setCodeLength(codeLength);
    localPigeonTotpSecret.setEnrollmentCompletionDeadline(enrollmentCompletionDeadline);
    localPigeonTotpSecret.setHashingAlgorithm(hashingAlgorithm);
    localPigeonTotpSecret.setSecretKey(secretKey);
    return localPigeonTotpSecret;
  }
  
  public Builder setCodeIntervalSeconds(Long paramLong)
  {
    codeIntervalSeconds = paramLong;
    return this;
  }
  
  public Builder setCodeLength(Long paramLong)
  {
    codeLength = paramLong;
    return this;
  }
  
  public Builder setEnrollmentCompletionDeadline(Long paramLong)
  {
    enrollmentCompletionDeadline = paramLong;
    return this;
  }
  
  public Builder setHashingAlgorithm(String paramString)
  {
    hashingAlgorithm = paramString;
    return this;
  }
  
  public Builder setSecretKey(String paramString)
  {
    secretKey = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonTotpSecret.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */