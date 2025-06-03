package m0;

import e0.b.a;
import e0.b.b;
import e0.d;
import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class f0
  extends d
{
  public int i;
  public int j;
  public boolean k;
  public int l;
  public byte[] m = M.f;
  public int n;
  public long o;
  
  public boolean c()
  {
    boolean bool;
    if ((super.c()) && (n == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public ByteBuffer d()
  {
    if (super.c())
    {
      int i1 = n;
      if (i1 > 0)
      {
        m(i1).put(m, 0, n).flip();
        n = 0;
      }
    }
    return super.d();
  }
  
  public void f(ByteBuffer paramByteBuffer)
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
    i3 -= i4;
    i1 = n + i3 - m.length;
    ByteBuffer localByteBuffer = m(i1);
    i4 = M.p(i1, 0, n);
    localByteBuffer.put(m, 0, i4);
    i1 = M.p(i1 - i4, 0, i3);
    paramByteBuffer.limit(paramByteBuffer.position() + i1);
    localByteBuffer.put(paramByteBuffer);
    paramByteBuffer.limit(i2);
    i2 = i3 - i1;
    i3 = n - i4;
    n = i3;
    byte[] arrayOfByte = m;
    System.arraycopy(arrayOfByte, i4, arrayOfByte, 0, i3);
    paramByteBuffer.get(m, n, i2);
    n += i2;
    localByteBuffer.flip();
  }
  
  public b.a i(b.a parama)
  {
    if (c == 2)
    {
      k = true;
      b.a locala = parama;
      if (i == 0) {
        if (j != 0) {
          locala = parama;
        } else {
          locala = b.a.e;
        }
      }
      return locala;
    }
    throw new b.b(parama);
  }
  
  public void j()
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
  
  public void k()
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
  
  public void l()
  {
    m = M.f;
  }
  
  public long n()
  {
    return o;
  }
  
  public void o()
  {
    o = 0L;
  }
  
  public void p(int paramInt1, int paramInt2)
  {
    i = paramInt1;
    j = paramInt2;
  }
}

/* Location:
 * Qualified Name:     m0.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */