package z3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import v3.h0;

public class g
  extends a
{
  public final c b = new c();
  public ByteBuffer c;
  public boolean d;
  public long e;
  public ByteBuffer f;
  public final int o;
  public final int p;
  
  static
  {
    h0.a("goog.exo.decoder");
  }
  
  public g(int paramInt)
  {
    o = paramInt;
    p = 0;
  }
  
  public void o()
  {
    a = 0;
    ByteBuffer localByteBuffer = c;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    localByteBuffer = f;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    d = false;
  }
  
  public final ByteBuffer p(int paramInt)
  {
    int i = o;
    if (i == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (i == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    ByteBuffer localByteBuffer = c;
    if (localByteBuffer == null) {
      i = 0;
    } else {
      i = localByteBuffer.capacity();
    }
    throw new a(i, paramInt);
  }
  
  public final void q(int paramInt)
  {
    int i = paramInt + p;
    ByteBuffer localByteBuffer1 = c;
    if (localByteBuffer1 == null)
    {
      c = p(i);
      return;
    }
    int j = localByteBuffer1.capacity();
    paramInt = localByteBuffer1.position();
    i += paramInt;
    if (j >= i)
    {
      c = localByteBuffer1;
      return;
    }
    ByteBuffer localByteBuffer2 = p(i);
    localByteBuffer2.order(localByteBuffer1.order());
    if (paramInt > 0)
    {
      localByteBuffer1.flip();
      localByteBuffer2.put(localByteBuffer1);
    }
    c = localByteBuffer2;
  }
  
  public final void r()
  {
    ByteBuffer localByteBuffer = c;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
    localByteBuffer = f;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
  }
  
  public static final class a
    extends IllegalStateException
  {
    public a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     z3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */