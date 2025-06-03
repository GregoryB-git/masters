package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public final class wj<V>
{
  private long[] a = new long[10];
  private V[] b = new Object[10];
  private int c;
  private int d;
  
  public wj()
  {
    this(10);
  }
  
  private wj(int paramInt) {}
  
  public final V a(long paramLong)
  {
    V ? = null;
    try
    {
      for (;;)
      {
        int i = d;
        if (i <= 0) {
          break;
        }
        Object localObject2 = a;
        int j = c;
        if (paramLong - localObject2[j] < 0L) {
          break;
        }
        localObject2 = b;
        ? = localObject2[j];
        localObject2[j] = null;
        c = ((j + 1) % localObject2.length);
        d = (i - 1);
      }
      return ?;
    }
    finally {}
  }
  
  public final void a()
  {
    try
    {
      c = 0;
      d = 0;
      Arrays.fill(b, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(long paramLong, V paramV)
  {
    try
    {
      int i = d;
      if (i > 0)
      {
        j = c;
        k = b.length;
        if (paramLong <= a[((j + i - 1) % k)]) {
          a();
        }
      }
      int j = b.length;
      if (d >= j)
      {
        k = j << 1;
        long[] arrayOfLong = new long[k];
        arrayOfObject = new Object[k];
        k = c;
        j -= k;
        System.arraycopy(a, k, arrayOfLong, 0, j);
        System.arraycopy(b, c, arrayOfObject, 0, j);
        k = c;
        if (k > 0)
        {
          System.arraycopy(a, 0, arrayOfLong, j, k);
          System.arraycopy(b, 0, arrayOfObject, j, c);
        }
        a = arrayOfLong;
        b = arrayOfObject;
        c = 0;
      }
      int k = c;
      j = d;
      Object[] arrayOfObject = b;
      k = (k + j) % arrayOfObject.length;
      a[k] = paramLong;
      arrayOfObject[k] = paramV;
      d = (j + 1);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */