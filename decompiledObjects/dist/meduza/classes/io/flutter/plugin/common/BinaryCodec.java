package io.flutter.plugin.common;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class BinaryCodec
  implements MessageCodec<ByteBuffer>
{
  public static final BinaryCodec INSTANCE = new BinaryCodec();
  public static final BinaryCodec INSTANCE_DIRECT = new BinaryCodec(true);
  private final boolean returnsDirectByteBufferFromDecoding;
  
  private BinaryCodec()
  {
    returnsDirectByteBufferFromDecoding = false;
  }
  
  private BinaryCodec(boolean paramBoolean)
  {
    returnsDirectByteBufferFromDecoding = paramBoolean;
  }
  
  public ByteBuffer decodeMessage(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      return paramByteBuffer;
    }
    if (returnsDirectByteBufferFromDecoding) {
      return paramByteBuffer;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.capacity());
    localByteBuffer.put(paramByteBuffer);
    localByteBuffer.rewind();
    return localByteBuffer;
  }
  
  public ByteBuffer encodeMessage(ByteBuffer paramByteBuffer)
  {
    return paramByteBuffer;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.BinaryCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */