package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

final class es
  extends ef
{
  public final void a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    int m = d;
    if (m != Integer.MIN_VALUE)
    {
      n = k;
      if (m != 3)
      {
        if (m == 1073741824)
        {
          n = k / 2;
          break label74;
        }
        throw new IllegalStateException();
      }
    }
    else
    {
      n = k / 3;
    }
    n <<= 1;
    label74:
    ByteBuffer localByteBuffer = a(n);
    k = d;
    int n = i;
    if (k != Integer.MIN_VALUE)
    {
      n = i;
      if (k != 3)
      {
        if (k == 1073741824) {
          while (i < j)
          {
            localByteBuffer.put(paramByteBuffer.get(i + 2));
            localByteBuffer.put(paramByteBuffer.get(i + 3));
            i += 4;
          }
        }
        throw new IllegalStateException();
      }
      while (n < j)
      {
        localByteBuffer.put((byte)0);
        localByteBuffer.put((byte)((paramByteBuffer.get(n) & 0xFF) - 128));
        n++;
      }
    }
    while (n < j)
    {
      localByteBuffer.put(paramByteBuffer.get(n + 1));
      localByteBuffer.put(paramByteBuffer.get(n + 2));
      n += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer.flip();
  }
  
  public final boolean a()
  {
    int i = d;
    return (i != 0) && (i != 2);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    if ((paramInt3 != 3) && (paramInt3 != 2) && (paramInt3 != Integer.MIN_VALUE) && (paramInt3 != 1073741824)) {
      throw new do(paramInt1, paramInt2, paramInt3);
    }
    return b(paramInt1, paramInt2, paramInt3);
  }
  
  public final int c()
  {
    return 2;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.es
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */