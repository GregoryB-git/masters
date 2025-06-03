package u;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class a$f
  extends a.b
{
  public final AtomicReferenceFieldUpdater a;
  public final AtomicReferenceFieldUpdater b;
  public final AtomicReferenceFieldUpdater c;
  public final AtomicReferenceFieldUpdater d;
  public final AtomicReferenceFieldUpdater e;
  
  public a$f(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater5)
  {
    super(null);
    a = paramAtomicReferenceFieldUpdater1;
    b = paramAtomicReferenceFieldUpdater2;
    c = paramAtomicReferenceFieldUpdater3;
    d = paramAtomicReferenceFieldUpdater4;
    e = paramAtomicReferenceFieldUpdater5;
  }
  
  public boolean a(a parama, a.e parame1, a.e parame2)
  {
    return b.a(d, parama, parame1, parame2);
  }
  
  public boolean b(a parama, Object paramObject1, Object paramObject2)
  {
    return b.a(e, parama, paramObject1, paramObject2);
  }
  
  public boolean c(a parama, a.h paramh1, a.h paramh2)
  {
    return b.a(c, parama, paramh1, paramh2);
  }
  
  public void d(a.h paramh1, a.h paramh2)
  {
    b.lazySet(paramh1, paramh2);
  }
  
  public void e(a.h paramh, Thread paramThread)
  {
    a.lazySet(paramh, paramThread);
  }
}

/* Location:
 * Qualified Name:     u.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */