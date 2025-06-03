package a5;

import V4.c;
import V4.g;
import b5.e;
import b5.i;
import b5.j;
import b5.k;
import b5.l;
import java.util.Map;

public final class a
  implements g
{
  public static Y4.b b(h5.b paramb, int paramInt1, int paramInt2)
  {
    int i = paramb.e();
    int j = paramb.d();
    int k = Math.max(paramInt1, i);
    int m = Math.max(paramInt2, j);
    int n = Math.min(k / i, m / j);
    k = (k - i * n) / 2;
    m = (m - j * n) / 2;
    Y4.b localb;
    if ((paramInt2 >= j) && (paramInt1 >= i))
    {
      localb = new Y4.b(paramInt1, paramInt2);
      paramInt1 = k;
      paramInt2 = m;
    }
    else
    {
      localb = new Y4.b(i, j);
      paramInt1 = 0;
      paramInt2 = paramInt1;
    }
    localb.b();
    k = 0;
    while (k < j)
    {
      m = paramInt1;
      int i1 = 0;
      while (i1 < i)
      {
        if (paramb.b(i1, k) == 1) {
          localb.n(m, paramInt2, n, n);
        }
        i1++;
        m += n;
      }
      k++;
      paramInt2 += n;
    }
    return localb;
  }
  
  public static Y4.b c(e parame, k paramk, int paramInt1, int paramInt2)
  {
    int i = paramk.h();
    int j = paramk.g();
    h5.b localb = new h5.b(paramk.j(), paramk.i());
    int k = 0;
    int m = k;
    while (k < j)
    {
      int n = m;
      boolean bool;
      if (k % e == 0)
      {
        i1 = 0;
        n = i1;
        while (i1 < paramk.j())
        {
          if (i1 % 2 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          localb.g(n, m, bool);
          n++;
          i1++;
        }
        n = m + 1;
      }
      int i1 = 0;
      m = i1;
      while (i1 < i)
      {
        i2 = m;
        if (i1 % d == 0)
        {
          localb.g(m, n, true);
          i2 = m + 1;
        }
        localb.g(i2, n, parame.e(i1, k));
        m = i2 + 1;
        int i3 = d;
        if (i1 % i3 == i3 - 1)
        {
          if (k % 2 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          localb.g(m, n, bool);
          m = i2 + 2;
        }
        i1++;
      }
      int i2 = n + 1;
      m = e;
      if (k % m == m - 1)
      {
        m = 0;
        i1 = m;
        while (m < paramk.j())
        {
          localb.g(i1, i2, true);
          i1++;
          m++;
        }
        m = n + 2;
      }
      else
      {
        m = i2;
      }
      k++;
    }
    return b(localb, paramInt1, paramInt2);
  }
  
  public Y4.b a(String paramString, V4.a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (!paramString.isEmpty())
    {
      if (parama == V4.a.t)
      {
        if ((paramInt1 >= 0) && (paramInt2 >= 0))
        {
          parama = l.o;
          Object localObject = parama;
          if (paramMap != null)
          {
            localObject = (l)paramMap.get(c.q);
            if (localObject != null) {
              parama = (V4.a)localObject;
            }
            android.support.v4.media.a.a(paramMap.get(c.r));
            android.support.v4.media.a.a(paramMap.get(c.s));
            localObject = parama;
          }
          paramString = j.b(paramString, (l)localObject, null, null);
          parama = k.l(paramString.length(), (l)localObject, null, null, true);
          paramString = new e(i.c(paramString, parama), parama.h(), parama.g());
          paramString.h();
          return c(paramString, parama, paramInt1, paramInt2);
        }
        paramString = new StringBuilder("Requested dimensions can't be negative: ");
        paramString.append(paramInt1);
        paramString.append('x');
        paramString.append(paramInt2);
        throw new IllegalArgumentException(paramString.toString());
      }
      throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(parama)));
    }
    throw new IllegalArgumentException("Found empty contents");
  }
}

/* Location:
 * Qualified Name:     a5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */