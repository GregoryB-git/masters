package a1;

import F0.A;
import F0.B;
import F0.B.a;
import F0.M;
import F0.s;
import g0.a;

public final class b$a
  implements g
{
  public B a;
  public B.a b;
  public long c;
  public long d;
  
  public b$a(B paramB, B.a parama)
  {
    a = paramB;
    b = parama;
    c = -1L;
    d = -1L;
  }
  
  public M a()
  {
    boolean bool;
    if (c != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    return new A(a, c);
  }
  
  public void b(long paramLong)
  {
    long[] arrayOfLong = b.a;
    d = arrayOfLong[g0.M.h(arrayOfLong, paramLong, true, true)];
  }
  
  public long c(s params)
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
  
  public void d(long paramLong)
  {
    c = paramLong;
  }
}

/* Location:
 * Qualified Name:     a1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */