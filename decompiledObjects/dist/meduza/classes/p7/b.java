package p7;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import r7.a;

public final class b
{
  static
  {
    new a();
  }
  
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
  
  public static byte[] b(InputStream paramInputStream)
  {
    paramInputStream.getClass();
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
        int n = paramInputStream.read(arrayOfByte, m, k - m);
        if (n == -1)
        {
          paramInputStream = a(localArrayDeque, j);
          break label164;
        }
        m += n;
        j += n;
      }
      if (i < 4096) {
        m = 4;
      } else {
        m = 2;
      }
      i = a.E(i * m);
    }
    if (paramInputStream.read() == -1)
    {
      paramInputStream = a(localArrayDeque, 2147483639);
      label164:
      return paramInputStream;
    }
    throw new OutOfMemoryError("input is too large to fit in a byte array");
  }
  
  public final class a
    extends OutputStream
  {
    public final String toString()
    {
      return "ByteStreams.nullOutputStream()";
    }
    
    public final void write(int paramInt) {}
    
    public final void write(byte[] paramArrayOfByte)
    {
      paramArrayOfByte.getClass();
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramArrayOfByte.getClass();
      x6.b.E(paramInt1, paramInt2 + paramInt1, paramArrayOfByte.length);
    }
  }
}

/* Location:
 * Qualified Name:     p7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */