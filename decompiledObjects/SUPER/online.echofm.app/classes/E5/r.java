package E5;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class r
  implements i
{
  public static final Charset a = Charset.forName("UTF8");
  public static final r b = new r();
  
  public String c(ByteBuffer paramByteBuffer)
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
    return new String(paramByteBuffer, j, i, a);
  }
  
  public ByteBuffer d(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    byte[] arrayOfByte = paramString.getBytes(a);
    paramString = ByteBuffer.allocateDirect(arrayOfByte.length);
    paramString.put(arrayOfByte);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     E5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */