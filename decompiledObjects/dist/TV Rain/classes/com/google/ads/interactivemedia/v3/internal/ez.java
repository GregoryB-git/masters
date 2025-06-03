package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class ez
  extends ev
{
  public final ey a = new ey();
  public ByteBuffer b;
  public long c;
  public ByteBuffer d;
  private final int e;
  
  public ez()
  {
    this(1);
  }
  
  public ez(int paramInt)
  {
    e = paramInt;
  }
  
  private final ByteBuffer e(int paramInt)
  {
    int i = e;
    if (i == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (i == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    Object localObject = b;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((Buffer)localObject).capacity();
    }
    localObject = new StringBuilder(44);
    ((StringBuilder)localObject).append("Buffer too small (");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" < ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(")");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final void a()
  {
    super.a();
    ByteBuffer localByteBuffer = b;
    if (localByteBuffer != null) {
      localByteBuffer.clear();
    }
  }
  
  public final void d(int paramInt)
  {
    ByteBuffer localByteBuffer = b;
    if (localByteBuffer == null)
    {
      b = e(paramInt);
      return;
    }
    int i = localByteBuffer.capacity();
    int j = b.position();
    paramInt += j;
    if (i >= paramInt) {
      return;
    }
    localByteBuffer = e(paramInt);
    if (j > 0)
    {
      b.position(0);
      b.limit(j);
      localByteBuffer.put(b);
    }
    b = localByteBuffer;
  }
  
  public final boolean f()
  {
    return (b == null) && (e == 0);
  }
  
  public final boolean g()
  {
    return c(1073741824);
  }
  
  public final void h()
  {
    b.flip();
    ByteBuffer localByteBuffer = d;
    if (localByteBuffer != null) {
      localByteBuffer.flip();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ez
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */