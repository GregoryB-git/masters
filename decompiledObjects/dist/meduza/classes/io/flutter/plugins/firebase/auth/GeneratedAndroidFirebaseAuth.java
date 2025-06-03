package io.flutter.plugins.firebase.auth;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidFirebaseAuth
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static enum ActionCodeInfoOperation
  {
    public final int index;
    
    static
    {
      PASSWORD_RESET = new ActionCodeInfoOperation("PASSWORD_RESET", 1, 1);
      VERIFY_EMAIL = new ActionCodeInfoOperation("VERIFY_EMAIL", 2, 2);
      RECOVER_EMAIL = new ActionCodeInfoOperation("RECOVER_EMAIL", 3, 3);
      EMAIL_SIGN_IN = new ActionCodeInfoOperation("EMAIL_SIGN_IN", 4, 4);
      VERIFY_AND_CHANGE_EMAIL = new ActionCodeInfoOperation("VERIFY_AND_CHANGE_EMAIL", 5, 5);
      REVERT_SECOND_FACTOR_ADDITION = new ActionCodeInfoOperation("REVERT_SECOND_FACTOR_ADDITION", 6, 6);
    }
    
    private ActionCodeInfoOperation(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static final class AuthPigeonFirebaseApp
  {
    private String appName;
    private String customAuthDomain;
    private String tenantId;
    
    public static AuthPigeonFirebaseApp fromList(ArrayList<Object> paramArrayList)
    {
      AuthPigeonFirebaseApp localAuthPigeonFirebaseApp = new AuthPigeonFirebaseApp();
      localAuthPigeonFirebaseApp.setAppName((String)paramArrayList.get(0));
      localAuthPigeonFirebaseApp.setTenantId((String)paramArrayList.get(1));
      localAuthPigeonFirebaseApp.setCustomAuthDomain((String)paramArrayList.get(2));
      return localAuthPigeonFirebaseApp;
    }
    
    public String getAppName()
    {
      return appName;
    }
    
    public String getCustomAuthDomain()
    {
      return customAuthDomain;
    }
    
    public String getTenantId()
    {
      return tenantId;
    }
    
    public void setAppName(String paramString)
    {
      if (paramString != null)
      {
        appName = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"appName\" is null.");
    }
    
    public void setCustomAuthDomain(String paramString)
    {
      customAuthDomain = paramString;
    }
    
    public void setTenantId(String paramString)
    {
      tenantId = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(appName);
      localArrayList.add(tenantId);
      localArrayList.add(customAuthDomain);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String appName;
      private String customAuthDomain;
      private String tenantId;
      
      public GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp build()
      {
        GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp localAuthPigeonFirebaseApp = new GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp();
        localAuthPigeonFirebaseApp.setAppName(appName);
        localAuthPigeonFirebaseApp.setTenantId(tenantId);
        localAuthPigeonFirebaseApp.setCustomAuthDomain(customAuthDomain);
        return localAuthPigeonFirebaseApp;
      }
      
      public Builder setAppName(String paramString)
      {
        appName = paramString;
        return this;
      }
      
      public Builder setCustomAuthDomain(String paramString)
      {
        customAuthDomain = paramString;
        return this;
      }
      
      public Builder setTenantId(String paramString)
      {
        tenantId = paramString;
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.CLASS)
  @Target({java.lang.annotation.ElementType.METHOD})
  public static @interface CanIgnoreReturnValue {}
  
  public static abstract interface FirebaseAuthHostApi
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
  
  public static class FirebaseAuthHostApiCodec
    extends StandardMessageCodec
  {
    public static final FirebaseAuthHostApiCodec INSTANCE = new FirebaseAuthHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      switch (paramByte)
      {
      default: 
        return super.readValueOfType(paramByte, paramByteBuffer);
      case -111: 
        return GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest.fromList((ArrayList)readValue(paramByteBuffer));
      case -112: 
        return GeneratedAndroidFirebaseAuth.PigeonUserProfile.fromList((ArrayList)readValue(paramByteBuffer));
      case -113: 
        return GeneratedAndroidFirebaseAuth.PigeonUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -114: 
        return GeneratedAndroidFirebaseAuth.PigeonUserDetails.fromList((ArrayList)readValue(paramByteBuffer));
      case -115: 
        return GeneratedAndroidFirebaseAuth.PigeonUserCredential.fromList((ArrayList)readValue(paramByteBuffer));
      case -116: 
        return GeneratedAndroidFirebaseAuth.PigeonTotpSecret.fromList((ArrayList)readValue(paramByteBuffer));
      case -117: 
        return GeneratedAndroidFirebaseAuth.PigeonSignInProvider.fromList((ArrayList)readValue(paramByteBuffer));
      case -118: 
        return GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion.fromList((ArrayList)readValue(paramByteBuffer));
      case -119: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.fromList((ArrayList)readValue(paramByteBuffer));
      case -120: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -121: 
        return GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.fromList((ArrayList)readValue(paramByteBuffer));
      case -122: 
        return GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings.fromList((ArrayList)readValue(paramByteBuffer));
      case -123: 
        return GeneratedAndroidFirebaseAuth.PigeonAuthCredential.fromList((ArrayList)readValue(paramByteBuffer));
      case -124: 
        return GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -125: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings.fromList((ArrayList)readValue(paramByteBuffer));
      case -126: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.fromList((ArrayList)readValue(paramByteBuffer));
      case -127: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp))
      {
        paramByteArrayOutputStream.write(128);
        paramObject = ((GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp)paramObject).toList();
      }
      for (;;)
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label468;
        if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo))
        {
          paramByteArrayOutputStream.write(129);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData))
        {
          paramByteArrayOutputStream.write(130);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings))
        {
          paramByteArrayOutputStream.write(131);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo))
        {
          paramByteArrayOutputStream.write(132);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAuthCredential))
        {
          paramByteArrayOutputStream.write(133);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAuthCredential)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings))
        {
          paramByteArrayOutputStream.write(134);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonIdTokenResult))
        {
          paramByteArrayOutputStream.write(135);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonIdTokenResult)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo))
        {
          paramByteArrayOutputStream.write(136);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession))
        {
          paramByteArrayOutputStream.write(137);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion))
        {
          paramByteArrayOutputStream.write(138);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonSignInProvider))
        {
          paramByteArrayOutputStream.write(139);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonSignInProvider)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonTotpSecret))
        {
          paramByteArrayOutputStream.write(140);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonTotpSecret)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserCredential))
        {
          paramByteArrayOutputStream.write(141);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserCredential)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserDetails))
        {
          paramByteArrayOutputStream.write(142);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserDetails)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserInfo))
        {
          paramByteArrayOutputStream.write(143);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserInfo)paramObject).toList();
        }
        else
        {
          if (!(paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserProfile)) {
            break;
          }
          paramByteArrayOutputStream.write(144);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserProfile)paramObject).toList();
        }
      }
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest))
      {
        paramByteArrayOutputStream.write(145);
        paramObject = ((GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest)paramObject).toList();
      }
      try
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label468;
        super.writeValue(paramByteArrayOutputStream, paramObject);
        label468:
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface FirebaseAuthUserHostApi
  {
    public abstract void delete(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
    
    public abstract void getIdToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Boolean paramBoolean, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> paramResult);
    
    public abstract void linkWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
    
    public abstract void linkWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
    
    public abstract void reauthenticateWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
    
    public abstract void reauthenticateWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
    
    public abstract void reload(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult);
    
    public abstract void sendEmailVerification(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
    
    public abstract void unlink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
    
    public abstract void updateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult);
    
    public abstract void updatePassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult);
    
    public abstract void updatePhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult);
    
    public abstract void updateProfile(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonUserProfile paramPigeonUserProfile, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult);
    
    public abstract void verifyBeforeUpdateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  }
  
  public static class FirebaseAuthUserHostApiCodec
    extends StandardMessageCodec
  {
    public static final FirebaseAuthUserHostApiCodec INSTANCE = new FirebaseAuthUserHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      switch (paramByte)
      {
      default: 
        return super.readValueOfType(paramByte, paramByteBuffer);
      case -111: 
        return GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest.fromList((ArrayList)readValue(paramByteBuffer));
      case -112: 
        return GeneratedAndroidFirebaseAuth.PigeonUserProfile.fromList((ArrayList)readValue(paramByteBuffer));
      case -113: 
        return GeneratedAndroidFirebaseAuth.PigeonUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -114: 
        return GeneratedAndroidFirebaseAuth.PigeonUserDetails.fromList((ArrayList)readValue(paramByteBuffer));
      case -115: 
        return GeneratedAndroidFirebaseAuth.PigeonUserCredential.fromList((ArrayList)readValue(paramByteBuffer));
      case -116: 
        return GeneratedAndroidFirebaseAuth.PigeonTotpSecret.fromList((ArrayList)readValue(paramByteBuffer));
      case -117: 
        return GeneratedAndroidFirebaseAuth.PigeonSignInProvider.fromList((ArrayList)readValue(paramByteBuffer));
      case -118: 
        return GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion.fromList((ArrayList)readValue(paramByteBuffer));
      case -119: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.fromList((ArrayList)readValue(paramByteBuffer));
      case -120: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -121: 
        return GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.fromList((ArrayList)readValue(paramByteBuffer));
      case -122: 
        return GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings.fromList((ArrayList)readValue(paramByteBuffer));
      case -123: 
        return GeneratedAndroidFirebaseAuth.PigeonAuthCredential.fromList((ArrayList)readValue(paramByteBuffer));
      case -124: 
        return GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -125: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings.fromList((ArrayList)readValue(paramByteBuffer));
      case -126: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.fromList((ArrayList)readValue(paramByteBuffer));
      case -127: 
        return GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp))
      {
        paramByteArrayOutputStream.write(128);
        paramObject = ((GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp)paramObject).toList();
      }
      for (;;)
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label468;
        if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo))
        {
          paramByteArrayOutputStream.write(129);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData))
        {
          paramByteArrayOutputStream.write(130);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings))
        {
          paramByteArrayOutputStream.write(131);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo))
        {
          paramByteArrayOutputStream.write(132);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAuthCredential))
        {
          paramByteArrayOutputStream.write(133);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAuthCredential)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings))
        {
          paramByteArrayOutputStream.write(134);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonIdTokenResult))
        {
          paramByteArrayOutputStream.write(135);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonIdTokenResult)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo))
        {
          paramByteArrayOutputStream.write(136);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession))
        {
          paramByteArrayOutputStream.write(137);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion))
        {
          paramByteArrayOutputStream.write(138);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonSignInProvider))
        {
          paramByteArrayOutputStream.write(139);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonSignInProvider)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonTotpSecret))
        {
          paramByteArrayOutputStream.write(140);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonTotpSecret)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserCredential))
        {
          paramByteArrayOutputStream.write(141);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserCredential)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserDetails))
        {
          paramByteArrayOutputStream.write(142);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserDetails)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserInfo))
        {
          paramByteArrayOutputStream.write(143);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserInfo)paramObject).toList();
        }
        else
        {
          if (!(paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserProfile)) {
            break;
          }
          paramByteArrayOutputStream.write(144);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserProfile)paramObject).toList();
        }
      }
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest))
      {
        paramByteArrayOutputStream.write(145);
        paramObject = ((GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest)paramObject).toList();
      }
      try
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label468;
        super.writeValue(paramByteArrayOutputStream, paramObject);
        label468:
        return;
      }
      finally {}
    }
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static abstract interface GenerateInterfaces
  {
    public abstract void pigeonInterface(GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo paramPigeonMultiFactorInfo);
  }
  
  public static class GenerateInterfacesCodec
    extends StandardMessageCodec
  {
    public static final GenerateInterfacesCodec INSTANCE = new GenerateInterfacesCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE) {
        return super.readValueOfType(paramByte, paramByteBuffer);
      }
      return GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo))
      {
        paramByteArrayOutputStream.write(128);
        writeValue(paramByteArrayOutputStream, ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo)paramObject).toList());
      }
      else
      {
        super.writeValue(paramByteArrayOutputStream, paramObject);
      }
    }
  }
  
  public static abstract interface MultiFactoResolverHostApi
  {
    public abstract void resolveSignIn(String paramString1, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion paramPigeonPhoneMultiFactorAssertion, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult);
  }
  
  public static class MultiFactoResolverHostApiCodec
    extends StandardMessageCodec
  {
    public static final MultiFactoResolverHostApiCodec INSTANCE = new MultiFactoResolverHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      switch (paramByte)
      {
      default: 
        return super.readValueOfType(paramByte, paramByteBuffer);
      case -123: 
        return GeneratedAndroidFirebaseAuth.PigeonUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
      case -124: 
        return GeneratedAndroidFirebaseAuth.PigeonUserDetails.fromList((ArrayList)readValue(paramByteBuffer));
      case -125: 
        return GeneratedAndroidFirebaseAuth.PigeonUserCredential.fromList((ArrayList)readValue(paramByteBuffer));
      case -126: 
        return GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion.fromList((ArrayList)readValue(paramByteBuffer));
      case -127: 
        return GeneratedAndroidFirebaseAuth.PigeonAuthCredential.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo))
      {
        paramByteArrayOutputStream.write(128);
        paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo)paramObject).toList();
      }
      for (;;)
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label168;
        if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonAuthCredential))
        {
          paramByteArrayOutputStream.write(129);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonAuthCredential)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion))
        {
          paramByteArrayOutputStream.write(130);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserCredential))
        {
          paramByteArrayOutputStream.write(131);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserCredential)paramObject).toList();
        }
        else
        {
          if (!(paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserDetails)) {
            break;
          }
          paramByteArrayOutputStream.write(132);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserDetails)paramObject).toList();
        }
      }
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonUserInfo))
      {
        paramByteArrayOutputStream.write(133);
        paramObject = ((GeneratedAndroidFirebaseAuth.PigeonUserInfo)paramObject).toList();
      }
      try
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        break label168;
        super.writeValue(paramByteArrayOutputStream, paramObject);
        label168:
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface MultiFactorTotpHostApi
  {
    public abstract void generateSecret(String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> paramResult);
    
    public abstract void getAssertionForEnrollment(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
    
    public abstract void getAssertionForSignIn(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
  }
  
  public static class MultiFactorTotpHostApiCodec
    extends StandardMessageCodec
  {
    public static final MultiFactorTotpHostApiCodec INSTANCE = new MultiFactorTotpHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE) {
        return super.readValueOfType(paramByte, paramByteBuffer);
      }
      return GeneratedAndroidFirebaseAuth.PigeonTotpSecret.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonTotpSecret))
      {
        paramByteArrayOutputStream.write(128);
        writeValue(paramByteArrayOutputStream, ((GeneratedAndroidFirebaseAuth.PigeonTotpSecret)paramObject).toList());
      }
      else
      {
        super.writeValue(paramByteArrayOutputStream, paramObject);
      }
    }
  }
  
  public static abstract interface MultiFactorTotpSecretHostApi
  {
    public abstract void generateQrCodeUrl(String paramString1, String paramString2, String paramString3, GeneratedAndroidFirebaseAuth.Result<String> paramResult);
    
    public abstract void openInOtpApp(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  }
  
  public static abstract interface MultiFactorUserHostApi
  {
    public abstract void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion paramPigeonPhoneMultiFactorAssertion, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
    
    public abstract void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
    
    public abstract void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> paramResult);
    
    public abstract void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> paramResult);
    
    public abstract void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult);
  }
  
  public static class MultiFactorUserHostApiCodec
    extends StandardMessageCodec
  {
    public static final MultiFactorUserHostApiCodec INSTANCE = new MultiFactorUserHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      switch (paramByte)
      {
      default: 
        return super.readValueOfType(paramByte, paramByteBuffer);
      case -125: 
        return GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion.fromList((ArrayList)readValue(paramByteBuffer));
      case -126: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.fromList((ArrayList)readValue(paramByteBuffer));
      case -127: 
        return GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp))
      {
        paramByteArrayOutputStream.write(128);
        paramObject = ((GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp)paramObject).toList();
      }
      for (;;)
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        return;
        if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo))
        {
          paramByteArrayOutputStream.write(129);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo)paramObject).toList();
        }
        else if ((paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession))
        {
          paramByteArrayOutputStream.write(130);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession)paramObject).toList();
        }
        else
        {
          if (!(paramObject instanceof GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion)) {
            break;
          }
          paramByteArrayOutputStream.write(131);
          paramObject = ((GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion)paramObject).toList();
        }
      }
      super.writeValue(paramByteArrayOutputStream, paramObject);
    }
  }
  
  public static abstract interface NullableResult<T>
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success(T paramT);
  }
  
  public static final class PigeonActionCodeInfo
  {
    private GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData data;
    private GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation operation;
    
    public static PigeonActionCodeInfo fromList(ArrayList<Object> paramArrayList)
    {
      PigeonActionCodeInfo localPigeonActionCodeInfo = new PigeonActionCodeInfo();
      Object localObject = paramArrayList.get(0);
      localPigeonActionCodeInfo.setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.values()[((Integer)localObject).intValue()]);
      localPigeonActionCodeInfo.setData((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData)paramArrayList.get(1));
      return localPigeonActionCodeInfo;
    }
    
    public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData getData()
    {
      return data;
    }
    
    public GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation getOperation()
    {
      return operation;
    }
    
    public void setData(GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData paramPigeonActionCodeInfoData)
    {
      if (paramPigeonActionCodeInfoData != null)
      {
        data = paramPigeonActionCodeInfoData;
        return;
      }
      throw new IllegalStateException("Nonnull field \"data\" is null.");
    }
    
    public void setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation paramActionCodeInfoOperation)
    {
      if (paramActionCodeInfoOperation != null)
      {
        operation = paramActionCodeInfoOperation;
        return;
      }
      throw new IllegalStateException("Nonnull field \"operation\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      Object localObject = operation;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Integer.valueOf(index);
      }
      localArrayList.add(localObject);
      localArrayList.add(data);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData data;
      private GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation operation;
      
      public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo build()
      {
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo localPigeonActionCodeInfo = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo();
        localPigeonActionCodeInfo.setOperation(operation);
        localPigeonActionCodeInfo.setData(data);
        return localPigeonActionCodeInfo;
      }
      
      public Builder setData(GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData paramPigeonActionCodeInfoData)
      {
        data = paramPigeonActionCodeInfoData;
        return this;
      }
      
      public Builder setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation paramActionCodeInfoOperation)
      {
        operation = paramActionCodeInfoOperation;
        return this;
      }
    }
  }
  
  public static final class PigeonActionCodeInfoData
  {
    private String email;
    private String previousEmail;
    
    public static PigeonActionCodeInfoData fromList(ArrayList<Object> paramArrayList)
    {
      PigeonActionCodeInfoData localPigeonActionCodeInfoData = new PigeonActionCodeInfoData();
      localPigeonActionCodeInfoData.setEmail((String)paramArrayList.get(0));
      localPigeonActionCodeInfoData.setPreviousEmail((String)paramArrayList.get(1));
      return localPigeonActionCodeInfoData;
    }
    
    public String getEmail()
    {
      return email;
    }
    
    public String getPreviousEmail()
    {
      return previousEmail;
    }
    
    public void setEmail(String paramString)
    {
      email = paramString;
    }
    
    public void setPreviousEmail(String paramString)
    {
      previousEmail = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(email);
      localArrayList.add(previousEmail);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String email;
      private String previousEmail;
      
      public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData build()
      {
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData localPigeonActionCodeInfoData = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData();
        localPigeonActionCodeInfoData.setEmail(email);
        localPigeonActionCodeInfoData.setPreviousEmail(previousEmail);
        return localPigeonActionCodeInfoData;
      }
      
      public Builder setEmail(String paramString)
      {
        email = paramString;
        return this;
      }
      
      public Builder setPreviousEmail(String paramString)
      {
        previousEmail = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonActionCodeSettings
  {
    private Boolean androidInstallApp;
    private String androidMinimumVersion;
    private String androidPackageName;
    private String dynamicLinkDomain;
    private Boolean handleCodeInApp;
    private String iOSBundleId;
    private String linkDomain;
    private String url;
    
    public static PigeonActionCodeSettings fromList(ArrayList<Object> paramArrayList)
    {
      PigeonActionCodeSettings localPigeonActionCodeSettings = new PigeonActionCodeSettings();
      localPigeonActionCodeSettings.setUrl((String)paramArrayList.get(0));
      localPigeonActionCodeSettings.setDynamicLinkDomain((String)paramArrayList.get(1));
      localPigeonActionCodeSettings.setHandleCodeInApp((Boolean)paramArrayList.get(2));
      localPigeonActionCodeSettings.setIOSBundleId((String)paramArrayList.get(3));
      localPigeonActionCodeSettings.setAndroidPackageName((String)paramArrayList.get(4));
      localPigeonActionCodeSettings.setAndroidInstallApp((Boolean)paramArrayList.get(5));
      localPigeonActionCodeSettings.setAndroidMinimumVersion((String)paramArrayList.get(6));
      localPigeonActionCodeSettings.setLinkDomain((String)paramArrayList.get(7));
      return localPigeonActionCodeSettings;
    }
    
    public Boolean getAndroidInstallApp()
    {
      return androidInstallApp;
    }
    
    public String getAndroidMinimumVersion()
    {
      return androidMinimumVersion;
    }
    
    public String getAndroidPackageName()
    {
      return androidPackageName;
    }
    
    public String getDynamicLinkDomain()
    {
      return dynamicLinkDomain;
    }
    
    public Boolean getHandleCodeInApp()
    {
      return handleCodeInApp;
    }
    
    public String getIOSBundleId()
    {
      return iOSBundleId;
    }
    
    public String getLinkDomain()
    {
      return linkDomain;
    }
    
    public String getUrl()
    {
      return url;
    }
    
    public void setAndroidInstallApp(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        androidInstallApp = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
    }
    
    public void setAndroidMinimumVersion(String paramString)
    {
      androidMinimumVersion = paramString;
    }
    
    public void setAndroidPackageName(String paramString)
    {
      androidPackageName = paramString;
    }
    
    public void setDynamicLinkDomain(String paramString)
    {
      dynamicLinkDomain = paramString;
    }
    
    public void setHandleCodeInApp(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        handleCodeInApp = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
    }
    
    public void setIOSBundleId(String paramString)
    {
      iOSBundleId = paramString;
    }
    
    public void setLinkDomain(String paramString)
    {
      linkDomain = paramString;
    }
    
    public void setUrl(String paramString)
    {
      if (paramString != null)
      {
        url = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"url\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(8);
      localArrayList.add(url);
      localArrayList.add(dynamicLinkDomain);
      localArrayList.add(handleCodeInApp);
      localArrayList.add(iOSBundleId);
      localArrayList.add(androidPackageName);
      localArrayList.add(androidInstallApp);
      localArrayList.add(androidMinimumVersion);
      localArrayList.add(linkDomain);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Boolean androidInstallApp;
      private String androidMinimumVersion;
      private String androidPackageName;
      private String dynamicLinkDomain;
      private Boolean handleCodeInApp;
      private String iOSBundleId;
      private String linkDomain;
      private String url;
      
      public GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings build()
      {
        GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings localPigeonActionCodeSettings = new GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings();
        localPigeonActionCodeSettings.setUrl(url);
        localPigeonActionCodeSettings.setDynamicLinkDomain(dynamicLinkDomain);
        localPigeonActionCodeSettings.setHandleCodeInApp(handleCodeInApp);
        localPigeonActionCodeSettings.setIOSBundleId(iOSBundleId);
        localPigeonActionCodeSettings.setAndroidPackageName(androidPackageName);
        localPigeonActionCodeSettings.setAndroidInstallApp(androidInstallApp);
        localPigeonActionCodeSettings.setAndroidMinimumVersion(androidMinimumVersion);
        localPigeonActionCodeSettings.setLinkDomain(linkDomain);
        return localPigeonActionCodeSettings;
      }
      
      public Builder setAndroidInstallApp(Boolean paramBoolean)
      {
        androidInstallApp = paramBoolean;
        return this;
      }
      
      public Builder setAndroidMinimumVersion(String paramString)
      {
        androidMinimumVersion = paramString;
        return this;
      }
      
      public Builder setAndroidPackageName(String paramString)
      {
        androidPackageName = paramString;
        return this;
      }
      
      public Builder setDynamicLinkDomain(String paramString)
      {
        dynamicLinkDomain = paramString;
        return this;
      }
      
      public Builder setHandleCodeInApp(Boolean paramBoolean)
      {
        handleCodeInApp = paramBoolean;
        return this;
      }
      
      public Builder setIOSBundleId(String paramString)
      {
        iOSBundleId = paramString;
        return this;
      }
      
      public Builder setLinkDomain(String paramString)
      {
        linkDomain = paramString;
        return this;
      }
      
      public Builder setUrl(String paramString)
      {
        url = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonAdditionalUserInfo
  {
    private String authorizationCode;
    private Boolean isNewUser;
    private Map<String, Object> profile;
    private String providerId;
    private String username;
    
    public static PigeonAdditionalUserInfo fromList(ArrayList<Object> paramArrayList)
    {
      PigeonAdditionalUserInfo localPigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
      localPigeonAdditionalUserInfo.setIsNewUser((Boolean)paramArrayList.get(0));
      localPigeonAdditionalUserInfo.setProviderId((String)paramArrayList.get(1));
      localPigeonAdditionalUserInfo.setUsername((String)paramArrayList.get(2));
      localPigeonAdditionalUserInfo.setAuthorizationCode((String)paramArrayList.get(3));
      localPigeonAdditionalUserInfo.setProfile((Map)paramArrayList.get(4));
      return localPigeonAdditionalUserInfo;
    }
    
    public String getAuthorizationCode()
    {
      return authorizationCode;
    }
    
    public Boolean getIsNewUser()
    {
      return isNewUser;
    }
    
    public Map<String, Object> getProfile()
    {
      return profile;
    }
    
    public String getProviderId()
    {
      return providerId;
    }
    
    public String getUsername()
    {
      return username;
    }
    
    public void setAuthorizationCode(String paramString)
    {
      authorizationCode = paramString;
    }
    
    public void setIsNewUser(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        isNewUser = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
    }
    
    public void setProfile(Map<String, Object> paramMap)
    {
      profile = paramMap;
    }
    
    public void setProviderId(String paramString)
    {
      providerId = paramString;
    }
    
    public void setUsername(String paramString)
    {
      username = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(isNewUser);
      localArrayList.add(providerId);
      localArrayList.add(username);
      localArrayList.add(authorizationCode);
      localArrayList.add(profile);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String authorizationCode;
      private Boolean isNewUser;
      private Map<String, Object> profile;
      private String providerId;
      private String username;
      
      public GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo build()
      {
        GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo localPigeonAdditionalUserInfo = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo();
        localPigeonAdditionalUserInfo.setIsNewUser(isNewUser);
        localPigeonAdditionalUserInfo.setProviderId(providerId);
        localPigeonAdditionalUserInfo.setUsername(username);
        localPigeonAdditionalUserInfo.setAuthorizationCode(authorizationCode);
        localPigeonAdditionalUserInfo.setProfile(profile);
        return localPigeonAdditionalUserInfo;
      }
      
      public Builder setAuthorizationCode(String paramString)
      {
        authorizationCode = paramString;
        return this;
      }
      
      public Builder setIsNewUser(Boolean paramBoolean)
      {
        isNewUser = paramBoolean;
        return this;
      }
      
      public Builder setProfile(Map<String, Object> paramMap)
      {
        profile = paramMap;
        return this;
      }
      
      public Builder setProviderId(String paramString)
      {
        providerId = paramString;
        return this;
      }
      
      public Builder setUsername(String paramString)
      {
        username = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonAuthCredential
  {
    private String accessToken;
    private Long nativeId;
    private String providerId;
    private String signInMethod;
    
    public static PigeonAuthCredential fromList(ArrayList<Object> paramArrayList)
    {
      PigeonAuthCredential localPigeonAuthCredential = new PigeonAuthCredential();
      localPigeonAuthCredential.setProviderId((String)paramArrayList.get(0));
      localPigeonAuthCredential.setSignInMethod((String)paramArrayList.get(1));
      Object localObject = paramArrayList.get(2);
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        long l;
        if ((localObject instanceof Integer)) {
          l = ((Integer)localObject).intValue();
        } else {
          l = ((Long)localObject).longValue();
        }
        localObject = Long.valueOf(l);
      }
      localPigeonAuthCredential.setNativeId((Long)localObject);
      localPigeonAuthCredential.setAccessToken((String)paramArrayList.get(3));
      return localPigeonAuthCredential;
    }
    
    public String getAccessToken()
    {
      return accessToken;
    }
    
    public Long getNativeId()
    {
      return nativeId;
    }
    
    public String getProviderId()
    {
      return providerId;
    }
    
    public String getSignInMethod()
    {
      return signInMethod;
    }
    
    public void setAccessToken(String paramString)
    {
      accessToken = paramString;
    }
    
    public void setNativeId(Long paramLong)
    {
      if (paramLong != null)
      {
        nativeId = paramLong;
        return;
      }
      throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
    }
    
    public void setProviderId(String paramString)
    {
      if (paramString != null)
      {
        providerId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"providerId\" is null.");
    }
    
    public void setSignInMethod(String paramString)
    {
      if (paramString != null)
      {
        signInMethod = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(providerId);
      localArrayList.add(signInMethod);
      localArrayList.add(nativeId);
      localArrayList.add(accessToken);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String accessToken;
      private Long nativeId;
      private String providerId;
      private String signInMethod;
      
      public GeneratedAndroidFirebaseAuth.PigeonAuthCredential build()
      {
        GeneratedAndroidFirebaseAuth.PigeonAuthCredential localPigeonAuthCredential = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential();
        localPigeonAuthCredential.setProviderId(providerId);
        localPigeonAuthCredential.setSignInMethod(signInMethod);
        localPigeonAuthCredential.setNativeId(nativeId);
        localPigeonAuthCredential.setAccessToken(accessToken);
        return localPigeonAuthCredential;
      }
      
      public Builder setAccessToken(String paramString)
      {
        accessToken = paramString;
        return this;
      }
      
      public Builder setNativeId(Long paramLong)
      {
        nativeId = paramLong;
        return this;
      }
      
      public Builder setProviderId(String paramString)
      {
        providerId = paramString;
        return this;
      }
      
      public Builder setSignInMethod(String paramString)
      {
        signInMethod = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonFirebaseAuthSettings
  {
    private Boolean appVerificationDisabledForTesting;
    private Boolean forceRecaptchaFlow;
    private String phoneNumber;
    private String smsCode;
    private String userAccessGroup;
    
    public static PigeonFirebaseAuthSettings fromList(ArrayList<Object> paramArrayList)
    {
      PigeonFirebaseAuthSettings localPigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
      localPigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting((Boolean)paramArrayList.get(0));
      localPigeonFirebaseAuthSettings.setUserAccessGroup((String)paramArrayList.get(1));
      localPigeonFirebaseAuthSettings.setPhoneNumber((String)paramArrayList.get(2));
      localPigeonFirebaseAuthSettings.setSmsCode((String)paramArrayList.get(3));
      localPigeonFirebaseAuthSettings.setForceRecaptchaFlow((Boolean)paramArrayList.get(4));
      return localPigeonFirebaseAuthSettings;
    }
    
    public Boolean getAppVerificationDisabledForTesting()
    {
      return appVerificationDisabledForTesting;
    }
    
    public Boolean getForceRecaptchaFlow()
    {
      return forceRecaptchaFlow;
    }
    
    public String getPhoneNumber()
    {
      return phoneNumber;
    }
    
    public String getSmsCode()
    {
      return smsCode;
    }
    
    public String getUserAccessGroup()
    {
      return userAccessGroup;
    }
    
    public void setAppVerificationDisabledForTesting(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        appVerificationDisabledForTesting = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
    }
    
    public void setForceRecaptchaFlow(Boolean paramBoolean)
    {
      forceRecaptchaFlow = paramBoolean;
    }
    
    public void setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
    }
    
    public void setSmsCode(String paramString)
    {
      smsCode = paramString;
    }
    
    public void setUserAccessGroup(String paramString)
    {
      userAccessGroup = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(appVerificationDisabledForTesting);
      localArrayList.add(userAccessGroup);
      localArrayList.add(phoneNumber);
      localArrayList.add(smsCode);
      localArrayList.add(forceRecaptchaFlow);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonIdTokenResult
  {
    private Long authTimestamp;
    private Map<String, Object> claims;
    private Long expirationTimestamp;
    private Long issuedAtTimestamp;
    private String signInProvider;
    private String signInSecondFactor;
    private String token;
    
    public static PigeonIdTokenResult fromList(ArrayList<Object> paramArrayList)
    {
      PigeonIdTokenResult localPigeonIdTokenResult = new PigeonIdTokenResult();
      localPigeonIdTokenResult.setToken((String)paramArrayList.get(0));
      Object localObject1 = paramArrayList.get(1);
      Object localObject2 = null;
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonIdTokenResult.setExpirationTimestamp((Long)localObject1);
      localObject1 = paramArrayList.get(2);
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonIdTokenResult.setAuthTimestamp((Long)localObject1);
      localObject1 = paramArrayList.get(3);
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonIdTokenResult.setIssuedAtTimestamp((Long)localObject1);
      localPigeonIdTokenResult.setSignInProvider((String)paramArrayList.get(4));
      localPigeonIdTokenResult.setClaims((Map)paramArrayList.get(5));
      localPigeonIdTokenResult.setSignInSecondFactor((String)paramArrayList.get(6));
      return localPigeonIdTokenResult;
    }
    
    public Long getAuthTimestamp()
    {
      return authTimestamp;
    }
    
    public Map<String, Object> getClaims()
    {
      return claims;
    }
    
    public Long getExpirationTimestamp()
    {
      return expirationTimestamp;
    }
    
    public Long getIssuedAtTimestamp()
    {
      return issuedAtTimestamp;
    }
    
    public String getSignInProvider()
    {
      return signInProvider;
    }
    
    public String getSignInSecondFactor()
    {
      return signInSecondFactor;
    }
    
    public String getToken()
    {
      return token;
    }
    
    public void setAuthTimestamp(Long paramLong)
    {
      authTimestamp = paramLong;
    }
    
    public void setClaims(Map<String, Object> paramMap)
    {
      claims = paramMap;
    }
    
    public void setExpirationTimestamp(Long paramLong)
    {
      expirationTimestamp = paramLong;
    }
    
    public void setIssuedAtTimestamp(Long paramLong)
    {
      issuedAtTimestamp = paramLong;
    }
    
    public void setSignInProvider(String paramString)
    {
      signInProvider = paramString;
    }
    
    public void setSignInSecondFactor(String paramString)
    {
      signInSecondFactor = paramString;
    }
    
    public void setToken(String paramString)
    {
      token = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(7);
      localArrayList.add(token);
      localArrayList.add(expirationTimestamp);
      localArrayList.add(authTimestamp);
      localArrayList.add(issuedAtTimestamp);
      localArrayList.add(signInProvider);
      localArrayList.add(claims);
      localArrayList.add(signInSecondFactor);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Long authTimestamp;
      private Map<String, Object> claims;
      private Long expirationTimestamp;
      private Long issuedAtTimestamp;
      private String signInProvider;
      private String signInSecondFactor;
      private String token;
      
      public GeneratedAndroidFirebaseAuth.PigeonIdTokenResult build()
      {
        GeneratedAndroidFirebaseAuth.PigeonIdTokenResult localPigeonIdTokenResult = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult();
        localPigeonIdTokenResult.setToken(token);
        localPigeonIdTokenResult.setExpirationTimestamp(expirationTimestamp);
        localPigeonIdTokenResult.setAuthTimestamp(authTimestamp);
        localPigeonIdTokenResult.setIssuedAtTimestamp(issuedAtTimestamp);
        localPigeonIdTokenResult.setSignInProvider(signInProvider);
        localPigeonIdTokenResult.setClaims(claims);
        localPigeonIdTokenResult.setSignInSecondFactor(signInSecondFactor);
        return localPigeonIdTokenResult;
      }
      
      public Builder setAuthTimestamp(Long paramLong)
      {
        authTimestamp = paramLong;
        return this;
      }
      
      public Builder setClaims(Map<String, Object> paramMap)
      {
        claims = paramMap;
        return this;
      }
      
      public Builder setExpirationTimestamp(Long paramLong)
      {
        expirationTimestamp = paramLong;
        return this;
      }
      
      public Builder setIssuedAtTimestamp(Long paramLong)
      {
        issuedAtTimestamp = paramLong;
        return this;
      }
      
      public Builder setSignInProvider(String paramString)
      {
        signInProvider = paramString;
        return this;
      }
      
      public Builder setSignInSecondFactor(String paramString)
      {
        signInSecondFactor = paramString;
        return this;
      }
      
      public Builder setToken(String paramString)
      {
        token = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonMultiFactorInfo
  {
    private String displayName;
    private Double enrollmentTimestamp;
    private String factorId;
    private String phoneNumber;
    private String uid;
    
    public static PigeonMultiFactorInfo fromList(ArrayList<Object> paramArrayList)
    {
      PigeonMultiFactorInfo localPigeonMultiFactorInfo = new PigeonMultiFactorInfo();
      localPigeonMultiFactorInfo.setDisplayName((String)paramArrayList.get(0));
      localPigeonMultiFactorInfo.setEnrollmentTimestamp((Double)paramArrayList.get(1));
      localPigeonMultiFactorInfo.setFactorId((String)paramArrayList.get(2));
      localPigeonMultiFactorInfo.setUid((String)paramArrayList.get(3));
      localPigeonMultiFactorInfo.setPhoneNumber((String)paramArrayList.get(4));
      return localPigeonMultiFactorInfo;
    }
    
    public String getDisplayName()
    {
      return displayName;
    }
    
    public Double getEnrollmentTimestamp()
    {
      return enrollmentTimestamp;
    }
    
    public String getFactorId()
    {
      return factorId;
    }
    
    public String getPhoneNumber()
    {
      return phoneNumber;
    }
    
    public String getUid()
    {
      return uid;
    }
    
    public void setDisplayName(String paramString)
    {
      displayName = paramString;
    }
    
    public void setEnrollmentTimestamp(Double paramDouble)
    {
      if (paramDouble != null)
      {
        enrollmentTimestamp = paramDouble;
        return;
      }
      throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
    }
    
    public void setFactorId(String paramString)
    {
      factorId = paramString;
    }
    
    public void setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
    }
    
    public void setUid(String paramString)
    {
      if (paramString != null)
      {
        uid = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"uid\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(displayName);
      localArrayList.add(enrollmentTimestamp);
      localArrayList.add(factorId);
      localArrayList.add(uid);
      localArrayList.add(phoneNumber);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonMultiFactorSession
  {
    private String id;
    
    public static PigeonMultiFactorSession fromList(ArrayList<Object> paramArrayList)
    {
      PigeonMultiFactorSession localPigeonMultiFactorSession = new PigeonMultiFactorSession();
      localPigeonMultiFactorSession.setId((String)paramArrayList.get(0));
      return localPigeonMultiFactorSession;
    }
    
    public String getId()
    {
      return id;
    }
    
    public void setId(String paramString)
    {
      if (paramString != null)
      {
        id = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"id\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(id);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String id;
      
      public GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession build()
      {
        GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession localPigeonMultiFactorSession = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession();
        localPigeonMultiFactorSession.setId(id);
        return localPigeonMultiFactorSession;
      }
      
      public Builder setId(String paramString)
      {
        id = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonPhoneMultiFactorAssertion
  {
    private String verificationCode;
    private String verificationId;
    
    public static PigeonPhoneMultiFactorAssertion fromList(ArrayList<Object> paramArrayList)
    {
      PigeonPhoneMultiFactorAssertion localPigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
      localPigeonPhoneMultiFactorAssertion.setVerificationId((String)paramArrayList.get(0));
      localPigeonPhoneMultiFactorAssertion.setVerificationCode((String)paramArrayList.get(1));
      return localPigeonPhoneMultiFactorAssertion;
    }
    
    public String getVerificationCode()
    {
      return verificationCode;
    }
    
    public String getVerificationId()
    {
      return verificationId;
    }
    
    public void setVerificationCode(String paramString)
    {
      if (paramString != null)
      {
        verificationCode = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
    }
    
    public void setVerificationId(String paramString)
    {
      if (paramString != null)
      {
        verificationId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(verificationId);
      localArrayList.add(verificationCode);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonSignInProvider
  {
    private Map<String, String> customParameters;
    private String providerId;
    private List<String> scopes;
    
    public static PigeonSignInProvider fromList(ArrayList<Object> paramArrayList)
    {
      PigeonSignInProvider localPigeonSignInProvider = new PigeonSignInProvider();
      localPigeonSignInProvider.setProviderId((String)paramArrayList.get(0));
      localPigeonSignInProvider.setScopes((List)paramArrayList.get(1));
      localPigeonSignInProvider.setCustomParameters((Map)paramArrayList.get(2));
      return localPigeonSignInProvider;
    }
    
    public Map<String, String> getCustomParameters()
    {
      return customParameters;
    }
    
    public String getProviderId()
    {
      return providerId;
    }
    
    public List<String> getScopes()
    {
      return scopes;
    }
    
    public void setCustomParameters(Map<String, String> paramMap)
    {
      customParameters = paramMap;
    }
    
    public void setProviderId(String paramString)
    {
      if (paramString != null)
      {
        providerId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"providerId\" is null.");
    }
    
    public void setScopes(List<String> paramList)
    {
      scopes = paramList;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(providerId);
      localArrayList.add(scopes);
      localArrayList.add(customParameters);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Map<String, String> customParameters;
      private String providerId;
      private List<String> scopes;
      
      public GeneratedAndroidFirebaseAuth.PigeonSignInProvider build()
      {
        GeneratedAndroidFirebaseAuth.PigeonSignInProvider localPigeonSignInProvider = new GeneratedAndroidFirebaseAuth.PigeonSignInProvider();
        localPigeonSignInProvider.setProviderId(providerId);
        localPigeonSignInProvider.setScopes(scopes);
        localPigeonSignInProvider.setCustomParameters(customParameters);
        return localPigeonSignInProvider;
      }
      
      public Builder setCustomParameters(Map<String, String> paramMap)
      {
        customParameters = paramMap;
        return this;
      }
      
      public Builder setProviderId(String paramString)
      {
        providerId = paramString;
        return this;
      }
      
      public Builder setScopes(List<String> paramList)
      {
        scopes = paramList;
        return this;
      }
    }
  }
  
  public static final class PigeonTotpSecret
  {
    private Long codeIntervalSeconds;
    private Long codeLength;
    private Long enrollmentCompletionDeadline;
    private String hashingAlgorithm;
    private String secretKey;
    
    public static PigeonTotpSecret fromList(ArrayList<Object> paramArrayList)
    {
      PigeonTotpSecret localPigeonTotpSecret = new PigeonTotpSecret();
      Object localObject1 = paramArrayList.get(0);
      Object localObject2 = null;
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonTotpSecret.setCodeIntervalSeconds((Long)localObject1);
      localObject1 = paramArrayList.get(1);
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonTotpSecret.setCodeLength((Long)localObject1);
      localObject1 = paramArrayList.get(2);
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonTotpSecret.setEnrollmentCompletionDeadline((Long)localObject1);
      localPigeonTotpSecret.setHashingAlgorithm((String)paramArrayList.get(3));
      localPigeonTotpSecret.setSecretKey((String)paramArrayList.get(4));
      return localPigeonTotpSecret;
    }
    
    public Long getCodeIntervalSeconds()
    {
      return codeIntervalSeconds;
    }
    
    public Long getCodeLength()
    {
      return codeLength;
    }
    
    public Long getEnrollmentCompletionDeadline()
    {
      return enrollmentCompletionDeadline;
    }
    
    public String getHashingAlgorithm()
    {
      return hashingAlgorithm;
    }
    
    public String getSecretKey()
    {
      return secretKey;
    }
    
    public void setCodeIntervalSeconds(Long paramLong)
    {
      codeIntervalSeconds = paramLong;
    }
    
    public void setCodeLength(Long paramLong)
    {
      codeLength = paramLong;
    }
    
    public void setEnrollmentCompletionDeadline(Long paramLong)
    {
      enrollmentCompletionDeadline = paramLong;
    }
    
    public void setHashingAlgorithm(String paramString)
    {
      hashingAlgorithm = paramString;
    }
    
    public void setSecretKey(String paramString)
    {
      if (paramString != null)
      {
        secretKey = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(codeIntervalSeconds);
      localArrayList.add(codeLength);
      localArrayList.add(enrollmentCompletionDeadline);
      localArrayList.add(hashingAlgorithm);
      localArrayList.add(secretKey);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonUserCredential
  {
    private GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo additionalUserInfo;
    private GeneratedAndroidFirebaseAuth.PigeonAuthCredential credential;
    private GeneratedAndroidFirebaseAuth.PigeonUserDetails user;
    
    public static PigeonUserCredential fromList(ArrayList<Object> paramArrayList)
    {
      PigeonUserCredential localPigeonUserCredential = new PigeonUserCredential();
      localPigeonUserCredential.setUser((GeneratedAndroidFirebaseAuth.PigeonUserDetails)paramArrayList.get(0));
      localPigeonUserCredential.setAdditionalUserInfo((GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo)paramArrayList.get(1));
      localPigeonUserCredential.setCredential((GeneratedAndroidFirebaseAuth.PigeonAuthCredential)paramArrayList.get(2));
      return localPigeonUserCredential;
    }
    
    public GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo getAdditionalUserInfo()
    {
      return additionalUserInfo;
    }
    
    public GeneratedAndroidFirebaseAuth.PigeonAuthCredential getCredential()
    {
      return credential;
    }
    
    public GeneratedAndroidFirebaseAuth.PigeonUserDetails getUser()
    {
      return user;
    }
    
    public void setAdditionalUserInfo(GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo paramPigeonAdditionalUserInfo)
    {
      additionalUserInfo = paramPigeonAdditionalUserInfo;
    }
    
    public void setCredential(GeneratedAndroidFirebaseAuth.PigeonAuthCredential paramPigeonAuthCredential)
    {
      credential = paramPigeonAuthCredential;
    }
    
    public void setUser(GeneratedAndroidFirebaseAuth.PigeonUserDetails paramPigeonUserDetails)
    {
      user = paramPigeonUserDetails;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(user);
      localArrayList.add(additionalUserInfo);
      localArrayList.add(credential);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonUserDetails
  {
    private List<Map<Object, Object>> providerData;
    private GeneratedAndroidFirebaseAuth.PigeonUserInfo userInfo;
    
    public static PigeonUserDetails fromList(ArrayList<Object> paramArrayList)
    {
      PigeonUserDetails localPigeonUserDetails = new PigeonUserDetails();
      localPigeonUserDetails.setUserInfo((GeneratedAndroidFirebaseAuth.PigeonUserInfo)paramArrayList.get(0));
      localPigeonUserDetails.setProviderData((List)paramArrayList.get(1));
      return localPigeonUserDetails;
    }
    
    public List<Map<Object, Object>> getProviderData()
    {
      return providerData;
    }
    
    public GeneratedAndroidFirebaseAuth.PigeonUserInfo getUserInfo()
    {
      return userInfo;
    }
    
    public void setProviderData(List<Map<Object, Object>> paramList)
    {
      if (paramList != null)
      {
        providerData = paramList;
        return;
      }
      throw new IllegalStateException("Nonnull field \"providerData\" is null.");
    }
    
    public void setUserInfo(GeneratedAndroidFirebaseAuth.PigeonUserInfo paramPigeonUserInfo)
    {
      if (paramPigeonUserInfo != null)
      {
        userInfo = paramPigeonUserInfo;
        return;
      }
      throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(userInfo);
      localArrayList.add(providerData);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private List<Map<Object, Object>> providerData;
      private GeneratedAndroidFirebaseAuth.PigeonUserInfo userInfo;
      
      public GeneratedAndroidFirebaseAuth.PigeonUserDetails build()
      {
        GeneratedAndroidFirebaseAuth.PigeonUserDetails localPigeonUserDetails = new GeneratedAndroidFirebaseAuth.PigeonUserDetails();
        localPigeonUserDetails.setUserInfo(userInfo);
        localPigeonUserDetails.setProviderData(providerData);
        return localPigeonUserDetails;
      }
      
      public Builder setProviderData(List<Map<Object, Object>> paramList)
      {
        providerData = paramList;
        return this;
      }
      
      public Builder setUserInfo(GeneratedAndroidFirebaseAuth.PigeonUserInfo paramPigeonUserInfo)
      {
        userInfo = paramPigeonUserInfo;
        return this;
      }
    }
  }
  
  public static final class PigeonUserInfo
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
    
    public static PigeonUserInfo fromList(ArrayList<Object> paramArrayList)
    {
      PigeonUserInfo localPigeonUserInfo = new PigeonUserInfo();
      localPigeonUserInfo.setUid((String)paramArrayList.get(0));
      localPigeonUserInfo.setEmail((String)paramArrayList.get(1));
      localPigeonUserInfo.setDisplayName((String)paramArrayList.get(2));
      localPigeonUserInfo.setPhotoUrl((String)paramArrayList.get(3));
      localPigeonUserInfo.setPhoneNumber((String)paramArrayList.get(4));
      localPigeonUserInfo.setIsAnonymous((Boolean)paramArrayList.get(5));
      localPigeonUserInfo.setIsEmailVerified((Boolean)paramArrayList.get(6));
      localPigeonUserInfo.setProviderId((String)paramArrayList.get(7));
      localPigeonUserInfo.setTenantId((String)paramArrayList.get(8));
      localPigeonUserInfo.setRefreshToken((String)paramArrayList.get(9));
      Object localObject1 = paramArrayList.get(10);
      Object localObject2 = null;
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonUserInfo.setCreationTimestamp((Long)localObject1);
      paramArrayList = paramArrayList.get(11);
      if (paramArrayList == null)
      {
        paramArrayList = (ArrayList<Object>)localObject2;
      }
      else
      {
        if ((paramArrayList instanceof Integer)) {
          l = ((Integer)paramArrayList).intValue();
        } else {
          l = ((Long)paramArrayList).longValue();
        }
        paramArrayList = Long.valueOf(l);
      }
      localPigeonUserInfo.setLastSignInTimestamp(paramArrayList);
      return localPigeonUserInfo;
    }
    
    public Long getCreationTimestamp()
    {
      return creationTimestamp;
    }
    
    public String getDisplayName()
    {
      return displayName;
    }
    
    public String getEmail()
    {
      return email;
    }
    
    public Boolean getIsAnonymous()
    {
      return isAnonymous;
    }
    
    public Boolean getIsEmailVerified()
    {
      return isEmailVerified;
    }
    
    public Long getLastSignInTimestamp()
    {
      return lastSignInTimestamp;
    }
    
    public String getPhoneNumber()
    {
      return phoneNumber;
    }
    
    public String getPhotoUrl()
    {
      return photoUrl;
    }
    
    public String getProviderId()
    {
      return providerId;
    }
    
    public String getRefreshToken()
    {
      return refreshToken;
    }
    
    public String getTenantId()
    {
      return tenantId;
    }
    
    public String getUid()
    {
      return uid;
    }
    
    public void setCreationTimestamp(Long paramLong)
    {
      creationTimestamp = paramLong;
    }
    
    public void setDisplayName(String paramString)
    {
      displayName = paramString;
    }
    
    public void setEmail(String paramString)
    {
      email = paramString;
    }
    
    public void setIsAnonymous(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        isAnonymous = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
    }
    
    public void setIsEmailVerified(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        isEmailVerified = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
    }
    
    public void setLastSignInTimestamp(Long paramLong)
    {
      lastSignInTimestamp = paramLong;
    }
    
    public void setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
    }
    
    public void setPhotoUrl(String paramString)
    {
      photoUrl = paramString;
    }
    
    public void setProviderId(String paramString)
    {
      providerId = paramString;
    }
    
    public void setRefreshToken(String paramString)
    {
      refreshToken = paramString;
    }
    
    public void setTenantId(String paramString)
    {
      tenantId = paramString;
    }
    
    public void setUid(String paramString)
    {
      if (paramString != null)
      {
        uid = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"uid\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(12);
      localArrayList.add(uid);
      localArrayList.add(email);
      localArrayList.add(displayName);
      localArrayList.add(photoUrl);
      localArrayList.add(phoneNumber);
      localArrayList.add(isAnonymous);
      localArrayList.add(isEmailVerified);
      localArrayList.add(providerId);
      localArrayList.add(tenantId);
      localArrayList.add(refreshToken);
      localArrayList.add(creationTimestamp);
      localArrayList.add(lastSignInTimestamp);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static final class PigeonUserProfile
  {
    private String displayName;
    private Boolean displayNameChanged;
    private String photoUrl;
    private Boolean photoUrlChanged;
    
    public static PigeonUserProfile fromList(ArrayList<Object> paramArrayList)
    {
      PigeonUserProfile localPigeonUserProfile = new PigeonUserProfile();
      localPigeonUserProfile.setDisplayName((String)paramArrayList.get(0));
      localPigeonUserProfile.setPhotoUrl((String)paramArrayList.get(1));
      localPigeonUserProfile.setDisplayNameChanged((Boolean)paramArrayList.get(2));
      localPigeonUserProfile.setPhotoUrlChanged((Boolean)paramArrayList.get(3));
      return localPigeonUserProfile;
    }
    
    public String getDisplayName()
    {
      return displayName;
    }
    
    public Boolean getDisplayNameChanged()
    {
      return displayNameChanged;
    }
    
    public String getPhotoUrl()
    {
      return photoUrl;
    }
    
    public Boolean getPhotoUrlChanged()
    {
      return photoUrlChanged;
    }
    
    public void setDisplayName(String paramString)
    {
      displayName = paramString;
    }
    
    public void setDisplayNameChanged(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        displayNameChanged = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
    }
    
    public void setPhotoUrl(String paramString)
    {
      photoUrl = paramString;
    }
    
    public void setPhotoUrlChanged(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        photoUrlChanged = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(displayName);
      localArrayList.add(photoUrl);
      localArrayList.add(displayNameChanged);
      localArrayList.add(photoUrlChanged);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String displayName;
      private Boolean displayNameChanged;
      private String photoUrl;
      private Boolean photoUrlChanged;
      
      public GeneratedAndroidFirebaseAuth.PigeonUserProfile build()
      {
        GeneratedAndroidFirebaseAuth.PigeonUserProfile localPigeonUserProfile = new GeneratedAndroidFirebaseAuth.PigeonUserProfile();
        localPigeonUserProfile.setDisplayName(displayName);
        localPigeonUserProfile.setPhotoUrl(photoUrl);
        localPigeonUserProfile.setDisplayNameChanged(displayNameChanged);
        localPigeonUserProfile.setPhotoUrlChanged(photoUrlChanged);
        return localPigeonUserProfile;
      }
      
      public Builder setDisplayName(String paramString)
      {
        displayName = paramString;
        return this;
      }
      
      public Builder setDisplayNameChanged(Boolean paramBoolean)
      {
        displayNameChanged = paramBoolean;
        return this;
      }
      
      public Builder setPhotoUrl(String paramString)
      {
        photoUrl = paramString;
        return this;
      }
      
      public Builder setPhotoUrlChanged(Boolean paramBoolean)
      {
        photoUrlChanged = paramBoolean;
        return this;
      }
    }
  }
  
  public static final class PigeonVerifyPhoneNumberRequest
  {
    private String autoRetrievedSmsCodeForTesting;
    private Long forceResendingToken;
    private String multiFactorInfoId;
    private String multiFactorSessionId;
    private String phoneNumber;
    private Long timeout;
    
    public static PigeonVerifyPhoneNumberRequest fromList(ArrayList<Object> paramArrayList)
    {
      PigeonVerifyPhoneNumberRequest localPigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
      localPigeonVerifyPhoneNumberRequest.setPhoneNumber((String)paramArrayList.get(0));
      Object localObject1 = paramArrayList.get(1);
      Object localObject2 = null;
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonVerifyPhoneNumberRequest.setTimeout((Long)localObject1);
      localObject1 = paramArrayList.get(2);
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonVerifyPhoneNumberRequest.setForceResendingToken((Long)localObject1);
      localPigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting((String)paramArrayList.get(3));
      localPigeonVerifyPhoneNumberRequest.setMultiFactorInfoId((String)paramArrayList.get(4));
      localPigeonVerifyPhoneNumberRequest.setMultiFactorSessionId((String)paramArrayList.get(5));
      return localPigeonVerifyPhoneNumberRequest;
    }
    
    public String getAutoRetrievedSmsCodeForTesting()
    {
      return autoRetrievedSmsCodeForTesting;
    }
    
    public Long getForceResendingToken()
    {
      return forceResendingToken;
    }
    
    public String getMultiFactorInfoId()
    {
      return multiFactorInfoId;
    }
    
    public String getMultiFactorSessionId()
    {
      return multiFactorSessionId;
    }
    
    public String getPhoneNumber()
    {
      return phoneNumber;
    }
    
    public Long getTimeout()
    {
      return timeout;
    }
    
    public void setAutoRetrievedSmsCodeForTesting(String paramString)
    {
      autoRetrievedSmsCodeForTesting = paramString;
    }
    
    public void setForceResendingToken(Long paramLong)
    {
      forceResendingToken = paramLong;
    }
    
    public void setMultiFactorInfoId(String paramString)
    {
      multiFactorInfoId = paramString;
    }
    
    public void setMultiFactorSessionId(String paramString)
    {
      multiFactorSessionId = paramString;
    }
    
    public void setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
    }
    
    public void setTimeout(Long paramLong)
    {
      if (paramLong != null)
      {
        timeout = paramLong;
        return;
      }
      throw new IllegalStateException("Nonnull field \"timeout\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(6);
      localArrayList.add(phoneNumber);
      localArrayList.add(timeout);
      localArrayList.add(forceResendingToken);
      localArrayList.add(autoRetrievedSmsCodeForTesting);
      localArrayList.add(multiFactorInfoId);
      localArrayList.add(multiFactorSessionId);
      return localArrayList;
    }
    
    public static final class Builder
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
  }
  
  public static abstract interface Result<T>
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success(T paramT);
  }
  
  public static abstract interface VoidResult
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */