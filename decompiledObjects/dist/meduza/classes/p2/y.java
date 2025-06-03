package p2;

import ec.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m.e;
import o2.j;
import o2.q;

public final class y
  extends e
{
  public static final String k = j.f("WorkContinuationImpl");
  public final k0 b;
  public final String c;
  public final int d;
  public final List<? extends q> e;
  public final ArrayList f;
  public final ArrayList g;
  public final List<y> h;
  public boolean i;
  public o j;
  
  public y() {}
  
  public y(k0 paramk0, List<? extends q> paramList)
  {
    super(3);
    b = paramk0;
    c = null;
    d = 2;
    e = paramList;
    h = null;
    f = new ArrayList(paramList.size());
    g = new ArrayList();
    for (int m = 0; m < paramList.size(); m++)
    {
      paramk0 = geta.toString();
      i.d(paramk0, "id.toString()");
      f.add(paramk0);
      g.add(paramk0);
    }
  }
  
  public static boolean v(y paramy, HashSet paramHashSet)
  {
    paramHashSet.addAll(f);
    Object localObject = w(paramy);
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext()) {
      if (((HashSet)localObject).contains((String)localIterator.next())) {
        return true;
      }
    }
    localObject = h;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (v((y)((Iterator)localObject).next(), paramHashSet)) {
          return true;
        }
      }
    }
    paramHashSet.removeAll(f);
    return false;
  }
  
  public static HashSet w(y paramy)
  {
    HashSet localHashSet = new HashSet();
    paramy = h;
    if ((paramy != null) && (!paramy.isEmpty()))
    {
      paramy = paramy.iterator();
      while (paramy.hasNext()) {
        localHashSet.addAll(nextf);
      }
    }
    return localHashSet;
  }
}

/* Location:
 * Qualified Name:     p2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */