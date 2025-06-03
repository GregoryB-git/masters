package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApiCodec
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */