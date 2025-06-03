package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import v5.e0;

public final class d0
  extends q
{
  public int i;
  public int j;
  public boolean k;
  public int l;
  public byte[] m = e0.f;
  public int n;
  public long o;
  
  public final ByteBuffer a()
  {
    if (super.d())
    {
      int i1 = n;
      if (i1 > 0)
      {
        j(i1).put(m, 0, n).flip();
        n = 0;
      }
    }
    return super.a();
  }
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    int i1 = paramByteBuffer.position();
    int i2 = paramByteBuffer.limit();
    int i3 = i2 - i1;
    if (i3 == 0) {
      return;
    }
    int i4 = Math.min(i3, l);
    o += i4 / b.d;
    l -= i4;
    paramByteBuffer.position(i1 + i4);
    if (l > 0) {
      return;
    }
    i4 = i3 - i4;
    i3 = n + i4 - m.length;
    ByteBuffer localByteBuffer = j(i3);
    i1 = e0.i(i3, 0, n);
    localByteBuffer.put(m, 0, i1);
    i3 = e0.i(i3 - i1, 0, i4);
    paramByteBuffer.limit(paramByteBuffer.position() + i3);
    localByteBuffer.put(paramByteBuffer);
    paramByteBuffer.limit(i2);
    i2 = i4 - i3;
    i4 = n - i1;
    n = i4;
    byte[] arrayOfByte = m;
    System.arraycopy(arrayOfByte, i1, arrayOfByte, 0, i4);
    paramByteBuffer.get(m, n, i2);
    n += i2;
    localByteBuffer.flip();
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((super.d()) && (n == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final f.a f(f.a parama)
  {
    if (c == 2)
    {
      k = true;
      f.a locala = parama;
      if (i == 0) {
        if (j != 0) {
          locala = parama;
        } else {
          locala = f.a.e;
        }
      }
      return locala;
    }
    throw new f.b(parama);
  }
  
  public final void g()
  {
    if (k)
    {
      k = false;
      int i1 = j;
      int i2 = b.d;
      m = new byte[i1 * i2];
      l = (i * i2);
    }
    n = 0;
  }
  
  public final void h()
  {
    if (k)
    {
      int i1 = n;
      if (i1 > 0) {
        o += i1 / b.d;
      }
      n = 0;
    }
  }
  
  public final void i()
  {
    m = e0.f;
  }
}

/* Location:
 * Qualified Name:     x3.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */