package aa;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d$a
  extends FilterInputStream
{
  public long a = 1048577L;
  public long b = -1L;
  
  public d$a(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public final int available()
  {
    return (int)Math.min(in.available(), a);
  }
  
  public final void mark(int paramInt)
  {
    try
    {
      in.mark(paramInt);
      b = a;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int read()
  {
    if (a == 0L) {
      return -1;
    }
    int i = in.read();
    if (i != -1) {
      a -= 1L;
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = a;
    if (l == 0L) {
      return -1;
    }
    paramInt2 = (int)Math.min(paramInt2, l);
    paramInt1 = in.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      a -= paramInt1;
    }
    return paramInt1;
  }
  
  public final void reset()
  {
    try
    {
      if (in.markSupported())
      {
        if (b != -1L)
        {
          in.reset();
          a = b;
          return;
        }
        localIOException = new java/io/IOException;
        localIOException.<init>("Mark not set");
        throw localIOException;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Mark not supported");
      throw localIOException;
    }
    finally {}
  }
  
  public final long skip(long paramLong)
  {
    paramLong = Math.min(paramLong, a);
    paramLong = in.skip(paramLong);
    a -= paramLong;
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     aa.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */