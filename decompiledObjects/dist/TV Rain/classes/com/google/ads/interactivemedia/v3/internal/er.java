package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class er
  extends ef
{
  private int e;
  private boolean f;
  private byte[] g;
  private byte[] h;
  private int i;
  private int j;
  private int k;
  private boolean l;
  private long m;
  
  public er()
  {
    byte[] arrayOfByte = wl.f;
    g = arrayOfByte;
    h = arrayOfByte;
  }
  
  private final int a(long paramLong)
  {
    return (int)(paramLong * b / 1000000L);
  }
  
  private final void a(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte, int paramInt)
  {
    int n = Math.min(paramByteBuffer.remaining(), k);
    int i1 = k - n;
    System.arraycopy(paramArrayOfByte, paramInt - i1, h, 0, i1);
    paramByteBuffer.position(paramByteBuffer.limit() - n);
    paramByteBuffer.get(h, i1, n);
  }
  
  private final void a(byte[] paramArrayOfByte, int paramInt)
  {
    a(paramInt).put(paramArrayOfByte, 0, paramInt).flip();
    if (paramInt > 0) {
      l = true;
    }
  }
  
  private final int b(ByteBuffer paramByteBuffer)
  {
    for (int n = paramByteBuffer.position() + 1; n < paramByteBuffer.limit(); n += 2) {
      if (Math.abs(paramByteBuffer.get(n)) > 4)
      {
        int i1 = e;
        return n / i1 * i1;
      }
    }
    return paramByteBuffer.limit();
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    while ((paramByteBuffer.hasRemaining()) && (!j()))
    {
      int n = i;
      int i1;
      int i4;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2)
          {
            i1 = paramByteBuffer.limit();
            n = b(paramByteBuffer);
            paramByteBuffer.limit(n);
            m += paramByteBuffer.remaining() / e;
            a(paramByteBuffer, h, k);
            if (n < i1)
            {
              a(h, k);
              i = 0;
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
          n = paramByteBuffer.limit();
          int i2 = b(paramByteBuffer);
          i1 = i2 - paramByteBuffer.position();
          byte[] arrayOfByte = g;
          int i3 = arrayOfByte.length;
          i4 = j;
          i3 -= i4;
          if ((i2 < n) && (i1 < i3))
          {
            a(arrayOfByte, i4);
            j = 0;
            i = 0;
          }
          else
          {
            i1 = Math.min(i1, i3);
            paramByteBuffer.limit(paramByteBuffer.position() + i1);
            paramByteBuffer.get(g, j, i1);
            i1 = j + i1;
            j = i1;
            arrayOfByte = g;
            if (i1 == arrayOfByte.length)
            {
              if (l)
              {
                a(arrayOfByte, k);
                m += (j - (k << 1)) / e;
              }
              else
              {
                m += (i1 - k) / e;
              }
              a(paramByteBuffer, g, j);
              j = 0;
              i = 2;
            }
            paramByteBuffer.limit(n);
          }
        }
      }
      else
      {
        i1 = paramByteBuffer.limit();
        paramByteBuffer.limit(Math.min(i1, paramByteBuffer.position() + g.length));
        for (n = paramByteBuffer.limit() - 1; n >= paramByteBuffer.position(); n -= 2) {
          if (Math.abs(paramByteBuffer.get(n)) > 4)
          {
            i4 = e;
            n = n / i4 * i4 + i4;
            break label436;
          }
        }
        n = paramByteBuffer.position();
        label436:
        if (n == paramByteBuffer.position())
        {
          i = 1;
        }
        else
        {
          paramByteBuffer.limit(n);
          n = paramByteBuffer.remaining();
          a(n).put(paramByteBuffer).flip();
          if (n > 0) {
            l = true;
          }
        }
        paramByteBuffer.limit(i1);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    f = paramBoolean;
    h();
  }
  
  public final boolean a()
  {
    return (super.a()) && (f);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    if (paramInt3 == 2)
    {
      e = (paramInt2 << 1);
      return b(paramInt1, paramInt2, paramInt3);
    }
    throw new do(paramInt1, paramInt2, paramInt3);
  }
  
  public final void k()
  {
    int n = j;
    if (n > 0) {
      a(g, n);
    }
    if (!l) {
      m += k / e;
    }
  }
  
  public final void l()
  {
    if (a())
    {
      int n = a(150000L) * e;
      if (g.length != n) {
        g = new byte[n];
      }
      n = a(20000L) * e;
      k = n;
      if (h.length != n) {
        h = new byte[n];
      }
    }
    i = 0;
    m = 0L;
    j = 0;
    l = false;
  }
  
  public final void m()
  {
    f = false;
    k = 0;
    byte[] arrayOfByte = wl.f;
    g = arrayOfByte;
    h = arrayOfByte;
  }
  
  public final long n()
  {
    return m;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.er
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */