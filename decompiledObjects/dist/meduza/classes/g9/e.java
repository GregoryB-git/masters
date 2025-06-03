package g9;

import f;
import j9.i;
import j9.l;
import j9.s;
import java.util.Iterator;
import java.util.List;
import ka.d0;
import x6.b;

public final class e
{
  public final boolean a;
  public final List<d0> b;
  
  public e(List<d0> paramList, boolean paramBoolean)
  {
    b = paramList;
    a = paramBoolean;
  }
  
  public final int a(List<e0> paramList, j9.g paramg)
  {
    boolean bool;
    if (b.size() <= paramList.size()) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Bound has more components than query's orderBy", bool, new Object[0]);
    int i = 0;
    int j = i;
    while (i < b.size())
    {
      e0 locale0 = (e0)paramList.get(i);
      d0 locald01 = (d0)b.get(i);
      int k;
      if (b.equals(l.b))
      {
        b.Z("Bound has a non-key value where the key path is being used %s", s.k(locald01), new Object[] { locald01 });
        k = i.h(locald01.Z()).f(paramg.getKey());
      }
      else
      {
        d0 locald02 = paramg.g(b);
        if (locald02 != null) {
          bool = true;
        } else {
          bool = false;
        }
        b.Z("Field should exist since document matched the orderBy already.", bool, new Object[0]);
        k = s.c(locald01, locald02);
      }
      j = k;
      if (q0.g.b(a, 2)) {
        j = k * -1;
      }
      if (j != 0) {
        break;
      }
      i++;
    }
    return j;
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = b.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      d0 locald0 = (d0)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(",");
      }
      i = 0;
      localStringBuilder.append(s.a(locald0));
    }
    return localStringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((a != a) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    boolean bool = a;
    return b.hashCode() + bool * true;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Bound(inclusive=");
    localStringBuilder.append(a);
    localStringBuilder.append(", position=");
    for (int i = 0; i < b.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append(" and ");
      }
      localStringBuilder.append(s.a((d0)b.get(i)));
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */