package x0;

import android.os.Handler;
import d0.q;
import g0.M;
import g0.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class E$a
{
  public final int a;
  public final x.b b;
  public final CopyOnWriteArrayList c;
  
  public E$a()
  {
    this(new CopyOnWriteArrayList(), 0, null);
  }
  
  public E$a(CopyOnWriteArrayList paramCopyOnWriteArrayList, int paramInt, x.b paramb)
  {
    c = paramCopyOnWriteArrayList;
    a = paramInt;
    b = paramb;
  }
  
  public void A(r paramr, u paramu)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new y(this, localE, paramr, paramu));
    }
  }
  
  public void B(E paramE)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (b == paramE) {
        c.remove(locala);
      }
    }
  }
  
  public void C(int paramInt, long paramLong1, long paramLong2)
  {
    D(new u(1, paramInt, null, 3, null, M.i1(paramLong1), M.i1(paramLong2)));
  }
  
  public void D(u paramu)
  {
    x.b localb = (x.b)a.e(b);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new A(this, localE, localb, paramu));
    }
  }
  
  public a E(int paramInt, x.b paramb)
  {
    return new a(c, paramInt, paramb);
  }
  
  public void g(Handler paramHandler, E paramE)
  {
    a.e(paramHandler);
    a.e(paramE);
    c.add(new a(paramHandler, paramE));
  }
  
  public void h(int paramInt1, q paramq, int paramInt2, Object paramObject, long paramLong)
  {
    i(new u(1, paramInt1, paramq, paramInt2, paramObject, M.i1(paramLong), -9223372036854775807L));
  }
  
  public void i(u paramu)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new z(this, localE, paramu));
    }
  }
  
  public void p(r paramr, int paramInt)
  {
    q(paramr, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public void q(r paramr, int paramInt1, int paramInt2, q paramq, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    r(paramr, new u(paramInt1, paramInt2, paramq, paramInt3, paramObject, M.i1(paramLong1), M.i1(paramLong2)));
  }
  
  public void r(r paramr, u paramu)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new D(this, localE, paramr, paramu));
    }
  }
  
  public void s(r paramr, int paramInt)
  {
    t(paramr, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public void t(r paramr, int paramInt1, int paramInt2, q paramq, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    u(paramr, new u(paramInt1, paramInt2, paramq, paramInt3, paramObject, M.i1(paramLong1), M.i1(paramLong2)));
  }
  
  public void u(r paramr, u paramu)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new B(this, localE, paramr, paramu));
    }
  }
  
  public void v(r paramr, int paramInt1, int paramInt2, q paramq, int paramInt3, Object paramObject, long paramLong1, long paramLong2, IOException paramIOException, boolean paramBoolean)
  {
    x(paramr, new u(paramInt1, paramInt2, paramq, paramInt3, paramObject, M.i1(paramLong1), M.i1(paramLong2)), paramIOException, paramBoolean);
  }
  
  public void w(r paramr, int paramInt, IOException paramIOException, boolean paramBoolean)
  {
    v(paramr, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramIOException, paramBoolean);
  }
  
  public void x(r paramr, u paramu, IOException paramIOException, boolean paramBoolean)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      E localE = b;
      M.S0(a, new C(this, localE, paramr, paramu, paramIOException, paramBoolean));
    }
  }
  
  public void y(r paramr, int paramInt)
  {
    z(paramr, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public void z(r paramr, int paramInt1, int paramInt2, q paramq, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    A(paramr, new u(paramInt1, paramInt2, paramq, paramInt3, paramObject, M.i1(paramLong1), M.i1(paramLong2)));
  }
  
  public static final class a
  {
    public Handler a;
    public E b;
    
    public a(Handler paramHandler, E paramE)
    {
      a = paramHandler;
      b = paramE;
    }
  }
}

/* Location:
 * Qualified Name:     x0.E.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */