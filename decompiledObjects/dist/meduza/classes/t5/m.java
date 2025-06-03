package t5;

import java.io.InputStream;
import x6.b;

public final class m
  extends InputStream
{
  public final k a;
  public final n b;
  public final byte[] c;
  public boolean d = false;
  public boolean e = false;
  
  public m(k paramk, n paramn)
  {
    a = paramk;
    b = paramn;
    c = new byte[1];
  }
  
  public final void close()
  {
    if (!e)
    {
      a.close();
      e = true;
    }
  }
  
  public final void f()
  {
    if (!d)
    {
      a.a(b);
      d = true;
    }
  }
  
  public final int read()
  {
    int i = read(c);
    int j = -1;
    if (i != -1) {
      j = c[0] & 0xFF;
    }
    return j;
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b.H(e ^ true);
    f();
    paramInt1 = a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 == -1) {
      return -1;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     t5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */