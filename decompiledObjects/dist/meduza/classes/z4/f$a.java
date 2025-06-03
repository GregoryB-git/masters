package z4;

import a4.g;
import a4.g.a;
import java.io.IOException;
import v5.e0;

public final class f$a
  implements w, g
{
  public final T a;
  public w.a b;
  public g.a c;
  
  public f$a(f paramf, h.d paramd)
  {
    b = paramf.q(null);
    c = new g.a(d.c, 0, null);
    a = paramd;
  }
  
  public final void E(int paramInt, t.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.c();
    }
  }
  
  public final void H(int paramInt, t.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.f();
    }
  }
  
  public final void M(int paramInt, t.b paramb, n paramn, q paramq)
  {
    if (b(paramInt, paramb)) {
      b.f(paramn, d(paramq));
    }
  }
  
  public final void O(int paramInt, t.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.b();
    }
  }
  
  public final void P(int paramInt, t.b paramb, Exception paramException)
  {
    if (b(paramInt, paramb)) {
      c.e(paramException);
    }
  }
  
  public final void U(int paramInt1, t.b paramb, int paramInt2)
  {
    if (b(paramInt1, paramb)) {
      c.d(paramInt2);
    }
  }
  
  public final void V(int paramInt, t.b paramb, q paramq)
  {
    if (b(paramInt, paramb)) {
      b.c(d(paramq));
    }
  }
  
  public final boolean b(int paramInt, t.b paramb)
  {
    if (paramb != null)
    {
      localObject = d.x(a, paramb);
      paramb = (t.b)localObject;
      if (localObject == null) {
        return false;
      }
    }
    else
    {
      paramb = null;
    }
    paramInt = d.z(paramInt, a);
    Object localObject = b;
    if ((a != paramInt) || (!e0.a(b, paramb))) {
      b = new w.a(d.c.c, paramInt, paramb, 0L);
    }
    localObject = c;
    if ((a != paramInt) || (!e0.a(b, paramb))) {
      c = new g.a(d.d.c, paramInt, paramb);
    }
    return true;
  }
  
  public final q d(q paramq)
  {
    long l1 = d.y(a, f);
    long l2 = d.y(a, g);
    if ((l1 == f) && (l2 == g)) {
      return paramq;
    }
    return new q(a, b, c, d, e, l1, l2);
  }
  
  public final void f0(int paramInt, t.b paramb, n paramn, q paramq, IOException paramIOException, boolean paramBoolean)
  {
    if (b(paramInt, paramb)) {
      b.l(paramn, d(paramq), paramIOException, paramBoolean);
    }
  }
  
  public final void h0(int paramInt, t.b paramb, n paramn, q paramq)
  {
    if (b(paramInt, paramb)) {
      b.o(paramn, d(paramq));
    }
  }
  
  public final void j0(int paramInt, t.b paramb)
  {
    if (b(paramInt, paramb)) {
      c.a();
    }
  }
  
  public final void n0(int paramInt, t.b paramb, n paramn, q paramq)
  {
    if (b(paramInt, paramb)) {
      b.i(paramn, d(paramq));
    }
  }
  
  public final void o0(int paramInt, t.b paramb, q paramq)
  {
    if (b(paramInt, paramb)) {
      b.p(d(paramq));
    }
  }
}

/* Location:
 * Qualified Name:     z4.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */