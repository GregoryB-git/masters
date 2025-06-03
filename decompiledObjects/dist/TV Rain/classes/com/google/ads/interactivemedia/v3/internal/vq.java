package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public final class vq
{
  private int a;
  private long[] b = new long[32];
  
  public vq()
  {
    this(32);
  }
  
  private vq(int paramInt) {}
  
  public final int a()
  {
    return a;
  }
  
  public final long a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < a)) {
      return b[paramInt];
    }
    int i = a;
    StringBuilder localStringBuilder = new StringBuilder(46);
    localStringBuilder.append("Invalid index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", size is ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final void a(long paramLong)
  {
    int i = a;
    long[] arrayOfLong = b;
    if (i == arrayOfLong.length) {
      b = Arrays.copyOf(arrayOfLong, i << 1);
    }
    arrayOfLong = b;
    i = a;
    a = (i + 1);
    arrayOfLong[i] = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */