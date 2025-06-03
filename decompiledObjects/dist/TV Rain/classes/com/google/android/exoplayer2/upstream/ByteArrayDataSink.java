package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class ByteArrayDataSink
  implements DataSink
{
  private ByteArrayOutputStream stream;
  
  public void close()
    throws IOException
  {
    stream.close();
  }
  
  public byte[] getData()
  {
    Object localObject = stream;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    return (byte[])localObject;
  }
  
  public void open(DataSpec paramDataSpec)
    throws IOException
  {
    long l = length;
    if (l == -1L)
    {
      stream = new ByteArrayOutputStream();
    }
    else
    {
      boolean bool;
      if (l <= 2147483647L) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool);
      stream = new ByteArrayOutputStream((int)length);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    stream.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.ByteArrayDataSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */