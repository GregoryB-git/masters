package aa;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class d
{
  public static byte[] a(ArrayDeque paramArrayDeque, int paramInt)
  {
    if (paramArrayDeque.isEmpty()) {
      return new byte[0];
    }
    byte[] arrayOfByte1 = (byte[])paramArrayDeque.remove();
    if (arrayOfByte1.length == paramInt) {
      return arrayOfByte1;
    }
    int i = paramInt - arrayOfByte1.length;
    byte[] arrayOfByte2 = Arrays.copyOf(arrayOfByte1, paramInt);
    while (i > 0)
    {
      arrayOfByte1 = (byte[])paramArrayDeque.remove();
      int j = Math.min(i, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramInt - i, j);
      i -= j;
    }
    return arrayOfByte2;
  }
  
  public static byte[] b(a parama)
  {
    ArrayDeque localArrayDeque = new ArrayDeque(20);
    int i = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
    int j = 0;
    while (j < 2147483639)
    {
      int k = Math.min(i, 2147483639 - j);
      byte[] arrayOfByte = new byte[k];
      localArrayDeque.add(arrayOfByte);
      int m = 0;
      while (m < k)
      {
        int n = parama.read(arrayOfByte, m, k - m);
        if (n == -1)
        {
          parama = a(localArrayDeque, j);
          break label192;
        }
        m += n;
        j += n;
      }
      long l = i;
      if (i < 4096) {
        i = 4;
      } else {
        i = 2;
      }
      l *= i;
      if (l > 2147483647L) {
        i = Integer.MAX_VALUE;
      } else if (l < -2147483648L) {
        i = Integer.MIN_VALUE;
      } else {
        i = (int)l;
      }
    }
    if (parama.read() == -1)
    {
      parama = a(localArrayDeque, 2147483639);
      label192:
      return parama;
    }
    throw new OutOfMemoryError("input is too large to fit in a byte array");
  }
  
  public static final class a
    extends FilterInputStream
  {
    public long a = 1048577L;
    public long b = -1L;
    
    public a(InputStream paramInputStream)
    {
      super();
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
}

/* Location:
 * Qualified Name:     aa.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */