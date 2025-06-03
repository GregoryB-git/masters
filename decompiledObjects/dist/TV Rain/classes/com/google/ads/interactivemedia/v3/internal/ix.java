package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

final class ix
{
  public byte[] a;
  public int b;
  private final int c;
  private boolean d;
  private boolean e;
  
  public ix(int paramInt1, int paramInt2)
  {
    c = paramInt1;
    byte[] arrayOfByte = new byte[''];
    a = arrayOfByte;
    arrayOfByte[2] = ((byte)1);
  }
  
  public final void a()
  {
    d = false;
    e = false;
  }
  
  public final void a(int paramInt)
  {
    boolean bool1 = d;
    boolean bool2 = true;
    rp.c(bool1 ^ true);
    if (paramInt != c) {
      bool2 = false;
    }
    d = bool2;
    if (bool2)
    {
      b = 3;
      e = false;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!d) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = a;
    int j = arrayOfByte.length;
    paramInt2 = b;
    if (j < paramInt2 + i) {
      a = Arrays.copyOf(arrayOfByte, paramInt2 + i << 1);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, a, b, i);
    b += i;
  }
  
  public final boolean b()
  {
    return e;
  }
  
  public final boolean b(int paramInt)
  {
    if (!d) {
      return false;
    }
    b -= paramInt;
    d = false;
    e = true;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */