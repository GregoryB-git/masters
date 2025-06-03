package p6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.b;
import u6.L;
import u6.s;

public abstract class b0
  extends c0
  implements S
{
  public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_queue");
  public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_delayed");
  public static final AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_isCompleted");
  private volatile Object _delayed;
  private volatile int _isCompleted = 0;
  private volatile Object _queue;
  
  private final boolean Z()
  {
    boolean bool;
    if (v.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void E(g paramg, Runnable paramRunnable)
  {
    X(paramRunnable);
  }
  
  public long L()
  {
    if (super.L() == 0L) {
      return 0L;
    }
    Object localObject = t.get(this);
    if (localObject != null) {
      if ((localObject instanceof s))
      {
        if (!((s)localObject).g()) {
          return 0L;
        }
      }
      else
      {
        if (localObject == e0.a()) {
          return Long.MAX_VALUE;
        }
        return 0L;
      }
    }
    localObject = (a)u.get(this);
    return Long.MAX_VALUE;
  }
  
  public long Q()
  {
    if (R()) {
      return 0L;
    }
    Object localObject = (a)u.get(this);
    localObject = W();
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      return 0L;
    }
    return L();
  }
  
  public final void V()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = t;
    Object localObject;
    s locals;
    do
    {
      do
      {
        localObject = localAtomicReferenceFieldUpdater.get(this);
        if (localObject != null) {
          break;
        }
      } while (!b.a(t, this, null, e0.a()));
      return;
      if ((localObject instanceof s))
      {
        ((s)localObject).d();
        return;
      }
      if (localObject == e0.a()) {
        return;
      }
      locals = new s(8, true);
      Intrinsics.c(localObject, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
      locals.a((Runnable)localObject);
    } while (!b.a(t, this, localObject, locals));
  }
  
  public final Runnable W()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = t;
    Object localObject1;
    do
    {
      for (;;)
      {
        localObject1 = localAtomicReferenceFieldUpdater.get(this);
        if (localObject1 == null) {
          return null;
        }
        if (!(localObject1 instanceof s)) {
          break;
        }
        Intrinsics.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
        s locals = (s)localObject1;
        Object localObject2 = locals.j();
        if (localObject2 != s.h) {
          return (Runnable)localObject2;
        }
        b.a(t, this, localObject1, locals.i());
      }
      if (localObject1 == e0.a()) {
        return null;
      }
    } while (!b.a(t, this, localObject1, null));
    Intrinsics.c(localObject1, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
    return (Runnable)localObject1;
  }
  
  public void X(Runnable paramRunnable)
  {
    if (Y(paramRunnable)) {
      U();
    } else {
      N.w.X(paramRunnable);
    }
  }
  
  public final boolean Y(Runnable paramRunnable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = t;
    Object localObject;
    s locals;
    label105:
    do
    {
      for (;;)
      {
        localObject = localAtomicReferenceFieldUpdater.get(this);
        if (Z()) {
          return false;
        }
        if (localObject == null)
        {
          if (b.a(t, this, null, paramRunnable)) {
            return true;
          }
        }
        else
        {
          if (!(localObject instanceof s)) {
            break label105;
          }
          Intrinsics.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
          locals = (s)localObject;
          int i = locals.a(paramRunnable);
          if (i == 0) {
            break;
          }
          if (i != 1)
          {
            if (i == 2) {
              return false;
            }
          }
          else {
            b.a(t, this, localObject, locals.i());
          }
        }
      }
      return true;
      if (localObject == e0.a()) {
        return false;
      }
      locals = new s(8, true);
      Intrinsics.c(localObject, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
      locals.a((Runnable)localObject);
      locals.a(paramRunnable);
    } while (!b.a(t, this, localObject, locals));
    return true;
  }
  
  public boolean a0()
  {
    boolean bool1 = P();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Object localObject = (a)u.get(this);
    localObject = t.get(this);
    if (localObject == null) {}
    do
    {
      bool2 = true;
      break;
      if ((localObject instanceof s))
      {
        bool2 = ((s)localObject).g();
        break;
      }
    } while (localObject == e0.a());
    return bool2;
  }
  
  public final void b0()
  {
    c.a();
    System.nanoTime();
    a locala = (a)u.get(this);
  }
  
  public final void c0()
  {
    t.set(this, null);
    u.set(this, null);
  }
  
  public final void d0(boolean paramBoolean)
  {
    v.set(this, paramBoolean);
  }
  
  public void shutdown()
  {
    L0.a.c();
    d0(true);
    V();
    while (Q() <= 0L) {}
    b0();
  }
  
  public static final abstract class a
    extends L
  {}
}

/* Location:
 * Qualified Name:     p6.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */