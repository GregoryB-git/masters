package m9;

import a0.j;
import eb.e1;
import g9.i.a;
import i9.e0;
import i9.l1;
import i9.m1;
import i9.n;
import j9.i;
import j9.m;
import j9.o;
import j9.q;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import ma.h;
import n9.a.a;
import t8.e.a;
import x6.b;

public final class f0
  implements p0.a
{
  public f0(h0 paramh0) {}
  
  public final void a()
  {
    h0 localh0 = a;
    Iterator localIterator = f.values().iterator();
    while (localIterator.hasNext()) {
      localh0.f((m1)localIterator.next());
    }
  }
  
  public final void c(e1 parame1)
  {
    h0 localh0 = a;
    localh0.getClass();
    Object localObject = g9.d0.a;
    boolean bool1 = parame1.e();
    boolean bool2 = true;
    if (bool1) {
      b.Z("Watch stream was stopped gracefully while still needed.", localh0.g() ^ true, new Object[0]);
    }
    k = null;
    if (localh0.g())
    {
      b0 localb0 = g;
      if (a == g9.d0.b)
      {
        localb0.b((g9.d0)localObject);
        if (b == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        b.Z("watchStreamFailures must be 0", bool1, new Object[0]);
        if (c == null) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
        b.Z("onlineStateTimer must be null", bool1, new Object[0]);
      }
      else
      {
        int i = b + 1;
        b = i;
        if (i >= 1)
        {
          localObject = c;
          if (localObject != null)
          {
            ((a.a)localObject).a();
            c = null;
          }
          localb0.a(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", new Object[] { Integer.valueOf(1), parame1 }));
          localb0.b(g9.d0.c);
        }
      }
      localh0.i();
    }
    else
    {
      g.c((g9.d0)localObject);
    }
  }
  
  public final void e(q paramq, n0 paramn0)
  {
    h0 localh0 = a;
    g.c(g9.d0.b);
    Object localObject1 = i;
    int i = 0;
    if ((localObject1 != null) && (k != null)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    b.Z("WatchStream and WatchStreamAggregator should both be non-null", bool1, new Object[0]);
    boolean bool1 = paramn0 instanceof n0.c;
    if (bool1) {
      localObject1 = (n0.c)paramn0;
    } else {
      localObject1 = null;
    }
    if ((localObject1 != null) && (a.equals(n0.d.c)) && (d != null)) {
      paramn0 = b.iterator();
    }
    while (paramn0.hasNext())
    {
      Object localObject3 = (Integer)paramn0.next();
      if (f.containsKey(localObject3))
      {
        f.remove(localObject3);
        paramq = k;
        int j = ((Integer)localObject3).intValue();
        b.remove(Integer.valueOf(j));
        b.e(((Integer)localObject3).intValue(), d);
        continue;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        Object localObject7;
        Object localObject8;
        if ((paramn0 instanceof n0.a))
        {
          localObject3 = k;
          localObject4 = (n0.a)paramn0;
          localObject3.getClass();
          localObject5 = d;
          localObject6 = c;
          localObject7 = a.iterator();
          while (((Iterator)localObject7).hasNext())
          {
            j = ((Integer)((Iterator)localObject7).next()).intValue();
            if ((localObject5 != null) && (((m)localObject5).b()))
            {
              if (((o0)localObject3).b(j))
              {
                paramn0 = b;
                if (a).b.d(j).contains(paramn0)) {
                  paramn0 = i.a.c;
                } else {
                  paramn0 = i.a.b;
                }
                localObject8 = ((o0)localObject3).a(j);
                localObject1 = b;
                c = true;
                b.put(localObject1, paramn0);
                c.put(b, localObject5);
                localObject8 = b;
                localObject1 = (Set)d.get(localObject8);
                paramn0 = (n0)localObject1;
                if (localObject1 == null)
                {
                  paramn0 = new HashSet();
                  d.put(localObject8, paramn0);
                }
                paramn0.add(Integer.valueOf(j));
              }
            }
            else {
              ((o0)localObject3).d(j, (i)localObject6, (m)localObject5);
            }
          }
          paramn0 = b.iterator();
          while (paramn0.hasNext()) {
            ((o0)localObject3).d(((Integer)paramn0.next()).intValue(), (i)localObject6, d);
          }
        }
        boolean bool2 = paramn0 instanceof n0.b;
        int k = 2;
        label840:
        Object localObject2;
        if (bool2)
        {
          localObject6 = k;
          localObject7 = (n0.b)paramn0;
          localObject6.getClass();
          j = a;
          int m = b.a;
          paramn0 = ((o0)localObject6).c(j);
          if (paramn0 != null)
          {
            paramn0 = a;
            if (paramn0.e())
            {
              if (m == 0)
              {
                paramn0 = new i(d);
                ((o0)localObject6).d(j, paramn0, m.n(paramn0, q.b));
              }
              else
              {
                if (m == 1) {
                  bool1 = true;
                } else {
                  bool1 = false;
                }
                b.Z("Single document existence filter with count: %d", bool1, new Object[] { Integer.valueOf(m) });
              }
            }
            else
            {
              paramn0 = ((o0)localObject6).a(j).a();
              int n = a).b.d(j).size();
              n = c.size() + n - e.size();
              if (n != m)
              {
                paramn0 = b.b;
                if ((paramn0 != null) && (paramn0.J()))
                {
                  localObject1 = paramn0.G().G();
                  try
                  {
                    paramn0 = g.a((h)localObject1, paramn0.G().I(), paramn0.I());
                    localObject4 = paramn0;
                    if (a != 0) {
                      break label840;
                    }
                  }
                  catch (g.a locala)
                  {
                    paramn0 = f.l("Applying bloom filter failed: (");
                    paramn0.append(locala.getMessage());
                    paramn0.append("); ignoring the bloom filter and falling back to full re-query.");
                    p2.m0.y(2, "WatchChangeAggregator", paramn0.toString(), new Object[0]);
                  }
                }
                localObject4 = null;
                if (localObject4 != null)
                {
                  int i1 = b.a;
                  int i2 = a;
                  localObject2 = a).b.d(i2);
                  paramn0 = f.l("projects/");
                  paramn0.append(f.a);
                  paramn0.append("/databases/");
                  paramn0 = g.f(paramn0, f.b, "/documents/");
                  localObject2 = ((t8.e)localObject2).iterator();
                  for (;;)
                  {
                    localObject3 = (e.a)localObject2;
                    if (!((e.a)localObject3).hasNext()) {
                      break label1316;
                    }
                    localObject5 = (i)((e.a)localObject3).next();
                    localObject3 = f.l(paramn0);
                    ((StringBuilder)localObject3).append(a.h());
                    localObject3 = ((StringBuilder)localObject3).toString();
                    long l1;
                    long l2;
                    if (a == 0)
                    {
                      localObject3 = paramn0;
                      paramn0 = (n0)localObject2;
                      localObject2 = localObject3;
                    }
                    else
                    {
                      localObject8 = d.digest(((String)localObject3).getBytes(StandardCharsets.UTF_8));
                      if (localObject8.length != 16) {
                        break;
                      }
                      m = 0;
                      l1 = 0L;
                      localObject3 = paramn0;
                      paramn0 = (n0)localObject2;
                      while (m < 8)
                      {
                        l1 |= (localObject8[(m + 0)] & 0xFF) << m * 8;
                        m++;
                      }
                      localObject2 = localObject3;
                      m = 0;
                      l2 = 0L;
                      while (m < 8)
                      {
                        l2 |= (localObject8[(8 + m)] & 0xFF) << m * 8;
                        m++;
                      }
                    }
                    for (m = 0; m < c; m++)
                    {
                      long l3 = m * l2 + l1;
                      long l4 = a;
                      l3 -= ((l3 >>> 1) / l4 << 1) * l4;
                      if (l3 < l4) {
                        l4 = 0L;
                      }
                      k = (int)(l3 - l4);
                      if ((1 << k % 8 & b.i(k / 8)) != 0) {
                        k = 1;
                      } else {
                        k = 0;
                      }
                      if (k == 0)
                      {
                        m = 0;
                        break label1251;
                      }
                    }
                    m = 1;
                    label1251:
                    k = i;
                    if (m == 0)
                    {
                      ((o0)localObject6).d(i2, (i)localObject5, null);
                      k = i + 1;
                    }
                    localObject3 = localObject2;
                    i = k;
                    localObject2 = paramn0;
                    paramn0 = (n0)localObject3;
                  }
                  throw new RuntimeException(j.m(f.l("Invalid md5 hash array length: "), localObject8.length, " (expected 16)"));
                  label1316:
                  m = j;
                  if (i1 == n - i) {
                    j = 1;
                  } else {
                    j = 3;
                  }
                }
                else
                {
                  m = j;
                  j = k;
                }
                if (j != 1)
                {
                  ((o0)localObject6).e(m);
                  if (j == 3) {
                    paramn0 = e0.c;
                  } else {
                    paramn0 = e0.b;
                  }
                  e.put(Integer.valueOf(m), paramn0);
                }
                localObject2 = m0.b;
                paramn0 = b;
                localObject6 = f;
                i = a;
                localObject3 = a;
                localObject6 = b;
                paramn0 = b;
                if (paramn0 == null)
                {
                  paramn0 = null;
                }
                else
                {
                  if (j == 1) {
                    bool1 = true;
                  } else {
                    bool1 = false;
                  }
                  paramn0 = new e((g)localObject4, bool1, paramn0.I(), paramn0.G().G().size(), paramn0.G().I());
                }
                new f(n, i, (String)localObject3, (String)localObject6, paramn0);
                paramn0 = a.iterator();
                while (paramn0.hasNext())
                {
                  localObject2 = (m0.c)((AtomicReference)paramn0.next()).get();
                  if (localObject2 != null) {
                    ((m0.c)localObject2).a();
                  }
                }
              }
            }
          }
        }
        else
        {
          b.Z("Expected watchChange to be an instance of WatchTargetChange", bool1, new Object[0]);
          localObject3 = k;
          localObject4 = (n0.c)paramn0;
          localObject3.getClass();
          paramn0 = b;
          if (paramn0.isEmpty())
          {
            localObject2 = new ArrayList();
            localObject6 = b.keySet().iterator();
            for (;;)
            {
              paramn0 = (n0)localObject2;
              if (!((Iterator)localObject6).hasNext()) {
                break;
              }
              paramn0 = (Integer)((Iterator)localObject6).next();
              if (((o0)localObject3).b(paramn0.intValue())) {
                ((ArrayList)localObject2).add(paramn0);
              }
            }
          }
          localObject2 = paramn0.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            i = ((Integer)((Iterator)localObject2).next()).intValue();
            paramn0 = ((o0)localObject3).a(i);
            j = a.ordinal();
            if (j != 0)
            {
              if (j != 1)
              {
                if (j != 2)
                {
                  if (j != 3)
                  {
                    if (j == 4)
                    {
                      if (!((o0)localObject3).b(i)) {
                        continue;
                      }
                      ((o0)localObject3).e(i);
                    }
                    else
                    {
                      b.T("Unknown target watch change state: %s", new Object[] { a });
                      throw null;
                    }
                  }
                  else
                  {
                    if (!((o0)localObject3).b(i)) {
                      continue;
                    }
                    c = true;
                    e = true;
                  }
                }
                else
                {
                  j = a - 1;
                  a = j;
                  if (j != 0) {
                    j = 1;
                  } else {
                    j = 0;
                  }
                  if (j == 0) {
                    b.remove(Integer.valueOf(i));
                  }
                  if (d == null) {
                    bool1 = true;
                  } else {
                    bool1 = false;
                  }
                  b.Z("WatchChangeAggregator does not handle errored targets", bool1, new Object[0]);
                }
              }
              else
              {
                j = a - 1;
                a = j;
                if (j != 0) {
                  j = 1;
                } else {
                  j = 0;
                }
                if (j == 0)
                {
                  c = false;
                  b.clear();
                }
              }
            }
            else {
              if (!((o0)localObject3).b(i)) {
                continue;
              }
            }
            localObject6 = c;
            if (!((h)localObject6).isEmpty())
            {
              c = true;
              d = ((h)localObject6);
            }
          }
        }
        paramn0 = q.b;
        if ((!paramq.equals(paramn0)) && (paramq.f(c.i.g()) >= 0))
        {
          b.Z("Can't raise event for unknown SnapshotVersion", paramq.equals(paramn0) ^ true, new Object[0]);
          paramn0 = k;
          paramn0.getClass();
          localObject2 = new HashMap();
          localObject3 = b.entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (Map.Entry)((Iterator)localObject3).next();
            j = ((Integer)((Map.Entry)localObject4).getKey()).intValue();
            localObject4 = (l0)((Map.Entry)localObject4).getValue();
            localObject6 = paramn0.c(j);
            if (localObject6 != null)
            {
              if ((e) && (a.e()))
              {
                localObject6 = new i(a.d);
                if ((c.get(localObject6) == null) && (!a).b.d(j).contains(localObject6))) {
                  paramn0.d(j, (i)localObject6, m.n((i)localObject6, paramq));
                }
              }
              if (c)
              {
                ((HashMap)localObject2).put(Integer.valueOf(j), ((l0)localObject4).a());
                c = false;
                b.clear();
              }
            }
          }
          localObject3 = new HashSet();
          localObject4 = d.entrySet().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject7 = (Map.Entry)((Iterator)localObject4).next();
            localObject6 = (i)((Map.Entry)localObject7).getKey();
            localObject5 = ((Set)((Map.Entry)localObject7).getValue()).iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localObject7 = paramn0.c(((Integer)((Iterator)localObject5).next()).intValue());
              if ((localObject7 != null) && (!d.equals(e0.d)))
              {
                j = 0;
                break label2391;
              }
            }
            j = 1;
            label2391:
            if (j != 0) {
              ((HashSet)localObject3).add(localObject6);
            }
          }
          localObject4 = c.values().iterator();
          while (((Iterator)localObject4).hasNext()) {
            nexte = paramq;
          }
          localObject4 = Collections.unmodifiableMap((Map)localObject2);
          localObject2 = new d0(paramq, (Map)localObject4, Collections.unmodifiableMap(e), Collections.unmodifiableMap(c), Collections.unmodifiableSet((Set)localObject3));
          c = new HashMap();
          d = new HashMap();
          e = new HashMap();
          paramn0 = ((Map)localObject4).entrySet().iterator();
          while (paramn0.hasNext())
          {
            localObject4 = (Map.Entry)paramn0.next();
            localObject3 = (k0)((Map.Entry)localObject4).getValue();
            if (!a.isEmpty())
            {
              j = ((Integer)((Map.Entry)localObject4).getKey()).intValue();
              localObject4 = (m1)f.get(Integer.valueOf(j));
              if (localObject4 != null) {
                f.put(Integer.valueOf(j), ((m1)localObject4).a(a, paramq));
              }
            }
          }
          paramn0 = ((Map)c).entrySet().iterator();
          while (paramn0.hasNext())
          {
            paramq = (Map.Entry)paramn0.next();
            j = ((Integer)paramq.getKey()).intValue();
            localObject3 = (m1)f.get(Integer.valueOf(j));
            if (localObject3 != null)
            {
              f.put(Integer.valueOf(j), ((m1)localObject3).a(h.b, e));
              localh0.e(j);
              localh0.f(new m1(a, j, c, (e0)paramq.getValue()));
            }
          }
          b.c((d0)localObject2);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     m9.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */