package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class UnionVector
  extends BaseVector
{
  public UnionVector __assign(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt1, paramInt2, paramByteBuffer);
    return this;
  }
  
  public Table get(Table paramTable, int paramInt)
  {
    return Table.__union(paramTable, __element(paramInt), bb);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.UnionVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */