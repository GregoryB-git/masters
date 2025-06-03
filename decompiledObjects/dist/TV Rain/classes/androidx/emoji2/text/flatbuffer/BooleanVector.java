package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class BooleanVector
  extends BaseVector
{
  public BooleanVector __assign(int paramInt, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt, 1, paramByteBuffer);
    return this;
  }
  
  public boolean get(int paramInt)
  {
    boolean bool;
    if (bb.get(__element(paramInt)) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.BooleanVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */