package tc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l
{
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");
  public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");
  public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");
  public final AtomicReferenceArray<g> a = new AtomicReferenceArray(128);
  private volatile int blockingTasksInBuffer;
  private volatile int consumerIndex;
  private volatile Object lastScheduledTask;
  private volatile int producerIndex;
  
  public final g a(g paramg)
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = c;
    if (localAtomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
      return paramg;
    }
    int i = b.c();
    int j = 1;
    if (i != 1) {
      j = 0;
    }
    if (j != 0) {
      e.incrementAndGet(this);
    }
    j = localAtomicIntegerFieldUpdater.get(this) & 0x7F;
    while (a.get(j) != null) {
      Thread.yield();
    }
    a.lazySet(j, paramg);
    c.incrementAndGet(this);
    return null;
  }
  
  public final g b()
  {
    Object localObject;
    do
    {
      do
      {
        localObject = d;
        i = ((AtomicIntegerFieldUpdater)localObject).get(this);
        if (i - c.get(this) == 0) {
          return null;
        }
      } while (!((AtomicIntegerFieldUpdater)localObject).compareAndSet(this, i, i + 1));
      localObject = (g)a.getAndSet(i & 0x7F, null);
    } while (localObject == null);
    int j = b.c();
    int i = 1;
    if (j != 1) {
      i = 0;
    }
    if (i != 0) {
      e.decrementAndGet(this);
    }
    return (g)localObject;
  }
  
  public final g c(int paramInt, boolean paramBoolean)
  {
    int i = paramInt & 0x7F;
    g localg = (g)a.get(i);
    if (localg != null)
    {
      int j = b.c();
      paramInt = 0;
      boolean bool;
      if (j == 1) {
        bool = true;
      } else {
        bool = false;
      }
      if (bool == paramBoolean)
      {
        AtomicReferenceArray localAtomicReferenceArray = a;
        do
        {
          if (localAtomicReferenceArray.compareAndSet(i, localg, null))
          {
            paramInt = 1;
            break;
          }
        } while (localAtomicReferenceArray.get(i) == localg);
        if (paramInt != 0)
        {
          if (paramBoolean) {
            e.decrementAndGet(this);
          }
          return localg;
        }
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     tc.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */