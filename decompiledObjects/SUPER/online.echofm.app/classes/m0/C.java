package m0;

import e0.b.a;
import e0.b.b;
import e0.d;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class C
  extends d
{
  public int[] i;
  public int[] j;
  
  public void f(ByteBuffer paramByteBuffer)
  {
    int[] arrayOfInt = (int[])a.e(j);
    int k = paramByteBuffer.position();
    int m = paramByteBuffer.limit();
    ByteBuffer localByteBuffer = m((m - k) / b.d * c.d);
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
  
  public b.a i(b.a parama)
  {
    int[] arrayOfInt = i;
    if (arrayOfInt == null) {
      return b.a.e;
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
          throw new b.b(parama);
        }
      }
      if (k != 0) {
        parama = new b.a(a, arrayOfInt.length, 2);
      } else {
        parama = b.a.e;
      }
      return parama;
    }
    throw new b.b(parama);
  }
  
  public void j()
  {
    j = i;
  }
  
  public void l()
  {
    j = null;
    i = null;
  }
  
  public void n(int[] paramArrayOfInt)
  {
    i = paramArrayOfInt;
  }
}

/* Location:
 * Qualified Name:     m0.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */