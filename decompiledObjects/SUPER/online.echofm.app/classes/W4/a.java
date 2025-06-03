package W4;

import V4.g;
import Y4.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class a
  implements g
{
  public static b b(String paramString, V4.a parama, int paramInt1, int paramInt2, Charset paramCharset, int paramInt3, int paramInt4)
  {
    if (parama == V4.a.o) {
      return c(X4.c.d(paramString.getBytes(paramCharset), paramInt3, paramInt4), paramInt1, paramInt2);
    }
    throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(parama)));
  }
  
  public static b c(X4.a parama, int paramInt1, int paramInt2)
  {
    parama = parama.a();
    if (parama != null)
    {
      int i = parama.j();
      int j = parama.g();
      int k = Math.max(paramInt1, i);
      paramInt2 = Math.max(paramInt2, j);
      int m = Math.min(k / i, paramInt2 / j);
      int n = (k - i * m) / 2;
      paramInt1 = (paramInt2 - j * m) / 2;
      b localb = new b(k, paramInt2);
      paramInt2 = 0;
      while (paramInt2 < j)
      {
        int i1 = 0;
        k = n;
        while (i1 < i)
        {
          if (parama.f(i1, paramInt2)) {
            localb.n(k, paramInt1, m, m);
          }
          i1++;
          k += m;
        }
        paramInt2++;
        paramInt1 += m;
      }
      return localb;
    }
    throw new IllegalStateException();
  }
  
  public b a(String paramString, V4.a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    Charset localCharset = StandardCharsets.ISO_8859_1;
    int i = 33;
    int j = 0;
    Object localObject = localCharset;
    int k = i;
    int m = j;
    if (paramMap != null)
    {
      localObject = V4.c.p;
      if (paramMap.containsKey(localObject)) {
        localCharset = Charset.forName(paramMap.get(localObject).toString());
      }
      localObject = V4.c.o;
      if (paramMap.containsKey(localObject)) {
        i = Integer.parseInt(paramMap.get(localObject).toString());
      }
      V4.c localc = V4.c.x;
      localObject = localCharset;
      k = i;
      m = j;
      if (paramMap.containsKey(localc))
      {
        m = Integer.parseInt(paramMap.get(localc).toString());
        k = i;
        localObject = localCharset;
      }
    }
    return b(paramString, parama, paramInt1, paramInt2, (Charset)localObject, k, m);
  }
}

/* Location:
 * Qualified Name:     W4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */