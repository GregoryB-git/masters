package b9;

import java.io.OutputStream;

public final class b
  extends OutputStream
{
  public long a = 0L;
  
  public final void write(int paramInt)
  {
    a += 1L;
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    a += paramArrayOfByte.length;
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramArrayOfByte.length) && (paramInt2 >= 0))
    {
      paramInt1 += paramInt2;
      if ((paramInt1 <= paramArrayOfByte.length) && (paramInt1 >= 0))
      {
        a += paramInt2;
        return;
      }
    }
    throw new IndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     b9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */