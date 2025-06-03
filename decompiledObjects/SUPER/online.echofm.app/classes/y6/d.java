package y6;

import V5.t;
import g6.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import p6.P0;
import r6.h;
import u.b;
import u6.C;
import u6.D;

public class d
{
  public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");
  public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");
  public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
  private volatile int _availablePermits;
  public final int a;
  public final g6.l b;
  private volatile long deqIdx;
  private volatile long enqIdx;
  private volatile Object head;
  private volatile Object tail;
  
  public d(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    if (paramInt1 > 0)
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt1))
      {
        localObject = new f(0L, null, 2);
        head = localObject;
        tail = localObject;
        _availablePermits = (paramInt1 - paramInt2);
        b = new b(this);
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("The number of acquired permits should be in 0..");
      ((StringBuilder)localObject).append(paramInt1);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Semaphore should have at least 1 permit, but had ");
    ((StringBuilder)localObject).append(paramInt1);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
  }
  
  public final void d(p6.l paraml)
  {
    do
    {
      if (g() > 0)
      {
        paraml.j(t.a, b);
        break;
      }
      Intrinsics.c(paraml, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
    } while (!e((P0)paraml));
  }
  
  public final boolean e(P0 paramP0)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = e;
    f localf = (f)localAtomicReferenceFieldUpdater.get(this);
    long l1 = f.getAndIncrement(this);
    Object localObject1 = a.o;
    long l2 = l1 / e.f();
    Object localObject2 = u6.d.c(localf, l2, (p)localObject1);
    if (!D.c(localObject2))
    {
      C localC = D.b(localObject2);
      for (;;)
      {
        localObject3 = (C)localAtomicReferenceFieldUpdater.get(this);
        if (q >= q) {
          break label143;
        }
        if (!localC.q()) {
          break;
        }
        if (b.a(localAtomicReferenceFieldUpdater, this, localObject3, localC))
        {
          if (!((C)localObject3).m()) {
            break label143;
          }
          ((u6.e)localObject3).k();
          break label143;
        }
        if (localC.m()) {
          localC.k();
        }
      }
    }
    label143:
    localObject1 = (f)D.b(localObject2);
    int i = (int)(l1 % e.f());
    if (h.a(((f)localObject1).r(), i, null, paramP0))
    {
      paramP0.a((C)localObject1, i);
      return true;
    }
    Object localObject3 = e.e();
    localObject2 = e.g();
    if (h.a(((f)localObject1).r(), i, localObject3, localObject2))
    {
      if ((paramP0 instanceof p6.l))
      {
        Intrinsics.c(paramP0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        ((p6.l)paramP0).j(t.a, b);
        return true;
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("unexpected: ");
      ((StringBuilder)localObject1).append(paramP0);
      throw new IllegalStateException(((StringBuilder)localObject1).toString().toString());
    }
    return false;
  }
  
  public final void f()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater;
    int i;
    int j;
    do
    {
      localAtomicIntegerFieldUpdater = g;
      i = localAtomicIntegerFieldUpdater.get(this);
      j = a;
    } while ((i > j) && (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, j)));
  }
  
  public final int g()
  {
    int i;
    do
    {
      i = g.getAndDecrement(this);
    } while (i > a);
    return i;
  }
  
  public int h()
  {
    return Math.max(g.get(this), 0);
  }
  
  public void i()
  {
    do
    {
      int i = g.getAndIncrement(this);
      if (i >= a) {
        break;
      }
      if (i >= 0) {
        return;
      }
    } while (!l());
    return;
    f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("The number of released permits cannot be greater than ");
    localStringBuilder.append(a);
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public boolean j()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater;
    int i;
    do
    {
      for (;;)
      {
        localAtomicIntegerFieldUpdater = g;
        i = localAtomicIntegerFieldUpdater.get(this);
        if (i <= a) {
          break;
        }
        f();
      }
      if (i <= 0) {
        return false;
      }
    } while (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, i - 1));
    return true;
  }
  
  public final boolean k(Object paramObject)
  {
    if ((paramObject instanceof p6.l))
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
      paramObject = (p6.l)paramObject;
      localObject = ((p6.l)paramObject).g(t.a, null, b);
      boolean bool;
      if (localObject != null)
      {
        ((p6.l)paramObject).p(localObject);
        bool = true;
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("unexpected: ");
    ((StringBuilder)localObject).append(paramObject);
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
  
  public final boolean l()
  {
    Object localObject1 = c;
    f localf = (f)((AtomicReferenceFieldUpdater)localObject1).get(this);
    long l1 = d.getAndIncrement(this);
    long l2 = l1 / e.f();
    c localc = c.o;
    Object localObject2 = u6.d.c(localf, l2, localc);
    Object localObject4;
    if (!D.c(localObject2))
    {
      localObject3 = D.b(localObject2);
      for (;;)
      {
        localObject4 = (C)((AtomicReferenceFieldUpdater)localObject1).get(this);
        if (q >= q) {
          break label141;
        }
        if (!((C)localObject3).q()) {
          break;
        }
        if (b.a((AtomicReferenceFieldUpdater)localObject1, this, localObject4, localObject3))
        {
          if (!((C)localObject4).m()) {
            break label141;
          }
          ((u6.e)localObject4).k();
          break label141;
        }
        if (((C)localObject3).m()) {
          ((u6.e)localObject3).k();
        }
      }
    }
    label141:
    localObject1 = (f)D.b(localObject2);
    ((u6.e)localObject1).b();
    long l3 = q;
    int i = 0;
    if (l3 > l2) {
      return false;
    }
    int j = (int)(l1 % e.f());
    Object localObject3 = e.e();
    localObject3 = ((f)localObject1).r().getAndSet(j, localObject3);
    if (localObject3 == null)
    {
      int k = e.d();
      while (i < k)
      {
        if (((f)localObject1).r().get(j) == e.g()) {
          return true;
        }
        i++;
      }
      localObject3 = e.e();
      localObject4 = e.b();
      return h.a(((f)localObject1).r(), j, localObject3, localObject4) ^ true;
    }
    if (localObject3 == e.c()) {
      return false;
    }
    return k(localObject3);
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public b(d paramd)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      o.i();
    }
  }
}

/* Location:
 * Qualified Name:     y6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */