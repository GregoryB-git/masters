package t5;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import u5.b;

public final class k0
  implements k
{
  public final k a;
  public final j b;
  public boolean c;
  public long d;
  
  public k0(k paramk, b paramb)
  {
    paramk.getClass();
    a = paramk;
    b = paramb;
  }
  
  public final long a(n paramn)
  {
    long l = a.a(paramn);
    d = l;
    if (l == 0L) {
      return 0L;
    }
    n localn = paramn;
    if (g == -1L)
    {
      localn = paramn;
      if (l != -1L) {
        localn = paramn.b(0L, l);
      }
    }
    c = true;
    b.a(localn);
    return d;
  }
  
  public final void close()
  {
    try
    {
      a.close();
      return;
    }
    finally
    {
      if (c)
      {
        c = false;
        b.close();
      }
    }
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    a.f(paraml0);
  }
  
  public final Map<String, List<String>> h()
  {
    return a.h();
  }
  
  public final Uri l()
  {
    return a.l();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (d == 0L) {
      return -1;
    }
    paramInt2 = a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt2 > 0)
    {
      b.write(paramArrayOfByte, paramInt1, paramInt2);
      long l = d;
      if (l != -1L) {
        d = (l - paramInt2);
      }
    }
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     t5.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */