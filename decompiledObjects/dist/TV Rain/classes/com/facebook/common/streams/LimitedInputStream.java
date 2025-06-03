package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LimitedInputStream
  extends FilterInputStream
{
  private int mBytesToRead;
  private int mBytesToReadWhenMarked;
  
  public LimitedInputStream(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    paramInputStream.getClass();
    if (paramInt >= 0)
    {
      mBytesToRead = paramInt;
      mBytesToReadWhenMarked = -1;
      return;
    }
    throw new IllegalArgumentException("limit must be >= 0");
  }
  
  public int available()
    throws IOException
  {
    return Math.min(in.available(), mBytesToRead);
  }
  
  public void mark(int paramInt)
  {
    if (in.markSupported())
    {
      in.mark(paramInt);
      mBytesToReadWhenMarked = mBytesToRead;
    }
  }
  
  public int read()
    throws IOException
  {
    if (mBytesToRead == 0) {
      return -1;
    }
    int i = in.read();
    if (i != -1) {
      mBytesToRead -= 1;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = mBytesToRead;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    paramInt1 = in.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 > 0) {
      mBytesToRead -= paramInt1;
    }
    return paramInt1;
  }
  
  public void reset()
    throws IOException
  {
    if (in.markSupported())
    {
      if (mBytesToReadWhenMarked != -1)
      {
        in.reset();
        mBytesToRead = mBytesToReadWhenMarked;
        return;
      }
      throw new IOException("mark not set");
    }
    throw new IOException("mark is not supported");
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    paramLong = Math.min(paramLong, mBytesToRead);
    paramLong = in.skip(paramLong);
    mBytesToRead = ((int)(mBytesToRead - paramLong));
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.streams.LimitedInputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */