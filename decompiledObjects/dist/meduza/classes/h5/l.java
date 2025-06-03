package h5;

import java.util.List;
import z3.h;

public abstract class l
  extends h
  implements g
{
  public g c;
  public long d;
  
  public final int f(long paramLong)
  {
    g localg = c;
    localg.getClass();
    return localg.f(paramLong - d);
  }
  
  public final long g(int paramInt)
  {
    g localg = c;
    localg.getClass();
    return localg.g(paramInt) + d;
  }
  
  public final List<a> h(long paramLong)
  {
    g localg = c;
    localg.getClass();
    return localg.h(paramLong - d);
  }
  
  public final int i()
  {
    g localg = c;
    localg.getClass();
    return localg.i();
  }
  
  public final void p(long paramLong1, g paramg, long paramLong2)
  {
    b = paramLong1;
    c = paramg;
    if (paramLong2 != Long.MAX_VALUE) {
      paramLong1 = paramLong2;
    }
    d = paramLong1;
  }
}

/* Location:
 * Qualified Name:     h5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */