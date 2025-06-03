package i9;

import android.util.SparseArray;
import g9.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import n9.d;
import t8.c;
import x6.b;

public final class u
  implements f0, p
{
  public final w a;
  public final i b;
  public final HashMap c;
  public l3.l d;
  public final a0 e;
  public long f;
  
  public u(w paramw, q.b paramb, i parami)
  {
    a = paramw;
    b = parami;
    c = new HashMap();
    e = new a0(f.e);
    f = -1L;
    paramw = new i9/q;
  }
  
  public final void a(d<Long> paramd)
  {
    Iterator localIterator = c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!p((j9.i)localEntry.getKey(), ((Long)localEntry.getValue()).longValue())) {
        paramd.accept((Long)localEntry.getValue());
      }
    }
  }
  
  public final int b(long paramLong, SparseArray<?> paramSparseArray)
  {
    z localz = a.f;
    Iterator localIterator = a.entrySet().iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      label27:
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = getValueb;
      if ((getValuec > paramLong) || (paramSparseArray.get(j) != null)) {
        break label27;
      }
      localIterator.remove();
      localz.i(j);
    }
    return i;
  }
  
  public final void c(j9.i parami)
  {
    c.put(parami, Long.valueOf(h()));
  }
  
  public final void d()
  {
    boolean bool;
    if (f != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Committing a transaction without having started one", bool, new Object[0]);
    f = -1L;
  }
  
  public final void e(j9.i parami)
  {
    c.put(parami, Long.valueOf(h()));
  }
  
  public final void f()
  {
    boolean bool;
    if (f == -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Starting a transaction without committing the previous one", bool, new Object[0]);
    a0 locala0 = e;
    long l = a + 1L;
    a = l;
    f = l;
  }
  
  public final void g(l paraml)
  {
    Iterator localIterator = a.f.a.values().iterator();
    while (localIterator.hasNext()) {
      paraml.accept((m1)localIterator.next());
    }
  }
  
  public final long h()
  {
    boolean bool;
    if (f != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Attempting to get a sequence number outside of a transaction", bool, new Object[0]);
    return f;
  }
  
  public final long i()
  {
    long l = a.f.a.size();
    long[] arrayOfLong = new long[1];
    a(new t(arrayOfLong, 0));
    return l + arrayOfLong[0];
  }
  
  public final int j(long paramLong)
  {
    y localy = a.h;
    ArrayList localArrayList = new ArrayList();
    localy.getClass();
    x localx = new x(a.iterator());
    while (localx.hasNext())
    {
      j9.i locali = ((j9.g)localx.next()).getKey();
      if (!p(locali, paramLong))
      {
        localArrayList.add(locali);
        c.remove(locali);
      }
    }
    localy.b(localArrayList);
    return localArrayList.size();
  }
  
  public final void k(j9.i parami)
  {
    c.put(parami, Long.valueOf(h()));
  }
  
  public final long l()
  {
    Object localObject1 = a.f;
    i locali = b;
    localObject1 = a.entrySet().iterator();
    for (long l1 = 0L; ((Iterator)localObject1).hasNext(); l1 += locali.g((m1)((Map.Entry)((Iterator)localObject1).next()).getValue()).m(null)) {}
    localObject1 = a.h;
    locali = b;
    localObject1.getClass();
    localObject1 = new x(a.iterator());
    for (long l2 = 0L; ((x)localObject1).hasNext(); l2 += locali.e((j9.g)((x)localObject1).next()).m(null)) {}
    l1 = l1 + 0L + l2;
    localObject1 = a.c.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (v)((Iterator)localObject1).next();
      locali = b;
      localObject2 = a.iterator();
      for (l2 = 0L; ((Iterator)localObject2).hasNext(); l2 += locali.f((k9.g)((Iterator)localObject2).next()).m(null)) {}
      l1 += l2;
    }
    return l1;
  }
  
  public final void m(l3.l paraml)
  {
    d = paraml;
  }
  
  public final void n(j9.i parami)
  {
    c.put(parami, Long.valueOf(h()));
  }
  
  public final void o(m1 paramm1)
  {
    paramm1 = paramm1.b(h());
    a.f.c(paramm1);
  }
  
  public final boolean p(j9.i parami, long paramLong)
  {
    Iterator localIterator = a.c.values().iterator();
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      bool2 = false;
      if (!bool1) {
        break;
      }
    } while (!((v)localIterator.next()).l(parami));
    int i = 1;
    break label60;
    i = 0;
    label60:
    if (i != 0) {
      return true;
    }
    if (d.a(parami)) {
      return true;
    }
    if (a.f.b.a(parami)) {
      return true;
    }
    parami = (Long)c.get(parami);
    boolean bool1 = bool2;
    if (parami != null)
    {
      bool1 = bool2;
      if (parami.longValue() > paramLong) {
        bool1 = true;
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     i9.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */