package b5;

import b.z;
import c4.v;
import t5.h;
import t5.j0;
import t5.k;
import t5.n;
import v3.i0;
import x6.b;
import z4.b0;

public final class o
  extends a
{
  public final int o;
  public final i0 p;
  public long q;
  public boolean r;
  
  public o(k paramk, n paramn, i0 parami01, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, i0 parami02)
  {
    super(paramk, paramn, parami01, paramInt1, paramObject, paramLong1, paramLong2, -9223372036854775807L, -9223372036854775807L, paramLong3);
    o = paramInt2;
    p = parami02;
  }
  
  public final void a()
  {
    Object localObject1 = m;
    b.K(localObject1);
    Object localObject3 = b;
    int i = localObject3.length;
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      Object localObject4 = localObject3[k];
      if (F != 0L)
      {
        F = 0L;
        z = true;
      }
    }
    localObject1 = ((c)localObject1).a(o);
    ((v)localObject1).d(p);
    try
    {
      localObject3 = b.a(q);
      long l1 = this.i.a((n)localObject3);
      long l2 = l1;
      if (l1 != -1L) {
        l2 = l1 + q;
      }
      localObject3 = new c4/e;
      ((c4.e)localObject3).<init>(this.i, q, l2);
      for (k = j; k != -1; k = ((v)localObject1).e((h)localObject3, Integer.MAX_VALUE, true)) {
        q += k;
      }
      k = (int)q;
      ((v)localObject1).c(g, 1, k, 0, null);
      z.d(this.i);
      r = true;
      return;
    }
    finally
    {
      z.d(this.i);
    }
  }
  
  public final void b() {}
  
  public final boolean d()
  {
    return r;
  }
}

/* Location:
 * Qualified Name:     b5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */