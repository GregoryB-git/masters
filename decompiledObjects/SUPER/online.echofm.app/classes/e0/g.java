package e0;

import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class g
  extends d
{
  public void f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    int m = b.c;
    int n = k;
    if (m != 3)
    {
      if (m != 4)
      {
        if (m != 21)
        {
          if (m == 22) {
            break label105;
          }
          n = k;
          if (m == 268435456) {
            break label111;
          }
          if (m != 1342177280)
          {
            if (m == 1610612736) {
              break label105;
            }
            throw new IllegalStateException();
          }
        }
        n = k / 3;
      }
    }
    else
    {
      n *= 2;
      break label111;
    }
    label105:
    n = k / 2;
    label111:
    ByteBuffer localByteBuffer = m(n);
    k = b.c;
    n = i;
    if (k != 3)
    {
      n = i;
      if (k != 4)
      {
        n = i;
        if (k != 21)
        {
          n = i;
          if (k != 22)
          {
            n = i;
            if (k != 268435456)
            {
              n = i;
              if (k != 1342177280)
              {
                if (k == 1610612736) {
                  while (i < j)
                  {
                    localByteBuffer.put(paramByteBuffer.get(i + 1));
                    localByteBuffer.put(paramByteBuffer.get(i));
                    i += 4;
                  }
                }
                throw new IllegalStateException();
              }
              while (n < j)
              {
                localByteBuffer.put(paramByteBuffer.get(n + 1));
                localByteBuffer.put(paramByteBuffer.get(n));
                n += 3;
              }
            }
            while (n < j)
            {
              localByteBuffer.put(paramByteBuffer.get(n + 1));
              localByteBuffer.put(paramByteBuffer.get(n));
              n += 2;
            }
          }
          while (n < j)
          {
            localByteBuffer.put(paramByteBuffer.get(n + 2));
            localByteBuffer.put(paramByteBuffer.get(n + 3));
            n += 4;
          }
        }
        while (n < j)
        {
          localByteBuffer.put(paramByteBuffer.get(n + 1));
          localByteBuffer.put(paramByteBuffer.get(n + 2));
          n += 3;
        }
      }
      while (n < j)
      {
        i = (short)(int)(M.o(paramByteBuffer.getFloat(n), -1.0F, 1.0F) * 32767.0F);
        localByteBuffer.put((byte)(i & 0xFF));
        localByteBuffer.put((byte)(i >> 8 & 0xFF));
        n += 4;
      }
    }
    while (n < j)
    {
      localByteBuffer.put((byte)0);
      localByteBuffer.put((byte)((paramByteBuffer.get(n) & 0xFF) - 128));
      n++;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer.flip();
  }
  
  public b.a i(b.a parama)
  {
    int i = c;
    if ((i != 3) && (i != 2) && (i != 268435456) && (i != 21) && (i != 1342177280) && (i != 22) && (i != 1610612736) && (i != 4)) {
      throw new b.b(parama);
    }
    if (i != 2) {
      parama = new b.a(a, b, 2);
    } else {
      parama = b.a.e;
    }
    return parama;
  }
}

/* Location:
 * Qualified Name:     e0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */