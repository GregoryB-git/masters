package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

class FlatBufferBuilder$ByteBufferBackedInputStream
  extends InputStream
{
  public ByteBuffer buf;
  
  public FlatBufferBuilder$ByteBufferBackedInputStream(ByteBuffer paramByteBuffer)
  {
    buf = paramByteBuffer;
  }
  
  public int read()
    throws IOException
  {
    try
    {
      int i = buf.get();
      return i & 0xFF;
    }
    catch (BufferUnderflowException localBufferUnderflowException) {}
    return -1;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferBackedInputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */