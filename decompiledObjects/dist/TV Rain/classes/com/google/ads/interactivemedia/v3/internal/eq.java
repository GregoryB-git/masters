package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

final class eq
  extends ef
{
  private static final int e = Float.floatToIntBits(NaN.0F);
  
  private static void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    int i = Float.floatToIntBits((float)(paramInt * 4.656612875245797E-10D));
    paramInt = i;
    if (i == e) {
      paramInt = Float.floatToIntBits(0.0F);
    }
    paramByteBuffer.putInt(paramInt);
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    int i;
    if (d == 1073741824) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    int m = k - j;
    if (i == 0) {
      m = m / 3 << 2;
    }
    ByteBuffer localByteBuffer = a(m);
    m = j;
    if (i != 0) {
      while (j < k)
      {
        a(paramByteBuffer.get(j) & 0xFF | (paramByteBuffer.get(j + 1) & 0xFF) << 8 | (paramByteBuffer.get(j + 2) & 0xFF) << 16 | (paramByteBuffer.get(j + 3) & 0xFF) << 24, localByteBuffer);
        j += 4;
      }
    }
    while (m < k)
    {
      a((paramByteBuffer.get(m) & 0xFF) << 8 | (paramByteBuffer.get(m + 1) & 0xFF) << 16 | (paramByteBuffer.get(m + 2) & 0xFF) << 24, localByteBuffer);
      m += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    localByteBuffer.flip();
  }
  
  public final boolean a()
  {
    return wl.d(d);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    if (wl.d(paramInt3)) {
      return b(paramInt1, paramInt2, paramInt3);
    }
    throw new do(paramInt1, paramInt2, paramInt3);
  }
  
  public final int c()
  {
    return 4;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.eq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */