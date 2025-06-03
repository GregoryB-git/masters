package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseCore$FirebaseCoreHostApiCodec
  extends StandardMessageCodec
{
  public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    if (paramByte != Byte.MIN_VALUE)
    {
      if (paramByte != -127) {
        return super.readValueOfType(paramByte, paramByteBuffer);
      }
      return GeneratedAndroidFirebaseCore.PigeonInitializeResponse.fromList((ArrayList)readValue(paramByteBuffer));
    }
    return GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.fromList((ArrayList)readValue(paramByteBuffer));
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)) {
      paramByteArrayOutputStream.write(128);
    }
    for (paramObject = ((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)paramObject).toList();; paramObject = ((GeneratedAndroidFirebaseCore.PigeonInitializeResponse)paramObject).toList())
    {
      writeValue(paramByteArrayOutputStream, paramObject);
      return;
      if (!(paramObject instanceof GeneratedAndroidFirebaseCore.PigeonInitializeResponse)) {
        break;
      }
      paramByteArrayOutputStream.write(129);
    }
    super.writeValue(paramByteArrayOutputStream, paramObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */