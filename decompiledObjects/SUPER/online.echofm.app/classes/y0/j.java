package y0;

import F0.T;
import F0.s;
import d0.q;
import i0.g;
import i0.k;
import i0.x;

public class j
  extends a
{
  public final int o;
  public final long p;
  public final f q;
  public long r;
  public volatile boolean s;
  public boolean t;
  
  public j(g paramg, k paramk, q paramq, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, long paramLong6, f paramf)
  {
    super(paramg, paramk, paramq, paramInt1, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
    o = paramInt2;
    p = paramLong6;
    q = paramf;
  }
  
  public final void b()
  {
    c localc1 = j();
    Object localObject2;
    Object localObject3;
    if (r == 0L)
    {
      localc1.c(p);
      localObject2 = q;
      localObject3 = l(localc1);
      long l1 = k;
      if (l1 == -9223372036854775807L) {
        l1 = -9223372036854775807L;
      } else {
        l1 -= p;
      }
      long l2 = l;
      if (l2 == -9223372036854775807L) {
        l2 = -9223372036854775807L;
      } else {
        l2 -= p;
      }
      ((f)localObject2).b((f.b)localObject3, l1, l2);
    }
    try
    {
      localObject2 = b.e(r);
      localObject3 = new F0/j;
      x localx = i;
      ((F0.j)localObject3).<init>(localx, g, localx.e((k)localObject2));
      try
      {
        while ((!s) && (q.c((s)localObject3))) {}
        m(localc2);
      }
      finally
      {
        break label218;
      }
      r = (((s)localObject3).p() - b.g);
      i0.j.a(i);
      t = (s ^ true);
      return;
    }
    finally
    {
      break label238;
      label218:
      r = (((s)localObject3).p() - b.g);
      throw ((Throwable)localObject1);
      label238:
      i0.j.a(i);
    }
  }
  
  public final void c()
  {
    s = true;
  }
  
  public long g()
  {
    return j + o;
  }
  
  public boolean h()
  {
    return t;
  }
  
  public f.b l(c paramc)
  {
    return paramc;
  }
  
  public final void m(c paramc)
  {
    if (!d0.z.p(d.m)) {
      return;
    }
    q localq = d;
    int i = I;
    int j = 1;
    if (((i > 1) || (J > 1)) && (i != -1) && (J != -1))
    {
      paramc = paramc.a(0, 4);
      localq = d;
      i = I;
      i = J * i;
      long l1 = (h - g) / i;
      while (j < i)
      {
        long l2 = j;
        paramc.e(new g0.z(), 0);
        paramc.b(l2 * l1, 0, 0, 0, null);
        j++;
      }
    }
  }
}

/* Location:
 * Qualified Name:     y0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */