package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class FlatBufferBuilder$HeapByteBufferFactory
  extends FlatBufferBuilder.ByteBufferFactory
{
  public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();
  
  public ByteBuffer newByteBuffer(int paramInt)
  {
    return ByteBuffer.allocate(paramInt).order(ByteOrder.LITTLE_ENDIAN);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder.HeapByteBufferFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */