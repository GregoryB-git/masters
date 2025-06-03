package b5;

import c4.g;
import c4.v;
import c4.v.a;
import t5.h;
import v3.i0;
import v5.e0;
import v5.u;

public final class d$a
  implements v
{
  public final int a;
  public final i0 b;
  public final g c;
  public i0 d;
  public v e;
  public long f;
  
  public d$a(int paramInt1, int paramInt2, i0 parami0)
  {
    a = paramInt2;
    b = parami0;
    c = new g();
  }
  
  public final void a(int paramInt, u paramu)
  {
    v localv = e;
    int i = e0.a;
    localv.b(paramInt, paramu);
  }
  
  public final void b(int paramInt, u paramu)
  {
    a(paramInt, paramu);
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
  {
    long l = f;
    if ((l != -9223372036854775807L) && (paramLong >= l)) {
      e = c;
    }
    v localv = e;
    int i = e0.a;
    localv.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
  }
  
  public final void d(i0 parami0)
  {
    i0 locali01 = b;
    i0 locali02 = parami0;
    if (locali01 != null) {
      locali02 = parami0.d(locali01);
    }
    d = locali02;
    parami0 = e;
    int i = e0.a;
    parami0.d(locali02);
  }
  
  public final int e(h paramh, int paramInt, boolean paramBoolean)
  {
    return g(paramh, paramInt, paramBoolean);
  }
  
  public final void f(f.a parama, long paramLong)
  {
    if (parama == null)
    {
      e = c;
      return;
    }
    f = paramLong;
    int i = a;
    parama = ((c)parama).a(i);
    e = parama;
    i0 locali0 = d;
    if (locali0 != null) {
      parama.d(locali0);
    }
  }
  
  public final int g(h paramh, int paramInt, boolean paramBoolean)
  {
    v localv = e;
    int i = e0.a;
    return localv.e(paramh, paramInt, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     b5.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */