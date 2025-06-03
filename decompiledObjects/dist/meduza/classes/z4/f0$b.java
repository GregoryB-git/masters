package z4;

import java.nio.ByteBuffer;
import l3.l;
import v3.i0;
import v5.e0;
import z3.a;
import z3.g;

public final class f0$b
  implements c0
{
  public final long a;
  public boolean b;
  public long c;
  
  public f0$b(long paramLong)
  {
    i0 locali0 = f0.r;
    paramLong = paramLong * 44100L / 1000000L;
    a = (e0.w(2, 2) * paramLong);
    c(0L);
  }
  
  public final void a() {}
  
  public final boolean b()
  {
    return true;
  }
  
  public final void c(long paramLong)
  {
    i0 locali0 = f0.r;
    paramLong = paramLong * 44100L / 1000000L;
    c = e0.j(e0.w(2, 2) * paramLong, 0L, a);
  }
  
  public final int m(long paramLong)
  {
    long l = c;
    c(paramLong);
    return (int)((c - l) / f0.t.length);
  }
  
  public final int r(l paraml, g paramg, int paramInt)
  {
    if ((b) && ((paramInt & 0x2) == 0))
    {
      long l1 = a;
      long l2 = c;
      l1 -= l2;
      if (l1 == 0L)
      {
        paramg.l(4);
        return -4;
      }
      paraml = f0.r;
      e = (l2 / e0.w(2, 2) * 1000000L / 44100L);
      paramg.l(1);
      paraml = f0.t;
      int i = (int)Math.min(paraml.length, l1);
      if ((paramInt & 0x4) == 0)
      {
        paramg.q(i);
        c.put(paraml, 0, i);
      }
      if ((paramInt & 0x1) == 0) {
        c += i;
      }
      return -4;
    }
    b = f0.r;
    b = true;
    return -5;
  }
}

/* Location:
 * Qualified Name:     z4.f0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */