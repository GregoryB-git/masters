package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class w
  extends q
{
  public static final int i = Float.floatToIntBits(NaN.0F);
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    int m = k - j;
    int n = b.c;
    ByteBuffer localByteBuffer2;
    if (n != 536870912)
    {
      if (n == 805306368)
      {
        localByteBuffer1 = j(m);
        for (;;)
        {
          localByteBuffer2 = localByteBuffer1;
          if (j >= k) {
            break;
          }
          m = Float.floatToIntBits((float)((paramByteBuffer.get(j) & 0xFF | (paramByteBuffer.get(j + 1) & 0xFF) << 8 | (paramByteBuffer.get(j + 2) & 0xFF) << 16 | (paramByteBuffer.get(j + 3) & 0xFF) << 24) * 4.656612875245797E-10D));
          n = m;
          if (m == i) {
            n = Float.floatToIntBits(0.0F);
          }
          localByteBuffer1.putInt(n);
          j += 4;
        }
      }
      throw new IllegalStateException();
    }
    ByteBuffer localByteBuffer1 = j(m / 3 * 4);
    for (;;)
    {
      localByteBuffer2 = localByteBuffer1;
      if (j >= k) {
        break;
      }
      m = Float.floatToIntBits((float)(((paramByteBuffer.get(j) & 0xFF) << 8 | (paramByteBuffer.get(j + 1) & 0xFF) << 16 | (paramByteBuffer.get(j + 2) & 0xFF) << 24) * 4.656612875245797E-10D));
      n = m;
      if (m == i) {
        n = Float.floatToIntBits(0.0F);
      }
      localByteBuffer1.putInt(n);
      j += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer2.flip();
  }
  
  public final f.a f(f.a parama)
  {
    int j = c;
    int k;
    if ((j != 536870912) && (j != 805306368) && (j != 4)) {
      k = 0;
    } else {
      k = 1;
    }
    if (k != 0)
    {
      if (j != 4) {
        parama = new f.a(a, b, 4);
      } else {
        parama = f.a.e;
      }
      return parama;
    }
    throw new f.b(parama);
  }
}

/* Location:
 * Qualified Name:     x3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */