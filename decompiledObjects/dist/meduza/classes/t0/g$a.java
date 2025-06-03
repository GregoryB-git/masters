package t0;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class g$a
{
  public final ByteBuffer a;
  
  public g$a(ByteBuffer paramByteBuffer)
  {
    a = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
  }
  
  public final long a()
  {
    return a.getInt() & 0xFFFFFFFF;
  }
  
  public final void b(int paramInt)
  {
    ByteBuffer localByteBuffer = a;
    localByteBuffer.position(localByteBuffer.position() + paramInt);
  }
}

/* Location:
 * Qualified Name:     t0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */