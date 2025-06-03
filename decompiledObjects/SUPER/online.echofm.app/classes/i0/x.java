package i0;

import android.net.Uri;
import d0.i;
import g0.a;
import java.util.Collections;
import java.util.Map;

public final class x
  implements g
{
  public final g a;
  public long b;
  public Uri c;
  public Map d;
  
  public x(g paramg)
  {
    a = ((g)a.e(paramg));
    c = Uri.EMPTY;
    d = Collections.emptyMap();
  }
  
  public void c(y paramy)
  {
    a.e(paramy);
    a.c(paramy);
  }
  
  public void close()
  {
    a.close();
  }
  
  public long e(k paramk)
  {
    c = a;
    d = Collections.emptyMap();
    long l = a.e(paramk);
    c = ((Uri)a.e(k()));
    d = g();
    return l;
  }
  
  public Map g()
  {
    return a.g();
  }
  
  public Uri k()
  {
    return a.k();
  }
  
  public long q()
  {
    return b;
  }
  
  public Uri r()
  {
    return c;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      b += paramInt1;
    }
    return paramInt1;
  }
  
  public Map s()
  {
    return d;
  }
  
  public void t()
  {
    b = 0L;
  }
}

/* Location:
 * Qualified Name:     i0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */