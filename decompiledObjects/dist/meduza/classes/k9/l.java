package k9;

import j9.n;
import j9.q;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class l
  extends f
{
  public final n d;
  public final d e;
  
  public l(j9.i parami, n paramn, d paramd, m paramm)
  {
    this(parami, paramn, paramd, paramm, new ArrayList());
  }
  
  public l(j9.i parami, n paramn, d paramd, m paramm, List<e> paramList)
  {
    super(parami, paramm, paramList);
    d = paramn;
    e = paramd;
  }
  
  public final d a(j9.m paramm, d paramd, u7.m paramm1)
  {
    j(paramm);
    if (!b.b(paramm)) {
      return paramd;
    }
    paramm1 = h(paramm1, paramm);
    HashMap localHashMap = k();
    n localn = f;
    localn.g(localHashMap);
    localn.g(paramm1);
    paramm.k(d, f);
    g = 1;
    d = q.b;
    if (paramd == null) {
      return null;
    }
    paramm = new HashSet(a);
    paramm.addAll(e.a);
    paramm1 = new ArrayList();
    paramd = c.iterator();
    while (paramd.hasNext()) {
      paramm1.add(nexta);
    }
    paramm.addAll(paramm1);
    return new d(paramm);
  }
  
  public final void b(j9.m paramm, i parami)
  {
    j(paramm);
    if (!b.b(paramm))
    {
      d = a;
      c = 4;
      f = new n();
      g = 2;
      return;
    }
    HashMap localHashMap = i(paramm, b);
    n localn = f;
    localn.g(k());
    localn.g(localHashMap);
    paramm.k(a, f);
    g = 2;
  }
  
  public final d d()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l.class == paramObject.getClass()))
    {
      paramObject = (l)paramObject;
      if ((!e((f)paramObject)) || (!d.equals(d)) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = f();
    return d.hashCode() + i * 31;
  }
  
  public final HashMap k()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = e.a.iterator();
    while (localIterator.hasNext())
    {
      j9.l locall = (j9.l)localIterator.next();
      if (!locall.o()) {
        localHashMap.put(locall, n.d(locall, d.b()));
      }
    }
    return localHashMap;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PatchMutation{");
    localStringBuilder.append(g());
    localStringBuilder.append(", mask=");
    localStringBuilder.append(e);
    localStringBuilder.append(", value=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */