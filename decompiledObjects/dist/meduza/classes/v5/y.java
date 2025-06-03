package v5;

import v3.e1;

public final class y
  implements o
{
  public final c a;
  public boolean b;
  public long c;
  public long d;
  public e1 e;
  
  public y(c paramc)
  {
    a = paramc;
    e = e1.d;
  }
  
  public final void a(long paramLong)
  {
    c = paramLong;
    if (b) {
      d = a.d();
    }
  }
  
  public final void c(e1 parame1)
  {
    if (b) {
      a(l());
    }
    e = parame1;
  }
  
  public final e1 f()
  {
    return e;
  }
  
  public final long l()
  {
    long l1 = c;
    long l2 = l1;
    if (b)
    {
      l2 = a.d() - d;
      e1 locale1 = e;
      if (a == 1.0F) {
        l2 = e0.I(l2);
      } else {
        l2 *= c;
      }
      l2 = l1 + l2;
    }
    return l2;
  }
}

/* Location:
 * Qualified Name:     v5.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */