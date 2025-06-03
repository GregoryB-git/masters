package com.google.android.exoplayer2.util;

import a;
import java.util.Arrays;

public final class LongArray
{
  private static final int DEFAULT_INITIAL_CAPACITY = 32;
  private int size;
  private long[] values;
  
  public LongArray()
  {
    this(32);
  }
  
  public LongArray(int paramInt)
  {
    values = new long[paramInt];
  }
  
  public void add(long paramLong)
  {
    int i = size;
    long[] arrayOfLong = values;
    if (i == arrayOfLong.length) {
      values = Arrays.copyOf(arrayOfLong, i * 2);
    }
    arrayOfLong = values;
    i = size;
    size = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public long get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size)) {
      return values[paramInt];
    }
    StringBuilder localStringBuilder = a.r("Invalid index ", paramInt, ", size is ");
    localStringBuilder.append(size);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public int size()
  {
    return size;
  }
  
  public long[] toArray()
  {
    return Arrays.copyOf(values, size);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.LongArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */