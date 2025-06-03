package io.flutter.plugins.firebase.auth;

import java.util.List;
import java.util.Map;

public abstract interface GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi
{
  public abstract void applyActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void checkActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo> paramResult);
  
  public abstract void confirmPasswordReset(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void createUserWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void fetchSignInMethodsForEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<List<String>> paramResult);
  
  public abstract void registerAuthStateListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  
  public abstract void registerIdTokenListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  
  public abstract void revokeTokenWithAuthorizationCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void sendPasswordResetEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void sendSignInLinkToEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void setLanguageCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  
  public abstract void setSettings(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings paramPigeonFirebaseAuthSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void signInAnonymously(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signInWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signInWithCustomToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signInWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signInWithEmailLink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signInWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  
  public abstract void signOut(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void useEmulator(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, Long paramLong, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  
  public abstract void verifyPasswordResetCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  
  public abstract void verifyPhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest paramPigeonVerifyPhoneNumberRequest, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */