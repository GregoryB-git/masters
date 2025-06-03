package r6;

import V5.n;
import V5.n.a;
import X5.d;
import Z5.h;
import g6.l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.P0;
import p6.m;
import u6.C;
import u6.E;
import u6.x;

public final class b$a
  implements e, P0
{
  public Object o = c.m();
  public m p;
  
  public b$a(b paramb) {}
  
  public void a(C paramC, int paramInt)
  {
    m localm = p;
    if (localm != null) {
      localm.a(paramC, paramInt);
    }
  }
  
  public Object b(d paramd)
  {
    b localb = q;
    Object localObject1 = (i)b.h().get(localb);
    if (localb.P()) {}
    for (boolean bool = g();; bool = true)
    {
      paramd = Z5.b.a(bool);
      break label182;
      long l1 = b.i().getAndIncrement(localb);
      int i = c.b;
      long l2 = l1 / i;
      i = (int)(l1 % i);
      if (q != l2)
      {
        localObject2 = b.e(localb, l2, (i)localObject1);
        if (localObject2 == null) {
          break;
        }
        localObject1 = localObject2;
      }
      Object localObject2 = b.p(localb, (i)localObject1, i, l1, null);
      if (localObject2 == c.r()) {
        break label184;
      }
      if (localObject2 == c.h())
      {
        if (l1 < localb.I()) {
          ((u6.e)localObject1).b();
        }
        break;
      }
      if (localObject2 == c.s()) {
        return f((i)localObject1, i, l1, paramd);
      }
      ((u6.e)localObject1).b();
      o = localObject2;
    }
    label182:
    return paramd;
    label184:
    throw new IllegalStateException("unreachable".toString());
  }
  
  public final Object f(i parami, int paramInt, long paramLong, d paramd)
  {
    Object localObject1 = q;
    m localm = p6.o.b(Y5.b.b(paramd));
    Object localObject2;
    try
    {
      d(this, localm);
      localObject2 = b.p((b)localObject1, parami, paramInt, paramLong, this);
      if (localObject2 == c.r()) {
        b.n((b)localObject1, this, parami, paramInt);
      }
    }
    finally
    {
      break label401;
    }
    Object localObject3 = c.h();
    Object localObject4 = null;
    Boolean localBoolean;
    if (localObject2 == localObject3)
    {
      if (paramLong < ((b)localObject1).I()) {
        parami.b();
      }
      localObject3 = (i)b.h().get(localObject1);
      for (;;)
      {
        if (((b)localObject1).P())
        {
          c(this);
          break label381;
        }
        paramLong = b.i().getAndIncrement(localObject1);
        paramInt = c.b;
        long l = paramLong / paramInt;
        paramInt = (int)(paramLong % paramInt);
        parami = (i)localObject3;
        if (q != l)
        {
          parami = b.e((b)localObject1, l, (i)localObject3);
          if (parami == null) {}
        }
        else
        {
          localObject2 = b.p((b)localObject1, parami, paramInt, paramLong, this);
          if (localObject2 == c.r())
          {
            b.n((b)localObject1, this, parami, paramInt);
            break label381;
          }
          if (localObject2 != c.h()) {
            break;
          }
          localObject3 = parami;
          if (paramLong < ((b)localObject1).I())
          {
            parami.b();
            localObject3 = parami;
          }
        }
      }
      if (localObject2 != c.s())
      {
        parami.b();
        e(this, localObject2);
        d(this, null);
        localBoolean = Z5.b.a(true);
        localObject1 = c;
        parami = (i)localObject4;
        localObject3 = localBoolean;
        if (localObject1 != null)
        {
          parami = x.a((l)localObject1, localObject2, localm.getContext());
          localObject3 = localBoolean;
        }
      }
    }
    for (;;)
    {
      localm.j(localObject3, parami);
      break;
      parami = new java/lang/IllegalStateException;
      parami.<init>("unexpected".toString());
      throw parami;
      parami.b();
      e(this, localObject2);
      d(this, null);
      localBoolean = Z5.b.a(true);
      localObject1 = c;
      parami = (i)localObject4;
      localObject3 = localBoolean;
      if (localObject1 != null)
      {
        parami = x.a((l)localObject1, localObject2, localm.getContext());
        localObject3 = localBoolean;
      }
    }
    label381:
    parami = localm.w();
    if (parami == Y5.b.c()) {
      h.c(paramd);
    }
    return parami;
    label401:
    localm.I();
    throw parami;
  }
  
  public final boolean g()
  {
    o = c.z();
    Throwable localThrowable = q.E();
    if (localThrowable == null) {
      return false;
    }
    throw E.a(localThrowable);
  }
  
  public final void h()
  {
    m localm = p;
    Intrinsics.b(localm);
    p = null;
    o = c.z();
    Throwable localThrowable = q.E();
    if (localThrowable == null) {
      localObject = n.o;
    }
    for (Object localObject = Boolean.FALSE;; localObject = V5.o.a(localThrowable))
    {
      localm.resumeWith(n.a(localObject));
      break;
      localObject = n.o;
    }
  }
  
  public final boolean i(Object paramObject)
  {
    m localm = p;
    Intrinsics.b(localm);
    l locall1 = null;
    p = null;
    o = paramObject;
    Boolean localBoolean = Boolean.TRUE;
    l locall2 = q.c;
    if (locall2 != null) {
      locall1 = x.a(locall2, paramObject, localm.getContext());
    }
    return c.u(localm, localBoolean, locall1);
  }
  
  public final void j()
  {
    m localm = p;
    Intrinsics.b(localm);
    p = null;
    o = c.z();
    Object localObject = q.E();
    if (localObject == null) {
      localObject = n.o;
    }
    for (localObject = Boolean.FALSE;; localObject = V5.o.a((Throwable)localObject))
    {
      localm.resumeWith(n.a(localObject));
      break;
      n.a locala = n.o;
    }
  }
  
  public Object next()
  {
    Object localObject = o;
    if (localObject != c.m())
    {
      o = c.m();
      if (localObject != c.z()) {
        return localObject;
      }
      throw E.a(b.g(q));
    }
    throw new IllegalStateException("`hasNext()` has not been invoked".toString());
  }
}

/* Location:
 * Qualified Name:     r6.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */