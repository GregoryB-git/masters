package K0;

import F0.B;
import F0.e;
import F0.e.e;
import F0.e.f;
import F0.s;
import F0.y;
import F0.y.a;

public final class b
  extends e
{
  public b(B paramB, int paramInt, long paramLong1, long paramLong2)
  {
    super(new a(paramB), new b(paramB, paramInt, null), paramB.f(), 0L, j, paramLong1, paramLong2, paramB.d(), Math.max(6, c));
  }
  
  public static final class b
    implements e.f
  {
    public final B a;
    public final int b;
    public final y.a c;
    
    public b(B paramB, int paramInt)
    {
      a = paramB;
      b = paramInt;
      c = new y.a();
    }
    
    public e.e a(s params, long paramLong)
    {
      long l1 = params.p();
      long l2 = c(params);
      long l3 = params.m();
      params.o(Math.max(6, a.c));
      long l4 = c(params);
      long l5 = params.m();
      if ((l2 <= paramLong) && (l4 > paramLong)) {
        return e.e.e(l3);
      }
      if (l4 <= paramLong) {
        return e.e.f(l4, l5);
      }
      return e.e.d(l2, l1);
    }
    
    public final long c(s params)
    {
      while ((params.m() < params.a() - 6L) && (!y.h(params, a, b, c))) {
        params.o(1);
      }
      if (params.m() >= params.a() - 6L)
      {
        params.o((int)(params.a() - params.m()));
        return a.j;
      }
      return c.a;
    }
  }
}

/* Location:
 * Qualified Name:     K0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */