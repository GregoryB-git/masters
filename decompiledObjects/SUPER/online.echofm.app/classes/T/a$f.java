package T;

import java.io.InputStream;

public class a$f
  extends a.b
{
  public a$f(InputStream paramInputStream)
  {
    super(paramInputStream);
    if (paramInputStream.markSupported())
    {
      o.mark(Integer.MAX_VALUE);
      return;
    }
    throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
  }
  
  public a$f(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
    o.mark(Integer.MAX_VALUE);
  }
  
  public void h(long paramLong)
  {
    int i = q;
    if (i > paramLong)
    {
      q = 0;
      o.reset();
    }
    else
    {
      paramLong -= i;
    }
    e((int)paramLong);
  }
}

/* Location:
 * Qualified Name:     T.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */