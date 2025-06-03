package io.flutter.plugins.firebase.auth;

import java.util.List;

public abstract interface GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi
{
  public abstract void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion paramPigeonPhoneMultiFactorAssertion, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> paramResult);
  
  public abstract void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> paramResult);
  
  public abstract void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */