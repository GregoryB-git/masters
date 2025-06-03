package z4;

import android.net.Uri;
import c4.v;
import java.util.List;
import java.util.Map;
import t5.h;
import t5.j0;
import t5.k;
import t5.l0;
import t5.n;
import v5.u;
import x6.b;

public final class m
  implements k
{
  public final k a;
  public final int b;
  public final a c;
  public final byte[] d;
  public int e;
  
  public m(j0 paramj0, int paramInt, a parama)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    a = paramj0;
    b = paramInt;
    c = parama;
    d = new byte[1];
    e = paramInt;
  }
  
  public final long a(n paramn)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void close()
  {
    throw new UnsupportedOperationException();
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
    if (e == 0)
    {
      Object localObject1 = a;
      Object localObject2 = d;
      int i = 0;
      int j;
      if (((h)localObject1).read((byte[])localObject2, 0, 1) == -1)
      {
        j = i;
      }
      else
      {
        j = (d[0] & 0xFF) << 4;
        if (j != 0)
        {
          localObject1 = new byte[j];
          int k = j;
          int m = 0;
          int n;
          for (;;)
          {
            n = j;
            if (k <= 0) {
              break;
            }
            n = a.read((byte[])localObject1, m, k);
            if (n == -1)
            {
              j = i;
              break label296;
            }
            m += n;
            k -= n;
          }
          while (n > 0)
          {
            j = n - 1;
            if (localObject1[j] != 0) {
              break;
            }
            n = j;
          }
          if (n > 0)
          {
            localObject2 = c;
            localObject1 = new u((byte[])localObject1, n);
            localObject2 = (y.a)localObject2;
            long l;
            if (!m)
            {
              l = j;
            }
            else
            {
              localObject3 = n;
              Map localMap = y.U;
              l = Math.max(((y)localObject3).w(true), j);
            }
            j = c - b;
            Object localObject3 = l;
            localObject3.getClass();
            ((b0)localObject3).a(j, (u)localObject1);
            ((v)localObject3).c(l, 1, j, 0, null);
            m = true;
          }
        }
        j = 1;
      }
      label296:
      if (j != 0) {
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
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     z4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */