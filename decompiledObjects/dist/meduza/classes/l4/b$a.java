package l4;

import c4.i;
import c4.n;
import c4.o;
import c4.o.a;
import c4.t;
import x6.b;

public final class b$a
  implements f
{
  public o a;
  public o.a b;
  public long c;
  public long d;
  
  public b$a(o paramo, o.a parama)
  {
    a = paramo;
    b = parama;
    c = -1L;
    d = -1L;
  }
  
  public final t a()
  {
    boolean bool;
    if (c != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    return new n(a, c);
  }
  
  public final long b(i parami)
  {
    long l = d;
    if (l >= 0L)
    {
      l = -(l + 2L);
      d = -1L;
      return l;
    }
    return -1L;
  }
  
  public final void c(long paramLong)
  {
    long[] arrayOfLong = b.a;
    d = arrayOfLong[v5.e0.f(arrayOfLong, paramLong, true)];
  }
}

/* Location:
 * Qualified Name:     l4.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */