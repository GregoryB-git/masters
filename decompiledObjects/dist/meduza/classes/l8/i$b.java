package l8;

import java.io.InputStream;
import java.io.RandomAccessFile;

public final class i$b
  extends InputStream
{
  public int a;
  public int b;
  
  public i$b(i parami, i.a parama)
  {
    a = parami.c0(a + 4);
    b = b;
  }
  
  public final int read()
  {
    if (b == 0) {
      return -1;
    }
    c.a.seek(a);
    int i = c.a.read();
    a = c.c0(a + 1);
    b -= 1;
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      if (((paramInt1 | paramInt2) >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1))
      {
        int i = b;
        if (i > 0)
        {
          int j = paramInt2;
          if (paramInt2 > i) {
            j = i;
          }
          c.M(a, paramArrayOfByte, paramInt1, j);
          a = c.c0(a + j);
          b -= j;
          return j;
        }
        return -1;
      }
      throw new ArrayIndexOutOfBoundsException();
    }
    throw new NullPointerException("buffer");
  }
}

/* Location:
 * Qualified Name:     l8.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */