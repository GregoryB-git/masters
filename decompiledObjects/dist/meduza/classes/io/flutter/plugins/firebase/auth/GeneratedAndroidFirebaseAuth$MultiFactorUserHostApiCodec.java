package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$MultiFactorUserHostApiCodec
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */