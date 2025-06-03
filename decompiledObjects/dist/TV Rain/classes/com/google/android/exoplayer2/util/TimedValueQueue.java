package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class TimedValueQueue<V>
{
  private static final int INITIAL_BUFFER_SIZE = 10;
  private int first;
  private int size;
  private long[] timestamps;
  private V[] values;
  
  public TimedValueQueue()
  {
    this(10);
  }
  
  public TimedValueQueue(int paramInt)
  {
    timestamps = new long[paramInt];
    values = newArray(paramInt);
  }
  
  private void addUnchecked(long paramLong, V paramV)
  {
    int i = first;
    int j = size;
    Object[] arrayOfObject = values;
    i = (i + j) % arrayOfObject.length;
    timestamps[i] = paramLong;
    arrayOfObject[i] = paramV;
    size = (j + 1);
  }
  
  private void clearBufferOnTimeDiscontinuity(long paramLong)
  {
    int i = size;
    if (i > 0)
    {
      int j = first;
      int k = values.length;
      if (paramLong <= timestamps[((j + i - 1) % k)]) {
        clear();
      }
    }
  }
  
  private void doubleCapacityIfFull()
  {
    int i = values.length;
    if (size < i) {
      return;
    }
    int j = i * 2;
    long[] arrayOfLong = new long[j];
    Object[] arrayOfObject = newArray(j);
    j = first;
    i -= j;
    System.arraycopy(timestamps, j, arrayOfLong, 0, i);
    System.arraycopy(values, first, arrayOfObject, 0, i);
    j = first;
    if (j > 0)
    {
      System.arraycopy(timestamps, 0, arrayOfLong, i, j);
      System.arraycopy(values, 0, arrayOfObject, i, first);
    }
    timestamps = arrayOfLong;
    values = arrayOfObject;
    first = 0;
  }
  
  private static <V> V[] newArray(int paramInt)
  {
    return new Object[paramInt];
  }
  
  @Nullable
  private V poll(long paramLong, boolean paramBoolean)
  {
    long l1 = Long.MAX_VALUE;
    V ? = null;
    for (;;)
    {
      int i = size;
      if (i <= 0) {
        break;
      }
      Object localObject = timestamps;
      int j = first;
      long l2 = paramLong - localObject[j];
      if ((l2 < 0L) && ((paramBoolean) || (-l2 >= l1))) {
        break;
      }
      localObject = values;
      ? = localObject[j];
      localObject[j] = null;
      first = ((j + 1) % localObject.length);
      size = (i - 1);
      l1 = l2;
    }
    return ?;
  }
  
  public void add(long paramLong, V paramV)
  {
    try
    {
      clearBufferOnTimeDiscontinuity(paramLong);
      doubleCapacityIfFull();
      addUnchecked(paramLong, paramV);
      return;
    }
    finally
    {
      paramV = finally;
      throw paramV;
    }
  }
  
  public void clear()
  {
    try
    {
      first = 0;
      size = 0;
      Arrays.fill(values, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public V poll(long paramLong)
  {
    try
    {
      Object localObject1 = poll(paramLong, false);
      return (V)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  @Nullable
  public V pollFloor(long paramLong)
  {
    try
    {
      Object localObject1 = poll(paramLong, true);
      return (V)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public int size()
  {
    try
    {
      int i = size;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.TimedValueQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */