package gb;

import eb.j0;
import java.io.InputStream;
import x6.b;

public final class v2$a
  extends InputStream
  implements j0
{
  public u2 a;
  
  public v2$a(u2 paramu2)
  {
    b.y(paramu2, "buffer");
    a = paramu2;
  }
  
  public final int available()
  {
    return a.b();
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void mark(int paramInt)
  {
    a.Z();
  }
  
  public final boolean markSupported()
  {
    return a.markSupported();
  }
  
  public final int read()
  {
    if (a.b() == 0) {
      return -1;
    }
    return a.readUnsignedByte();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (a.b() == 0) {
      return -1;
    }
    paramInt2 = Math.min(a.b(), paramInt2);
    a.U(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
  
  public final void reset()
  {
    a.reset();
  }
  
  public final long skip(long paramLong)
  {
    int i = (int)Math.min(a.b(), paramLong);
    a.skipBytes(i);
    return i;
  }
}

/* Location:
 * Qualified Name:     gb.v2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */