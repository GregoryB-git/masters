package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class et
  implements dl
{
  private int b = -1;
  private int c = -1;
  private float d = 1.0F;
  private float e = 1.0F;
  private int f = -1;
  private int g;
  private boolean h;
  private eu i;
  private ByteBuffer j;
  private ShortBuffer k;
  private ByteBuffer l;
  private long m;
  private long n;
  private boolean o;
  
  public et()
  {
    ByteBuffer localByteBuffer = dl.a;
    j = localByteBuffer;
    k = localByteBuffer.asShortBuffer();
    l = localByteBuffer;
    g = -1;
  }
  
  public final float a(float paramFloat)
  {
    paramFloat = wl.a(paramFloat, 0.1F, 8.0F);
    if (d != paramFloat)
    {
      d = paramFloat;
      h = true;
    }
    h();
    return paramFloat;
  }
  
  public final long a(long paramLong)
  {
    long l1 = n;
    if (l1 >= 1024L)
    {
      int i1 = f;
      int i2 = c;
      if (i1 == i2) {
        return wl.c(paramLong, m, l1);
      }
      return wl.c(paramLong, m * i1, l1 * i2);
    }
    return (d * paramLong);
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    eu localeu = (eu)rp.a(i);
    if (paramByteBuffer.hasRemaining())
    {
      ShortBuffer localShortBuffer = paramByteBuffer.asShortBuffer();
      i1 = paramByteBuffer.remaining();
      m += i1;
      localeu.a(localShortBuffer);
      paramByteBuffer.position(paramByteBuffer.position() + i1);
    }
    int i1 = localeu.c();
    if (i1 > 0)
    {
      if (j.capacity() < i1)
      {
        paramByteBuffer = ByteBuffer.allocateDirect(i1).order(ByteOrder.nativeOrder());
        j = paramByteBuffer;
        k = paramByteBuffer.asShortBuffer();
      }
      else
      {
        j.clear();
        k.clear();
      }
      localeu.b(k);
      n += i1;
      j.limit(i1);
      l = j;
    }
  }
  
  public final boolean a()
  {
    return (c != -1) && ((Math.abs(d - 1.0F) >= 0.01F) || (Math.abs(e - 1.0F) >= 0.01F) || (f != c));
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    if (paramInt3 == 2)
    {
      int i1 = g;
      paramInt3 = i1;
      if (i1 == -1) {
        paramInt3 = paramInt1;
      }
      if ((c == paramInt1) && (b == paramInt2) && (f == paramInt3)) {
        return false;
      }
      c = paramInt1;
      b = paramInt2;
      f = paramInt3;
      h = true;
      return true;
    }
    throw new do(paramInt1, paramInt2, paramInt3);
  }
  
  public final float b(float paramFloat)
  {
    paramFloat = wl.a(paramFloat, 0.1F, 8.0F);
    if (e != paramFloat)
    {
      e = paramFloat;
      h = true;
    }
    h();
    return paramFloat;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final int c()
  {
    return 2;
  }
  
  public final int d()
  {
    return f;
  }
  
  public final void e()
  {
    eu localeu = i;
    if (localeu != null) {
      localeu.a();
    }
    o = true;
  }
  
  public final ByteBuffer f()
  {
    ByteBuffer localByteBuffer = l;
    l = dl.a;
    return localByteBuffer;
  }
  
  public final boolean g()
  {
    if (o)
    {
      eu localeu = i;
      if ((localeu == null) || (localeu.c() == 0)) {
        return true;
      }
    }
    return false;
  }
  
  public final void h()
  {
    if (a()) {
      if (h)
      {
        i = new eu(c, b, d, e, f);
      }
      else
      {
        eu localeu = i;
        if (localeu != null) {
          localeu.b();
        }
      }
    }
    l = dl.a;
    m = 0L;
    n = 0L;
    o = false;
  }
  
  public final void i()
  {
    d = 1.0F;
    e = 1.0F;
    b = -1;
    c = -1;
    f = -1;
    ByteBuffer localByteBuffer = dl.a;
    j = localByteBuffer;
    k = localByteBuffer.asShortBuffer();
    l = localByteBuffer;
    g = -1;
    h = false;
    i = null;
    m = 0L;
    n = 0L;
    o = false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.et
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */