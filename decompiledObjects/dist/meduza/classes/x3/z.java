package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import v5.e0;

public final class z
  extends q
{
  public final void b(ByteBuffer paramByteBuffer)
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
        n = k;
        if (m == 268435456) {
          break label100;
        }
        if (m != 536870912)
        {
          if (m != 805306368) {
            throw new IllegalStateException();
          }
        }
        else
        {
          n = k / 3;
          break label94;
        }
      }
      n = k / 2;
      break label100;
    }
    label94:
    n *= 2;
    label100:
    ByteBuffer localByteBuffer = j(n);
    k = b.c;
    n = i;
    if (k != 3)
    {
      n = i;
      if (k != 4)
      {
        n = i;
        if (k != 268435456)
        {
          n = i;
          if (k != 536870912)
          {
            if (k == 805306368) {
              while (i < j)
              {
                localByteBuffer.put(paramByteBuffer.get(i + 2));
                localByteBuffer.put(paramByteBuffer.get(i + 3));
                i += 4;
              }
            }
            throw new IllegalStateException();
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
          localByteBuffer.put(paramByteBuffer.get(n + 1));
          localByteBuffer.put(paramByteBuffer.get(n));
          n += 2;
        }
      }
      while (n < j)
      {
        i = (short)(int)(e0.h(paramByteBuffer.getFloat(n), -1.0F, 1.0F) * 32767.0F);
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
  
  public final f.a f(f.a parama)
  {
    int i = c;
    if ((i != 3) && (i != 2) && (i != 268435456) && (i != 536870912) && (i != 805306368) && (i != 4)) {
      throw new f.b(parama);
    }
    if (i != 2) {
      parama = new f.a(a, b, 2);
    } else {
      parama = f.a.e;
    }
    return parama;
  }
}

/* Location:
 * Qualified Name:     x3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */