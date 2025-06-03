package z4;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p3.a;
import v3.i0;
import v3.x0;
import v5.e0;

public final class w$a
{
  public final int a;
  public final t.b b;
  public final CopyOnWriteArrayList<a> c;
  public final long d;
  
  public w$a()
  {
    this(new CopyOnWriteArrayList(), 0, null, 0L);
  }
  
  public w$a(CopyOnWriteArrayList<a> paramCopyOnWriteArrayList, int paramInt, t.b paramb, long paramLong)
  {
    c = paramCopyOnWriteArrayList;
    a = paramInt;
    b = paramb;
    d = paramLong;
  }
  
  public final long a(long paramLong)
  {
    long l = e0.R(paramLong);
    paramLong = -9223372036854775807L;
    if (l != -9223372036854775807L) {
      paramLong = d + l;
    }
    return paramLong;
  }
  
  public final void b(int paramInt1, i0 parami0, int paramInt2, Object paramObject, long paramLong)
  {
    c(new q(1, paramInt1, parami0, paramInt2, paramObject, a(paramLong), -9223372036854775807L));
  }
  
  public final void c(q paramq)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new x0(this, localw, paramq, 1));
    }
  }
  
  public final void d(n paramn, int paramInt)
  {
    e(paramn, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public final void e(n paramn, int paramInt1, int paramInt2, i0 parami0, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    f(paramn, new q(paramInt1, paramInt2, parami0, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void f(n paramn, q paramq)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new u(this, localw, paramn, paramq, 1));
    }
  }
  
  public final void g(n paramn, int paramInt)
  {
    h(paramn, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public final void h(n paramn, int paramInt1, int paramInt2, i0 parami0, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    i(paramn, new q(paramInt1, paramInt2, parami0, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void i(n paramn, q paramq)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new p2.v(this, localw, paramn, paramq, 2));
    }
  }
  
  public final void j(n paramn, int paramInt1, int paramInt2, i0 parami0, int paramInt3, Object paramObject, long paramLong1, long paramLong2, IOException paramIOException, boolean paramBoolean)
  {
    l(paramn, new q(paramInt1, paramInt2, parami0, paramInt3, paramObject, a(paramLong1), a(paramLong2)), paramIOException, paramBoolean);
  }
  
  public final void k(n paramn, int paramInt, IOException paramIOException, boolean paramBoolean)
  {
    j(paramn, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramIOException, paramBoolean);
  }
  
  public final void l(n paramn, q paramq, IOException paramIOException, boolean paramBoolean)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new v(this, localw, paramn, paramq, paramIOException, paramBoolean));
    }
  }
  
  public final void m(n paramn, int paramInt)
  {
    n(paramn, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
  }
  
  public final void n(n paramn, int paramInt1, int paramInt2, i0 parami0, int paramInt3, Object paramObject, long paramLong1, long paramLong2)
  {
    o(paramn, new q(paramInt1, paramInt2, parami0, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void o(n paramn, q paramq)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new u(this, localw, paramn, paramq, 0));
    }
  }
  
  public final void p(q paramq)
  {
    t.b localb = b;
    localb.getClass();
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      w localw = b;
      e0.M(a, new a(this, localw, localb, paramq, 1));
    }
  }
  
  public static final class a
  {
    public Handler a;
    public w b;
    
    public a(Handler paramHandler, w paramw)
    {
      a = paramHandler;
      b = paramw;
    }
  }
}

/* Location:
 * Qualified Name:     z4.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */