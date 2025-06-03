package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

final class im
{
  private static final byte[] d = { 0, 0, 1 };
  public int a;
  public int b;
  public byte[] c = new byte[''];
  private boolean e;
  
  public im(int paramInt) {}
  
  public final void a()
  {
    e = false;
    a = 0;
    b = 0;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!e) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = c;
    int j = arrayOfByte.length;
    paramInt2 = a;
    if (j < paramInt2 + i) {
      c = Arrays.copyOf(arrayOfByte, paramInt2 + i << 1);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, c, a, i);
    a += i;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    if (e)
    {
      paramInt2 = a - paramInt2;
      a = paramInt2;
      if ((b == 0) && (paramInt1 == 181))
      {
        b = paramInt2;
      }
      else
      {
        e = false;
        return true;
      }
    }
    else if (paramInt1 == 179)
    {
      e = true;
    }
    byte[] arrayOfByte = d;
    a(arrayOfByte, 0, arrayOfByte.length);
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.im
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */