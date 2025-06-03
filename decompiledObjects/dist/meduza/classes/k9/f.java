package k9;

import j9.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ka.d0;
import x6.b;

public abstract class f
{
  public final j9.i a;
  public final m b;
  public final List<e> c;
  
  public f(j9.i parami, m paramm)
  {
    this(parami, paramm, new ArrayList());
  }
  
  public f(j9.i parami, m paramm, List<e> paramList)
  {
    a = parami;
    b = paramm;
    c = paramList;
  }
  
  public static f c(j9.m paramm, d paramd)
  {
    if ((paramm.d()) && ((paramd == null) || (!a.isEmpty())))
    {
      if (paramd == null)
      {
        if (paramm.h()) {
          return new c(b, m.c);
        }
        return new o(b, f, m.c, new ArrayList());
      }
      n localn1 = f;
      n localn2 = new n();
      HashSet localHashSet = new HashSet();
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        j9.l locall = (j9.l)localIterator.next();
        if (!localHashSet.contains(locall))
        {
          paramd = locall;
          if (n.d(locall, localn1.b()) == null)
          {
            paramd = locall;
            if (locall.q() > 1) {
              paramd = (j9.l)locall.s();
            }
          }
          localn2.f(paramd, n.d(paramd, localn1.b()));
          localHashSet.add(paramd);
        }
      }
      return new l(b, localn2, new d(localHashSet), m.c);
    }
    return null;
  }
  
  public abstract d a(j9.m paramm, d paramd, u7.m paramm1);
  
  public abstract void b(j9.m paramm, i parami);
  
  public abstract d d();
  
  public final boolean e(f paramf)
  {
    boolean bool;
    if ((a.equals(a)) && (b.equals(b))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int f()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String g()
  {
    StringBuilder localStringBuilder = f.l("key=");
    localStringBuilder.append(a);
    localStringBuilder.append(", precondition=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public final HashMap h(u7.m paramm, j9.m paramm1)
  {
    HashMap localHashMap = new HashMap(c.size());
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      p localp = b;
      d0 locald0 = paramm1.g(a);
      localHashMap.put(a, localp.b(paramm, locald0));
    }
    return localHashMap;
  }
  
  public final HashMap i(j9.m paramm, List paramList)
  {
    HashMap localHashMap = new HashMap(c.size());
    int i = c.size();
    int j = paramList.size();
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("server transform count (%d) should match field transform count (%d)", bool, new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(c.size()) });
    while (k < paramList.size())
    {
      e locale = (e)c.get(k);
      p localp = b;
      d0 locald0 = paramm.g(a);
      localHashMap.put(a, localp.a(locald0, (d0)paramList.get(k)));
      k++;
    }
    return localHashMap;
  }
  
  public final void j(j9.m paramm)
  {
    b.Z("Can only apply a mutation to a document with the same key", b.equals(a), new Object[0]);
  }
}

/* Location:
 * Qualified Name:     k9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */