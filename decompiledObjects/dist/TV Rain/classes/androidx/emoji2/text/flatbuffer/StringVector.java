package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class StringVector
  extends BaseVector
{
  private Utf8 utf8 = Utf8.getDefault();
  
  public StringVector __assign(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt1, paramInt2, paramByteBuffer);
    return this;
  }
  
  public String get(int paramInt)
  {
    return Table.__string(__element(paramInt), bb, utf8);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.StringVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */