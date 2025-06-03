package nb;

import eb.d;
import eb.d.a;
import eb.k0.k;
import eb.o;
import f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import x6.b;

public final class i$a
{
  public i.f a;
  public volatile a b = new a();
  public a c = new a();
  public Long d;
  public int e;
  public final HashSet f = new HashSet();
  
  public i$a(i.f paramf)
  {
    a = paramf;
  }
  
  public final void a(i.h paramh)
  {
    if ((d()) && (!c))
    {
      paramh.k();
    }
    else if ((!d()) && (c))
    {
      c = false;
      o localo = d;
      if (localo != null)
      {
        e.a(localo);
        f.b(d.a.b, "Subchannel unejected: {0}", new Object[] { paramh });
      }
    }
    b = this;
    f.add(paramh);
  }
  
  public final void b(long paramLong)
  {
    d = Long.valueOf(paramLong);
    e += 1;
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext()) {
      ((i.h)localIterator.next()).k();
    }
  }
  
  public final long c()
  {
    long l = c.a.get();
    return c.b.get() + l;
  }
  
  public final boolean d()
  {
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void e()
  {
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "not currently ejected");
    d = null;
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      i.h localh = (i.h)localIterator.next();
      c = false;
      o localo = d;
      if (localo != null)
      {
        e.a(localo);
        f.b(d.a.b, "Subchannel unejected: {0}", new Object[] { localh });
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AddressTracker{subchannels=");
    localStringBuilder.append(f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public AtomicLong a = new AtomicLong();
    public AtomicLong b = new AtomicLong();
  }
}

/* Location:
 * Qualified Name:     nb.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */