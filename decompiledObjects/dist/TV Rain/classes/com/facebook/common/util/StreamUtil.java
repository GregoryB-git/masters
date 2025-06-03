package com.facebook.common.util;

import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil
{
  public static byte[] getBytesFromStream(InputStream paramInputStream)
    throws IOException
  {
    return getBytesFromStream(paramInputStream, paramInputStream.available());
  }
  
  public static byte[] getBytesFromStream(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    ByteArrayOutputStream local1 = new ByteArrayOutputStream(paramInt)
    {
      public byte[] toByteArray()
      {
        int i = count;
        byte[] arrayOfByte = buf;
        if (i == arrayOfByte.length) {
          return arrayOfByte;
        }
        return super.toByteArray();
      }
    };
    ByteStreams.copy(paramInputStream, local1);
    return local1.toByteArray();
  }
  
  public static long skip(InputStream paramInputStream, long paramLong)
    throws IOException
  {
    Preconditions.checkNotNull(paramInputStream);
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    long l1 = paramLong;
    long l2 = paramLong;
    if (l1 > 0L)
    {
      l2 = paramInputStream.skip(l1);
      if (l2 > 0L) {}
      for (;;)
      {
        l1 -= l2;
        break;
        if (paramInputStream.read() == -1) {
          break label74;
        }
        l2 = 1L;
      }
      label74:
      l2 = paramLong - l1;
    }
    return l2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.StreamUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */