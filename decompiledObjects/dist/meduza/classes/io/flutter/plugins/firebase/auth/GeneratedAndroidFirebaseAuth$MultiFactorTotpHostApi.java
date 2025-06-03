package io.flutter.plugins.firebase.auth;

public abstract interface GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi
{
  public abstract void generateSecret(String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> paramResult);
  
  public abstract void getAssertionForEnrollment(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  
  public abstract void getAssertionForSignIn(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */