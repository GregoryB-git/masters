package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$GenerateInterfacesCodec
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.GenerateInterfacesCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */