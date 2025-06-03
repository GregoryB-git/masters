package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class ef
  implements dl
{
  public int b;
  public int c;
  public int d;
  private ByteBuffer e;
  private ByteBuffer f;
  private boolean g;
  
  public ef()
  {
    ByteBuffer localByteBuffer = dl.a;
    e = localByteBuffer;
    f = localByteBuffer;
    c = -1;
    b = -1;
    d = -1;
  }
  
  public final ByteBuffer a(int paramInt)
  {
    if (e.capacity() < paramInt) {
      e = ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
    } else {
      e.clear();
    }
    ByteBuffer localByteBuffer = e;
    f = localByteBuffer;
    return localByteBuffer;
  }
  
  public boolean a()
  {
    return b != -1;
  }
  
  public int b()
  {
    return c;
  }
  
  public final boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == b) && (paramInt2 == c) && (paramInt3 == d)) {
      return false;
    }
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    return true;
  }
  
  public int c()
  {
    return d;
  }
  
  public final int d()
  {
    return b;
  }
  
  public final void e()
  {
    g = true;
    k();
  }
  
  public ByteBuffer f()
  {
    ByteBuffer localByteBuffer = f;
    f = dl.a;
    return localByteBuffer;
  }
  
  public boolean g()
  {
    return (g) && (f == dl.a);
  }
  
  public final void h()
  {
    f = dl.a;
    g = false;
    l();
  }
  
  public final void i()
  {
    h();
    e = dl.a;
    b = -1;
    c = -1;
    d = -1;
    m();
  }
  
  public final boolean j()
  {
    return f.hasRemaining();
  }
  
  public void k() {}
  
  public void l() {}
  
  public void m() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */