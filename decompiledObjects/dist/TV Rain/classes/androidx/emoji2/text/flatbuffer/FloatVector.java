package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class FloatVector
  extends BaseVector
{
  public FloatVector __assign(int paramInt, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt, 4, paramByteBuffer);
    return this;
  }
  
  public float get(int paramInt)
  {
    return bb.getFloat(__element(paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FloatVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */