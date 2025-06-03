package b5;

import t5.k;
import t5.n;
import v3.i0;

public abstract class m
  extends e
{
  public final long j;
  
  public m(k paramk, n paramn, i0 parami0, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    super(paramk, paramn, 1, parami0, paramInt, paramObject, paramLong1, paramLong2);
    parami0.getClass();
    j = paramLong3;
  }
  
  public long c()
  {
    long l1 = j;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = 1L + l1;
    }
    return l2;
  }
  
  public abstract boolean d();
}

/* Location:
 * Qualified Name:     b5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */