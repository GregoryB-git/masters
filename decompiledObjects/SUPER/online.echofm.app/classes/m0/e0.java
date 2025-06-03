package m0;

import e0.b.a;
import e0.b.b;
import e0.d;
import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class e0
  extends d
{
  public static final int i = Float.floatToIntBits(NaN.0F);
  
  public static void n(int paramInt, ByteBuffer paramByteBuffer)
  {
    int j = Float.floatToIntBits((float)(paramInt * 4.656612875245797E-10D));
    paramInt = j;
    if (j == i) {
      paramInt = Float.floatToIntBits(0.0F);
    }
    paramByteBuffer.putInt(paramInt);
  }
  
  public void f(ByteBuffer paramByteBuffer)
  {
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    int m = k - j;
    int n = b.c;
    ByteBuffer localByteBuffer2;
    if (n != 21)
    {
      if (n != 22)
      {
        if (n != 1342177280)
        {
          if (n == 1610612736)
          {
            localByteBuffer1 = m(m);
            for (;;)
            {
              localByteBuffer2 = localByteBuffer1;
              if (j >= k) {
                break;
              }
              n(paramByteBuffer.get(j + 3) & 0xFF | (paramByteBuffer.get(j + 2) & 0xFF) << 8 | (paramByteBuffer.get(j + 1) & 0xFF) << 16 | (paramByteBuffer.get(j) & 0xFF) << 24, localByteBuffer1);
              j += 4;
            }
          }
          throw new IllegalStateException();
        }
        localByteBuffer1 = m(m / 3 * 4);
        for (;;)
        {
          localByteBuffer2 = localByteBuffer1;
          if (j >= k) {
            break;
          }
          n((paramByteBuffer.get(j + 2) & 0xFF) << 8 | (paramByteBuffer.get(j + 1) & 0xFF) << 16 | (paramByteBuffer.get(j) & 0xFF) << 24, localByteBuffer1);
          j += 3;
        }
      }
      localByteBuffer1 = m(m);
      for (;;)
      {
        localByteBuffer2 = localByteBuffer1;
        if (j >= k) {
          break;
        }
        n(paramByteBuffer.get(j) & 0xFF | (paramByteBuffer.get(j + 1) & 0xFF) << 8 | (paramByteBuffer.get(j + 2) & 0xFF) << 16 | (paramByteBuffer.get(j + 3) & 0xFF) << 24, localByteBuffer1);
        j += 4;
      }
    }
    ByteBuffer localByteBuffer1 = m(m / 3 * 4);
    for (;;)
    {
      localByteBuffer2 = localByteBuffer1;
      if (j >= k) {
        break;
      }
      n((paramByteBuffer.get(j) & 0xFF) << 8 | (paramByteBuffer.get(j + 1) & 0xFF) << 16 | (paramByteBuffer.get(j + 2) & 0xFF) << 24, localByteBuffer1);
      j += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer2.flip();
  }
  
  public b.a i(b.a parama)
  {
    int j = c;
    if (M.z0(j))
    {
      if (j != 4) {
        parama = new b.a(a, b, 4);
      } else {
        parama = b.a.e;
      }
      return parama;
    }
    throw new b.b(parama);
  }
}

/* Location:
 * Qualified Name:     m0.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */