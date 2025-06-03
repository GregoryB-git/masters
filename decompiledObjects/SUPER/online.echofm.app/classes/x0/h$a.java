package x0;

import g0.M;
import java.io.IOException;
import p0.v;
import p0.v.a;

public final class h$a
  implements E, v
{
  public final Object a;
  public E.a b;
  public v.a c;
  
  public h$a(h paramh, Object paramObject)
  {
    b = paramh.u(null);
    c = paramh.s(null);
    a = paramObject;
  }
  
  public void K(int paramInt, x.b paramb, r paramr, u paramu)
  {
    if (b(paramInt, paramb)) {
      b.A(paramr, c(paramu, paramb));
    }
  }
  
  public void M(int paramInt1, x.b paramb, int paramInt2)
  {
    if (b(paramInt1, paramb)) {
      c.k(paramInt2);
    }
  }
  
  public void S(int paramInt, x.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.h();
    }
  }
  
  public void T(int paramInt, x.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.m();
    }
  }
  
  public void W(int paramInt, x.b paramb, u paramu)
  {
    if (b(paramInt, paramb)) {
      b.i(c(paramu, paramb));
    }
  }
  
  public void Z(int paramInt, x.b paramb, u paramu)
  {
    if (b(paramInt, paramb)) {
      b.D(c(paramu, paramb));
    }
  }
  
  public void a0(int paramInt, x.b paramb, r paramr, u paramu, IOException paramIOException, boolean paramBoolean)
  {
    if (b(paramInt, paramb)) {
      b.x(paramr, c(paramu, paramb), paramIOException, paramBoolean);
    }
  }
  
  public final boolean b(int paramInt, x.b paramb)
  {
    if (paramb != null)
    {
      localObject = d.F(a, paramb);
      paramb = (x.b)localObject;
      if (localObject == null) {
        return false;
      }
    }
    else
    {
      paramb = null;
    }
    paramInt = d.H(a, paramInt);
    Object localObject = b;
    if ((a != paramInt) || (!M.c(b, paramb))) {
      b = d.t(paramInt, paramb);
    }
    localObject = c;
    if ((a != paramInt) || (!M.c(b, paramb))) {
      c = d.r(paramInt, paramb);
    }
    return true;
  }
  
  public final u c(u paramu, x.b paramb)
  {
    long l1 = d.G(a, f, paramb);
    long l2 = d.G(a, g, paramb);
    if ((l1 == f) && (l2 == g)) {
      return paramu;
    }
    return new u(a, b, c, d, e, l1, l2);
  }
  
  public void d0(int paramInt, x.b paramb, Exception paramException)
  {
    if (b(paramInt, paramb)) {
      c.l(paramException);
    }
  }
  
  public void g0(int paramInt, x.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.i();
    }
  }
  
  public void l0(int paramInt, x.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.j();
    }
  }
  
  public void m0(int paramInt, x.b paramb, r paramr, u paramu)
  {
    if (b(paramInt, paramb)) {
      b.u(paramr, c(paramu, paramb));
    }
  }
  
  public void p0(int paramInt, x.b paramb, r paramr, u paramu)
  {
    if (b(paramInt, paramb)) {
      b.r(paramr, c(paramu, paramb));
    }
  }
}

/* Location:
 * Qualified Name:     x0.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */