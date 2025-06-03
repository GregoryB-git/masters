package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$FirebaseAuthHostApiCodec
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */