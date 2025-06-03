package l1;

import F0.e;
import F0.e.b;
import F0.e.e;
import F0.e.f;
import F0.s;
import g0.E;
import g0.M;
import g0.z;

public final class G
  extends e
{
  public G(E paramE, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    super(new e.b(), new a(paramInt1, paramE, paramInt2), paramLong1, 0L, paramLong1 + 1L, 0L, paramLong2, 188L, 940);
  }
  
  public static final class a
    implements e.f
  {
    public final E a;
    public final z b;
    public final int c;
    public final int d;
    
    public a(int paramInt1, E paramE, int paramInt2)
    {
      c = paramInt1;
      a = paramE;
      d = paramInt2;
      b = new z();
    }
    
    public e.e a(s params, long paramLong)
    {
      long l = params.p();
      int i = (int)Math.min(d, params.a() - l);
      b.P(i);
      params.n(b.e(), 0, i);
      return c(b, paramLong, l);
    }
    
    public void b()
    {
      b.Q(M.f);
    }
    
    public final e.e c(z paramz, long paramLong1, long paramLong2)
    {
      int i = paramz.g();
      long l1 = -1L;
      long l2 = -1L;
      long l5;
      for (long l3 = -9223372036854775807L; paramz.a() >= 188; l3 = l5)
      {
        int j = L.a(paramz.e(), paramz.f(), i);
        int k = j + 188;
        if (k > i) {
          break;
        }
        l1 = L.c(paramz, j, c);
        long l4 = l2;
        l5 = l3;
        if (l1 != -9223372036854775807L)
        {
          l5 = a.b(l1);
          if (l5 > paramLong1)
          {
            if (l3 == -9223372036854775807L) {
              return e.e.d(l5, paramLong2);
            }
            return e.e.e(paramLong2 + l2);
          }
          if (100000L + l5 > paramLong1) {
            return e.e.e(paramLong2 + j);
          }
          l4 = j;
        }
        paramz.T(k);
        l1 = k;
        l2 = l4;
      }
      if (l3 != -9223372036854775807L) {
        return e.e.f(l3, paramLong2 + l1);
      }
      return e.e.d;
    }
  }
}

/* Location:
 * Qualified Name:     l1.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */