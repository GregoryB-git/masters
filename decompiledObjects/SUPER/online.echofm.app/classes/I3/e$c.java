package I3;

import java.io.InputStream;
import java.io.RandomAccessFile;

public final class e$c
  extends InputStream
{
  public int o;
  public int p;
  
  public e$c(e parame, e.b paramb)
  {
    o = e.a(parame, a + 4);
    p = b;
  }
  
  public int read()
  {
    if (p == 0) {
      return -1;
    }
    e.e(q).seek(o);
    int i = e.e(q).read();
    o = e.a(q, o + 1);
    p -= 1;
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    e.b(paramArrayOfByte, "buffer");
    if (((paramInt1 | paramInt2) >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1))
    {
      int i = p;
      if (i > 0)
      {
        int j = paramInt2;
        if (paramInt2 > i) {
          j = i;
        }
        e.c(q, o, paramArrayOfByte, paramInt1, j);
        o = e.a(q, o + j);
        p -= j;
        return j;
      }
      return -1;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     I3.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */