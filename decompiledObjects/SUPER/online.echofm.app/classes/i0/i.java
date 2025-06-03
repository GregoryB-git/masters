package i0;

import g0.a;
import java.io.InputStream;

public final class i
  extends InputStream
{
  public final g o;
  public final k p;
  public final byte[] q;
  public boolean r = false;
  public boolean s = false;
  public long t;
  
  public i(g paramg, k paramk)
  {
    o = paramg;
    p = paramk;
    q = new byte[1];
  }
  
  public final void a()
  {
    if (!r)
    {
      o.e(p);
      r = true;
    }
  }
  
  public void b()
  {
    a();
  }
  
  public void close()
  {
    if (!s)
    {
      o.close();
      s = true;
    }
  }
  
  public int read()
  {
    int i = read(q);
    int j = -1;
    if (i != -1) {
      j = q[0] & 0xFF;
    }
    return j;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.f(s ^ true);
    a();
    paramInt1 = o.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 == -1) {
      return -1;
    }
    t += paramInt1;
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     i0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */