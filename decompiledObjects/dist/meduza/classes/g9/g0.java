package g9;

import d9.a0;
import d9.l;
import j9.g;
import j9.h;
import j9.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o4.o;
import t8.c;
import t8.e;
import t8.e.a;
import x6.b;

public final class g0
{
  public final f0 a;
  public final k.a b;
  public final l<s0> c;
  public boolean d = false;
  public d0 e = d0.a;
  public s0 f;
  
  public g0(f0 paramf0, k.a parama, d paramd)
  {
    a = paramf0;
    c = paramd;
    b = parama;
  }
  
  public final boolean a()
  {
    k.a locala = b;
    if (locala != null) {
      return d.equals(a0.b) ^ true;
    }
    return true;
  }
  
  public final boolean b(s0 params0)
  {
    boolean bool1 = d.isEmpty();
    boolean bool2 = true;
    if ((bool1) && (!g)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    b.Z("We got a new snapshot with no changes?", bool1, new Object[0]);
    Object localObject = params0;
    if (!b.a)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = d.iterator();
      while (localIterator.hasNext())
      {
        localObject = (i)localIterator.next();
        if (a != i.a.d) {
          localArrayList.add(localObject);
        }
      }
      localObject = new s0(a, b, c, localArrayList, e, f, g, true, i);
    }
    if (!d)
    {
      if (d((s0)localObject, e))
      {
        c((s0)localObject);
        bool1 = bool2;
        break label307;
      }
    }
    else
    {
      if (!d.isEmpty())
      {
        bool1 = true;
      }
      else
      {
        params0 = f;
        int i;
        if ((params0 != null) && ((f.a.isEmpty() ^ true) != (f.a.isEmpty() ^ true))) {
          i = 1;
        } else {
          i = 0;
        }
        if ((!g) && (i == 0)) {
          bool1 = false;
        } else {
          bool1 = b.b;
        }
      }
      if (bool1)
      {
        c.a(localObject, null);
        bool1 = bool2;
        break label307;
      }
    }
    bool1 = false;
    label307:
    f = ((s0)localObject);
    return bool1;
  }
  
  public final void c(s0 params0)
  {
    b.Z("Trying to raise initial event for second time", d ^ true, new Object[0]);
    f0 localf0 = a;
    j localj = b;
    e locale = f;
    boolean bool1 = e;
    boolean bool2 = h;
    boolean bool3 = i;
    params0 = new ArrayList();
    Object localObject1 = localj.iterator();
    for (;;)
    {
      Object localObject2 = (e.a)localObject1;
      if (!((e.a)localObject2).hasNext()) {
        break;
      }
      localObject2 = (g)((e.a)localObject2).next();
      params0.add(new i(i.a.b, (g)localObject2));
    }
    localObject1 = new o(localf0.a(), 1);
    params0 = new s0(localf0, localj, new j(h.a, new e(Collections.emptyList(), (Comparator)localObject1)), params0, bool1, locale, true, bool2, bool3);
    d = true;
    c.a(params0, null);
  }
  
  public final boolean d(s0 params0, d0 paramd0)
  {
    boolean bool1 = d;
    boolean bool2 = true;
    b.Z("Determining whether to raise first event but already had first event.", bool1 ^ true, new Object[0]);
    if (!e) {
      return true;
    }
    if (!a()) {
      return true;
    }
    d0 locald0 = d0.c;
    bool1 = paramd0.equals(locald0);
    if ((b.c) && ((bool1 ^ true)))
    {
      b.Z("Waiting for sync, but snapshot is not from cache", e, new Object[0]);
      return false;
    }
    bool1 = bool2;
    if (b.a.isEmpty())
    {
      bool1 = bool2;
      if (!i) {
        if (paramd0.equals(locald0)) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     g9.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */