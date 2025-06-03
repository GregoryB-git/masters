package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class ByteBufferUtil
{
  public static int getSizePrefix(ByteBuffer paramByteBuffer)
  {
    return paramByteBuffer.getInt(paramByteBuffer.position());
  }
  
  public static ByteBuffer removeSizePrefix(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = paramByteBuffer.duplicate();
    paramByteBuffer.position(paramByteBuffer.position() + 4);
    return paramByteBuffer;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ByteBufferUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */