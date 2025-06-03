package g9;

import f;
import j9.e;
import j9.g;
import j9.i;
import j9.l;
import j9.s;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ka.d0;
import x6.b;

public final class f0$a
  implements Comparator<g>
{
  public final List<e0> a;
  
  public f0$a(List<e0> paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (int i = 0;; i = 1)
    {
      if (!localIterator.hasNext()) {
        break label56;
      }
      e0 locale0 = (e0)localIterator.next();
      if ((i == 0) && (!b.equals(l.b))) {
        break;
      }
    }
    label56:
    if (i != 0)
    {
      a = paramList;
      return;
    }
    throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (g)paramObject1;
    paramObject2 = (g)paramObject2;
    Iterator localIterator = a.iterator();
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      e0 locale0 = (e0)localIterator.next();
      int j;
      if (b.equals(l.b))
      {
        j = f.c(a);
        i = ((g)paramObject1).getKey().f(((g)paramObject2).getKey());
      }
      else
      {
        d0 locald01 = ((g)paramObject1).g(b);
        d0 locald02 = ((g)paramObject2).g(b);
        if ((locald01 != null) && (locald02 != null)) {
          bool = true;
        } else {
          bool = false;
        }
        b.Z("Trying to compare documents on fields that don't exist.", bool, new Object[0]);
        j = f.c(a);
        i = s.c(locald01, locald02);
      }
      i *= j;
    } while (i == 0);
    return i;
  }
}

/* Location:
 * Qualified Name:     g9.f0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */