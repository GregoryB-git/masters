package X3;

import V3.k;
import Y3.d;
import Y3.d.c;
import Y3.m;
import d4.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class i
{
  public static final Y3.i f = new a();
  public static final Y3.i g = new b();
  public static final Y3.i h = new c();
  public static final Y3.i i = new d();
  public d a;
  public final f b;
  public final c4.c c;
  public final Y3.a d;
  public long e = 0L;
  
  public i(f paramf, c4.c paramc, Y3.a parama)
  {
    b = paramf;
    c = paramc;
    d = parama;
    a = new d(null);
    r();
    paramf = paramf.n().iterator();
    while (paramf.hasNext())
    {
      paramc = (h)paramf.next();
      e = Math.max(a + 1L, e);
      d(paramc);
    }
  }
  
  public static void c(a4.i parami)
  {
    boolean bool;
    if ((parami.g()) && (!parami.f())) {
      bool = false;
    } else {
      bool = true;
    }
    m.g(bool, "Can't have tracked non-default query that loads all data");
  }
  
  public static long e(a parama, long paramLong)
  {
    float f1 = parama.b();
    return paramLong - Math.min(Math.floor((float)paramLong * (1.0F - f1)), parama.c());
  }
  
  public static a4.i o(a4.i parami)
  {
    a4.i locali = parami;
    if (parami.g()) {
      locali = a4.i.a(parami.e());
    }
    return locali;
  }
  
  public final void d(h paramh)
  {
    c(b);
    Object localObject1 = (Map)a.s(b.e());
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new HashMap();
      a = a.W(b.e(), localObject2);
    }
    localObject1 = (h)((Map)localObject2).get(b.d());
    boolean bool;
    if ((localObject1 != null) && (a != a)) {
      bool = false;
    } else {
      bool = true;
    }
    m.f(bool);
    ((Map)localObject2).put(b.d(), paramh);
  }
  
  public long f()
  {
    return k(h).size();
  }
  
  public void g(k paramk)
  {
    if (!m(paramk))
    {
      a4.i locali = a4.i.a(paramk);
      paramk = i(locali);
      if (paramk == null)
      {
        long l = e;
        e = (1L + l);
        paramk = new h(l, locali, d.a(), true, false);
      }
      else
      {
        m.g(d ^ true, "This should have been handled above!");
        paramk = paramk.b();
      }
      s(paramk);
    }
  }
  
  public final Set h(k paramk)
  {
    HashSet localHashSet = new HashSet();
    paramk = (Map)a.s(paramk);
    if (paramk != null)
    {
      Iterator localIterator = paramk.values().iterator();
      while (localIterator.hasNext())
      {
        paramk = (h)localIterator.next();
        if (!b.g()) {
          localHashSet.add(Long.valueOf(a));
        }
      }
    }
    return localHashSet;
  }
  
  public h i(a4.i parami)
  {
    a4.i locali = o(parami);
    parami = (Map)a.s(locali.e());
    if (parami != null) {
      parami = (h)parami.get(locali.d());
    } else {
      parami = null;
    }
    return parami;
  }
  
  public Set j(k paramk)
  {
    m.g(n(a4.i.a(paramk)) ^ true, "Path is fully complete.");
    HashSet localHashSet = new HashSet();
    Object localObject1 = h(paramk);
    if (!((Set)localObject1).isEmpty()) {
      localHashSet.addAll(b.v((Set)localObject1));
    }
    paramk = a.Y(paramk).M().iterator();
    while (paramk.hasNext())
    {
      Object localObject2 = (Map.Entry)paramk.next();
      localObject1 = (b)((Map.Entry)localObject2).getKey();
      localObject2 = (d)((Map.Entry)localObject2).getValue();
      if ((((d)localObject2).getValue() != null) && (f.a((Map)((d)localObject2).getValue()))) {
        localHashSet.add(localObject1);
      }
    }
    return localHashSet;
  }
  
  public final List k(Y3.i parami)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = a.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((Map)((Map.Entry)localIterator1.next()).getValue()).values().iterator();
      while (localIterator2.hasNext())
      {
        h localh = (h)localIterator2.next();
        if (parami.a(localh)) {
          localArrayList.add(localh);
        }
      }
    }
    return localArrayList;
  }
  
  public boolean l(k paramk)
  {
    boolean bool;
    if (a.V(paramk, g) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean m(k paramk)
  {
    boolean bool;
    if (a.f(paramk, f) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean n(a4.i parami)
  {
    boolean bool1 = m(parami.e());
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (parami.g()) {
      return false;
    }
    Map localMap = (Map)a.s(parami.e());
    if ((localMap == null) || (!localMap.containsKey(parami.d())) || (!getdd)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public g p(a parama)
  {
    Object localObject1 = k(h);
    long l = e(parama, ((List)localObject1).size());
    parama = new g();
    Object localObject2;
    Object localObject3;
    if (c.f())
    {
      localObject2 = c;
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Pruning old queries.  Prunable: ");
      ((StringBuilder)localObject3).append(((List)localObject1).size());
      ((StringBuilder)localObject3).append(" Count to prune: ");
      ((StringBuilder)localObject3).append(l);
      ((c4.c)localObject2).b(((StringBuilder)localObject3).toString(), new Object[0]);
    }
    Collections.sort((List)localObject1, new f());
    for (int j = 0; j < l; j++)
    {
      localObject2 = (h)((List)localObject1).get(j);
      parama = parama.d(b.e());
      q(b);
    }
    for (j = (int)l; j < ((List)localObject1).size(); j++) {
      parama = parama.c(getb.e());
    }
    localObject1 = k(i);
    if (c.f())
    {
      localObject3 = c;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Unprunable queries: ");
      ((StringBuilder)localObject2).append(((List)localObject1).size());
      ((c4.c)localObject3).b(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      parama = parama.c(nextb.e());
    }
    return parama;
  }
  
  public void q(a4.i parami)
  {
    parami = o(parami);
    Object localObject = i(parami);
    boolean bool;
    if (localObject != null) {
      bool = true;
    } else {
      bool = false;
    }
    m.g(bool, "Query must exist to be removed.");
    b.h(a);
    localObject = (Map)a.s(parami.e());
    ((Map)localObject).remove(parami.d());
    if (((Map)localObject).isEmpty()) {
      a = a.U(parami.e());
    }
  }
  
  public final void r()
  {
    try
    {
      b.g();
      b.j(d.a());
      b.p();
      return;
    }
    finally
    {
      b.f();
    }
  }
  
  public final void s(h paramh)
  {
    d(paramh);
    b.u(paramh);
  }
  
  public void t(k paramk)
  {
    a.Y(paramk).q(new e());
  }
  
  public void u(a4.i parami)
  {
    v(parami, true);
  }
  
  public final void v(a4.i parami, boolean paramBoolean)
  {
    parami = o(parami);
    h localh = i(parami);
    long l1 = d.a();
    if (localh != null)
    {
      parami = localh.c(l1).a(paramBoolean);
    }
    else
    {
      m.g(paramBoolean, "If we're setting the query to inactive, we should already be tracking it!");
      long l2 = e;
      e = (1L + l2);
      parami = new h(l2, parami, l1, false, paramBoolean);
    }
    s(parami);
  }
  
  public void w(a4.i parami)
  {
    parami = i(o(parami));
    if ((parami != null) && (!d)) {
      s(parami.b());
    }
  }
  
  public void x(a4.i parami)
  {
    v(parami, false);
  }
  
  public class a
    implements Y3.i
  {
    public boolean b(Map paramMap)
    {
      paramMap = (h)paramMap.get(a4.h.i);
      boolean bool;
      if ((paramMap != null) && (d)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public class b
    implements Y3.i
  {
    public boolean b(Map paramMap)
    {
      paramMap = (h)paramMap.get(a4.h.i);
      boolean bool;
      if ((paramMap != null) && (e)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public class c
    implements Y3.i
  {
    public boolean b(h paramh)
    {
      return e ^ true;
    }
  }
  
  public class d
    implements Y3.i
  {
    public boolean b(h paramh)
    {
      return i.a().a(paramh) ^ true;
    }
  }
  
  public class e
    implements d.c
  {
    public e() {}
    
    public Void b(k paramk, Map paramMap, Void paramVoid)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        paramk = (h)((Map.Entry)paramMap.next()).getValue();
        if (!d) {
          i.b(i.this, paramk.b());
        }
      }
      return null;
    }
  }
  
  public class f
    implements Comparator
  {
    public f() {}
    
    public int a(h paramh1, h paramh2)
    {
      return m.b(c, c);
    }
  }
}

/* Location:
 * Qualified Name:     X3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */