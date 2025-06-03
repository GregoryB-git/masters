package l1;

import g0.E;
import g0.y;
import g0.z;

public final class C$a
{
  public final m a;
  public final E b;
  public final y c;
  public boolean d;
  public boolean e;
  public boolean f;
  public int g;
  public long h;
  
  public C$a(m paramm, E paramE)
  {
    a = paramm;
    b = paramE;
    c = new y(new byte[64]);
  }
  
  public void a(z paramz)
  {
    paramz.l(c.a, 0, 3);
    c.p(0);
    b();
    paramz.l(c.a, 0, g);
    c.p(0);
    c();
    a.d(h, 4);
    a.a(paramz);
    a.c(false);
  }
  
  public final void b()
  {
    c.r(8);
    d = c.g();
    e = c.g();
    c.r(6);
    g = c.h(8);
  }
  
  public final void c()
  {
    h = 0L;
    if (d)
    {
      c.r(4);
      long l1 = c.h(3);
      c.r(1);
      long l2 = c.h(15) << 15;
      c.r(1);
      long l3 = c.h(15);
      c.r(1);
      if ((!f) && (e))
      {
        c.r(4);
        long l4 = c.h(3);
        c.r(1);
        long l5 = c.h(15) << 15;
        c.r(1);
        long l6 = c.h(15);
        c.r(1);
        b.b(l4 << 30 | l5 | l6);
        f = true;
      }
      h = b.b(l1 << 30 | l2 | l3);
    }
  }
  
  public void d()
  {
    f = false;
    a.b();
  }
}

/* Location:
 * Qualified Name:     l1.C.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */