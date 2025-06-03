package z4;

import a4.g;
import a4.g.a;
import android.os.Handler;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import t5.l0;
import v3.r1;
import v5.e0;
import x6.b;

public abstract class f<T>
  extends a
{
  public final HashMap<T, b<T>> p = new HashMap();
  public Handler q;
  public l0 r;
  
  public abstract void A(Object paramObject, r1 paramr1);
  
  public final void B(h.d paramd, t paramt)
  {
    b.q(p.containsKey(paramd) ^ true);
    e locale = new e(this, paramd);
    Object localObject = new a(paramd);
    p.put(paramd, new b(paramt, locale, (a)localObject));
    paramd = q;
    paramd.getClass();
    paramt.n(paramd, (w)localObject);
    paramd = q;
    paramd.getClass();
    paramt.d(paramd, (g)localObject);
    localObject = r;
    paramd = o;
    b.K(paramd);
    paramt.e(locale, (l0)localObject, paramd);
    if (!(b.isEmpty() ^ true)) {
      paramt.l(locale);
    }
  }
  
  public void h()
  {
    Iterator localIterator = p.values().iterator();
    while (localIterator.hasNext()) {
      nexta.h();
    }
  }
  
  public void r()
  {
    Iterator localIterator = p.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.l(b);
    }
  }
  
  public void s()
  {
    Iterator localIterator = p.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.b(b);
    }
  }
  
  public void w()
  {
    Iterator localIterator = p.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      a.a(b);
      a.m(c);
      a.c(c);
    }
    p.clear();
  }
  
  public abstract t.b x(T paramT, t.b paramb);
  
  public long y(T paramT, long paramLong)
  {
    return paramLong;
  }
  
  public abstract int z(int paramInt, Object paramObject);
  
  public final class a
    implements w, g
  {
    public final T a;
    public w.a b = q(null);
    public g.a c = new g.a(d.c, 0, null);
    
    public a(h.d paramd)
    {
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
        localObject = x(a, paramb);
        paramb = (t.b)localObject;
        if (localObject == null) {
          return false;
        }
      }
      else
      {
        paramb = null;
      }
      paramInt = z(paramInt, a);
      Object localObject = b;
      if ((a != paramInt) || (!e0.a(b, paramb))) {
        b = new w.a(c.c, paramInt, paramb, 0L);
      }
      localObject = c;
      if ((a != paramInt) || (!e0.a(b, paramb))) {
        c = new g.a(d.c, paramInt, paramb);
      }
      return true;
    }
    
    public final q d(q paramq)
    {
      long l1 = y(a, f);
      long l2 = y(a, g);
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
  
  public static final class b<T>
  {
    public final t a;
    public final t.c b;
    public final f<T>.a c;
    
    public b(t paramt, e parame, f.a parama)
    {
      a = paramt;
      b = parame;
      c = parama;
    }
  }
}

/* Location:
 * Qualified Name:     z4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */