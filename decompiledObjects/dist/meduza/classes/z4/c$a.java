package z4;

import l3.l;
import v3.i0;
import v3.i0.a;
import z3.g;

public final class c$a
  implements c0
{
  public final c0 a;
  public boolean b;
  
  public c$a(c paramc, c0 paramc0)
  {
    a = paramc0;
  }
  
  public final void a()
  {
    a.a();
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((!c.f()) && (a.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int m(long paramLong)
  {
    if (c.f()) {
      return -3;
    }
    return a.m(paramLong);
  }
  
  public final int r(l paraml, g paramg, int paramInt)
  {
    if (c.f()) {
      return -3;
    }
    if (b)
    {
      a = 4;
      return -4;
    }
    paramInt = a.r(paraml, paramg, paramInt);
    if (paramInt == -5)
    {
      paramg = (i0)b;
      paramg.getClass();
      paramInt = J;
      if ((paramInt != 0) || (K != 0))
      {
        c localc = c;
        l = e;
        int i = 0;
        if (l != 0L) {
          paramInt = 0;
        }
        if (f == Long.MIN_VALUE) {
          i = K;
        }
        paramg = paramg.a();
        A = paramInt;
        B = i;
        b = paramg.a();
      }
      return -5;
    }
    paraml = c;
    long l = f;
    if ((l != Long.MIN_VALUE) && (((paramInt == -4) && (e >= l)) || ((paramInt == -3) && (paraml.g() == Long.MIN_VALUE) && (!d))))
    {
      paramg.o();
      a = 4;
      b = true;
      return -4;
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     z4.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */