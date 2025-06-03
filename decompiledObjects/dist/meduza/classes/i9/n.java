package i9;

import android.util.SparseArray;
import g9.l0;
import j9.i;
import j9.k.a;
import j9.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l3.l;
import p2.m0;

public final class n
  implements f9.a
{
  public static final long n = TimeUnit.MINUTES.toSeconds(5L);
  public final e9.a a;
  public f b;
  public a0 c;
  public b d;
  public final g0 e;
  public h f;
  public final d0 g;
  public final l h;
  public final l1 i;
  public final a j;
  public final SparseArray<m1> k;
  public final HashMap l;
  public final l0 m;
  
  public n(e9.a parama, d0 paramd0, e9.e parame)
  {
    x6.b.Z("LocalStore was passed an unstarted persistence implementation", parama.u(), new Object[0]);
    a = parama;
    g = paramd0;
    parama.l();
    paramd0 = parama.r();
    i = paramd0;
    j = parama.j();
    paramd0 = new l0(0, paramd0.d());
    a += 2;
    m = paramd0;
    e = parama.q();
    paramd0 = new l(6);
    h = paramd0;
    k = new SparseArray();
    l = new HashMap();
    parama.p().m(paramd0);
    c(parame);
  }
  
  public static boolean e(m1 paramm11, m1 paramm12, m9.k0 paramk0)
  {
    boolean bool1 = g.isEmpty();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    long l1 = e.a.a;
    long l2 = e.a.a;
    long l3 = n;
    if (l1 - l2 >= l3) {
      return true;
    }
    if (f.a.a - f.a.a >= l3) {
      return true;
    }
    if (paramk0 == null) {
      return false;
    }
    int i1 = c.size();
    int i2 = d.size();
    if (e.size() + (i2 + i1) <= 0) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final m1 a(g9.k0 paramk0)
  {
    Object localObject = i.a(paramk0);
    int i1;
    if (localObject != null)
    {
      i1 = b;
    }
    else
    {
      localObject = new a();
      a.y("Allocate target", new x0.g(this, localObject, paramk0, 8));
      i1 = b;
      localObject = a;
    }
    if (k.get(i1) == null)
    {
      k.put(i1, localObject);
      l.put(paramk0, Integer.valueOf(i1));
    }
    return (m1)localObject;
  }
  
  public final r4.c b(g9.f0 paramf0, boolean paramBoolean)
  {
    Object localObject1 = paramf0.i();
    Object localObject2 = (Integer)l.get(localObject1);
    if (localObject2 != null) {
      localObject2 = (m1)k.get(((Integer)localObject2).intValue());
    } else {
      localObject2 = i.a((g9.k0)localObject1);
    }
    Object localObject3 = q.b;
    localObject1 = i.c;
    if (localObject2 != null)
    {
      localObject4 = f;
      localObject1 = i.f(b);
      localObject2 = localObject4;
    }
    else
    {
      localObject2 = localObject3;
    }
    d0 locald0 = g;
    if (!paramBoolean) {
      localObject2 = localObject3;
    }
    x6.b.Z("initialize() not called", c, new Object[0]);
    Object localObject4 = locald0.d(paramf0);
    if (localObject4 != null)
    {
      localObject2 = localObject4;
    }
    else
    {
      if ((!paramf0.h()) && (!((q)localObject2).equals(localObject3)))
      {
        localObject3 = d0.b(paramf0, a.b((Iterable)localObject1));
        if (!d0.c(paramf0, ((t8.e)localObject1).size(), (t8.e)localObject3, (q)localObject2)) {}
      }
      else
      {
        localObject2 = null;
        break label345;
      }
      if (m0.S()) {
        m0.y(1, "QueryEngine", "Re-using previous result from %s to execute query: %s", new Object[] { ((q)localObject2).toString(), paramf0.toString() });
      }
      localObject4 = k.a.a;
      localObject2 = a;
      long l1 = a;
      int i1 = b + 1;
      if (i1 == 1.0E9D) {
        localObject2 = new u7.m(0, l1 + 1L);
      } else {
        localObject2 = new u7.m(i1, l1);
      }
      localObject2 = locald0.a((t8.e)localObject3, paramf0, new j9.b(new q((u7.m)localObject2), i.g(), -1));
      label345:
      if (localObject2 == null)
      {
        localObject4 = new a.a();
        if (m0.S()) {
          m0.y(1, "QueryEngine", "Using full collection scan to execute query: %s", new Object[] { paramf0.toString() });
        }
        localObject3 = a.d(paramf0, k.a.a, (a.a)localObject4);
        localObject2 = localObject3;
        if (localObject3 != null)
        {
          localObject2 = localObject3;
          if (d)
          {
            i1 = ((t8.c)localObject3).size();
            if (a < 100)
            {
              m0.y(1, "QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", new Object[] { paramf0.toString(), Integer.valueOf(100) });
              localObject2 = localObject3;
            }
            else
            {
              m0.y(1, "QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", new Object[] { paramf0.toString(), Integer.valueOf(a), Integer.valueOf(i1) });
              localObject2 = localObject3;
              if (a > i1 * 2.0D)
              {
                b.m(paramf0.i());
                m0.y(1, "QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", new Object[] { paramf0.toString() });
                localObject2 = localObject3;
              }
            }
          }
        }
      }
    }
    return new r4.c(6, localObject2, localObject1);
  }
  
  public final void c(e9.e parame)
  {
    Object localObject1 = a.m(parame);
    b = ((f)localObject1);
    c = a.n(parame, (f)localObject1);
    parame = a.k(parame);
    d = parame;
    localObject1 = e;
    Object localObject2 = c;
    f localf = b;
    f = new h((g0)localObject1, (a0)localObject2, parame, localf);
    ((g0)localObject1).e(localf);
    localObject1 = g;
    parame = f;
    localObject2 = b;
    a = parame;
    b = ((f)localObject2);
    c = true;
  }
  
  public final b d(Map<i, j9.m> paramMap)
  {
    HashMap localHashMap1 = new HashMap();
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    HashMap localHashMap2 = e.a(paramMap.keySet());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      i locali = (i)((Map.Entry)localObject).getKey();
      localObject = (j9.m)((Map.Entry)localObject).getValue();
      j9.m localm = (j9.m)localHashMap2.get(locali);
      if (((j9.m)localObject).b() != localm.b()) {
        localHashSet.add(locali);
      }
      if ((((j9.m)localObject).h()) && (d.equals(q.b)))
      {
        localArrayList.add(b);
      }
      else
      {
        if (((q0.g.b(c, 1) ^ true)) && (d.f(d) <= 0) && ((d.f(d) != 0) || (!localm.e())))
        {
          m0.y(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", new Object[] { locali, d, d });
          continue;
        }
        x6.b.Z("Cannot add a document when the remote version is zero", q.b.equals(e) ^ true, new Object[0]);
        e.d((j9.m)localObject, e);
      }
      localHashMap1.put(locali, localObject);
    }
    e.b(localArrayList);
    return new b(localHashMap1, localHashSet);
  }
  
  public static final class a
  {
    public m1 a;
    public int b;
  }
  
  public static final class b
  {
    public final Map<i, j9.m> a;
    public final Set<i> b;
    
    public b(HashMap paramHashMap, HashSet paramHashSet)
    {
      a = paramHashMap;
      b = paramHashSet;
    }
  }
}

/* Location:
 * Qualified Name:     i9.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */