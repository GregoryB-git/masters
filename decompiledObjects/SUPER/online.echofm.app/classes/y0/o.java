package y0;

import F0.T;
import d0.i;
import d0.q;
import i0.g;
import i0.k;
import i0.x;

public final class o
  extends a
{
  public final int o;
  public final q p;
  public long q;
  public boolean r;
  
  public o(g paramg, k paramk, q paramq1, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, q paramq2)
  {
    super(paramg, paramk, paramq1, paramInt1, paramObject, paramLong1, paramLong2, -9223372036854775807L, -9223372036854775807L, paramLong3);
    o = paramInt2;
    p = paramq2;
  }
  
  public void b()
  {
    Object localObject1 = j();
    ((c)localObject1).c(0L);
    int i = o;
    int j = 0;
    localObject1 = ((c)localObject1).a(0, i);
    ((T)localObject1).d(p);
    long l2;
    try
    {
      localObject3 = b.e(q);
      long l1 = this.i.e((k)localObject3);
      l2 = l1;
      if (l1 != -1L) {
        l2 = l1 + q;
      }
    }
    finally
    {
      break label171;
    }
    Object localObject3 = new F0/j;
    ((F0.j)localObject3).<init>(this.i, q, l2);
    while (j != -1)
    {
      q += j;
      j = ((T)localObject2).f((i)localObject3, Integer.MAX_VALUE, true);
    }
    j = (int)q;
    ((T)localObject2).b(g, 1, j, 0, null);
    i0.j.a(this.i);
    r = true;
    return;
    label171:
    i0.j.a(this.i);
    throw ((Throwable)localObject2);
  }
  
  public void c() {}
  
  public boolean h()
  {
    return r;
  }
}

/* Location:
 * Qualified Name:     y0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */