package b5;

import t5.k;
import t5.n;
import v3.i0;
import x6.b;

public abstract class a
  extends m
{
  public final long k;
  public final long l;
  public c m;
  public int[] n;
  
  public a(k paramk, n paramn, i0 parami0, int paramInt, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    super(paramk, paramn, parami0, paramInt, paramObject, paramLong1, paramLong2, paramLong5);
    k = paramLong3;
    l = paramLong4;
  }
  
  public final int e(int paramInt)
  {
    int[] arrayOfInt = n;
    b.K(arrayOfInt);
    return arrayOfInt[paramInt];
  }
}

/* Location:
 * Qualified Name:     b5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */