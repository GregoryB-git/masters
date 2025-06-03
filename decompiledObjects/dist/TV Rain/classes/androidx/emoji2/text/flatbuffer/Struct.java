package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class Struct
{
  public ByteBuffer bb;
  public int bb_pos;
  
  public void __reset()
  {
    __reset(0, null);
  }
  
  public void __reset(int paramInt, ByteBuffer paramByteBuffer)
  {
    bb = paramByteBuffer;
    if (paramByteBuffer != null) {
      bb_pos = paramInt;
    } else {
      bb_pos = 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Struct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */