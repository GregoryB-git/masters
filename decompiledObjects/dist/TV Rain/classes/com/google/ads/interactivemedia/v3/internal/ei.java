package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class ei
  extends ef
{
  private int[] e;
  private boolean f;
  private int[] g;
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    int[] arrayOfInt = (int[])rp.a(g);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    ByteBuffer localByteBuffer = a((j - i) / (c * 2) * arrayOfInt.length << 1);
    while (i < j)
    {
      int k = arrayOfInt.length;
      for (int m = 0; m < k; m++) {
        localByteBuffer.putShort(paramByteBuffer.getShort(arrayOfInt[m] * 2 + i));
      }
      i += (c << 1);
    }
    paramByteBuffer.position(j);
    localByteBuffer.flip();
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    e = paramArrayOfInt;
  }
  
  public final boolean a()
  {
    return f;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
    throws do
  {
    int i = Arrays.equals(e, g) ^ true;
    int[] arrayOfInt = e;
    g = arrayOfInt;
    if (arrayOfInt == null)
    {
      f = false;
      return i;
    }
    if (paramInt3 == 2)
    {
      if ((i == 0) && (!b(paramInt1, paramInt2, paramInt3))) {
        return false;
      }
      if (paramInt2 != arrayOfInt.length) {
        i = 1;
      } else {
        i = 0;
      }
      f = i;
      int j = 0;
      while (j < arrayOfInt.length)
      {
        int k = arrayOfInt[j];
        if (k < paramInt2)
        {
          i = f;
          if (k != j) {
            k = 1;
          } else {
            k = 0;
          }
          f = (k | i);
          j++;
        }
        else
        {
          throw new do(paramInt1, paramInt2, paramInt3);
        }
      }
      return true;
    }
    throw new do(paramInt1, paramInt2, paramInt3);
  }
  
  public final int b()
  {
    int[] arrayOfInt = g;
    if (arrayOfInt == null) {
      return c;
    }
    return arrayOfInt.length;
  }
  
  public final void m()
  {
    g = null;
    e = null;
    f = false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */