package j0;

import d0.q;
import d0.v;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class i
  extends a
{
  public q p;
  public final c q = new c();
  public ByteBuffer r;
  public boolean s;
  public long t;
  public ByteBuffer u;
  public final int v;
  public final int w;
  
  static
  {
    v.a("media3.decoder");
  }
  
  public i(int paramInt)
  {
    this(paramInt, 0);
  }
  
  public i(int paramInt1, int paramInt2)
  {
    v = paramInt1;
    w = paramInt2;
  }
  
  public static i F()
  {
    return new i(0);
  }
  
  public final void C()
  {
    ByteBuffer localByteBuffer = r;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
    localByteBuffer = u;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
  }
  
  public final boolean D()
  {
    return n(1073741824);
  }
  
  public void G(int paramInt)
  {
    ByteBuffer localByteBuffer = u;
    if ((localByteBuffer != null) && (localByteBuffer.capacity() >= paramInt)) {
      u.clear();
    } else {
      u = ByteBuffer.allocate(paramInt);
    }
  }
  
  public void m()
  {
    super.m();
    ByteBuffer localByteBuffer = r;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    localByteBuffer = u;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
    s = false;
  }
  
  public final ByteBuffer x(int paramInt)
  {
    int i = v;
    if (i == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (i == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    ByteBuffer localByteBuffer = r;
    if (localByteBuffer == null) {
      i = 0;
    } else {
      i = localByteBuffer.capacity();
    }
    throw new a(i, paramInt);
  }
  
  public void z(int paramInt)
  {
    int i = paramInt + w;
    ByteBuffer localByteBuffer1 = r;
    if (localByteBuffer1 == null)
    {
      r = x(i);
      return;
    }
    paramInt = localByteBuffer1.capacity();
    int j = localByteBuffer1.position();
    i += j;
    if (paramInt >= i)
    {
      r = localByteBuffer1;
      return;
    }
    ByteBuffer localByteBuffer2 = x(i);
    localByteBuffer2.order(localByteBuffer1.order());
    if (j > 0)
    {
      localByteBuffer1.flip();
      localByteBuffer2.put(localByteBuffer1);
    }
    r = localByteBuffer2;
  }
  
  public static final class a
    extends IllegalStateException
  {
    public final int o;
    public final int p;
    
    public a(int paramInt1, int paramInt2)
    {
      super();
      o = paramInt1;
      p = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     j0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */