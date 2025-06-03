package O0;

import d0.x;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class c
  implements a
{
  public final x a(b paramb)
  {
    ByteBuffer localByteBuffer = (ByteBuffer)g0.a.e(r);
    boolean bool;
    if ((localByteBuffer.position() == 0) && (localByteBuffer.hasArray()) && (localByteBuffer.arrayOffset() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    return b(paramb, localByteBuffer);
  }
  
  public abstract x b(b paramb, ByteBuffer paramByteBuffer);
}

/* Location:
 * Qualified Name:     O0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */