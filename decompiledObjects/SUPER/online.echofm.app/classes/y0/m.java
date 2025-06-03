package y0;

import d0.q;
import g0.a;
import i0.g;
import i0.k;

public abstract class m
  extends e
{
  public final long j;
  
  public m(g paramg, k paramk, q paramq, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    super(paramg, paramk, 1, paramq, paramInt, paramObject, paramLong1, paramLong2);
    a.e(paramq);
    j = paramLong3;
  }
  
  public long g()
  {
    long l1 = j;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = 1L + l1;
    }
    return l2;
  }
  
  public abstract boolean h();
}

/* Location:
 * Qualified Name:     y0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */