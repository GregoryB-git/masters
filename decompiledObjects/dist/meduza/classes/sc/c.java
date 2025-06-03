package sc;

import ec.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;

public abstract class c<N extends c<N>>
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
  private volatile Object _next;
  private volatile Object _prev;
  
  public c(N paramN)
  {
    _prev = paramN;
  }
  
  public final void a()
  {
    b.lazySet(this, null);
  }
  
  public final N b()
  {
    Object localObject = a.get(this);
    if (localObject == m0.C) {
      return null;
    }
    return (c)localObject;
  }
  
  public abstract boolean c();
  
  public final void d()
  {
    int i;
    if (b() == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    c localc1;
    do
    {
      do
      {
        for (localc1 = (c)b.get(this); (localc1 != null) && (localc1.c()); localc1 = (c)b.get(localc1)) {}
        Object localObject1 = b();
        i.b(localObject1);
        c localc2;
        while (((c)localObject1).c())
        {
          localc2 = ((c)localObject1).b();
          if (localc2 == null) {
            break;
          }
          localObject1 = localc2;
        }
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = b;
        do
        {
          Object localObject2 = localAtomicReferenceFieldUpdater.get(localObject1);
          if ((c)localObject2 == null) {
            localc2 = null;
          } else {
            localc2 = localc1;
          }
          do
          {
            if (localAtomicReferenceFieldUpdater.compareAndSet(localObject1, localObject2, localc2))
            {
              i = 1;
              break;
            }
          } while (localAtomicReferenceFieldUpdater.get(localObject1) == localObject2);
          i = 0;
        } while (i == 0);
        if (localc1 != null) {
          a.set(localc1, localObject1);
        }
        if (!((c)localObject1).c()) {
          break;
        }
        if (((c)localObject1).b() == null) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i == 0);
    } while ((localc1 != null) && (localc1.c()));
  }
}

/* Location:
 * Qualified Name:     sc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */