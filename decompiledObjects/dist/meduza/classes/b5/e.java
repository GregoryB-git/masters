package b5;

import java.util.concurrent.atomic.AtomicLong;
import t5.d0.d;
import t5.j0;
import t5.k;
import v3.i0;

public abstract class e
  implements d0.d
{
  public final long a;
  public final t5.n b;
  public final int c;
  public final i0 d;
  public final int e;
  public final Object f;
  public final long g;
  public final long h;
  public final j0 i;
  
  public e(k paramk, t5.n paramn, int paramInt1, i0 parami0, int paramInt2, Object paramObject, long paramLong1, long paramLong2)
  {
    i = new j0(paramk);
    b = paramn;
    c = paramInt1;
    d = parami0;
    e = paramInt2;
    f = paramObject;
    g = paramLong1;
    h = paramLong2;
    a = z4.n.b.getAndIncrement();
  }
}

/* Location:
 * Qualified Name:     b5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */