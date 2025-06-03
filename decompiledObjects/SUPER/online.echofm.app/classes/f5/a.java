package f5;

import V4.g;
import h5.f;
import java.util.Map;

public final class a
  implements g
{
  public static Y4.b b(f paramf, int paramInt1, int paramInt2, int paramInt3)
  {
    paramf = paramf.a();
    if (paramf != null)
    {
      int i = paramf.e();
      int j = paramf.d();
      paramInt3 <<= 1;
      int k = i + paramInt3;
      int m = paramInt3 + j;
      paramInt3 = Math.max(paramInt1, k);
      paramInt2 = Math.max(paramInt2, m);
      int n = Math.min(paramInt3 / k, paramInt2 / m);
      m = (paramInt3 - i * n) / 2;
      paramInt1 = (paramInt2 - j * n) / 2;
      Y4.b localb = new Y4.b(paramInt3, paramInt2);
      paramInt2 = 0;
      while (paramInt2 < j)
      {
        k = 0;
        paramInt3 = m;
        while (k < i)
        {
          if (paramf.b(k, paramInt2) == 1) {
            localb.n(paramInt3, paramInt1, n, n);
          }
          k++;
          paramInt3 += n;
        }
        paramInt2++;
        paramInt1 += n;
      }
      return localb;
    }
    throw new IllegalStateException();
  }
  
  public Y4.b a(String paramString, V4.a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (!paramString.isEmpty())
    {
      if (parama == V4.a.z)
      {
        if ((paramInt1 >= 0) && (paramInt2 >= 0))
        {
          parama = g5.a.p;
          int i = 4;
          int j = i;
          Object localObject = parama;
          if (paramMap != null)
          {
            localObject = V4.c.o;
            if (paramMap.containsKey(localObject)) {
              parama = g5.a.valueOf(paramMap.get(localObject).toString());
            }
            V4.c localc = V4.c.t;
            j = i;
            localObject = parama;
            if (paramMap.containsKey(localc))
            {
              j = Integer.parseInt(paramMap.get(localc).toString());
              localObject = parama;
            }
          }
          return b(h5.c.n(paramString, (g5.a)localObject, paramMap), paramInt1, paramInt2, j);
        }
        paramString = new StringBuilder("Requested dimensions are too small: ");
        paramString.append(paramInt1);
        paramString.append('x');
        paramString.append(paramInt2);
        throw new IllegalArgumentException(paramString.toString());
      }
      throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(parama)));
    }
    throw new IllegalArgumentException("Found empty contents");
  }
}

/* Location:
 * Qualified Name:     f5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */