package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class a$e
  extends a.a
{
  public final AtomicReferenceFieldUpdater<a.h, Thread> a;
  public final AtomicReferenceFieldUpdater<a.h, a.h> b;
  public final AtomicReferenceFieldUpdater<a, a.h> c;
  public final AtomicReferenceFieldUpdater<a, a.d> d;
  public final AtomicReferenceFieldUpdater<a, Object> e;
  
  public a$e(AtomicReferenceFieldUpdater<a.h, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<a.h, a.h> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<a, a.h> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, a.d> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, Object> paramAtomicReferenceFieldUpdater4)
  {
    a = paramAtomicReferenceFieldUpdater;
    b = paramAtomicReferenceFieldUpdater1;
    c = paramAtomicReferenceFieldUpdater2;
    d = paramAtomicReferenceFieldUpdater3;
    e = paramAtomicReferenceFieldUpdater4;
  }
  
  public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = d;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramd1, paramd2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(parama) == paramd1);
    boolean bool = false;
    return bool;
  }
  
  public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = e;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramObject1, paramObject2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(parama) == paramObject1);
    boolean bool = false;
    return bool;
  }
  
  public final boolean c(a<?> parama, a.h paramh1, a.h paramh2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = c;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramh1, paramh2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(parama) == paramh1);
    boolean bool = false;
    return bool;
  }
  
  public final void d(a.h paramh1, a.h paramh2)
  {
    b.lazySet(paramh1, paramh2);
  }
  
  public final void e(a.h paramh, Thread paramThread)
  {
    a.lazySet(paramh, paramThread);
  }
}

/* Location:
 * Qualified Name:     s.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */