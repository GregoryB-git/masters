package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class BaseVector
{
  public ByteBuffer bb;
  private int element_size;
  private int length;
  private int vector;
  
  public int __element(int paramInt)
  {
    int i = vector;
    return paramInt * element_size + i;
  }
  
  public void __reset(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    bb = paramByteBuffer;
    if (paramByteBuffer != null)
    {
      vector = paramInt1;
      length = paramByteBuffer.getInt(paramInt1 - 4);
      element_size = paramInt2;
    }
    else
    {
      vector = 0;
      length = 0;
      element_size = 0;
    }
  }
  
  public int __vector()
  {
    return vector;
  }
  
  public int length()
  {
    return length;
  }
  
  public void reset()
  {
    __reset(0, 0, null);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.BaseVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */