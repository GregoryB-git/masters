package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class r
  extends q
{
  public int[] i;
  public int[] j;
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    int[] arrayOfInt = j;
    arrayOfInt.getClass();
    int k = paramByteBuffer.position();
    int m = paramByteBuffer.limit();
    ByteBuffer localByteBuffer = j((m - k) / b.d * c.d);
    while (k < m)
    {
      int n = arrayOfInt.length;
      for (int i1 = 0; i1 < n; i1++) {
        localByteBuffer.putShort(paramByteBuffer.getShort(arrayOfInt[i1] * 2 + k));
      }
      k += b.d;
    }
    paramByteBuffer.position(m);
    localByteBuffer.flip();
  }
  
  public final f.a f(f.a parama)
  {
    int[] arrayOfInt = i;
    if (arrayOfInt == null) {
      return f.a.e;
    }
    if (c == 2)
    {
      int k;
      if (b != arrayOfInt.length) {
        k = 1;
      } else {
        k = 0;
      }
      int m = 0;
      while (m < arrayOfInt.length)
      {
        int n = arrayOfInt[m];
        if (n < b)
        {
          if (n != m) {
            n = 1;
          } else {
            n = 0;
          }
          k |= n;
          m++;
        }
        else
        {
          throw new f.b(parama);
        }
      }
      if (k != 0) {
        parama = new f.a(a, arrayOfInt.length, 2);
      } else {
        parama = f.a.e;
      }
      return parama;
    }
    throw new f.b(parama);
  }
  
  public final void g()
  {
    j = i;
  }
  
  public final void i()
  {
    j = null;
    i = null;
  }
}

/* Location:
 * Qualified Name:     x3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */