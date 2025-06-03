package k0;

import d0.C;
import g0.M;
import g0.c;

public final class e1
  implements A0
{
  public final c o;
  public boolean p;
  public long q;
  public long r;
  public C s;
  
  public e1(c paramc)
  {
    o = paramc;
    s = C.d;
  }
  
  public long H()
  {
    long l1 = q;
    long l2 = l1;
    if (p)
    {
      l2 = o.b() - r;
      C localC = s;
      if (a == 1.0F) {}
      for (l2 = M.J0(l2);; l2 = localC.a(l2))
      {
        l2 = l1 + l2;
        break;
      }
    }
    return l2;
  }
  
  public void a(long paramLong)
  {
    q = paramLong;
    if (p) {
      r = o.b();
    }
  }
  
  public void b()
  {
    if (!p)
    {
      r = o.b();
      p = true;
    }
  }
  
  public void c()
  {
    if (p)
    {
      a(H());
      p = false;
    }
  }
  
  public C h()
  {
    return s;
  }
  
  public void k(C paramC)
  {
    if (p) {
      a(H());
    }
    s = paramC;
  }
}

/* Location:
 * Qualified Name:     k0.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */