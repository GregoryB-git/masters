package io.flutter.plugin.common;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class StringCodec
  implements MessageCodec<String>
{
  public static final StringCodec INSTANCE = new StringCodec();
  private static final Charset UTF8 = Charset.forName("UTF8");
  
  public String decodeMessage(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return null;
    }
    int i = paramByteBuffer.remaining();
    byte[] arrayOfByte;
    int j;
    if (paramByteBuffer.hasArray())
    {
      arrayOfByte = paramByteBuffer.array();
      j = paramByteBuffer.arrayOffset();
      paramByteBuffer = arrayOfByte;
    }
    else
    {
      arrayOfByte = new byte[i];
      paramByteBuffer.get(arrayOfByte);
      j = 0;
      paramByteBuffer = arrayOfByte;
    }
    return new String(paramByteBuffer, j, i, UTF8);
  }
  
  public ByteBuffer encodeMessage(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    byte[] arrayOfByte = paramString.getBytes(UTF8);
    paramString = ByteBuffer.allocateDirect(arrayOfByte.length);
    paramString.put(arrayOfByte);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.StringCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */