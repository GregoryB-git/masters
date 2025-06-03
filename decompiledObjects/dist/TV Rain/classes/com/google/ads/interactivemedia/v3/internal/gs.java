package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class gs
{
  private static final long[] a = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  private final byte[] b = new byte[8];
  private int c;
  private int d;
  
  public static int a(int paramInt)
  {
    for (int i = 0;; i++)
    {
      long[] arrayOfLong = a;
      if (i >= arrayOfLong.length) {
        break;
      }
      if ((arrayOfLong[i] & paramInt) != 0L) {
        return i + 1;
      }
    }
    paramInt = -1;
    return paramInt;
  }
  
  public static long a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l1 = paramArrayOfByte[0] & 0xFF;
    long l2 = l1;
    if (paramBoolean) {
      l2 = l1 & a[(paramInt - 1)];
    }
    for (int i = 1; i < paramInt; i++) {
      l2 = l2 << 8 | paramArrayOfByte[i] & 0xFF;
    }
    return l2;
  }
  
  public final long a(fz paramfz, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    throws IOException, InterruptedException
  {
    if (c == 0)
    {
      if (!paramfz.a(b, 0, 1, paramBoolean1)) {
        return -1L;
      }
      i = a(b[0] & 0xFF);
      d = i;
      if (i != -1) {
        c = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      }
    }
    int i = d;
    if (i > paramInt)
    {
      c = 0;
      return -2L;
    }
    if (i != 1) {
      paramfz.b(b, 1, i - 1);
    }
    c = 0;
    return a(b, d, paramBoolean2);
  }
  
  public final void a()
  {
    c = 0;
    d = 0;
  }
  
  public final int b()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */