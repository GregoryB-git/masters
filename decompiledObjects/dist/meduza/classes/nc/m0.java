package nc;

import ub.f;
import ub.f.a;
import vb.a;
import wb.c;

public final class m0
{
  public static final Object a(long paramLong, c paramc)
  {
    if (paramLong <= 0L) {
      return rb.h.a;
    }
    paramc = new l(1, p2.m0.P(paramc));
    paramc.t();
    if (paramLong < Long.MAX_VALUE) {
      b(e).f(paramLong, paramc);
    }
    paramc = paramc.s();
    if (paramc == a.a) {
      return paramc;
    }
    return rb.h.a;
  }
  
  public static final l0 b(ub.h paramh)
  {
    int i = f.n;
    paramh = paramh.get(f.a.a);
    if ((paramh instanceof l0)) {
      paramh = (l0)paramh;
    } else {
      paramh = null;
    }
    Object localObject = paramh;
    if (paramh == null) {
      localObject = i0.a;
    }
    return (l0)localObject;
  }
}

/* Location:
 * Qualified Name:     nc.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */