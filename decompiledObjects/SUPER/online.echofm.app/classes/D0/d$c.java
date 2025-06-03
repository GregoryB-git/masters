package D0;

import d0.P;
import d0.q;
import d0.q.b;
import g0.c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class d$c
  implements t.a
{
  public d$c(d paramd) {}
  
  public void b(P paramP)
  {
    d.l(a, new q.b().v0(a).Y(b).o0("video/raw").K());
    Iterator localIterator = d.m(a).iterator();
    while (localIterator.hasNext()) {
      ((d.d)localIterator.next()).b(a, paramP);
    }
  }
  
  public void c(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    Object localObject;
    if ((paramBoolean) && (d.n(a) != null))
    {
      localObject = d.m(a).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((d.d)((Iterator)localObject).next()).d(a);
      }
    }
    if (d.o(a) != null)
    {
      if (d.k(a) == null) {}
      for (localObject = new q.b().K();; localObject = d.k(a)) {
        break;
      }
      d.o(a).k(paramLong2, d.p(a).c(), (q)localObject, null);
    }
    d.q(a);
    android.support.v4.media.a.a(g0.a.h(null));
    throw null;
  }
  
  public void d()
  {
    Iterator localIterator = d.m(a).iterator();
    while (localIterator.hasNext()) {
      ((d.d)localIterator.next()).a(a);
    }
    d.q(a);
    android.support.v4.media.a.a(g0.a.h(null));
    throw null;
  }
}

/* Location:
 * Qualified Name:     D0.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */