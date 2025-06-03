package x0;

import android.os.Handler;
import d0.I;
import g0.M;
import i0.y;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p0.v;
import p0.v.a;

public abstract class h
  extends a
{
  public final HashMap h = new HashMap();
  public Handler i;
  public y j;
  
  public void B()
  {
    Iterator localIterator = h.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.m(b);
      a.c(c);
      a.o(c);
    }
    h.clear();
  }
  
  public final void D(Object paramObject)
  {
    paramObject = (b)g0.a.e((b)h.get(paramObject));
    a.d(b);
  }
  
  public final void E(Object paramObject)
  {
    paramObject = (b)g0.a.e((b)h.get(paramObject));
    a.n(b);
  }
  
  public abstract x.b F(Object paramObject, x.b paramb);
  
  public long G(Object paramObject, long paramLong, x.b paramb)
  {
    return paramLong;
  }
  
  public abstract int H(Object paramObject, int paramInt);
  
  public abstract void J(Object paramObject, x paramx, I paramI);
  
  public final void K(Object paramObject, x paramx)
  {
    g0.a.a(h.containsKey(paramObject) ^ true);
    g localg = new g(this, paramObject);
    a locala = new a(paramObject);
    h.put(paramObject, new b(paramx, localg, locala));
    paramx.p((Handler)g0.a.e(i), locala);
    paramx.k((Handler)g0.a.e(i), locala);
    paramx.g(localg, j, x());
    if (!y()) {
      paramx.d(localg);
    }
  }
  
  public final void L(Object paramObject)
  {
    paramObject = (b)g0.a.e((b)h.remove(paramObject));
    a.m(b);
    a.c(c);
    a.o(c);
  }
  
  public void h()
  {
    Iterator localIterator = h.values().iterator();
    while (localIterator.hasNext()) {
      nexta.h();
    }
  }
  
  public void v()
  {
    Iterator localIterator = h.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.d(b);
    }
  }
  
  public void w()
  {
    Iterator localIterator = h.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.n(b);
    }
  }
  
  public void z(y paramy)
  {
    j = paramy;
    i = M.A();
  }
  
  public final class a
    implements E, v
  {
    public final Object a;
    public E.a b = u(null);
    public v.a c = s(null);
    
    public a(Object paramObject)
    {
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
        localObject = F(a, paramb);
        paramb = (x.b)localObject;
        if (localObject == null) {
          return false;
        }
      }
      else
      {
        paramb = null;
      }
      paramInt = H(a, paramInt);
      Object localObject = b;
      if ((a != paramInt) || (!M.c(b, paramb))) {
        b = t(paramInt, paramb);
      }
      localObject = c;
      if ((a != paramInt) || (!M.c(b, paramb))) {
        c = r(paramInt, paramb);
      }
      return true;
    }
    
    public final u c(u paramu, x.b paramb)
    {
      long l1 = G(a, f, paramb);
      long l2 = G(a, g, paramb);
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
  
  public static final class b
  {
    public final x a;
    public final x.c b;
    public final h.a c;
    
    public b(x paramx, x.c paramc, h.a parama)
    {
      a = paramx;
      b = paramc;
      c = parama;
    }
  }
}

/* Location:
 * Qualified Name:     x0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */