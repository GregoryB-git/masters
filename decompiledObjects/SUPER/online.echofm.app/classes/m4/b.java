package m4;

import java.io.OutputStream;

public final class b
  extends OutputStream
{
  public long o = 0L;
  
  public long a()
  {
    return o;
  }
  
  public void write(int paramInt)
  {
    o += 1L;
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    o += paramArrayOfByte.length;
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramArrayOfByte.length) && (paramInt2 >= 0))
    {
      paramInt1 += paramInt2;
      if ((paramInt1 <= paramArrayOfByte.length) && (paramInt1 >= 0))
      {
        o += paramInt2;
        return;
      }
    }
    throw new IndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     m4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */