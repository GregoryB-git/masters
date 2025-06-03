package j4;

import c4.t.a;
import c4.u;
import v5.e0;
import v5.n;

public final class b
  implements e
{
  public final long a;
  public final n b;
  public final n c;
  public long d;
  
  public b(long paramLong1, long paramLong2, long paramLong3)
  {
    d = paramLong1;
    a = paramLong3;
    n localn1 = new n();
    b = localn1;
    n localn2 = new n();
    c = localn2;
    localn1.a(0L);
    localn2.a(paramLong2);
  }
  
  public final long a(long paramLong)
  {
    int i = e0.d(c, paramLong);
    return b.b(i);
  }
  
  public final boolean b(long paramLong)
  {
    n localn = b;
    int i = a;
    boolean bool = true;
    if (paramLong - localn.b(i - 1) >= 100000L) {
      bool = false;
    }
    return bool;
  }
  
  public final long c()
  {
    return a;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    int i = e0.d(b, paramLong);
    long l = b.b(i);
    u localu = new u(l, c.b(i));
    if (l != paramLong)
    {
      n localn = b;
      if (i != a - 1)
      {
        i++;
        return new t.a(localu, new u(localn.b(i), c.b(i)));
      }
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     j4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */