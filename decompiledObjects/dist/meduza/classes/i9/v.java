package i9;

import b0.d;
import j9.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k9.f;
import k9.g;
import m9.q0;
import ma.h;
import n9.o;
import t8.e;
import t8.e.a;
import u7.m;
import x6.b;

public final class v
  implements a0
{
  public final ArrayList a;
  public e<c> b;
  public int c;
  public h d;
  public final w e;
  public final s f;
  
  public v(w paramw)
  {
    e = paramw;
    a = new ArrayList();
    b = new e(Collections.emptyList(), c.c);
    c = 1;
    d = q0.w;
    f = e;
  }
  
  public final void a()
  {
    if (a.isEmpty()) {
      b.Z("Document leak -- detected dangling mutation references when queue is empty.", b.a.isEmpty(), new Object[0]);
    }
  }
  
  public final void b(g paramg)
  {
    boolean bool;
    if (n(a, "removed") == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Can only remove the first entry of the mutation queue", bool, new Object[0]);
    a.remove(0);
    e locale = b;
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      i locali = nexta;
      e.i.n(locali);
      locale = locale.i(new c(a, locali));
    }
    b = locale;
  }
  
  public final void c(h paramh)
  {
    paramh.getClass();
    d = paramh;
  }
  
  public final g d(m paramm, ArrayList paramArrayList, List paramList)
  {
    boolean bool1 = paramList.isEmpty();
    boolean bool2 = true;
    b.Z("Mutation batches should not be empty", bool1 ^ true, new Object[0]);
    int i = c;
    c = (i + 1);
    int j = a.size();
    if (j > 0)
    {
      if (a.get(j - 1)).a >= i) {
        bool2 = false;
      }
      b.Z("Mutation batchIds must be monotonically increasing order", bool2, new Object[0]);
    }
    paramm = new g(i, paramm, paramArrayList, paramList);
    a.add(paramm);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramArrayList = (f)paramList.next();
      b = b.a(new c(i, a));
      f.j(a.i());
    }
    return paramm;
  }
  
  public final ArrayList e(Set paramSet)
  {
    Object localObject1 = Collections.emptyList();
    Object localObject2 = o.a;
    localObject1 = new e((List)localObject1, new d(12));
    localObject2 = paramSet.iterator();
    paramSet = (Set)localObject1;
    if (((Iterator)localObject2).hasNext())
    {
      i locali = (i)((Iterator)localObject2).next();
      localObject1 = new c(0, locali);
      e.a locala = b.h((c)localObject1);
      for (localObject1 = paramSet;; localObject1 = ((e)localObject1).a(Integer.valueOf(b)))
      {
        paramSet = (Set)localObject1;
        if (!locala.hasNext()) {
          break;
        }
        paramSet = (c)locala.next();
        if (!locali.equals(a))
        {
          paramSet = (Set)localObject1;
          break;
        }
      }
    }
    localObject1 = new ArrayList();
    paramSet = paramSet.iterator();
    for (;;)
    {
      localObject2 = (e.a)paramSet;
      if (!((e.a)localObject2).hasNext()) {
        break;
      }
      localObject2 = h(((Integer)((e.a)localObject2).next()).intValue());
      if (localObject2 != null) {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    return (ArrayList)localObject1;
  }
  
  public final g f(int paramInt)
  {
    int i = m(paramInt + 1);
    paramInt = i;
    if (i < 0) {
      paramInt = 0;
    }
    g localg;
    if (a.size() > paramInt) {
      localg = (g)a.get(paramInt);
    } else {
      localg = null;
    }
    return localg;
  }
  
  public final int g()
  {
    boolean bool = a.isEmpty();
    int i = -1;
    if (!bool) {
      i = -1 + c;
    }
    return i;
  }
  
  public final g h(int paramInt)
  {
    int i = m(paramInt);
    if ((i >= 0) && (i < a.size()))
    {
      g localg = (g)a.get(i);
      boolean bool;
      if (a == paramInt) {
        bool = true;
      } else {
        bool = false;
      }
      b.Z("If found batch must match", bool, new Object[0]);
      return localg;
    }
    return null;
  }
  
  public final h i()
  {
    return d;
  }
  
  public final void j(g paramg, h paramh)
  {
    int i = a;
    int j = n(i, "acknowledged");
    boolean bool;
    if (j == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Can only acknowledge the first batch in the mutation queue", bool, new Object[0]);
    paramg = (g)a.get(j);
    if (i == a) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Queue ordering failure: expected batch %d, got batch %d", bool, new Object[] { Integer.valueOf(i), Integer.valueOf(a) });
    paramh.getClass();
    d = paramh;
  }
  
  public final List<g> k()
  {
    return Collections.unmodifiableList(a);
  }
  
  public final boolean l(i parami)
  {
    Object localObject = new c(0, parami);
    localObject = b.h((c)localObject);
    if (!((e.a)localObject).hasNext()) {
      return false;
    }
    return nexta.equals(parami);
  }
  
  public final int m(int paramInt)
  {
    if (a.isEmpty()) {
      return 0;
    }
    return paramInt - a.get(0)).a;
  }
  
  public final int n(int paramInt, String paramString)
  {
    paramInt = m(paramInt);
    boolean bool;
    if ((paramInt >= 0) && (paramInt < a.size())) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Batches must exist to be %s", bool, new Object[] { paramString });
    return paramInt;
  }
  
  public final void start()
  {
    if (a.isEmpty()) {
      c = 1;
    }
  }
}

/* Location:
 * Qualified Name:     i9.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */