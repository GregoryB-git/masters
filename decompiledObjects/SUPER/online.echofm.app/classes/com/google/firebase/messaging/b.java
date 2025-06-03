package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Queue;

public abstract class b
{
  public static byte[] a(Queue paramQueue, int paramInt)
  {
    if (paramQueue.isEmpty()) {
      return new byte[0];
    }
    byte[] arrayOfByte1 = (byte[])paramQueue.remove();
    if (arrayOfByte1.length == paramInt) {
      return arrayOfByte1;
    }
    int i = paramInt - arrayOfByte1.length;
    arrayOfByte1 = Arrays.copyOf(arrayOfByte1, paramInt);
    while (i > 0)
    {
      byte[] arrayOfByte2 = (byte[])paramQueue.remove();
      int j = Math.min(i, arrayOfByte2.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt - i, j);
      i -= j;
    }
    return arrayOfByte1;
  }
  
  public static InputStream b(InputStream paramInputStream, long paramLong)
  {
    return new a(paramInputStream, paramLong);
  }
  
  public static int c(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
  
  public static byte[] d(InputStream paramInputStream)
  {
    return e(paramInputStream, new ArrayDeque(20), 0);
  }
  
  public static byte[] e(InputStream paramInputStream, Queue paramQueue, int paramInt)
  {
    long l;
    for (int i = Math.min(8192, Math.max(128, Integer.highestOneBit(paramInt) * 2)); paramInt < 2147483639; i = c(l * i))
    {
      int j = Math.min(i, 2147483639 - paramInt);
      byte[] arrayOfByte = new byte[j];
      paramQueue.add(arrayOfByte);
      int k = 0;
      while (k < j)
      {
        int m = paramInputStream.read(arrayOfByte, k, j - k);
        if (m == -1) {
          return a(paramQueue, paramInt);
        }
        k += m;
        paramInt += m;
      }
      l = i;
      if (i < 4096) {
        i = 4;
      } else {
        i = 2;
      }
    }
    if (paramInputStream.read() == -1) {
      return a(paramQueue, 2147483639);
    }
    throw new OutOfMemoryError("input is too large to fit in a byte array");
  }
  
  public static final class a
    extends FilterInputStream
  {
    public long o;
    public long p = -1L;
    
    public a(InputStream paramInputStream, long paramLong)
    {
      super();
      o = paramLong;
    }
    
    public int available()
    {
      return (int)Math.min(in.available(), o);
    }
    
    public void mark(int paramInt)
    {
      try
      {
        in.mark(paramInt);
        p = o;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public int read()
    {
      if (o == 0L) {
        return -1;
      }
      int i = in.read();
      if (i != -1) {
        o -= 1L;
      }
      return i;
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      long l = o;
      if (l == 0L) {
        return -1;
      }
      paramInt2 = (int)Math.min(paramInt2, l);
      paramInt1 = in.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1) {
        o -= paramInt1;
      }
      return paramInt1;
    }
    
    public void reset()
    {
      IOException localIOException;
      label69:
      try
      {
        if (in.markSupported()) {
          if (p != -1L)
          {
            in.reset();
            o = p;
            return;
          }
        }
      }
      finally
      {
        break label69;
        localIOException = new java/io/IOException;
        localIOException.<init>("Mark not set");
        throw localIOException;
        localIOException = new java/io/IOException;
        localIOException.<init>("Mark not supported");
        throw localIOException;
      }
    }
    
    public long skip(long paramLong)
    {
      paramLong = Math.min(paramLong, o);
      paramLong = in.skip(paramLong);
      o -= paramLong;
      return paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */