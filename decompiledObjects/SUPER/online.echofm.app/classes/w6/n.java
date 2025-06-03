package w6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import u.b;
import u6.r;

public final class n
{
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
  public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
  public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
  public final AtomicReferenceArray a = new AtomicReferenceArray(128);
  private volatile int blockingTasksInBuffer;
  private volatile int consumerIndex;
  private volatile Object lastScheduledTask;
  private volatile int producerIndex;
  
  public final h a(h paramh, boolean paramBoolean)
  {
    if (paramBoolean) {
      return b(paramh);
    }
    paramh = (h)b.getAndSet(this, paramh);
    if (paramh == null) {
      return null;
    }
    return b(paramh);
  }
  
  public final h b(h paramh)
  {
    if (d() == 127) {
      return paramh;
    }
    if (p.b() == 1) {
      e.incrementAndGet(this);
    }
    int i = c.get(this) & 0x7F;
    while (a.get(i) != null) {
      Thread.yield();
    }
    a.lazySet(i, paramh);
    c.incrementAndGet(this);
    return null;
  }
  
  public final void c(h paramh)
  {
    if ((paramh != null) && (p.b() == 1)) {
      e.decrementAndGet(this);
    }
  }
  
  public final int d()
  {
    return c.get(this) - d.get(this);
  }
  
  public final int e()
  {
    int i;
    if (b.get(this) != null) {
      i = d() + 1;
    } else {
      i = d();
    }
    return i;
  }
  
  public final void f(d paramd)
  {
    h localh = (h)b.getAndSet(this, null);
    if (localh != null) {
      paramd.a(localh);
    }
    while (j(paramd)) {}
  }
  
  public final h g()
  {
    h localh1 = (h)b.getAndSet(this, null);
    h localh2 = localh1;
    if (localh1 == null) {
      localh2 = i();
    }
    return localh2;
  }
  
  public final h h()
  {
    return k(true);
  }
  
  public final h i()
  {
    Object localObject;
    do
    {
      int i;
      do
      {
        localObject = d;
        i = ((AtomicIntegerFieldUpdater)localObject).get(this);
        if (i - c.get(this) == 0) {
          return null;
        }
      } while (!((AtomicIntegerFieldUpdater)localObject).compareAndSet(this, i, i + 1));
      localObject = (h)a.getAndSet(i & 0x7F, null);
    } while (localObject == null);
    c((h)localObject);
    return (h)localObject;
  }
  
  public final boolean j(d paramd)
  {
    h localh = i();
    if (localh == null) {
      return false;
    }
    paramd.a(localh);
    return true;
  }
  
  public final h k(boolean paramBoolean)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater;
    h localh;
    do
    {
      localAtomicReferenceFieldUpdater = b;
      localh = (h)localAtomicReferenceFieldUpdater.get(this);
      if (localh == null) {
        break;
      }
      i = p.b();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      if (bool != paramBoolean) {
        break;
      }
    } while (!b.a(localAtomicReferenceFieldUpdater, this, localh, null));
    return localh;
    int j = d.get(this);
    int i = c.get(this);
    while (j != i)
    {
      if ((paramBoolean) && (e.get(this) == 0)) {
        return null;
      }
      i--;
      localh = m(i, paramBoolean);
      if (localh != null) {
        return localh;
      }
    }
    return null;
  }
  
  public final h l(int paramInt)
  {
    int i = d.get(this);
    int j = c.get(this);
    boolean bool = true;
    if (paramInt == 1)
    {
      paramInt = i;
    }
    else
    {
      bool = false;
      paramInt = i;
    }
    while (paramInt != j)
    {
      if ((bool) && (e.get(this) == 0)) {
        return null;
      }
      h localh = m(paramInt, bool);
      if (localh == null) {
        paramInt++;
      } else {
        return localh;
      }
    }
    return null;
  }
  
  public final h m(int paramInt, boolean paramBoolean)
  {
    int i = paramInt & 0x7F;
    h localh = (h)a.get(i);
    if (localh != null)
    {
      paramInt = p.b();
      boolean bool = true;
      if (paramInt != 1) {
        bool = false;
      }
      if ((bool == paramBoolean) && (r6.h.a(a, i, localh, null)))
      {
        if (paramBoolean) {
          e.decrementAndGet(this);
        }
        return localh;
      }
    }
    return null;
  }
  
  public final long n(int paramInt, u paramu)
  {
    h localh;
    if (paramInt == 3) {
      localh = i();
    } else {
      localh = l(paramInt);
    }
    if (localh != null)
    {
      o = localh;
      return -1L;
    }
    return o(paramInt, paramu);
  }
  
  public final long o(int paramInt, u paramu)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater;
    h localh;
    do
    {
      localAtomicReferenceFieldUpdater = b;
      localh = (h)localAtomicReferenceFieldUpdater.get(this);
      if (localh == null) {
        return -2L;
      }
      int i = p.b();
      int j = 1;
      if (i != 1) {
        j = 2;
      }
      if ((j & paramInt) == 0) {
        return -2L;
      }
      long l1 = l.f.a() - o;
      long l2 = l.b;
      if (l1 < l2) {
        return l2 - l1;
      }
    } while (!b.a(localAtomicReferenceFieldUpdater, this, localh, null));
    o = localh;
    return -1L;
  }
}

/* Location:
 * Qualified Name:     w6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */