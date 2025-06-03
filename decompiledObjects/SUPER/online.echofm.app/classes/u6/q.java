package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p6.M;

public class q
{
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");
  public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
  private volatile Object _next = this;
  private volatile Object _prev = this;
  private volatile Object _removedRef;
  
  public final boolean j(q paramq)
  {
    p.lazySet(paramq, this);
    o.lazySet(paramq, this);
    do
    {
      if (n() != this) {
        return false;
      }
    } while (!u.b.a(o, this, this, paramq));
    paramq.m(this);
    return true;
  }
  
  public final q k(y paramy)
  {
    q localq = (q)p.get(this);
    Object localObject1 = localq;
    label13:
    Object localObject2 = null;
    for (;;)
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
      Object localObject3 = localAtomicReferenceFieldUpdater.get(localObject1);
      if (localObject3 == this)
      {
        if (localq == localObject1) {
          return (q)localObject1;
        }
        if (!u.b.a(p, this, localq, localObject1)) {
          break;
        }
        return (q)localObject1;
      }
      if (q()) {
        return null;
      }
      if (localObject3 == paramy) {
        return (q)localObject1;
      }
      if ((localObject3 instanceof y))
      {
        ((y)localObject3).a(localObject1);
        break;
      }
      if ((localObject3 instanceof z))
      {
        if (localObject2 != null)
        {
          if (!u.b.a(localAtomicReferenceFieldUpdater, localObject2, localObject1, a)) {
            break;
          }
          localObject1 = localObject2;
          break label13;
        }
        localObject1 = (q)p.get(localObject1);
        continue;
      }
      Intrinsics.c(localObject3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      localObject3 = (q)localObject3;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }
  
  public final q l(q paramq)
  {
    for (;;)
    {
      if (!paramq.q()) {
        return paramq;
      }
      paramq = (q)p.get(paramq);
    }
  }
  
  public final void m(q paramq)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = p;
    q localq;
    do
    {
      localq = (q)localAtomicReferenceFieldUpdater.get(paramq);
      if (n() != paramq) {
        return;
      }
    } while (!u.b.a(p, paramq, localq, this));
    if (q()) {
      paramq.k(null);
    }
  }
  
  public final Object n()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    for (;;)
    {
      Object localObject = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject instanceof y)) {
        return localObject;
      }
      ((y)localObject).a(this);
    }
  }
  
  public final q o()
  {
    return p.b(n());
  }
  
  public final q p()
  {
    q localq1 = k(null);
    q localq2 = localq1;
    if (localq1 == null) {
      localq2 = l((q)p.get(this));
    }
    return localq2;
  }
  
  public boolean q()
  {
    return n() instanceof z;
  }
  
  public boolean r()
  {
    boolean bool;
    if (s() == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final q s()
  {
    Object localObject;
    q localq;
    z localz;
    do
    {
      localObject = n();
      if ((localObject instanceof z)) {
        return a;
      }
      if (localObject == this) {
        return (q)localObject;
      }
      Intrinsics.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      localq = (q)localObject;
      localz = localq.t();
    } while (!u.b.a(o, this, localObject, localz));
    localq.k(null);
    return null;
  }
  
  public final z t()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = q;
    z localz1 = (z)localAtomicReferenceFieldUpdater.get(this);
    z localz2 = localz1;
    if (localz1 == null)
    {
      localz2 = new z(this);
      localAtomicReferenceFieldUpdater.lazySet(this, localz2);
    }
    return localz2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(new b());
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    return localStringBuilder.toString();
  }
  
  public final int u(q paramq1, q paramq2, a parama)
  {
    p.lazySet(paramq1, this);
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    localAtomicReferenceFieldUpdater.lazySet(paramq1, paramq2);
    c = paramq2;
    if (!u.b.a(localAtomicReferenceFieldUpdater, this, paramq2, parama)) {
      return 0;
    }
    int i;
    if (parama.a(this) == null) {
      i = 1;
    } else {
      i = 2;
    }
    return i;
  }
  
  public static abstract class a
    extends b
  {
    public final q b;
    public q c;
    
    public a(q paramq)
    {
      b = paramq;
    }
    
    public void e(q paramq, Object paramObject)
    {
      int i;
      if (paramObject == null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramObject = b;
      } else {
        paramObject = c;
      }
      if ((paramObject != null) && (u.b.a(q.i(), paramq, this, paramObject)) && (i != 0))
      {
        paramq = b;
        paramObject = c;
        Intrinsics.b(paramObject);
        q.h(paramq, (q)paramObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     u6.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */