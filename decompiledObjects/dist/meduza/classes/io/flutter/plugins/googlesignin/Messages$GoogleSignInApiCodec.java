package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class Messages$GoogleSignInApiCodec
  extends StandardMessageCodec
{
  public static final GoogleSignInApiCodec INSTANCE = new GoogleSignInApiCodec();
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    if (paramByte != Byte.MIN_VALUE)
    {
      if (paramByte != -127) {
        return super.readValueOfType(paramByte, paramByteBuffer);
      }
      return Messages.UserData.fromList((ArrayList)readValue(paramByteBuffer));
    }
    return Messages.InitParams.fromList((ArrayList)readValue(paramByteBuffer));
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof Messages.InitParams)) {
      paramByteArrayOutputStream.write(128);
    }
    for (paramObject = ((Messages.InitParams)paramObject).toList();; paramObject = ((Messages.UserData)paramObject).toList())
    {
      writeValue(paramByteArrayOutputStream, paramObject);
      return;
      if (!(paramObject instanceof Messages.UserData)) {
        break;
      }
      paramByteArrayOutputStream.write(129);
    }
    super.writeValue(paramByteArrayOutputStream, paramObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.GoogleSignInApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */