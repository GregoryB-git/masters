package x0;

import android.net.Uri;
import d0.i;
import g0.a;
import g0.z;
import i0.g;
import i0.k;
import i0.y;
import java.util.Map;

public final class q
  implements g
{
  public final g a;
  public final int b;
  public final a c;
  public final byte[] d;
  public int e;
  
  public q(g paramg, int paramInt, a parama)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    a = paramg;
    b = paramInt;
    c = parama;
    d = new byte[1];
    e = paramInt;
  }
  
  public void c(y paramy)
  {
    a.e(paramy);
    a.c(paramy);
  }
  
  public void close()
  {
    throw new UnsupportedOperationException();
  }
  
  public long e(k paramk)
  {
    throw new UnsupportedOperationException();
  }
  
  public Map g()
  {
    return a.g();
  }
  
  public Uri k()
  {
    return a.k();
  }
  
  public final boolean q()
  {
    if (a.read(d, 0, 1) == -1) {
      return false;
    }
    int i = (d[0] & 0xFF) << 4;
    if (i == 0) {
      return true;
    }
    byte[] arrayOfByte = new byte[i];
    int j = i;
    int k = 0;
    int m;
    for (;;)
    {
      m = i;
      if (j <= 0) {
        break;
      }
      m = a.read(arrayOfByte, k, j);
      if (m == -1) {
        return false;
      }
      k += m;
      j -= m;
    }
    while ((m > 0) && (arrayOfByte[(m - 1)] == 0)) {
      m--;
    }
    if (m > 0) {
      c.a(new z(arrayOfByte, m));
    }
    return true;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (e == 0) {
      if (q()) {
        e = b;
      } else {
        return -1;
      }
    }
    paramInt1 = a.read(paramArrayOfByte, paramInt1, Math.min(e, paramInt2));
    if (paramInt1 != -1) {
      e -= paramInt1;
    }
    return paramInt1;
  }
  
  public static abstract interface a
  {
    public abstract void a(z paramz);
  }
}

/* Location:
 * Qualified Name:     x0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */