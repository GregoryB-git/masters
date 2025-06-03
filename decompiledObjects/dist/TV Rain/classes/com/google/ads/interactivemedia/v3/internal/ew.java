package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

final class ew
  extends ef
{
  private boolean e;
  private int f;
  private int g;
  private int h;
  private boolean i;
  private int j;
  private byte[] k = wl.f;
  private int l;
  private long m;
  
  public final void a(int paramInt1, int paramInt2)
  {
    f = paramInt1;
    g = paramInt2;
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    int n = paramByteBuffer.position();
    int i1 = paramByteBuffer.limit();
    int i2 = i1 - n;
    if (i2 == 0) {
      return;
    }
    i = true;
    int i3 = Math.min(i2, j);
    m += i3 / h;
    j -= i3;
    paramByteBuffer.position(n + i3);
    if (j > 0) {
      return;
    }
    n = i2 - i3;
    i2 = l + n - k.length;
    ByteBuffer localByteBuffer = a(i2);
    i3 = wl.a(i2, 0, l);
    localByteBuffer.put(k, 0, i3);
    i2 = wl.a(i2 - i3, 0, n);
    paramByteBuffer.limit(paramByteBuffer.position() + i2);
    localByteBuffer.put(paramByteBuffer);
    paramByteBuffer.limit(i1);
    i1 = n - i2;
    n = l - i3;
    l = n;
    byte[] arrayOfByte = k;
    System.arraycopy(arrayOfByte, i3, arrayOfByte, 0, n);
    paramByteBuffer.get(k, l, i1);
    l += i1;
    localByteBuffer.flip();
  }
  
  public final boolean a()
  {
    return e;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    if (paramInt3 == 2)
    {
      int n = l;
      if (n > 0) {
        m += n / h;
      }
      int i1 = wl.b(2, paramInt2);
      h = i1;
      int i2 = g;
      k = new byte[i2 * i1];
      l = 0;
      n = f;
      j = (i1 * n);
      boolean bool1 = e;
      boolean bool2;
      if ((n == 0) && (i2 == 0)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      e = bool2;
      i = false;
      b(paramInt1, paramInt2, paramInt3);
      return bool1 != e;
    }
    throw new do(paramInt1, paramInt2, paramInt3);
  }
  
  public final ByteBuffer f()
  {
    if (super.g())
    {
      int n = l;
      if (n > 0)
      {
        a(n).put(k, 0, l).flip();
        l = 0;
      }
    }
    return super.f();
  }
  
  public final boolean g()
  {
    return (super.g()) && (l == 0);
  }
  
  public final void l()
  {
    if (i) {
      j = 0;
    }
    l = 0;
  }
  
  public final void m()
  {
    k = wl.f;
  }
  
  public final void n()
  {
    m = 0L;
  }
  
  public final long o()
  {
    return m;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */