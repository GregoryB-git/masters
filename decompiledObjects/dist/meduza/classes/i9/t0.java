package i9;

import android.text.TextUtils;
import android.util.Pair;
import g9.e0;
import g9.k0;
import g9.l.a;
import ia.a.b;
import ia.a.b.b;
import ia.a.b.c;
import j9.k.a;
import j9.k.b;
import j9.k.c;
import j9.q;
import j9.r;
import j9.s;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeSet;
import ka.d0;
import ma.w.a;
import p2.m0;

public final class t0
  implements f
{
  public static final byte[] k = new byte[0];
  public final y0 a;
  public final i b;
  public final String c;
  public final HashMap d = new HashMap();
  public final s.a e = new s.a();
  public final HashMap f = new HashMap();
  public final PriorityQueue g = new PriorityQueue(10, new b0.d(10));
  public boolean h;
  public int i;
  public long j;
  
  public t0(y0 paramy0, i parami, e9.e parame)
  {
    int m = 0;
    h = false;
    i = -1;
    j = -1L;
    a = paramy0;
    b = parami;
    paramy0 = a;
    if (paramy0 != null) {
      m = 1;
    }
    if (m == 0) {
      paramy0 = "";
    }
    c = paramy0;
  }
  
  public static Object[] o(j9.k paramk, k0 paramk0, Collection paramCollection)
  {
    if (paramCollection == null) {
      return null;
    }
    Object localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(new h9.c());
    Object localObject2 = paramCollection.iterator();
    paramCollection = paramk.c().iterator();
    paramk = (j9.k)localObject2;
    while (paramCollection.hasNext())
    {
      k.c localc = (k.c)paramCollection.next();
      d0 locald01 = (d0)paramk.next();
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (h9.c)((Iterator)localObject2).next();
        Object localObject4 = localc.f();
        Object localObject5 = c.iterator();
        Object localObject6;
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (g9.m)((Iterator)localObject5).next();
          if ((localObject6 instanceof g9.l))
          {
            localObject6 = (g9.l)localObject6;
            if (c.equals(localObject4))
            {
              localObject6 = a;
              if ((localObject6.equals(l.a.r)) || (localObject6.equals(l.a.s)))
              {
                m = 1;
                break label212;
              }
            }
          }
        }
        m = 0;
        label212:
        if ((m != 0) && (s.h(locald01)))
        {
          localObject6 = new ArrayList((Collection)localObject1);
          localObject5 = new ArrayList();
          Iterator localIterator1 = locald01.R().h().iterator();
          localObject1 = localObject2;
          localObject4 = paramCollection;
          localObject3 = paramk;
          if (localIterator1.hasNext())
          {
            d0 locald02 = (d0)localIterator1.next();
            Iterator localIterator2 = ((ArrayList)localObject6).iterator();
            paramCollection = (Collection)localObject1;
            localObject2 = localObject4;
            paramk = (j9.k)localObject3;
            for (;;)
            {
              localObject3 = paramk;
              localObject4 = localObject2;
              localObject1 = paramCollection;
              if (!localIterator2.hasNext()) {
                break;
              }
              localObject4 = (h9.c)localIterator2.next();
              localObject1 = new h9.c();
              localObject4 = a;
              localObject3 = Arrays.copyOf(a, b);
              localObject4 = a;
              localObject4.getClass();
              ((h9.f)localObject4).a(localObject3.length);
              int n = localObject3.length;
              for (m = 0; m < n; m++)
              {
                int i1 = localObject3[m];
                byte[] arrayOfByte = a;
                int i2 = b;
                b = (i2 + 1);
                arrayOfByte[i2] = ((byte)i1);
              }
              localObject4 = ((h9.c)localObject1).a(localc.g());
              h9.b.a(locald02, (m.e)localObject4);
              ((m.e)localObject4).r();
              ((ArrayList)localObject5).add(localObject1);
            }
          }
          localObject2 = localObject3;
          paramCollection = (Collection)localObject4;
          paramk = (j9.k)localObject1;
          localObject1 = localObject5;
        }
        else
        {
          localObject4 = localObject2;
          localObject2 = ((h9.c)localObject3).a(localc.g());
          h9.b.a(locald01, (m.e)localObject2);
          ((m.e)localObject2).r();
          localObject2 = paramk;
          paramk = (j9.k)localObject4;
        }
        localObject4 = localObject2;
        localObject2 = paramk;
        paramk = (j9.k)localObject4;
      }
    }
    paramk0 = new Object[((List)localObject1).size()];
    for (int m = 0; m < ((List)localObject1).size(); m++)
    {
      paramk = geta;
      paramk0[m] = Arrays.copyOf(a, b);
    }
    return paramk0;
  }
  
  public static j9.b r(Collection paramCollection)
  {
    x6.b.Z("Found empty index group when looking for least recent index offset.", paramCollection.isEmpty() ^ true, new Object[0]);
    Iterator localIterator = paramCollection.iterator();
    Object localObject = ((j9.k)localIterator.next()).e().a();
    int m = ((k.a)localObject).i();
    while (localIterator.hasNext())
    {
      k.a locala = ((j9.k)localIterator.next()).e().a();
      paramCollection = (Collection)localObject;
      if (locala.f((k.a)localObject) < 0) {
        paramCollection = locala;
      }
      m = Math.max(locala.i(), m);
      localObject = paramCollection;
    }
    return new j9.b(((k.a)localObject).l(), ((k.a)localObject).h(), m);
  }
  
  public final void a(j9.k paramk)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    int m = i + 1;
    j9.a locala = new j9.a(m, paramk.b(), paramk.f(), paramk.e());
    y0 localy0 = a;
    String str = d;
    Object localObject = b;
    paramk = e;
    localObject.getClass();
    localObject = ia.a.J();
    ((w.a)localObject).m();
    ia.a.G((ia.a)b);
    Iterator localIterator = paramk.iterator();
    while (localIterator.hasNext())
    {
      k.c localc = (k.c)localIterator.next();
      a.b.b localb = a.b.M();
      paramk = localc.f().h();
      localb.m();
      a.b.G((a.b)b, paramk);
      if (localc.g() == 3)
      {
        localb.m();
        a.b.I((a.b)b);
      }
      else
      {
        if (localc.g() == 1) {
          paramk = a.b.c.c;
        } else {
          paramk = a.b.c.d;
        }
        localb.m();
        a.b.H((a.b)b, paramk);
      }
      ((w.a)localObject).m();
      ia.a.H((ia.a)b, (a.b)localb.k());
    }
    localy0.G("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", new Object[] { Integer.valueOf(m), str, ((ia.a)((w.a)localObject).k()).j() });
    t(locala);
  }
  
  public final j9.b b(k0 paramk0)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = s(paramk0).iterator();
    while (localIterator.hasNext())
    {
      paramk0 = p((k0)localIterator.next());
      if (paramk0 != null) {
        localArrayList.add(paramk0);
      }
    }
    return r(localArrayList);
  }
  
  public final void c(j9.k paramk)
  {
    a.G("DELETE FROM index_configuration WHERE index_id = ?", new Object[] { Integer.valueOf(paramk.d()) });
    a.G("DELETE FROM index_entries WHERE index_id = ?", new Object[] { Integer.valueOf(paramk.d()) });
    a.G("DELETE FROM index_state WHERE index_id = ?", new Object[] { Integer.valueOf(paramk.d()) });
    g.remove(paramk);
    Map localMap = (Map)f.get(paramk.b());
    if (localMap != null) {
      localMap.remove(Integer.valueOf(paramk.d()));
    }
  }
  
  public final Collection<j9.k> d()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = f.values().iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll(((Map)localIterator.next()).values());
    }
    return localArrayList;
  }
  
  public final String e()
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    Object localObject = (j9.k)g.peek();
    if (localObject != null) {
      localObject = ((j9.k)localObject).b();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final List<j9.o> f(String paramString)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    ArrayList localArrayList = new ArrayList();
    y0.d locald = a.H("SELECT parent FROM collection_parents WHERE collection_id = ?");
    locald.a(new Object[] { paramString });
    locald.d(new p0(localArrayList, 0));
    return localArrayList;
  }
  
  public final void g()
  {
    a.G("DELETE FROM index_configuration", new Object[0]);
    a.G("DELETE FROM index_entries", new Object[0]);
    a.G("DELETE FROM index_state", new Object[0]);
    g.clear();
    f.clear();
  }
  
  public final void h(t8.c<j9.i, j9.g> paramc)
  {
    boolean bool = h;
    int m = 0;
    x6.b.Z("IndexManager not started", bool, new Object[0]);
    Iterator localIterator1 = paramc.iterator();
    if (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      paramc = getKeya;
      Iterator localIterator2 = q(paramc.n(paramc.q() - 2)).iterator();
      int n = m;
      for (;;)
      {
        m = n;
        if (!localIterator2.hasNext()) {
          break;
        }
        Object localObject1 = (j9.k)localIterator2.next();
        paramc = (j9.i)localEntry.getKey();
        TreeSet localTreeSet = new TreeSet();
        Object localObject2 = a.H("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
        Object localObject3 = new Object[3];
        localObject3[n] = Integer.valueOf(((j9.k)localObject1).d());
        localObject3[1] = paramc.toString();
        localObject3[2] = c;
        ((y0.d)localObject2).a((Object[])localObject3);
        ((y0.d)localObject2).d(new s0(localTreeSet, localObject1, paramc, n));
        localObject2 = (j9.g)localEntry.getValue();
        localObject3 = new TreeSet();
        Object localObject4 = new h9.c();
        Object localObject5 = ((j9.k)localObject1).c().iterator();
        Object localObject6;
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (k.c)((Iterator)localObject5).next();
          paramc = ((j9.g)localObject2).g(((k.c)localObject6).f());
          if (paramc == null)
          {
            paramc = null;
            break label331;
          }
          localObject6 = ((h9.c)localObject4).a(((k.c)localObject6).g());
          h9.b.a(paramc, (m.e)localObject6);
          ((m.e)localObject6).r();
        }
        paramc = a;
        paramc = Arrays.copyOf(a, b);
        label331:
        if (paramc != null)
        {
          localObject5 = ((j9.k)localObject1).a();
          if (localObject5 != null)
          {
            localObject5 = ((j9.g)localObject2).g(((k.c)localObject5).f());
            if (s.h((d0)localObject5))
            {
              localObject5 = ((d0)localObject5).R().h().iterator();
              while (((Iterator)localObject5).hasNext())
              {
                d0 locald0 = (d0)((Iterator)localObject5).next();
                n = ((j9.k)localObject1).d();
                localObject4 = ((j9.g)localObject2).getKey();
                h9.c localc = new h9.c();
                localObject6 = localc.a(1);
                h9.b.a(locald0, (m.e)localObject6);
                ((m.e)localObject6).r();
                localObject6 = a;
                ((TreeSet)localObject3).add(new h9.a(n, (j9.i)localObject4, Arrays.copyOf(a, b), paramc));
              }
            }
          }
          else
          {
            ((TreeSet)localObject3).add(new h9.a(((j9.k)localObject1).d(), ((j9.g)localObject2).getKey(), new byte[0], paramc));
          }
        }
        if (!localTreeSet.equals(localObject3))
        {
          paramc = (j9.g)localEntry.getValue();
          m0.y(1, "t0", "Updating index entries for document '%s'", new Object[] { paramc.getKey() });
          localObject1 = new q0(0, this, paramc);
          localObject2 = new r0(0, this, paramc);
          paramc = n9.o.a;
          localObject5 = localTreeSet.iterator();
          localObject3 = ((TreeSet)localObject3).iterator();
          if (localTreeSet.comparator() != null) {
            paramc = localTreeSet.comparator();
          } else {
            paramc = new q5.i(7);
          }
          n9.o.f((Iterator)localObject5, (Iterator)localObject3, paramc, (n9.d)localObject1, (n9.d)localObject2);
          n = 0;
        }
        else
        {
          n = 0;
        }
      }
    }
  }
  
  public final j9.b i(String paramString)
  {
    paramString = q(paramString);
    x6.b.Z("minOffset was called for collection without indexes", paramString.isEmpty() ^ true, new Object[0]);
    return r(paramString);
  }
  
  public final void j(j9.o paramo)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    boolean bool;
    if (paramo.q() % 2 == 1) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Expected a collection path.", bool, new Object[0]);
    if (e.a(paramo))
    {
      String str = paramo.m();
      paramo = (j9.o)paramo.s();
      a.G("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", new Object[] { str, m0.A(paramo) });
    }
  }
  
  public final int k(k0 paramk0)
  {
    List localList = s(paramk0);
    Iterator localIterator1 = localList.iterator();
    int m = 3;
    int n;
    for (;;)
    {
      boolean bool = localIterator1.hasNext();
      n = 0;
      int i1 = 0;
      if (!bool) {
        break;
      }
      Object localObject1 = (k0)localIterator1.next();
      Object localObject2 = p((k0)localObject1);
      if (localObject2 == null)
      {
        m = 1;
        break;
      }
      int i2 = ((j9.k)localObject2).f().size();
      localObject2 = new HashSet();
      Iterator localIterator2 = c.iterator();
      n = i1;
      if (localIterator2.hasNext())
      {
        localIterator3 = ((g9.m)localIterator2.next()).c().iterator();
        i1 = n;
        for (;;)
        {
          n = i1;
          if (!localIterator3.hasNext()) {
            break;
          }
          g9.l locall = (g9.l)localIterator3.next();
          if (!c.u()) {
            if ((!a.equals(l.a.p)) && (!a.equals(l.a.q))) {
              ((HashSet)localObject2).add(c);
            } else {
              i1 = 1;
            }
          }
        }
      }
      Iterator localIterator3 = b.iterator();
      while (localIterator3.hasNext())
      {
        localObject1 = (e0)localIterator3.next();
        if (!b.u()) {
          ((HashSet)localObject2).add(b);
        }
      }
      if (i2 < ((HashSet)localObject2).size() + n) {
        m = 2;
      }
    }
    if (f != -1L) {
      n = 1;
    }
    if ((n != 0) && (localList.size() > 1) && (m == 3)) {
      return 2;
    }
    return m;
  }
  
  public final List<j9.i> l(k0 paramk0)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject1 = new ArrayList();
    Object localObject2 = s(paramk0).iterator();
    Object localObject3;
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (k0)((Iterator)localObject2).next();
      localObject4 = p((k0)localObject3);
      if (localObject4 == null) {
        return null;
      }
      ((ArrayList)localObject1).add(Pair.create(localObject3, localObject4));
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    int m;
    label273:
    label452:
    label462:
    boolean bool1;
    for (;;)
    {
      localObject2 = null;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject4 = (Pair)((Iterator)localObject1).next();
      Object localObject5 = (k0)first;
      Object localObject6 = (j9.k)second;
      localObject5.getClass();
      localObject4 = ((j9.k)localObject6).a();
      if (localObject4 != null)
      {
        localObject4 = ((k0)localObject5).d(((k.c)localObject4).f()).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject2 = (g9.l)((Iterator)localObject4).next();
          m = a.ordinal();
          if (m != 6)
          {
            if (m == 7)
            {
              localObject2 = b.R().h();
              break label273;
            }
          }
          else
          {
            localObject2 = Collections.singletonList(b);
            break label273;
          }
        }
        localObject2 = null;
      }
      Object localObject7 = new LinkedHashMap();
      Object localObject8 = ((j9.k)localObject6).c().iterator();
      localObject4 = localObject1;
      if (((Iterator)localObject8).hasNext())
      {
        localObject9 = (k.c)((Iterator)localObject8).next();
        localObject10 = ((k0)localObject5).d(((k.c)localObject9).f()).iterator();
        localObject3 = localObject8;
        localObject1 = localObject4;
        for (;;)
        {
          localObject4 = localObject1;
          localObject8 = localObject3;
          if (!((Iterator)localObject10).hasNext()) {
            break;
          }
          localObject4 = (g9.l)((Iterator)localObject10).next();
          m = a.ordinal();
          if (m != 2) {
            if (m != 3)
            {
              if (m != 8) {
                if (m != 9) {
                  break label452;
                }
              }
            }
            else
            {
              ((AbstractMap)localObject7).put(((k.c)localObject9).f(), b);
              localObject4 = ((LinkedHashMap)localObject7).values();
              break label462;
            }
          }
          ((AbstractMap)localObject7).put(((k.c)localObject9).f(), b);
        }
      }
      localObject1 = localObject4;
      localObject4 = null;
      localObject7 = new ArrayList();
      localObject3 = ((j9.k)localObject6).c().iterator();
      bool1 = true;
      boolean bool2;
      while (((Iterator)localObject3).hasNext())
      {
        localObject8 = (k.c)((Iterator)localObject3).next();
        bool2 = q0.g.b(((k.c)localObject8).g(), 1);
        localObject10 = g;
        if (bool2) {
          localObject8 = ((k0)localObject5).a((k.c)localObject8, (g9.e)localObject10);
        } else {
          localObject8 = ((k0)localObject5).c((k.c)localObject8, (g9.e)localObject10);
        }
        ((ArrayList)localObject7).add((d0)first);
        bool1 &= ((Boolean)second).booleanValue();
      }
      Object localObject9 = new g9.e((List)localObject7, bool1);
      Object localObject10 = new ArrayList();
      localObject3 = ((j9.k)localObject6).c().iterator();
      bool1 = true;
      while (((Iterator)localObject3).hasNext())
      {
        localObject7 = (k.c)((Iterator)localObject3).next();
        bool2 = q0.g.b(((k.c)localObject7).g(), 1);
        localObject8 = h;
        if (bool2) {
          localObject8 = ((k0)localObject5).c((k.c)localObject7, (g9.e)localObject8);
        } else {
          localObject8 = ((k0)localObject5).a((k.c)localObject7, (g9.e)localObject8);
        }
        ((ArrayList)localObject10).add((d0)first);
        bool1 &= ((Boolean)second).booleanValue();
      }
      localObject3 = new g9.e((List)localObject10, bool1);
      if (m0.S()) {
        m0.y(1, "t0", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", new Object[] { localObject6, localObject5, localObject2, localObject9, localObject3 });
      }
      localObject7 = o((j9.k)localObject6, (k0)localObject5, b);
      if (a) {
        localObject3 = ">=";
      } else {
        localObject3 = ">";
      }
      localObject10 = o((j9.k)localObject6, (k0)localObject5, (Collection)localObject10);
      if (bool1) {
        localObject8 = "<=";
      } else {
        localObject8 = "<";
      }
      localObject5 = o((j9.k)localObject6, (k0)localObject5, (Collection)localObject4);
      int n = ((j9.k)localObject6).d();
      if (localObject2 != null) {
        m = ((List)localObject2).size();
      } else {
        m = 1;
      }
      int i1 = Math.max(localObject7.length, localObject10.length) * m;
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("SELECT document_key, directional_value FROM index_entries ");
      ((StringBuilder)localObject4).append("WHERE index_id = ? AND uid = ? ");
      ((StringBuilder)localObject4).append("AND array_value = ? ");
      ((StringBuilder)localObject4).append("AND directional_value ");
      ((StringBuilder)localObject4).append((String)localObject3);
      ((StringBuilder)localObject4).append(" ? ");
      ((StringBuilder)localObject4).append("AND directional_value ");
      ((StringBuilder)localObject4).append((String)localObject8);
      ((StringBuilder)localObject4).append(" ? ");
      localObject3 = n9.o.h((CharSequence)localObject4, i1, " UNION ");
      localObject4 = localObject3;
      if (localObject5 != null)
      {
        localObject4 = new StringBuilder("SELECT document_key, directional_value FROM (");
        ((StringBuilder)localObject4).append((CharSequence)localObject3);
        ((StringBuilder)localObject4).append(") WHERE directional_value NOT IN (");
        ((StringBuilder)localObject4).append(n9.o.h("?", localObject5.length, ", "));
        ((StringBuilder)localObject4).append(")");
      }
      if (localObject2 != null) {
        m = ((List)localObject2).size();
      } else {
        m = 1;
      }
      int i2 = i1 / m;
      if (localObject5 != null) {
        m = localObject5.length;
      } else {
        m = 0;
      }
      localObject8 = new Object[i1 * 5 + m];
      int i3 = 0;
      for (m = 0; i3 < i1; m++)
      {
        int i4 = m + 1;
        localObject8[m] = Integer.valueOf(n);
        m = i4 + 1;
        localObject8[i4] = c;
        i4 = m + 1;
        if (localObject2 != null)
        {
          localObject9 = (d0)((List)localObject2).get(i3 / i2);
          localObject3 = new h9.c();
          localObject6 = ((h9.c)localObject3).a(1);
          h9.b.a((d0)localObject9, (m.e)localObject6);
          ((m.e)localObject6).r();
          localObject3 = a;
          localObject3 = Arrays.copyOf(a, b);
        }
        else
        {
          localObject3 = k;
        }
        localObject8[m] = localObject3;
        m = i4 + 1;
        int i5 = i3 % i2;
        localObject8[i4] = localObject7[i5];
        localObject8[m] = localObject10[i5];
        i3++;
      }
      if (localObject5 != null)
      {
        n = localObject5.length;
        i1 = 0;
        while (i1 < n)
        {
          localObject8[m] = localObject5[i1];
          i1++;
          m++;
        }
      }
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).add(((StringBuilder)localObject4).toString());
      ((ArrayList)localObject2).addAll(Arrays.asList((Object[])localObject8));
      localObject2 = ((ArrayList)localObject2).toArray();
      localArrayList1.add(String.valueOf(localObject2[0]));
      localArrayList2.addAll(Arrays.asList((Object[])localObject2).subList(1, localObject2.length));
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(TextUtils.join(" UNION ", localArrayList1));
    ((StringBuilder)localObject1).append("ORDER BY directional_value, document_key ");
    localObject2 = b;
    if (q0.g.b(getsize1a, 1)) {
      localObject2 = "asc ";
    } else {
      localObject2 = "desc ";
    }
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = g.e("SELECT DISTINCT document_key FROM (", ((StringBuilder)localObject1).toString(), ")");
    if (f != -1L) {
      m = 1;
    } else {
      m = 0;
    }
    localObject2 = localObject1;
    if (m != 0)
    {
      localObject2 = g.g((String)localObject1, " LIMIT ");
      ((StringBuilder)localObject2).append(f);
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (localArrayList2.size() < 1000) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    x6.b.Z("Cannot perform query with more than 999 bind elements", bool1, new Object[0]);
    paramk0 = a.H((String)localObject2);
    paramk0.a(localArrayList2.toArray());
    localObject2 = new ArrayList();
    paramk0.d(new o0(0, (ArrayList)localObject2));
    m0.y(1, "t0", "Index scan returned %s documents", new Object[] { Integer.valueOf(((ArrayList)localObject2).size()) });
    return (List<j9.i>)localObject2;
  }
  
  public final void m(k0 paramk0)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    Iterator localIterator = s(paramk0).iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (k0)localIterator.next();
      int m = k((k0)localObject1);
      if ((m == 1) || (m == 2))
      {
        paramk0 = e;
        if (paramk0 == null) {
          paramk0 = d.m();
        }
        Object localObject2 = b;
        Object localObject3 = new TreeSet(new v4.d(9));
        Object localObject4 = new ArrayList();
        Object localObject5 = c.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject1 = (g9.l)((Iterator)localObject5).next();
          if (((g9.l)localObject1).f()) {
            ((TreeSet)localObject3).add(localObject1);
          } else {
            ((ArrayList)localObject4).add(localObject1);
          }
        }
        if (((TreeSet)localObject3).size() > 1) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0)
        {
          paramk0 = null;
        }
        else
        {
          localObject1 = new HashSet();
          localObject3 = new ArrayList();
          localObject5 = ((ArrayList)localObject4).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject4 = (g9.l)((Iterator)localObject5).next();
            if (!c.u())
            {
              if ((!a.equals(l.a.p)) && (!a.equals(l.a.q))) {
                m = 0;
              } else {
                m = 1;
              }
              if (m != 0)
              {
                ((ArrayList)localObject3).add(new j9.d(c, 3));
              }
              else if (!((HashSet)localObject1).contains(c))
              {
                ((HashSet)localObject1).add(c);
                ((ArrayList)localObject3).add(new j9.d(c, 1));
              }
            }
          }
          localObject4 = ((List)localObject2).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject2 = (e0)((Iterator)localObject4).next();
            if ((!b.u()) && (!((HashSet)localObject1).contains(b)))
            {
              ((HashSet)localObject1).add(b);
              localObject5 = b;
              if (a == 1) {
                m = 1;
              } else {
                m = 2;
              }
              ((ArrayList)localObject3).add(new j9.d((j9.l)localObject5, m));
            }
          }
          paramk0 = new j9.a(-1, paramk0, (List)localObject3, j9.k.a);
        }
        if (paramk0 != null) {
          a(paramk0);
        }
      }
    }
  }
  
  public final void n(String paramString, j9.b paramb)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    j += 1L;
    paramString = q(paramString).iterator();
    while (paramString.hasNext())
    {
      j9.k localk = (j9.k)paramString.next();
      j9.a locala = new j9.a(localk.d(), localk.b(), localk.f(), new j9.c(j, paramb));
      a.G("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", new Object[] { Integer.valueOf(localk.d()), c, Long.valueOf(j), Long.valueOf(c.a.a), Integer.valueOf(c.a.b), m0.A(d.a), Integer.valueOf(e) });
      t(locala);
    }
  }
  
  public final j9.k p(k0 paramk0)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    r localr = new r(paramk0);
    Object localObject1 = e;
    if (localObject1 != null) {
      paramk0 = (k0)localObject1;
    } else {
      paramk0 = d.m();
    }
    localObject1 = q(paramk0);
    boolean bool = ((Collection)localObject1).isEmpty();
    paramk0 = null;
    if (bool) {
      return null;
    }
    Iterator localIterator1 = ((Collection)localObject1).iterator();
    while (localIterator1.hasNext())
    {
      j9.k localk = (j9.k)localIterator1.next();
      x6.b.Z("Collection IDs do not match", localk.b().equals(a), new Object[0]);
      int m = b.size();
      int n = 1;
      if (m > 1) {
        m = 1;
      } else {
        m = 0;
      }
      Object localObject2;
      if (m != 0)
      {
        localObject2 = paramk0;
      }
      else
      {
        localObject1 = localk.a();
        if ((localObject1 != null) && (!localr.a((k.c)localObject1)))
        {
          localObject2 = paramk0;
        }
        else
        {
          Iterator localIterator2 = d.iterator();
          ArrayList localArrayList = localk.c();
          Object localObject3 = new HashSet();
          for (m = 0; (m < localArrayList.size()) && (localr.a((k.c)localArrayList.get(m))); m++) {
            ((HashSet)localObject3).add(((k.c)localArrayList.get(m)).f().h());
          }
          if (m == localArrayList.size())
          {
            localObject2 = paramk0;
            m = n;
            break label470;
          }
          localObject1 = paramk0;
          int i1 = m;
          if (b.size() > 0)
          {
            localObject1 = (g9.l)b.first();
            localObject2 = paramk0;
            i1 = m;
            if (((HashSet)localObject3).contains(c.h())) {
              break label458;
            }
            localObject3 = (k.c)localArrayList.get(m);
            localObject2 = paramk0;
            if (!r.b((g9.l)localObject1, (k.c)localObject3)) {
              break label467;
            }
            localObject2 = paramk0;
            i1 = m;
            if (r.c((e0)localIterator2.next(), (k.c)localObject3)) {
              break label458;
            }
            localObject2 = paramk0;
            break label467;
          }
          for (;;)
          {
            localObject2 = localObject1;
            m = n;
            if (i1 >= localArrayList.size()) {
              break label470;
            }
            paramk0 = (k.c)localArrayList.get(i1);
            localObject2 = localObject1;
            if (!localIterator2.hasNext()) {
              break;
            }
            localObject2 = localObject1;
            if (!r.c((e0)localIterator2.next(), paramk0))
            {
              localObject2 = localObject1;
              break;
            }
            label458:
            i1++;
            localObject1 = localObject2;
          }
        }
      }
      label467:
      m = 0;
      label470:
      paramk0 = (k0)localObject2;
      if (m != 0) {
        if (localObject2 != null)
        {
          paramk0 = (k0)localObject2;
          if (localk.f().size() <= ((j9.k)localObject2).f().size()) {}
        }
        else
        {
          paramk0 = localk;
        }
      }
    }
    return paramk0;
  }
  
  public final Collection<j9.k> q(String paramString)
  {
    x6.b.Z("IndexManager not started", h, new Object[0]);
    paramString = (Map)f.get(paramString);
    if (paramString == null) {
      paramString = Collections.emptyList();
    } else {
      paramString = paramString.values();
    }
    return paramString;
  }
  
  public final List<k0> s(k0 paramk0)
  {
    if (d.containsKey(paramk0)) {
      return (List)d.get(paramk0);
    }
    ArrayList localArrayList = new ArrayList();
    if (c.isEmpty())
    {
      localArrayList.add(paramk0);
    }
    else
    {
      Object localObject = c;
      int m = 1;
      localObject = new g9.g((List)localObject, 1);
      g9.m localm;
      if (((g9.g)localObject).b().isEmpty())
      {
        localObject = Collections.emptyList();
      }
      else
      {
        localm = n9.k.e(n9.k.f((g9.m)localObject));
        x6.b.Z("computeDistributedNormalForm did not result in disjunctive normal form", n9.k.g(localm), new Object[0]);
        if (!(localm instanceof g9.l))
        {
          if ((localm instanceof g9.g))
          {
            localObject = (g9.g)localm;
            Iterator localIterator = a.iterator();
            while (localIterator.hasNext()) {
              if (((g9.m)localIterator.next() instanceof g9.g))
              {
                n = 0;
                break label179;
              }
            }
            n = 1;
            label179:
            if ((n != 0) && (((g9.g)localObject).e())) {
              n = 1;
            } else {
              n = 0;
            }
            if (n != 0)
            {
              n = m;
              break label215;
            }
          }
          int n = 0;
          label215:
          if (n == 0)
          {
            localObject = localm.b();
            break label238;
          }
        }
        localObject = Collections.singletonList(localm);
      }
      label238:
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localm = (g9.m)((Iterator)localObject).next();
        localArrayList.add(new k0(d, e, localm.b(), b, f, g, h));
      }
    }
    d.put(paramk0, localArrayList);
    return localArrayList;
  }
  
  public final void start()
  {
    HashMap localHashMap = new HashMap();
    y0.d locald = a.H("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
    locald.a(new Object[] { c });
    locald.d(new p0(localHashMap, 1));
    a.H("SELECT index_id, collection_group, index_proto FROM index_configuration").d(new q0(1, this, localHashMap));
    h = true;
  }
  
  public final void t(j9.a parama)
  {
    Object localObject1 = (Map)f.get(d);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new HashMap();
      f.put(d, localObject2);
    }
    localObject1 = (j9.k)((Map)localObject2).get(Integer.valueOf(c));
    if (localObject1 != null) {
      g.remove(localObject1);
    }
    ((Map)localObject2).put(Integer.valueOf(c), parama);
    g.add(parama);
    i = Math.max(i, c);
    j = Math.max(j, f.b());
  }
}

/* Location:
 * Qualified Name:     i9.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */