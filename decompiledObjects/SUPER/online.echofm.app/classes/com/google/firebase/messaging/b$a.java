package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b$a
  extends FilterInputStream
{
  public long o;
  public long p = -1L;
  
  public b$a(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
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

/* Location:
 * Qualified Name:     com.google.firebase.messaging.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */