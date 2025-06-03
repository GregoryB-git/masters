package sc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k<E>
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur");
  private volatile Object _cur = new l(8, false);
  
  public final boolean a(E paramE)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = a;
    for (;;)
    {
      l locall1 = (l)localAtomicReferenceFieldUpdater1.get(this);
      int i = locall1.a(paramE);
      if (i == 0) {
        break label81;
      }
      if (i != 1)
      {
        if (i == 2) {
          return false;
        }
      }
      else
      {
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = a;
        l locall2 = locall1.c();
        if (!localAtomicReferenceFieldUpdater2.compareAndSet(this, locall1, locall2)) {
          if (localAtomicReferenceFieldUpdater2.get(this) == locall1) {
            break;
          }
        }
      }
    }
    label81:
    return true;
  }
  
  public final void b()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = a;
    for (;;)
    {
      l locall1 = (l)localAtomicReferenceFieldUpdater1.get(this);
      if (locall1.b()) {
        return;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = a;
      l locall2 = locall1.c();
      if (!localAtomicReferenceFieldUpdater2.compareAndSet(this, locall1, locall2)) {
        if (localAtomicReferenceFieldUpdater2.get(this) == locall1) {
          break;
        }
      }
    }
  }
  
  public final int c()
  {
    l locall = (l)a.get(this);
    locall.getClass();
    long l = l.f.get(locall);
    int i = (int)((0x3FFFFFFF & l) >> 0);
    return (int)((l & 0xFFFFFFFC0000000) >> 30) - i & 0x3FFFFFFF;
  }
  
  public final E d()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      l locall1 = (l)localAtomicReferenceFieldUpdater.get(this);
      Object localObject = locall1.d();
      if (localObject != l.g) {
        return (E)localObject;
      }
      localObject = a;
      l locall2 = locall1.c();
      if (!((AtomicReferenceFieldUpdater)localObject).compareAndSet(this, locall1, locall2)) {
        if (((AtomicReferenceFieldUpdater)localObject).get(this) == locall1) {
          break;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     sc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */