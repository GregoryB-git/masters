package f9;

import d9.d0;
import g.q;
import g9.f0;
import i9.m1;
import i9.n;
import j9.g;
import j9.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public final a a;
  public final e b;
  public final ArrayList c;
  public final HashMap d;
  public t8.c<j9.i, m> e;
  public long f;
  public h g;
  
  public d(n paramn, e parame)
  {
    a = paramn;
    b = parame;
    c = new ArrayList();
    e = j9.h.a;
    d = new HashMap();
  }
  
  public final d0 a(c paramc, long paramLong)
  {
    x6.b.p("Unexpected bundle metadata element.", paramc instanceof e ^ true, new Object[0]);
    int i = e.size();
    boolean bool = paramc instanceof j;
    Object localObject1 = null;
    if (bool)
    {
      c.add((j)paramc);
    }
    else
    {
      Object localObject2;
      Object localObject3;
      if ((paramc instanceof h))
      {
        localObject2 = (h)paramc;
        d.put(a, localObject2);
        g = ((h)localObject2);
        if (c) {
          break label243;
        }
        t8.c localc = e;
        paramc = a;
        localObject3 = m.n(paramc, b);
        e = b;
        paramc = localc.n(paramc, localObject3);
      }
      else
      {
        if (!(paramc instanceof b)) {
          break label243;
        }
        localObject2 = (b)paramc;
        paramc = g;
        if ((paramc == null) || (!a.b.equals(a))) {
          break label233;
        }
        paramc = e;
        localObject2 = a;
        localObject3 = b;
        e = g.b;
        paramc = paramc.n(localObject3, localObject2);
      }
      e = paramc;
      g = null;
      break label243;
      label233:
      throw new IllegalArgumentException("The document being added does not match the stored metadata.");
    }
    label243:
    f += paramLong;
    paramc = (c)localObject1;
    if (i != e.size())
    {
      i = e.size();
      paramc = b;
      paramc = new d0(i, d, f, e, null, 2);
    }
    return paramc;
  }
  
  public final t8.c<j9.i, g> b()
  {
    boolean bool;
    if (g == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.p("Bundled documents end with a document metadata element instead of a document.", bool, new Object[0]);
    if (b.a != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.p("Bundle ID must be set", bool, new Object[0]);
    int i = e.size();
    int j = b.d;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.p("Expected %s documents, but loaded %s.", bool, new Object[] { Integer.valueOf(j), Integer.valueOf(e.size()) });
    Object localObject1 = a;
    t8.c localc = e;
    Object localObject2 = b.a;
    localObject1 = (n)localObject1;
    localObject1.getClass();
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("__bundle__/docs/");
    ((StringBuilder)localObject3).append((String)localObject2);
    localObject2 = ((n)localObject1).a(new f0(j9.o.t(((StringBuilder)localObject3).toString()), null).i());
    localc = (t8.c)a.x("Apply bundle documents", new r3.o(localObject1, localc, localObject2));
    localObject1 = new HashMap();
    localObject2 = c.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((HashMap)localObject1).put(nexta, j9.i.c);
    }
    Iterator localIterator = d.values().iterator();
    Object localObject4;
    while (localIterator.hasNext())
    {
      localObject4 = (h)localIterator.next();
      localObject2 = d.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        ((HashMap)localObject1).put(localObject3, ((t8.e)((HashMap)localObject1).get(localObject3)).a(a));
      }
    }
    localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (j)localIterator.next();
      localObject4 = a;
      localObject3 = (t8.e)((HashMap)localObject1).get(a);
      n localn = (n)localObject4;
      localn.getClass();
      localObject4 = localn.a(b.a);
      j = b;
      a.y("Saved named query", new i9.j(localn, (j)localObject2, (m1)localObject4, j, (t8.e)localObject3));
    }
    localObject2 = a;
    localObject1 = b;
    localObject2 = (n)localObject2;
    a.y("Save bundle", new q(17, localObject2, localObject1));
    return localc;
  }
}

/* Location:
 * Qualified Name:     f9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */