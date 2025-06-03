package y0;

import F0.T;
import F0.T.a;
import F0.n;
import d0.i;
import d0.q;
import g0.M;
import g0.z;

public final class d$a
  implements T
{
  public final int a;
  public final int b;
  public final q c;
  public final n d;
  public q e;
  public T f;
  public long g;
  
  public d$a(int paramInt1, int paramInt2, q paramq)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramq;
    d = new n();
  }
  
  public void a(z paramz, int paramInt1, int paramInt2)
  {
    ((T)M.i(f)).e(paramz, paramInt1);
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    long l = g;
    if ((l != -9223372036854775807L) && (paramLong >= l)) {
      f = d;
    }
    ((T)M.i(f)).b(paramLong, paramInt1, paramInt2, paramInt3, parama);
  }
  
  public int c(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return ((T)M.i(f)).f(parami, paramInt1, paramBoolean);
  }
  
  public void d(q paramq)
  {
    q localq1 = c;
    q localq2 = paramq;
    if (localq1 != null) {
      localq2 = paramq.h(localq1);
    }
    e = localq2;
    ((T)M.i(f)).d(e);
  }
  
  public void g(f.b paramb, long paramLong)
  {
    if (paramb == null)
    {
      f = d;
      return;
    }
    g = paramLong;
    T localT = paramb.a(a, b);
    f = localT;
    paramb = e;
    if (paramb != null) {
      localT.d(paramb);
    }
  }
}

/* Location:
 * Qualified Name:     y0.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */