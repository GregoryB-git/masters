package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ByteVector
  extends BaseVector
{
  public ByteVector __assign(int paramInt, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt, 1, paramByteBuffer);
    return this;
  }
  
  public byte get(int paramInt)
  {
    return bb.get(__element(paramInt));
  }
  
  public int getAsUnsigned(int paramInt)
  {
    return get(paramInt) & 0xFF;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ByteVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */