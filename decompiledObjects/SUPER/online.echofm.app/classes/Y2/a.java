package Y2;

import W2.m;
import Z2.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Queue;

public abstract class a
{
  public static final OutputStream a = new a();
  
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
  
  public static byte[] b(InputStream paramInputStream)
  {
    m.j(paramInputStream);
    return c(paramInputStream, new ArrayDeque(20), 0);
  }
  
  public static byte[] c(InputStream paramInputStream, Queue paramQueue, int paramInt)
  {
    int i = Math.min(8192, Math.max(128, Integer.highestOneBit(paramInt) * 2));
    int j = paramInt;
    for (paramInt = i; j < 2147483639; paramInt = d.c(paramInt, i))
    {
      int k = Math.min(paramInt, 2147483639 - j);
      byte[] arrayOfByte = new byte[k];
      paramQueue.add(arrayOfByte);
      i = 0;
      while (i < k)
      {
        int m = paramInputStream.read(arrayOfByte, i, k - i);
        if (m == -1) {
          return a(paramQueue, j);
        }
        i += m;
        j += m;
      }
      if (paramInt < 4096) {
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
  
  public class a
    extends OutputStream
  {
    public String toString()
    {
      return "ByteStreams.nullOutputStream()";
    }
    
    public void write(int paramInt) {}
    
    public void write(byte[] paramArrayOfByte)
    {
      m.j(paramArrayOfByte);
    }
    
    public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      m.j(paramArrayOfByte);
      m.n(paramInt1, paramInt2 + paramInt1, paramArrayOfByte.length);
    }
  }
}

/* Location:
 * Qualified Name:     Y2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */