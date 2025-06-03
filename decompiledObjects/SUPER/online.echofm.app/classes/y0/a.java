package y0;

import d0.q;
import i0.g;
import i0.k;

public abstract class a
  extends m
{
  public final long k;
  public final long l;
  public c m;
  public int[] n;
  
  public a(g paramg, k paramk, q paramq, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    super(paramg, paramk, paramq, paramInt, paramObject, paramLong1, paramLong2, paramLong5);
    k = paramLong3;
    l = paramLong4;
  }
  
  public final int i(int paramInt)
  {
    return ((int[])g0.a.h(n))[paramInt];
  }
  
  public final c j()
  {
    return (c)g0.a.h(m);
  }
  
  public void k(c paramc)
  {
    m = paramc;
    n = paramc.b();
  }
}

/* Location:
 * Qualified Name:     y0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */