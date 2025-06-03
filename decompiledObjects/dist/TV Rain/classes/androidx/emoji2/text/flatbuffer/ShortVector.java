package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ShortVector
  extends BaseVector
{
  public ShortVector __assign(int paramInt, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt, 2, paramByteBuffer);
    return this;
  }
  
  public short get(int paramInt)
  {
    return bb.getShort(__element(paramInt));
  }
  
  public int getAsUnsigned(int paramInt)
  {
    return get(paramInt) & 0xFFFF;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ShortVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */