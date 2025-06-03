package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import v5.e0;

public final class a0
  extends q
{
  public final long i = 150000L;
  public final long j = 20000L;
  public final short k = (short)'Ѐ';
  public int l;
  public boolean m;
  public byte[] n;
  public byte[] o;
  public int p;
  public int q;
  public int r;
  public boolean s;
  public long t;
  
  public a0()
  {
    byte[] arrayOfByte = e0.f;
    n = arrayOfByte;
    o = arrayOfByte;
  }
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    while ((paramByteBuffer.hasRemaining()) && (!g.hasRemaining()))
    {
      int i1 = p;
      int i2;
      int i5;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 == 2)
          {
            i1 = paramByteBuffer.limit();
            i2 = k(paramByteBuffer);
            paramByteBuffer.limit(i2);
            t += paramByteBuffer.remaining() / l;
            m(paramByteBuffer, o, r);
            if (i2 < i1)
            {
              l(o, r);
              p = 0;
              paramByteBuffer.limit(i1);
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          i1 = paramByteBuffer.limit();
          int i3 = k(paramByteBuffer);
          i2 = i3 - paramByteBuffer.position();
          byte[] arrayOfByte = n;
          int i4 = arrayOfByte.length;
          i5 = q;
          i4 -= i5;
          if ((i3 < i1) && (i2 < i4))
          {
            l(arrayOfByte, i5);
            q = 0;
            p = 0;
          }
          else
          {
            i2 = Math.min(i2, i4);
            paramByteBuffer.limit(paramByteBuffer.position() + i2);
            paramByteBuffer.get(n, q, i2);
            i2 = q + i2;
            q = i2;
            arrayOfByte = n;
            if (i2 == arrayOfByte.length)
            {
              if (s)
              {
                l(arrayOfByte, r);
                t += (q - r * 2) / l;
              }
              else
              {
                t += (i2 - r) / l;
              }
              m(paramByteBuffer, n, q);
              q = 0;
              p = 2;
            }
            paramByteBuffer.limit(i1);
          }
        }
      }
      else
      {
        i5 = paramByteBuffer.limit();
        paramByteBuffer.limit(Math.min(i5, paramByteBuffer.position() + n.length));
        i1 = paramByteBuffer.limit();
        do
        {
          i2 = i1 - 2;
          if (i2 < paramByteBuffer.position()) {
            break;
          }
          i1 = i2;
        } while (Math.abs(paramByteBuffer.getShort(i2)) <= k);
        i1 = l;
        i1 = i2 / i1 * i1 + i1;
        break label438;
        i1 = paramByteBuffer.position();
        label438:
        if (i1 == paramByteBuffer.position())
        {
          p = 1;
        }
        else
        {
          paramByteBuffer.limit(i1);
          i1 = paramByteBuffer.remaining();
          j(i1).put(paramByteBuffer).flip();
          if (i1 > 0) {
            s = true;
          }
        }
        paramByteBuffer.limit(i5);
      }
    }
  }
  
  public final f.a f(f.a parama)
  {
    if (c == 2)
    {
      if (!m) {
        parama = f.a.e;
      }
      return parama;
    }
    throw new f.b(parama);
  }
  
  public final void g()
  {
    if (m)
    {
      f.a locala = b;
      int i1 = d;
      l = i1;
      long l1 = i;
      int i2 = a;
      int i3 = (int)(l1 * i2 / 1000000L) * i1;
      if (n.length != i3) {
        n = new byte[i3];
      }
      i2 = (int)(j * i2 / 1000000L) * i1;
      r = i2;
      if (o.length != i2) {
        o = new byte[i2];
      }
    }
    p = 0;
    t = 0L;
    q = 0;
    s = false;
  }
  
  public final void h()
  {
    int i1 = q;
    if (i1 > 0) {
      l(n, i1);
    }
    if (!s) {
      t += r / l;
    }
  }
  
  public final void i()
  {
    m = false;
    r = 0;
    byte[] arrayOfByte = e0.f;
    n = arrayOfByte;
    o = arrayOfByte;
  }
  
  public final boolean isActive()
  {
    return m;
  }
  
  public final int k(ByteBuffer paramByteBuffer)
  {
    for (int i1 = paramByteBuffer.position(); i1 < paramByteBuffer.limit(); i1 += 2) {
      if (Math.abs(paramByteBuffer.getShort(i1)) > k)
      {
        int i2 = l;
        return i1 / i2 * i2;
      }
    }
    return paramByteBuffer.limit();
  }
  
  public final void l(byte[] paramArrayOfByte, int paramInt)
  {
    j(paramInt).put(paramArrayOfByte, 0, paramInt).flip();
    if (paramInt > 0) {
      s = true;
    }
  }
  
  public final void m(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramByteBuffer.remaining(), r);
    int i2 = r - i1;
    System.arraycopy(paramArrayOfByte, paramInt - i2, o, 0, i2);
    paramByteBuffer.position(paramByteBuffer.limit() - i1);
    paramByteBuffer.get(o, i2, i1);
  }
}

/* Location:
 * Qualified Name:     x3.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */