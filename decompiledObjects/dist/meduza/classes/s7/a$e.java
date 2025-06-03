package s7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class a$e
  extends a.a
{
  public final AtomicReferenceFieldUpdater<a.k, Thread> a;
  public final AtomicReferenceFieldUpdater<a.k, a.k> b;
  public final AtomicReferenceFieldUpdater<a, a.k> c;
  public final AtomicReferenceFieldUpdater<a, a.d> d;
  public final AtomicReferenceFieldUpdater<a, Object> e;
  
  public a$e(AtomicReferenceFieldUpdater<a.k, Thread> paramAtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<a.k, a.k> paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<a, a.k> paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, a.d> paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, Object> paramAtomicReferenceFieldUpdater4)
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
  
  public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = c;
    do
    {
      if (localAtomicReferenceFieldUpdater.compareAndSet(parama, paramk1, paramk2))
      {
        bool = true;
        break;
      }
    } while (localAtomicReferenceFieldUpdater.get(parama) == paramk1);
    boolean bool = false;
    return bool;
  }
  
  public final a.d d(a<?> parama, a.d paramd)
  {
    return (a.d)d.getAndSet(parama, paramd);
  }
  
  public final a.k e(a parama)
  {
    a.k localk = a.k.c;
    return (a.k)c.getAndSet(parama, localk);
  }
  
  public final void f(a.k paramk1, a.k paramk2)
  {
    b.lazySet(paramk1, paramk2);
  }
  
  public final void g(a.k paramk, Thread paramThread)
  {
    a.lazySet(paramk, paramThread);
  }
}

/* Location:
 * Qualified Name:     s7.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */